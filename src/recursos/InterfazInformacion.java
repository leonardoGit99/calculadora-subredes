
package recursos;


public class InterfazInformacion extends javax.swing.JFrame {


    public InterfazInformacion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cuadroInformacion = new javax.swing.JPanel();
        textoRed = new javax.swing.JLabel();
        campoRed = new javax.swing.JTextField();
        textoPrimeraIpUtil = new javax.swing.JLabel();
        campoPrimeraIpU = new javax.swing.JTextField();
        textoBroadcast = new javax.swing.JLabel();
        campoBroadcast = new javax.swing.JTextField();
        textoHostPorSubred = new javax.swing.JLabel();
        textoUltimaIpUtil = new javax.swing.JLabel();
        campoUltimaIpU = new javax.swing.JTextField();
        campoHostPSubred = new javax.swing.JTextField();
        textoSaltoSR = new javax.swing.JLabel();
        campoSaltoRed = new javax.swing.JTextField();
        textoMascaraSubred = new javax.swing.JLabel();
        campoMascaraSubred = new javax.swing.JTextField();
        separadorVertical = new javax.swing.JSeparator();
        textoTituloInfoSubred = new javax.swing.JLabel();
        textoTituloInfoRed = new javax.swing.JLabel();
        textoMascaraRed = new javax.swing.JLabel();
        campoMascaraRed = new javax.swing.JTextField();
        textoClaseInf = new javax.swing.JLabel();
        campoClase = new javax.swing.JTextField();
        textoIpBin = new javax.swing.JLabel();
        campoIpBin = new javax.swing.JTextField();
        textoRedBin = new javax.swing.JLabel();
        campoRedBin = new javax.swing.JTextField();
        textoBroadcastBin = new javax.swing.JLabel();
        campoBroadcastBin = new javax.swing.JTextField();
        textoMascaraRedBin = new javax.swing.JLabel();
        campoMascaraRedBin = new javax.swing.JTextField();
        textoMascaraSubredBin = new javax.swing.JLabel();
        campoMascaraSubredBin = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cuadroInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRed.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoRed.setForeground(new java.awt.Color(204, 255, 255));
        textoRed.setText("RED:");
        cuadroInformacion.add(textoRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, -1, -1));

        campoRed.setEditable(false);
        campoRed.setBackground(new java.awt.Color(204, 204, 204));
        campoRed.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoRed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoRed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 109, 273, 28));

        textoPrimeraIpUtil.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoPrimeraIpUtil.setForeground(new java.awt.Color(204, 255, 255));
        textoPrimeraIpUtil.setText("PRIMERA IP UTILIZABLE:");
        cuadroInformacion.add(textoPrimeraIpUtil, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 224, -1, -1));

        campoPrimeraIpU.setEditable(false);
        campoPrimeraIpU.setBackground(new java.awt.Color(204, 204, 204));
        campoPrimeraIpU.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoPrimeraIpU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPrimeraIpU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoPrimeraIpU, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 213, 273, 28));

        textoBroadcast.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoBroadcast.setForeground(new java.awt.Color(204, 255, 255));
        textoBroadcast.setText("BROADCAST:");
        cuadroInformacion.add(textoBroadcast, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 337, -1, -1));

        campoBroadcast.setEditable(false);
        campoBroadcast.setBackground(new java.awt.Color(204, 204, 204));
        campoBroadcast.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoBroadcast.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoBroadcast.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoBroadcast, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 326, 273, 28));

        textoHostPorSubred.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoHostPorSubred.setForeground(new java.awt.Color(204, 255, 255));
        textoHostPorSubred.setText("HOST POR SUBRED:");
        cuadroInformacion.add(textoHostPorSubred, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 189, -1, -1));

        textoUltimaIpUtil.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoUltimaIpUtil.setForeground(new java.awt.Color(204, 255, 255));
        textoUltimaIpUtil.setText("ULTIMA IP UTILIZABLE:");
        cuadroInformacion.add(textoUltimaIpUtil, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 282, -1, -1));

        campoUltimaIpU.setEditable(false);
        campoUltimaIpU.setBackground(new java.awt.Color(204, 204, 204));
        campoUltimaIpU.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoUltimaIpU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoUltimaIpU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoUltimaIpU, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 271, 273, 28));

        campoHostPSubred.setEditable(false);
        campoHostPSubred.setBackground(new java.awt.Color(204, 204, 204));
        campoHostPSubred.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoHostPSubred.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoHostPSubred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoHostPSubred, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 178, 273, 28));

        textoSaltoSR.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoSaltoSR.setForeground(new java.awt.Color(204, 255, 255));
        textoSaltoSR.setText("SALTO DE RED:");
        cuadroInformacion.add(textoSaltoSR, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 250, -1, -1));

        campoSaltoRed.setEditable(false);
        campoSaltoRed.setBackground(new java.awt.Color(204, 204, 204));
        campoSaltoRed.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoSaltoRed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSaltoRed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoSaltoRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 239, 273, 28));

        textoMascaraSubred.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoMascaraSubred.setForeground(new java.awt.Color(255, 255, 255));
        textoMascaraSubred.setText("MASCARA SUBRED:");
        cuadroInformacion.add(textoMascaraSubred, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 84, -1, -1));

        campoMascaraSubred.setEditable(false);
        campoMascaraSubred.setBackground(new java.awt.Color(204, 204, 204));
        campoMascaraSubred.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoMascaraSubred.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoMascaraSubred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoMascaraSubred, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 80, 273, 28));

        separadorVertical.setForeground(new java.awt.Color(255, 255, 255));
        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separadorVertical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cuadroInformacion.add(separadorVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 12, -1, 539));

        textoTituloInfoSubred.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoTituloInfoSubred.setForeground(new java.awt.Color(255, 255, 255));
        textoTituloInfoSubred.setText("                                      INFORMACIÓN DE SUBRED");
        textoTituloInfoSubred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cuadroInformacion.add(textoTituloInfoSubred, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 12, 453, 30));

        textoTituloInfoRed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoTituloInfoRed.setForeground(new java.awt.Color(255, 255, 255));
        textoTituloInfoRed.setText("                                        INFORMACIÓN DE RED");
        textoTituloInfoRed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cuadroInformacion.add(textoTituloInfoRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 470, 30));

        textoMascaraRed.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoMascaraRed.setForeground(new java.awt.Color(204, 255, 255));
        textoMascaraRed.setText("MASCARA DE RED:");
        cuadroInformacion.add(textoMascaraRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 445, -1, -1));

        campoMascaraRed.setEditable(false);
        campoMascaraRed.setBackground(new java.awt.Color(204, 204, 204));
        campoMascaraRed.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoMascaraRed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoMascaraRed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoMascaraRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 434, 273, 28));

        textoClaseInf.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoClaseInf.setForeground(new java.awt.Color(204, 255, 255));
        textoClaseInf.setText("CLASE:");
        cuadroInformacion.add(textoClaseInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 525, -1, -1));

        campoClase.setEditable(false);
        campoClase.setBackground(new java.awt.Color(204, 204, 204));
        campoClase.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoClase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoClase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 514, 273, 28));

        textoIpBin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoIpBin.setForeground(new java.awt.Color(255, 255, 255));
        textoIpBin.setText("IP BINARIO:");
        cuadroInformacion.add(textoIpBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 74, -1, -1));

        campoIpBin.setEditable(false);
        campoIpBin.setBackground(new java.awt.Color(204, 204, 204));
        campoIpBin.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoIpBin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoIpBin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoIpBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 63, 273, 28));

        textoRedBin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoRedBin.setForeground(new java.awt.Color(204, 255, 255));
        textoRedBin.setText("RED BINARIO:");
        cuadroInformacion.add(textoRedBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 170, -1, -1));

        campoRedBin.setEditable(false);
        campoRedBin.setBackground(new java.awt.Color(204, 204, 204));
        campoRedBin.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoRedBin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoRedBin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoRedBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 159, 273, 28));

        textoBroadcastBin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoBroadcastBin.setForeground(new java.awt.Color(204, 255, 255));
        textoBroadcastBin.setText("BROADCAST BINARIO:");
        cuadroInformacion.add(textoBroadcastBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 399, -1, -1));

        campoBroadcastBin.setEditable(false);
        campoBroadcastBin.setBackground(new java.awt.Color(204, 204, 204));
        campoBroadcastBin.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoBroadcastBin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoBroadcastBin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoBroadcastBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 388, 273, 28));

        textoMascaraRedBin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoMascaraRedBin.setForeground(new java.awt.Color(204, 255, 255));
        textoMascaraRedBin.setText("MASCARA DE RED BIN:");
        cuadroInformacion.add(textoMascaraRedBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 491, -1, -1));

        campoMascaraRedBin.setEditable(false);
        campoMascaraRedBin.setBackground(new java.awt.Color(204, 204, 204));
        campoMascaraRedBin.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoMascaraRedBin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoMascaraRedBin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoMascaraRedBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 480, 273, 28));

        textoMascaraSubredBin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        textoMascaraSubredBin.setForeground(new java.awt.Color(204, 255, 255));
        textoMascaraSubredBin.setText("MASCARA SUBRED BIN:");
        cuadroInformacion.add(textoMascaraSubredBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 136, -1, -1));

        campoMascaraSubredBin.setEditable(false);
        campoMascaraSubredBin.setBackground(new java.awt.Color(204, 204, 204));
        campoMascaraSubredBin.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        campoMascaraSubredBin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoMascaraSubredBin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cuadroInformacion.add(campoMascaraSubredBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 132, 273, 28));

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCalcIp.jpg"))); // NOI18N
        cuadroInformacion.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuadroInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuadroInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InterfazInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInformacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField campoBroadcast;
    public static javax.swing.JTextField campoBroadcastBin;
    public static javax.swing.JTextField campoClase;
    public static javax.swing.JTextField campoHostPSubred;
    public static javax.swing.JTextField campoIpBin;
    public static javax.swing.JTextField campoMascaraRed;
    public static javax.swing.JTextField campoMascaraRedBin;
    public static javax.swing.JTextField campoMascaraSubred;
    public static javax.swing.JTextField campoMascaraSubredBin;
    public static javax.swing.JTextField campoPrimeraIpU;
    public static javax.swing.JTextField campoRed;
    public static javax.swing.JTextField campoRedBin;
    public static javax.swing.JTextField campoSaltoRed;
    public static javax.swing.JTextField campoUltimaIpU;
    private javax.swing.JPanel cuadroInformacion;
    private javax.swing.JLabel fondo;
    private javax.swing.JSeparator separadorVertical;
    private javax.swing.JLabel textoBroadcast;
    private javax.swing.JLabel textoBroadcastBin;
    private javax.swing.JLabel textoClaseInf;
    private javax.swing.JLabel textoHostPorSubred;
    private javax.swing.JLabel textoIpBin;
    private javax.swing.JLabel textoMascaraRed;
    private javax.swing.JLabel textoMascaraRedBin;
    private javax.swing.JLabel textoMascaraSubred;
    private javax.swing.JLabel textoMascaraSubredBin;
    private javax.swing.JLabel textoPrimeraIpUtil;
    private javax.swing.JLabel textoRed;
    private javax.swing.JLabel textoRedBin;
    private javax.swing.JLabel textoSaltoSR;
    private javax.swing.JLabel textoTituloInfoRed;
    private javax.swing.JLabel textoTituloInfoSubred;
    private javax.swing.JLabel textoUltimaIpUtil;
    // End of variables declaration//GEN-END:variables
}
