
package vista;


public class GestionReporte extends javax.swing.JFrame {


    public GestionReporte() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reporteEmpleado = new javax.swing.JButton();
        reporteProudcto = new javax.swing.JButton();
        editarCotizacion = new javax.swing.JButton();
        buscarCotizacion = new javax.swing.JButton();
        atrasCotizacion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 10, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(604, 555));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTES.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("GESTION REPORTES");

        reporteEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EMPLEADObOTON.PNG"))); // NOI18N
        reporteEmpleado.setBorder(null);
        reporteEmpleado.setBorderPainted(false);
        reporteEmpleado.setContentAreaFilled(false);
        reporteEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EMPLEADObOTON.PNG"))); // NOI18N
        reporteEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EMPLEADObOTON.PNG"))); // NOI18N
        reporteEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteEmpleadoActionPerformed(evt);
            }
        });

        reporteProudcto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRODUCTOboton.PNG"))); // NOI18N
        reporteProudcto.setBorder(null);
        reporteProudcto.setBorderPainted(false);
        reporteProudcto.setContentAreaFilled(false);
        reporteProudcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteProudctoActionPerformed(evt);
            }
        });

        editarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLIENTEBOTON.PNG"))); // NOI18N
        editarCotizacion.setBorder(null);
        editarCotizacion.setBorderPainted(false);
        editarCotizacion.setContentAreaFilled(false);
        editarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCotizacionActionPerformed(evt);
            }
        });

        buscarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/COTIZACIONESboton.PNG"))); // NOI18N
        buscarCotizacion.setBorder(null);
        buscarCotizacion.setBorderPainted(false);
        buscarCotizacion.setContentAreaFilled(false);
        buscarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCotizacionActionPerformed(evt);
            }
        });

        atrasCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS2.png"))); // NOI18N
        atrasCotizacion.setToolTipText("");
        atrasCotizacion.setBorder(null);
        atrasCotizacion.setBorderPainted(false);
        atrasCotizacion.setContentAreaFilled(false);
        atrasCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasCotizacionActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/silver.PNG"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONOeMPLEADO.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Producto.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clienteimagenqw.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cotizacion.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reporteProudcto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarCotizacion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarCotizacion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reporteEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atrasCotizacion)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(reporteEmpleado))
                                        .addGap(45, 45, 45)
                                        .addComponent(reporteProudcto))
                                    .addComponent(jLabel5))
                                .addGap(45, 45, 45)
                                .addComponent(editarCotizacion))
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscarCotizacion)
                            .addComponent(jLabel7))
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(atrasCotizacion)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reporteEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteEmpleadoActionPerformed
        GenrarPdfEmpleado vista = new GenrarPdfEmpleado();
        vista.setVisible(true);
    }//GEN-LAST:event_reporteEmpleadoActionPerformed

    private void atrasCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasCotizacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_atrasCotizacionActionPerformed
    
    private void reporteProudctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteProudctoActionPerformed
        GenerarPdfProducto vista1 = new GenerarPdfProducto();
        vista1.setVisible(true);
    }//GEN-LAST:event_reporteProudctoActionPerformed

    private void editarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCotizacionActionPerformed
        GenerarPdfCliente vista1 = new GenerarPdfCliente();
        vista1.setVisible(true);
    }//GEN-LAST:event_editarCotizacionActionPerformed

    private void buscarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarCotizacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasCotizacion;
    private javax.swing.JButton buscarCotizacion;
    private javax.swing.JButton editarCotizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reporteEmpleado;
    private javax.swing.JButton reporteProudcto;
    // End of variables declaration//GEN-END:variables
}
