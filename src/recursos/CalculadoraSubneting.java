package recursos;

public class CalculadoraSubneting {

    private Interfaz interfaz;
    private int primerOct;
    private int segundoOct;
    private int tercerOct;
    private int cuartoOct;
    private String clase;
    private int prefijo;
    private int cantSubRedes;
    private CalculadoraIp calcBin;

    public static void main(String args[]) {
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
    }

    public CalculadoraSubneting(Interfaz interfaz) {
        this.interfaz = interfaz;
        primerOct = interfaz.getPrimerOcteto();
        segundoOct = interfaz.getSegundoOcteto();
        tercerOct = interfaz.getTercerOcteto();
        cuartoOct = interfaz.getCuartoOcteto();
        prefijo = interfaz.getCbPrefijo();
        cantSubRedes = interfaz.getCbCantSubRedes();
        clase = interfaz.getCbClase();
        calcBin = new CalculadoraIp();
    }

    // ********************************* CALCULADORA (SUBNETTING) ********************************************
    // ******* PASO 1: IDENTIFICAR MASCARA ACTUAL EN DECIMAL *******
    public String[] getMascaraDecimal() {
        String mascaraDec[] = new String[4];
        String[] octetosMasc = calcBin.convertirPrefijoRedBinOctPorOct(prefijo);//Devuelve la mascara de red en binario
        mascaraDec[0] = String.valueOf(calcBin.convertirBinarioDecimal(octetosMasc[0]));
        mascaraDec[1] = String.valueOf(calcBin.convertirBinarioDecimal(octetosMasc[1]));
        mascaraDec[2] = String.valueOf(calcBin.convertirBinarioDecimal(octetosMasc[2]));// Convirte la mascara a decimal 
        mascaraDec[3] = String.valueOf(calcBin.convertirBinarioDecimal(octetosMasc[3]));// y lo guarda en un arreglo

        return mascaraDec;
    }

    // ******* PASO 2: RESOLVER LA FORMULA 2^N >= C (METODO OBTIENE N) *******
    public int getPotenciaN() {
        int potenciaN = 0;
        for (int i = 0; i <= 24; i++) {
            if (((int) Math.pow(2, i)) >= cantSubRedes) { // Busca un numero cuyo valor elevado a la N sea >= a la cant subR
                potenciaN = i;
                break;
            }
        }

        return potenciaN;
    }

    // PASO 3: OBTENER LA NUEVA MASCARA (SUBMASCARA) EN DECIMAL
    public String getSubmascaraDecimal() {
        String subMascaraDec = "";
        String subMascBin = getSubmascaraBinario();
        int primerOct = calcBin.convertirBinarioDecimal(subMascBin.substring(0, 8));
        int segundoOct = calcBin.convertirBinarioDecimal(subMascBin.substring(8, 16));// Separar la submascara en binario
        int tercerOct = calcBin.convertirBinarioDecimal(subMascBin.substring(16, 24));// luego, Convertir submascara a decimal
        int cuartoOct = calcBin.convertirBinarioDecimal(subMascBin.substring(24, 32));

        subMascaraDec = primerOct + "." + segundoOct + "." + tercerOct + "." + cuartoOct; // Concatenar submascara en decimal

        return subMascaraDec;
    }

    // SUBMASCARA EN BINARIO (PASO 3)
    public String getSubmascaraBinario() {
        String subMascBin = "";
        String mascaraBin = calcBin.concatenarMascaraBin(prefijo); // Obtener mascara Binario
        String octetos = calcBin.encenderBits(getNuevaPotenciaParaSubmasc(), mascaraBin);
        String primerOct = octetos.substring(0, 8);
        String segundoOct = octetos.substring(8, 16);// Separar la submascara en binario
        String tercerOct = octetos.substring(16, 24);
        String cuartoOct = octetos.substring(24, 32);

        subMascBin = primerOct + segundoOct + tercerOct + cuartoOct; //Concatenar submascara en binario

        return subMascBin;
    }

    // ******* PASO 4: OBTENER LA CANTIDAD DE HOST POR SUBRED (2^M -2 = H) *******
    public int getHostPorSubred() {
        int HostPorSubred = (int) (Math.pow(2, getPotenciaM()) - 2); // Obtener Host Por Subred en base a potencia M

        return HostPorSubred;
    }

    // OBTENER LA POTENCIA M PARA RESOLVER LA FORMULA DE HOST POR SUBRED ( RETURN PASO 4)
    public int getPotenciaM() {
        int potenciaM = 0;
        String submasc = getSubmascaraBinario(); // Obtener Submascara binario 
        for (int i = 0; i < 32; i++) {  // Recorrer posicion por posicion la submascara en binario
            if (submasc.charAt(i) == '0') { // Buscar 0's en cada posicion 
                potenciaM = potenciaM + 1;  // y contarlos
            }
        }
        return potenciaM;
    }

    // ******* PASO 5: OBTENER EL SALTO DE RED  (256 - LA CANTIDAD DE CEROS SOBRANTES EN LA SUBMASCARA)******* 
    public int getSaltoDeRed() {
        int saltoDeRed;
        int numeroMagico = 256;
        saltoDeRed = numeroMagico - getOctetoAModificar();

        return saltoDeRed;
    }

    // IDENTIFICAR EL OCTETO QUE SE MODIFICÓ EN LA SUBMASCARA (RETURN PASO 5)  
    public int getOctetoAModificar() {
        int octetoAModificar = 0;
        String octetosSubmasc = getSubmascaraDecimal();
        int nuevaPotencia = getNuevaPotenciaParaSubmasc();
        String[] partesOcteto = octetosSubmasc.split("\\.");

        int primerOct = Integer.parseInt(partesOcteto[0]);
        int segundoOct = Integer.parseInt(partesOcteto[1]);
        int tercerOct = Integer.parseInt(partesOcteto[2]);
        int cuartoOct = Integer.parseInt(partesOcteto[3]);

        if (nuevaPotencia >= 8 && nuevaPotencia <= 16) {
            octetoAModificar = segundoOct;
        } else if (nuevaPotencia >= 17 && nuevaPotencia <= 24) {
            octetoAModificar = tercerOct;
        } else if (nuevaPotencia >= 25 && nuevaPotencia <= 32) {
            octetoAModificar = cuartoOct;
        }

        return octetoAModificar;
    }

    // OBTENER SOLO EL VALOR DEL OCTETO QUE SE MODIFICÓ EN DECIMAL (RETURN getOctetoAModificar)
    public int getNuevaPotenciaParaSubmasc() {
        int potenciaBit = getPotenciaN();
        int nuevaPotencia = potenciaBit + prefijo;
        return nuevaPotencia;
    }
}
