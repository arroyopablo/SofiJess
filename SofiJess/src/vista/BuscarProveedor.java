
package vista;

import javax.swing.JOptionPane;

public class BuscarProveedor extends javax.swing.JFrame {


    public BuscarProveedor() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nitProveedor = new javax.swing.JTextField();
        buscarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        busquedaProveedor = new javax.swing.JTextArea();
        salirProveedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BUSCAR PROVEEDOR");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenlogoblanco.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Nit Proveedor");

        nitProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitProveedorActionPerformed(evt);
            }
        });
        nitProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitProveedorKeyTyped(evt);
            }
        });

        buscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarProveedor.setBorder(null);
        buscarProveedor.setBorderPainted(false);
        buscarProveedor.setContentAreaFilled(false);
        buscarProveedor.setFocusPainted(false);
        buscarProveedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProveedorActionPerformed(evt);
            }
        });

        busquedaProveedor.setEditable(false);
        busquedaProveedor.setColumns(20);
        busquedaProveedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        busquedaProveedor.setRows(5);
        jScrollPane1.setViewportView(busquedaProveedor);

        salirProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirProveedor.setBorder(null);
        salirProveedor.setBorderPainted(false);
        salirProveedor.setContentAreaFilled(false);
        salirProveedor.setFocusPainted(false);
        salirProveedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirProveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(buscarProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(salirProveedor)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarProveedor)
                    .addComponent(salirProveedor))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(nitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(84, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void nitProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitProveedorActionPerformed

    private void buscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProveedorActionPerformed
        controlador.ControladorProveedor buscar  = new controlador.ControladorProveedor();
        if(nitProveedor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA CEDULA DEL CLIENTE");
        }else{
            int nit = Integer.parseInt(nitProveedor.getText());
            busquedaProveedor.setText(buscar.buscarProv(nit));
            nitProveedor.setText("");
        }
        
    }//GEN-LAST:event_buscarProveedorActionPerformed

    private void salirProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirProveedorActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirProveedorActionPerformed

    private void nitProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitProveedorKeyTyped
       char dato = evt.getKeyChar();
       if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_nitProveedorKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarProveedor;
    private javax.swing.JTextArea busquedaProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nitProveedor;
    private javax.swing.JButton salirProveedor;
    // End of variables declaration//GEN-END:variables
}
