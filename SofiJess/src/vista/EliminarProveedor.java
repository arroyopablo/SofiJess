
package vista;

import javax.swing.JOptionPane;


public class EliminarProveedor extends javax.swing.JFrame {


    public EliminarProveedor() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false); 
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonBuscarProv = new javax.swing.JButton();
        salirCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nitProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        proveedorEliminar = new javax.swing.JTextArea();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 10, true));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("ELIMINAR PROVEEDOR");

        botonBuscarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarProv.setBorder(null);
        botonBuscarProv.setBorderPainted(false);
        botonBuscarProv.setContentAreaFilled(false);
        botonBuscarProv.setFocusPainted(false);
        botonBuscarProv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarProv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarProvActionPerformed(evt);
            }
        });

        salirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirCliente.setBorder(null);
        salirCliente.setBorderPainted(false);
        salirCliente.setContentAreaFilled(false);
        salirCliente.setFocusPainted(false);
        salirCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirClienteActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenlogoblanco.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Nit del Proveedor ");

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

        proveedorEliminar.setEditable(false);
        proveedorEliminar.setColumns(20);
        proveedorEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        proveedorEliminar.setRows(5);
        jScrollPane1.setViewportView(proveedorEliminar);

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar.setBorder(null);
        botonEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(50, 50, 50)
                                .addComponent(nitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(botonEliminar)
                        .addGap(110, 110, 110)
                        .addComponent(salirCliente)))
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonBuscarProv)
                .addGap(147, 147, 147))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarProv)
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salirCliente)
                    .addComponent(botonEliminar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    controlador.ControladorProveedor prove = new controlador.ControladorProveedor();
    private void botonBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProvActionPerformed
        int nit = Integer.parseInt(nitProveedor.getText());
        if(nitProveedor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR EL NIT DEL CLIENTE");
        }else{
            proveedorEliminar.setText(prove.buscarProv(nit));
        }

    }//GEN-LAST:event_botonBuscarProvActionPerformed

    private void salirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirClienteActionPerformed

    private void nitProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitProveedorActionPerformed

    }//GEN-LAST:event_nitProveedorActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        if(nitProveedor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE BUSCAR AL CLIENTE");
        }else if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el proveedor, ¿desea continuar?",
            "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        prove.eliminarProv(Integer.parseInt(nitProveedor.getText()));
        limpiarCampos();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void nitProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitProveedorKeyTyped
       char dato = evt.getKeyChar();
       if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_nitProveedorKeyTyped
    public void limpiarCampos(){
        nitProveedor.setText("");
        proveedorEliminar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarProv;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nitProveedor;
    private javax.swing.JTextArea proveedorEliminar;
    private javax.swing.JButton salirCliente;
    // End of variables declaration//GEN-END:variables
}