package recursos;

public class CalculadoraIp {

    public CalculadoraIp() {
    }

    //********************************* CALCULADORA BINARIO ********************************************
    //******* PASO 0: METODOS CONVERTIR DECIMAL A BINARIO Y VICEVERSA , DETERMINAR LA CLASE*******
    // DETERMINAR LA CLASE DE LA DIRECCION IP EN BASE A LA IP EN BINARIO 
    public String determinarClase(int[] ipDecimal) {
        String clase = "";
        String[] octetosIP = ipDecimalBinario(ipDecimal);//Convertir ip Decimal a Binario
        if (octetosIP[0].charAt(0) == '0') { // Comparar el primer bit 
            clase = "A";                     // de la ip  en Binario
        } else if (octetosIP[0].charAt(0) == '1' && octetosIP[0].charAt(1) == '0') { // Comparar los dos primeros bits 
            clase = "B";                                                             // de la ip en Binario
        } else if (octetosIP[0].charAt(0) == '1' && octetosIP[0].charAt(1) == '1' && octetosIP[0].charAt(2) == '0') {
            clase = "C"; // Comparar los tres primeros bits de la ip en Binario
        }
        return clase;
    }

    // CONVERTIR UN OCTETO DE DECIMAL A BINARIO
    private String convertirDecimalBinario(int octetoDecimal) {
        String octetoBinario = "";
        for (int i = 7; i >= 0; i--) { //Recorrer la tabla de derecha a izquierda
            if (i != -1) {
                if (octetoDecimal >= (int) Math.pow(2, i)) { // Comparar el octeto Decimal con la tabla
                    octetoBinario = octetoBinario + 1; // Concatenar 1's a nuestra respuesta
                    octetoDecimal = octetoDecimal - (int) Math.pow(2, i); // Actualizar el nuevo Valor
                } else {
                    octetoBinario = octetoBinario + 0; // Concatenar 0's a nuestra respuesta
                }
            }
        }
        return octetoBinario;
    }

    // CONVERTIR UN OCTETO DE  BINARIO A DECIMAL
    public int convertirBinarioDecimal(String octetoBin) {
        int octetoDec = 0;
        int[] tabla = {128, 64, 32, 16, 8, 4, 2, 1};// tabla
        for (int i = 0; i < tabla.length; i++) {
            int num = Character.getNumericValue(octetoBin.charAt(i));// Convertir un caracter a numero
            if (num == 1) {
                octetoDec = octetoDec + tabla[i];// Sumar valor de la posicion "i" de la tabla si el bit es 1
            }
        }
        return octetoDec;
    }

    // ENCENDER BITS (1's)
    public String encenderBits(int bitsAEncender, String mascaraBin) {
        String bitsEncendidos = "";
        bitsEncendidos = mascaraBin.substring(0, bitsAEncender); // Obtener Bits que deben encenderse
        bitsEncendidos = bitsEncendidos.replace('0', '1'); // Encendiendo Bits
        if (bitsAEncender < mascaraBin.length()) {
            String bitsApagados = mascaraBin.substring(bitsAEncender, mascaraBin.length());// Obtener Bits que deben apagarse
            bitsEncendidos = bitsEncendidos + bitsApagados; //Concatenar Bits
        }

        return bitsEncendidos;
    }

    // ******* PASO 1: CONVERTIR LA DIRECCION IP INGRESADA A BINARIO *******    
    // CONVERTIR LA IP A BINARIO OCTETO POR OCTETO (RETURN METODO determinarClase())
    public String[] ipDecimalBinario(int[] ipDecimal) {
        String[] octetosIPBin = new String[4];

        octetosIPBin[0] = convertirDecimalBinario(ipDecimal[0]);
        octetosIPBin[1] = convertirDecimalBinario(ipDecimal[1]);// Convertir ip Decimal a 
        octetosIPBin[2] = convertirDecimalBinario(ipDecimal[2]);// Binario Octeto por Octeto
        octetosIPBin[3] = convertirDecimalBinario(ipDecimal[3]);

        return octetosIPBin;
    }

    // ******* PASO 2: CONVERTIR EL PREFIJO DE RED INGRESADO A BINARIO *******    
    // CONVERTIR PREFIJO DE RED A BINARIO OCTETO POR OCTETO   
    public String[] convertirPrefijoRedBinOctPorOct(int prefijo) {
        String[] octetosMasc = new String[4];

        String mascaraBin = "00000000000000000000000000000000";
        String res = encenderBits(prefijo, mascaraBin); // enciende bits 
        octetosMasc[0] = res.substring(0, 8);
        octetosMasc[1] = res.substring(8, 16);// Dividir en octetos
        octetosMasc[2] = res.substring(16, 24);
        octetosMasc[3] = res.substring(24, 32);

        return octetosMasc;
    }

    // CONCATENAR LOS OCTETOS DE LA RED BINARIO
    public String concatenarMascaraBin(int prefijo) {
        String[] octetosMascBin = convertirPrefijoRedBinOctPorOct(prefijo);
        String mascConcatenada = octetosMascBin[0] + octetosMascBin[1] + octetosMascBin[2] + octetosMascBin[3];

        return mascConcatenada;
    }

    // ******* PASO 3: ENCONTRAR LA DIRECCION DE RED EN DECIMAL (DIRECCION IP AND MASCARA DE RED) *******   
    public String[] calcularRedBin(int[] ipDec, int prefijo) {
        String[] octetosRedBin = new String[4];
        String redConcatenada = "";
        String[] ipBin = ipDecimalBinario(ipDec); // Convertir IP Decimal a Binario 
        String ipBinConcatenada = ipBin[0] + ipBin[1] + ipBin[2] + ipBin[3]; // Concatenar ip Binario
        String[] octetosMascBin = convertirPrefijoRedBinOctPorOct(prefijo); // Convertir Mascara de Red a Binario
        String mascBinConcatenada = octetosMascBin[0] + octetosMascBin[1]
                + octetosMascBin[2] + octetosMascBin[3];// Concatenera mascara de Red Binaria
        for (int i = 0; i < 32; i++) {
            if (ipBinConcatenada.charAt(i) == '1' && mascBinConcatenada.charAt(i) == '1') { // Realiza la operacion logica
                redConcatenada = redConcatenada + 1;                                        // AND entre la IP y la mascara            
            } else {                                                                        // en Binario
                redConcatenada = redConcatenada + 0;
            }
        }
        octetosRedBin[0] = redConcatenada.substring(0, 8);
        octetosRedBin[1] = redConcatenada.substring(8, 16);// Separar la Red Binaria 
        octetosRedBin[2] = redConcatenada.substring(16, 24); // en Octetos
        octetosRedBin[3] = redConcatenada.substring(24, 32);

        return octetosRedBin;
    }

    public String[] calcularRedDecimal(int[] ipDec, int prefijo) {
        String[] octetosRedDec = new String[4];
        String[] octetosRedBin = calcularRedBin(ipDec, prefijo); // Calcular la Red en Binario
        octetosRedDec[0] = String.valueOf(convertirBinarioDecimal(octetosRedBin[0]));
        octetosRedDec[1] = String.valueOf(convertirBinarioDecimal(octetosRedBin[1]));// Convertir y separar en 
        octetosRedDec[2] = String.valueOf(convertirBinarioDecimal(octetosRedBin[2]));// octetos la Red en Decimal
        octetosRedDec[3] = String.valueOf(convertirBinarioDecimal(octetosRedBin[3]));

        return octetosRedDec;
    }

    // PASO 4: ENCONTRAR EL BROADCAST;
    public String[] calcularBroadCastBin(int[] ipDec, int prefijo) {
        String[] octetosBroadCast = new String[4];
        String[] octetosRedBin = calcularRedBin(ipDec, prefijo); // Calcular la Red en Binario
        String redBinConcatenada = octetosRedBin[0] + octetosRedBin[1] + octetosRedBin[2] + octetosRedBin[3]; // Concatenar la Red Binaria
        String broadCastBin = redBinConcatenada.substring(0, prefijo) + encenderBits(32 - prefijo, redBinConcatenada.substring(prefijo, 32)); //  
        // Concatena la red Binaria manteniendo los bits que pertenecen a la Red y enciende (1's) bits pertenecientes a los hosts 
        octetosBroadCast[0] = broadCastBin.substring(0, 8);
        octetosBroadCast[1] = broadCastBin.substring(8, 16);// Separar el BroadCast Binario 
        octetosBroadCast[2] = broadCastBin.substring(16, 24); // en Octetos
        octetosBroadCast[3] = broadCastBin.substring(24, 32);

        return octetosBroadCast;
    }

    public String[] calcularBroadcastDec(int[] ipDec, int prefijo) {
        String[] octetosBroadCastDec = new String[4];
        String[] octetosBroadCastBin = calcularBroadCastBin(ipDec, prefijo); //Calcular BroadCast en Binario
        String broadCastBinConcatenado = octetosBroadCastBin[0] + octetosBroadCastBin[1] + octetosBroadCastBin[2] + octetosBroadCastBin[3]; // Concatenar Broadcast en Binario

        octetosBroadCastDec[0] = String.valueOf(convertirBinarioDecimal(broadCastBinConcatenado.substring(0, 8)));
        octetosBroadCastDec[1] = String.valueOf(convertirBinarioDecimal(broadCastBinConcatenado.substring(8, 16))); // Separar  en octetos 
        octetosBroadCastDec[2] = String.valueOf(convertirBinarioDecimal(broadCastBinConcatenado.substring(16, 24)));// y convertir
        octetosBroadCastDec[3] = String.valueOf(convertirBinarioDecimal(broadCastBinConcatenado.substring(24, 32))); // broadcast a Decimal

        return octetosBroadCastDec;
    }

}
