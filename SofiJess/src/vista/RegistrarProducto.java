package vista;

import javax.swing.JOptionPane;

public class RegistrarProducto extends javax.swing.JFrame {

    public RegistrarProducto() {
        initComponents();

        this.setLocationRelativeTo(this);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        guardarProducto = new javax.swing.JButton();
        salirProducto = new javax.swing.JButton();
        nombreProducto = new javax.swing.JTextField();
        codigoProducto = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        descripcionProducto = new javax.swing.JTextField();
        cantidadProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        proveedirProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 10, true));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("REGISTAR PRODUCTO");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Codigo");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Descrpcion");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Cantidad");

        guardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto.setBorder(null);
        guardarProducto.setBorderPainted(false);
        guardarProducto.setContentAreaFilled(false);
        guardarProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });

        salirProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirProducto.setBorder(null);
        salirProducto.setBorderPainted(false);
        salirProducto.setContentAreaFilled(false);
        salirProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirProductoActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenlogoblanco.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Proveedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(guardarProducto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(salirProducto)
                                .addComponent(cantidadProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                                .addComponent(descripcionProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(precioProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(codigoProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(proveedirProducto, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(60, 60, 60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel4))
                            .addComponent(codigoProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6))
                    .addComponent(descripcionProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(proveedirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarProducto)
                    .addComponent(salirProducto))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
        String nombre = nombreProducto.getText();
        int codigo = Integer.parseInt(codigoProducto.getText());
        double precio = Double.parseDouble(precioProducto.getText());
        String descripcion = descripcionProducto.getText();
        int cantidad = Integer.parseInt(cantidadProducto.getText());
        String proveedor = proveedirProducto.getText();

        controlador.ControladorProducto producto = new controlador.ControladorProducto();
        String resultado = producto.verificarExitencia(codigo);
        
        if(resultado.equals("No esta")){
          producto.guardarProducto(nombre, codigo, precio, descripcion, cantidad, proveedor);
          limpiarCampos();  
        }
    
    }//GEN-LAST:event_guardarProductoActionPerformed

    private void salirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirProductoActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirProductoActionPerformed

    public void limpiarCampos(){
        nombreProducto.setText(" ");
        codigoProducto.setText(" ");
        precioProducto.setText(" ");
        descripcionProducto.setText(" ");
        cantidadProducto.setText(" ");
        proveedirProducto.setText(" ");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadProducto;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JTextField descripcionProducto;
    private javax.swing.JButton guardarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JTextField proveedirProducto;
    private javax.swing.JButton salirProducto;
    // End of variables declaration//GEN-END:variables
}
