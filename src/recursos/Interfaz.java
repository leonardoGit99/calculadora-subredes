package recursos;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    // Variables declaration - do not modify                     
    private javax.swing.JLabel textoCantSR;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbCantSubredes;
    private javax.swing.JComboBox<String> cbClase;
    private javax.swing.JComboBox<String> cbPrefijo;
    private javax.swing.JPanel cuadroParametros;
    private javax.swing.JPanel cuadroTipo;
    private javax.swing.JPanel cuadroTitulo;
    private javax.swing.JTextField cuartoOcteto;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField primerOcteto;
    private javax.swing.JTextField segundoOcteto;
    private javax.swing.JTextField tercerOcteto;
    private javax.swing.JLabel textoClase;
    private javax.swing.JLabel textoDirIp;
    private javax.swing.JLabel textoPrefijoRed;
    private javax.swing.JLabel textoRangoA;
    private javax.swing.JLabel textoRangoB;
    private javax.swing.JLabel textoRangoC;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel todoElemVentanaCalcu;
    private javax.swing.JSeparator segSeparador;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel fondoCuadroParametros;
    private javax.swing.JLabel fondoInfoClases;
    private javax.swing.JButton botonAyuda;

    InterfazInformacion informacion;
    InterfazAyuda interfazAyuda;

    public Interfaz() {
        initComponents();
        this.setVisible(false);
        informacion = new InterfazInformacion();
        interfazAyuda = new InterfazAyuda(this, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        todoElemVentanaCalcu = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cuadroParametros = new javax.swing.JPanel();
        textoDirIp = new javax.swing.JLabel();
        textoClase = new javax.swing.JLabel();
        textoPrefijoRed = new javax.swing.JLabel();
        textoCantSR = new javax.swing.JLabel();
        primerOcteto = new javax.swing.JTextField();
        cbClase = new javax.swing.JComboBox<>();
        cbPrefijo = new javax.swing.JComboBox<>();
        cbCantSubredes = new javax.swing.JComboBox<>();
        segundoOcteto = new javax.swing.JTextField();
        tercerOcteto = new javax.swing.JTextField();
        cuartoOcteto = new javax.swing.JTextField();
        fondoCuadroParametros = new javax.swing.JLabel();
        cuadroTipo = new javax.swing.JPanel();
        textoRangoA = new javax.swing.JLabel();
        textoRangoB = new javax.swing.JLabel();
        textoRangoC = new javax.swing.JLabel();
        fondoInfoClases = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        segSeparador = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        todoElemVentanaCalcu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("  CALCULADORA SUBREDES");
        titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        todoElemVentanaCalcu.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 240, 40));

        cuadroParametros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroParametros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoDirIp.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoDirIp.setForeground(new java.awt.Color(204, 255, 255));
        textoDirIp.setText("DIRECCIÓN IP:");
        cuadroParametros.add(textoDirIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 15, -1, -1));

        textoClase.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoClase.setForeground(new java.awt.Color(204, 255, 255));
        textoClase.setText("CLASE:");
        cuadroParametros.add(textoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 53, -1, -1));

        textoPrefijoRed.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoPrefijoRed.setForeground(new java.awt.Color(204, 255, 255));
        textoPrefijoRed.setText("PREFIJO DE RED:");
        cuadroParametros.add(textoPrefijoRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 100, -1, -1));

        textoCantSR.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoCantSR.setForeground(new java.awt.Color(204, 255, 255));
        textoCantSR.setText("CANT. DE SUBREDES:");
        cuadroParametros.add(textoCantSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 150, -1, -1));

        primerOcteto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        primerOcteto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primerOcteto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroParametros.add(primerOcteto, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 12, 54, 26));

        cbClase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una clase", "A", "B", "C" }));
        cbClase.setToolTipText("");
        cbClase.setName(""); // NOI18N
        cbClase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbClaseItemStateChanged(evt);
            }
        });
        cuadroParametros.add(cbClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 49, 270, -1));

        cbPrefijo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbPrefijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Prefijo de Red" }));
        cbPrefijo.setToolTipText("");
        cbPrefijo.setName(""); // NOI18N
        cbPrefijo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPrefijoItemStateChanged(evt);
            }
        });
        cuadroParametros.add(cbPrefijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 99, 270, -1));

        cbCantSubredes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbCantSubredes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la cantidad de subredes" }));
        cbCantSubredes.setToolTipText("");
        cuadroParametros.add(cbCantSubredes, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 146, 270, -1));

        segundoOcteto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        segundoOcteto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        segundoOcteto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroParametros.add(segundoOcteto, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 12, 54, 26));

        tercerOcteto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tercerOcteto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tercerOcteto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroParametros.add(tercerOcteto, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 12, 54, 26));

        cuartoOcteto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cuartoOcteto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cuartoOcteto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroParametros.add(cuartoOcteto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 12, 54, 26));

        fondoCuadroParametros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoCuadroParametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCalcIp.jpg"))); // NOI18N
        fondoCuadroParametros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cuadroParametros.add(fondoCuadroParametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 190));

        todoElemVentanaCalcu.add(cuadroParametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 560, 190));

        cuadroTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroTipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRangoA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoRangoA.setForeground(new java.awt.Color(204, 255, 255));
        textoRangoA.setText("CLASE A: 0 - 127");
        cuadroTipo.add(textoRangoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, -1, -1));

        textoRangoB.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoRangoB.setForeground(new java.awt.Color(204, 255, 255));
        textoRangoB.setText("CLASE B: 128 - 191");
        cuadroTipo.add(textoRangoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 40, -1, -1));

        textoRangoC.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoRangoC.setForeground(new java.awt.Color(204, 255, 255));
        textoRangoC.setText("CLASE C: 192 - 223");
        cuadroTipo.add(textoRangoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 75, -1, -1));

        fondoInfoClases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoInfoClases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCalcIp.jpg"))); // NOI18N
        fondoInfoClases.setToolTipText("");
        fondoInfoClases.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fondoInfoClases.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cuadroTipo.add(fondoInfoClases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 100));

        todoElemVentanaCalcu.add(cuadroTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 180, 100));

        btnGenerar.setBackground(new java.awt.Color(0, 0, 0));
        btnGenerar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoBtnGE.png"))); // NOI18N
        btnGenerar.setText("GENERAR");
        btnGenerar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnGenerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        todoElemVentanaCalcu.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 80, 30));
        todoElemVentanaCalcu.add(segSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 780, -1));

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoBtnGE.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        todoElemVentanaCalcu.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 80, 30));

        botonAyuda.setBackground(new java.awt.Color(0, 51, 51));
        botonAyuda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnAyuda.png"))); // NOI18N
        botonAyuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });
        todoElemVentanaCalcu.add(botonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCalcIp.jpg"))); // NOI18N
        todoElemVentanaCalcu.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(todoElemVentanaCalcu, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(todoElemVentanaCalcu, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // OBTENER LA LISTA DE PREFIJOS DE RED EN BASE A LA CLASE SELECCIONADA
    public String[] getPrefijo(String clase) {
        String[] prefijos = null;
        int incremento;

        if (clase.equals("A")) { // Genera una lista de  prefijos de red segun la clase que se seleccione
            prefijos = new String[26];
            prefijos[0] = "Seleccione un Prefijo de Red";
            incremento = 8; // Indica que se puede seleccionar desde el prefijo 8 hasta el 32
            for (int i = 1; i < prefijos.length; i++) { //Genera uno por uno los prefijos desde 8 hasta 32
                prefijos[i] = String.valueOf(incremento);
                incremento++;
            }
        } else if (clase.equals("B")) {// Genera una lista de  prefijos de red segun la clase que se seleccione
            prefijos = new String[18];
            prefijos[0] = "Seleccione un Prefijo de Red";
            incremento = 16;// Indica que se puede seleccionar desde el prefijo 16 hasta el 32
            for (int i = 1; i < prefijos.length; i++) {//Genera uno por uno los prefijos desde 16 hasta 32
                prefijos[i] = String.valueOf(incremento);
                incremento++;
            }
        } else if (clase.equals("C")) {// Genera una lista de  prefijos de red segun la clase que se seleccione
            prefijos = new String[10];
            prefijos[0] = "Seleccione un Prefijo de Red";
            incremento = 24;// Indica que se puede seleccionar desde el prefijo 24 hasta el 32
            for (int i = 1; i < prefijos.length; i++) {//Genera uno por uno los prefijos desde 24 hasta 32
                prefijos[i] = String.valueOf(incremento);
                incremento++;
            }
        }
        return prefijos;
    }

    // OBTENER LA CANTIDAD DE SUBREDES DISPONIBLES EN BASE A LA MASCARA (PREFIJO DE RED) QUE SE SELECCIONE   
    public String[] getCantSubRedes(String prefijo) {
        String[] cantSubredes = null;
        int prefijoEntero = Integer.parseInt(prefijo);
        int tamListaSubredes = 32 - prefijoEntero;//Define el tamaño de la lista de subredes en base al prefijo de red seleccionado
        cantSubredes = new String[tamListaSubredes + 2];//Asina el tamaño al arreglo 
        cantSubredes[0] = "Seleccione la cantidad de subredes";
        for (int i = 0; i <= tamListaSubredes; i++) {//Genera la lista de subredes dependiendo del prefijo de red
            cantSubredes[i + 1] = String.valueOf((int) Math.pow(2, i));// Añade cada una de las subredes creadas al arreglo
        }

        return cantSubredes;
    }

    // OBTENER EL VALOR DEL PRIMER OCTETO DE LA DIRECCION IP INGRESADA
    //El try-catch se uso para controlar las exepciones de cada octeto en caso de recibirse valores que no fueran enteros 
    //y si estos se encuentran fuera de rango se fuerza a que se genere una excepcion de tipo: NumberFormatException 
    public int getPrimerOcteto() {
        int primerOct = 0;

        try {
            Integer.parseInt(primerOcteto.getText());
            if (primerOct >= 255) {
                primerOct = Integer.parseInt("Fuera de rango");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el primer octeto de tipo:" + ex);
        }

        return primerOct;
    }

    // OBTENER EL VALOR DEL SEGUNDO OCTETO DE LA DIRECCION IP INGRESADA
    public int getSegundoOcteto() {
        int segundoOct = 0;
        try {
            segundoOct = Integer.parseInt(segundoOcteto.getText());
            if (segundoOct >= 255) {
                segundoOct = Integer.parseInt("Fuera de rango");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el segundo octeto de tipo:" + ex);
        }

        return segundoOct;
    }

    // OBTENER EL VALOR DEL TERCER OCTETO DE LA DIRECCION IP INGRESADA
    public int getTercerOcteto() {
        int tercerOct = 0;
        try {
            tercerOct = Integer.parseInt(tercerOcteto.getText());
            if (tercerOct >= 255) {
                tercerOct = Integer.parseInt("Fuera de rango");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el tercer octeto de tipo:" + ex);
        }

        return tercerOct;
    }

    //OBTENER EL VALOR DEL CUARTO OCTETO DE LA DIRECCION IP INGRESADA
    public int getCuartoOcteto() {
        int cuartoOct = 0;
        try {
            cuartoOct = Integer.parseInt(cuartoOcteto.getText());
            if (cuartoOct >= 255) {
                cuartoOct = Integer.parseInt("Fuera de rango");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en el cuarto octeto de tipo:" + ex);
        }
        return cuartoOct;
    }
    // OBTENER LA CLASE QUE SE SELECCIONO EN EL COMBOBOX DE CLASE
    // El try-catch se uso para controlar la excepcion tipo : NumberFormatException en caso de no seleccionar la clase 

    public String getCbClase() {
        String clase = "";

        try {
            clase = (String) cbClase.getSelectedItem();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en la Clase de tipo:" + ex);
        }

        return clase;
    }

    // OBTENER LA MASCARA (PREFIJO DE RED) QUE SE SELECCIONO EN EL COMBOBOX DE MASCARA
    // El try-catch se uso para controlar la excepcion tipo : NumberFormatException en caso de no seleccionar el prefijo 
    public int getCbPrefijo() {
        int prefijo = 0;
        try {
            prefijo = Integer.parseInt((String) cbPrefijo.getSelectedItem());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error el prefijo de red de tipo:" + ex);
        }

        return prefijo;
    }

    // OBTENER LA CANTIDAD DE SUBREDES QUE SE SELECCIONO EN EL COMBOBOX DE CANTIDAD DE SUBREDES
    // El try-catch se uso para controlar la excepcion tipo : NumberFormatException en caso de no seleccionar la cantidad de subredes
    public int getCbCantSubRedes() {
        int cantSubR = 0;
        try {
            cantSubR = Integer.parseInt((String) cbCantSubredes.getSelectedItem());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error en la cantidad de subredes:" + ex);
        }

        return cantSubR;
    }

    // ACCIONES QUE SE REALIZARAN DESPUES DE PRESIONAR EL BOTON 
    // El try-catch se uso para controlar alguna excepcion tipo : NumberFormatException al momento que presionar el boton "Generar"
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        try {
            CalculadoraSubneting calculadora = new CalculadoraSubneting(this);
            CalculadoraIp calcBin = new CalculadoraIp();
            int[] ipDecimal = {Integer.parseInt(primerOcteto.getText()), Integer.parseInt(segundoOcteto.getText()), Integer.parseInt(tercerOcteto.getText()), Integer.parseInt(cuartoOcteto.getText())};
            //Obtiene la direccion ip ingresada y lo guarda en un arreglo
            if (!cbClase.getSelectedItem().equals("Seleccione una clase")) {//Mientras no se selecione nada no se despliega la interfaz de informacion
                if (!cbPrefijo.getSelectedItem().equals("Seleccione un Prefijo de Red")) {
                    if (!cbCantSubredes.getSelectedItem().equals("Seleccione la cantidad de subredes")) {

                        if (!calcBin.determinarClase(ipDecimal).equals(getCbClase())) {//Verifica que la clase seleccionada corresponde a la clase de la Ip ingresada
                            JOptionPane.showMessageDialog(null, "No concuerda la Direccion IP ingresada con la Clase seleccionada");
                            cbClase.setSelectedIndex(0); // Las listas vuelven a sus valores por defecto
                            cbPrefijo.setSelectedIndex(0);
                            cbCantSubredes.setSelectedIndex(0);
                        } else if (calcBin.determinarClase(ipDecimal).equals(getCbClase())) { // Si todo es correcto la informacion se muestra en la interfaz

                            // ABRIR VENTANA INFORMACION
                            informacion.setVisible(true);

                            // INTRODUCIR VALORES EN CAMPO IP BINARIO
                            String[] ipBinario = calcBin.ipDecimalBinario(ipDecimal);
                            informacion.campoIpBin.setText(ipBinario[0] + " . " + ipBinario[1] + " . "
                                    + ipBinario[2] + " . " + ipBinario[3]);

                            // INTRODUCIR VALORES EN CAMPO RED Y PRIMERA IP UTILIZABLE
                            String[] redDecimal = calcBin.calcularRedDecimal(ipDecimal, getCbPrefijo());
                            int primeraIpU = Integer.parseInt(redDecimal[3]) + 1;
                            informacion.campoRed.setText(redDecimal[0] + " . " + redDecimal[1] + " . "
                                    + redDecimal[2] + " . " + redDecimal[3]);
                            informacion.campoPrimeraIpU.setText(redDecimal[0] + " . " + redDecimal[1] + " . "
                                    + redDecimal[2] + " . " + String.valueOf(primeraIpU));

                            // INTRODUCIR VALORES EN CAMPO RED BINARIO
                            String[] redBinaria = calcBin.calcularRedBin(ipDecimal, getCbPrefijo());
                            informacion.campoRedBin.setText(redBinaria[0] + " . " + redBinaria[1] + " . "
                                    + redBinaria[2] + " . " + redBinaria[3]);

                            // INTRODUCIR VALORES EN CAMPO BROADCAST Y ULTIMA IP UTILIZABLE           
                            String[] broadcastDecimal = calcBin.calcularBroadcastDec(ipDecimal, getCbPrefijo());
                            int ultimaIpU = Integer.parseInt(broadcastDecimal[3]) - 1;
                            informacion.campoBroadcast.setText(broadcastDecimal[0] + " . " + broadcastDecimal[1] + " . "
                                    + broadcastDecimal[2] + " . " + broadcastDecimal[3]);
                            informacion.campoUltimaIpU.setText(broadcastDecimal[0] + " . " + broadcastDecimal[1] + " . "
                                    + broadcastDecimal[2] + " . " + String.valueOf(ultimaIpU));

                            // INTRODUCIR VALORES EN CAMPO BROADCAST BINARIO
                            String[] broadcastBin = calcBin.calcularBroadCastBin(ipDecimal, getCbPrefijo());
                            informacion.campoBroadcastBin.setText(broadcastBin[0] + " . " + broadcastBin[1] + " . "
                                    + broadcastBin[2] + " . " + broadcastBin[3]);

                            //INTRODUCIR VALORES EN CAMPO MASCARA DE RED          
                            String[] mascaraRedDecimal = calculadora.getMascaraDecimal();
                            informacion.campoMascaraRed.setText(mascaraRedDecimal[0] + " . " + mascaraRedDecimal[1] + " . "
                                    + mascaraRedDecimal[2] + " . " + mascaraRedDecimal[3]);

                            // INTRODUCIR VALORES EN CAMPO MASCARA DE RED BIN
                            String[] mascaraRedBin = calcBin.convertirPrefijoRedBinOctPorOct(getCbPrefijo());
                            informacion.campoMascaraRedBin.setText(mascaraRedBin[0] + " . " + mascaraRedBin[1] + " . "
                                    + mascaraRedBin[2] + " . " + mascaraRedBin[3]);

                            //INTRODUCIR VALORES EN CAMPO CLASE
                            String clase = calcBin.determinarClase(ipDecimal);
                            informacion.campoClase.setText(clase);

                            //INTRODUCIR VALORES CAMPO MASCARA SUBRED
                            String mascaraSubred = calculadora.getSubmascaraDecimal();
                            informacion.campoMascaraSubred.setText(mascaraSubred);

                            // INTRODUCIR VALORES EN CAMPO MASCARA SUBRED BIN
                            String mascaraSubredBin = calculadora.getSubmascaraBinario();
                            String MascaraSubRedBin = mascaraSubredBin.substring(0, 8) + " . " + mascaraSubredBin.substring(8, 16) + " . " + mascaraSubredBin.substring(16, 24) + " . " + mascaraSubredBin.substring(24, 32);
                            informacion.campoMascaraSubredBin.setText(MascaraSubRedBin);

                            //INTRODUCIR VALORES EN CAMPO HOST POR SUBRED
                            int hostPorSubred = calculadora.getHostPorSubred();
                            informacion.campoHostPSubred.setText(String.valueOf(hostPorSubred + "  Hosts por subred"));

                            //INTRODUCIR VALORES EN CAMPO SALTO DE RED
                            int saltoDeRed = calculadora.getSaltoDeRed();
                            int nuevaPotenciaSubmasc = calculadora.getNuevaPotenciaParaSubmasc();
                            if (nuevaPotenciaSubmasc >= 8 && nuevaPotenciaSubmasc <= 16) {//Determina en que octeto se realiza el salto, dependiendo de los bits encendidos de la submascara
                                informacion.campoSaltoRed.setText("De  " + saltoDeRed + "  en " + saltoDeRed + "  en el Segundo Octeto");
                            } else if (nuevaPotenciaSubmasc >= 17 && nuevaPotenciaSubmasc <= 24) {
                                informacion.campoSaltoRed.setText("De  " + saltoDeRed + "  en  " + saltoDeRed + "  en el Tercer Octeto");
                            } else if (nuevaPotenciaSubmasc >= 25 && nuevaPotenciaSubmasc <= 32) {
                                informacion.campoSaltoRed.setText("De  " + saltoDeRed + "  en  " + saltoDeRed + "  en el Cuarto Octeto");
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Error" + ex);
        }

    }//GEN-LAST:event_btnGenerarActionPerformed

    //COMBOBOX ANIDADO A MASCARA (PADRE = CLASE, HIJO = MASCARA)
    private void cbClaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbClaseItemStateChanged
        //controla los eventos del combo box clase
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cbClase.getSelectedIndex() > 0) {
                this.cbPrefijo.setModel(new DefaultComboBoxModel(getPrefijo(this.cbClase.getSelectedItem().toString())));
            }
        }

    }//GEN-LAST:event_cbClaseItemStateChanged

    // COMBOBOX ANIDADO A CANTIDAD DE SUBREDES (PADRE = MASCARA, HIJO = CANTIDAD DE SUBREDES)
    private void cbPrefijoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPrefijoItemStateChanged
        //controla los eventos del combo box prefijo
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cbPrefijo.getSelectedIndex() > 0) {
                this.cbCantSubredes.setModel(new DefaultComboBoxModel(
                        getCantSubRedes(this.cbPrefijo.getSelectedItem().toString())));
            }
        }

    }//GEN-LAST:event_cbPrefijoItemStateChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//        Informacion informacion = new Informacion(this, false);
//Elimina los datos de todos los campos
        primerOcteto.setText("");
        segundoOcteto.setText("");
        tercerOcteto.setText("");
        cuartoOcteto.setText("");
        cbClase.setSelectedIndex(0);
        cbPrefijo.setSelectedIndex(0);
        cbCantSubredes.setSelectedIndex(0);
        informacion.dispose();// Cierra la ventana  de Interfaz Informacion despues de presionar el boton "Eliminar"
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        interfazAyuda.setVisible(true);
    }//GEN-LAST:event_botonAyudaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbCantSubredes;
    private javax.swing.JComboBox<String> cbClase;
    private javax.swing.JComboBox<String> cbPrefijo;
    private javax.swing.JPanel cuadroParametros;
    private javax.swing.JPanel cuadroTipo;
    private javax.swing.JTextField cuartoOcteto;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondoCuadroParametros;
    private javax.swing.JLabel fondoInfoClases;
    private javax.swing.JTextField primerOcteto;
    private javax.swing.JSeparator segSeparador;
    private javax.swing.JTextField segundoOcteto;
    private javax.swing.JTextField tercerOcteto;
    private javax.swing.JLabel textoCantSR;
    private javax.swing.JLabel textoClase;
    private javax.swing.JLabel textoDirIp;
    private javax.swing.JLabel textoPrefijoRed;
    private javax.swing.JLabel textoRangoA;
    private javax.swing.JLabel textoRangoB;
    private javax.swing.JLabel textoRangoC;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel todoElemVentanaCalcu;
    // End of variables declaration//GEN-END:variables
*/

}
