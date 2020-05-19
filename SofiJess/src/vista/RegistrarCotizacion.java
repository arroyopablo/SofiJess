
package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RegistrarCotizacion extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    controlador.ControladorCotizacion buscar = new controlador.ControladorCotizacion();
    private int idcotizacion;
  
    private double compraTotal;
    

    public RegistrarCotizacion() {
        initComponents();
        String[] titulo = new String[]{"Codigo", "Nombre", "Cantidad", "V Unitario", "Valor Total"};
        dtm.setColumnIdentifiers(titulo);
        tlbDatos.setModel(dtm);
        numeroCotizacion.setEditable(false);
        fechaCotizacion.setEditable(false);
        controlador.ControladorCotizacion buscar = new controlador.ControladorCotizacion();
        idcotizacion = Integer.parseInt(buscar.codigoCotizacion());
        numeroCotizacion.setText(Integer.toString(idcotizacion));
        fechaCotizacion.setText(buscar.fechaActual());
        codigoProducCotizacion.setEditable(false);
        cantidadProductoCotizacion.setEditable(false);
        agregar.setEnabled(false);
        eliminarProducto.setEnabled(false);
        GuardarCotizacion.setEnabled(false);

        this.setLocationRelativeTo(this);
        this.setResizable(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        documentoClienteCotiza = new javax.swing.JTextField();
        vendedorCotizacion = new javax.swing.JTextField();
        codigoProducCotizacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cantidadProductoCotizacion = new javax.swing.JTextField();
        GuardarCotizacion = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        numeroCotizacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fechaCotizacion = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        totalCompra = new javax.swing.JLabel();
        eliminarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tlbDatos = new javax.swing.JTable();
        fecha = new javax.swing.JLabel();
        tbnGuardarCotizacion = new javax.swing.JButton();
        cancelarC = new javax.swing.JButton();
        GuardarCotizacion1 = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 10, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CREAR COTIZACION");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenlogoblanco.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Documento Cliente");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Documento vendedor");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Codigo Producto");

        vendedorCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedorCotizacionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Cantidad");

        cantidadProductoCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoCotizacionActionPerformed(evt);
            }
        });

        GuardarCotizacion.setBorder(null);
        GuardarCotizacion.setBorderPainted(false);
        GuardarCotizacion.setContentAreaFilled(false);
        GuardarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCotizacionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Numero Cotizacion");

        numeroCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCotizacionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Fecha");

        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setFocusPainted(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        totalCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalCompra.setForeground(new java.awt.Color(102, 102, 102));
        totalCompra.setText("Total");

        eliminarProducto.setText("ELIMINAR");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });

        tlbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tlbDatos);

        fecha.setText("Año/Mes/Dia");

        tbnGuardarCotizacion.setText("GUARDAR");
        tbnGuardarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnGuardarCotizacionActionPerformed(evt);
            }
        });

        cancelarC.setText("CANCELAR");
        cancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCActionPerformed(evt);
            }
        });

        GuardarCotizacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        GuardarCotizacion1.setBorder(null);
        GuardarCotizacion1.setBorderPainted(false);
        GuardarCotizacion1.setContentAreaFilled(false);
        GuardarCotizacion1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        GuardarCotizacion1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guradar.png"))); // NOI18N
        GuardarCotizacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCotizacion1ActionPerformed(evt);
            }
        });

        salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salir1.setBorderPainted(false);
        salir1.setContentAreaFilled(false);
        salir1.setFocusPainted(false);
        salir1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalir.PNG"))); // NOI18N
        salir1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(documentoClienteCotiza, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vendedorCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(GuardarCotizacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GuardarCotizacion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salir1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tbnGuardarCotizacion)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cantidadProductoCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(codigoProducCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(279, 279, 279)
                                        .addComponent(cancelarC)))))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarProducto)
                        .addGap(84, 84, 84))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(totalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(numeroCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fechaCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(documentoClienteCotiza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vendedorCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnGuardarCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(codigoProducCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cantidadProductoCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(eliminarProducto))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(totalCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(GuardarCotizacion)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuardarCotizacion1)
                            .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void vendedorCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedorCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendedorCotizacionActionPerformed

    private void cantidadProductoCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProductoCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProductoCotizacionActionPerformed

    private void GuardarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCotizacionActionPerformed

        int numerocotiza = Integer.parseInt(buscar.codigoCotizacion()) -1;
        System.out.println(numerocotiza);
        buscar.updateCompra(compraTotal,numerocotiza);
        codigoProducCotizacion.setEditable(false);
        cantidadProductoCotizacion.setEditable(false);
        agregar.setEnabled(false);
        eliminarProducto.setEnabled(false);
        GuardarCotizacion.setEnabled(false);
        documentoClienteCotiza.setText("");
        vendedorCotizacion.setText("");
        fechaCotizacion.setText(buscar.fechaActual());
        idcotizacion = Integer.parseInt(buscar.codigoCotizacion());
        numeroCotizacion.setText(Integer.toString(idcotizacion));
        tbnGuardarCotizacion.setEnabled(true);
        totalCompra.setText("Total: ");
        limpiarTabla();
    }//GEN-LAST:event_GuardarCotizacionActionPerformed

    private void numeroCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCotizacionActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        try {

            int codigoProducto = Integer.parseInt(codigoProducCotizacion.getText());
            controlador.ControladorCotizacion buscar = new controlador.ControladorCotizacion();
            String nombre = (buscar.buscarPro(codigoProducto));
            String precio = (buscar.buscarPrecio(codigoProducto));
            String codigo = (buscar.buscarCodigo(codigoProducto));
            String cantidad = cantidadProductoCotizacion.getText();
            float valort1 = Float.parseFloat(cantidad) * Float.parseFloat(precio);
            String valort = Float.toString(valort1);
            String iva = ivaProducto(Double.parseDouble(precio));

            if (cantidad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad");
            } else if (buscar.isNumeric(cantidad)) {
                agregar(codigo, nombre, cantidad, precio, valort);
                buscar.guardarDetalleC(idcotizacion, codigoProducto, Integer.parseInt(cantidad),
                    Double.parseDouble(precio), Double.parseDouble(iva), valort1);

                cantidadProductoCotizacion.setText("");
                codigoProducCotizacion.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un dato Correcto");
        }

        totalCompra.setText("Total: " + sumarTotal());
        compraTotal = Double.parseDouble(sumarTotal());
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProductoActionPerformed
        try {
            eliminarProducto();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe Selecionar la fila a eliminar");
        }
        //restarTotal();
        totalCompra.setText("Total: " + restarTotal());
        compraTotal = Double.parseDouble(restarTotal());
    }//GEN-LAST:event_eliminarProductoActionPerformed

    private void tbnGuardarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnGuardarCotizacionActionPerformed

        int cedulaClien = Integer.parseInt(documentoClienteCotiza.getText());
        int cedulaEmple = Integer.parseInt(vendedorCotizacion.getText());
        //Crea la cotizacion
        buscar.guardarCotizacion(cedulaClien, cedulaEmple);
        codigoProducCotizacion.setEditable(true);
        cantidadProductoCotizacion.setEditable(true);
        agregar.setEnabled(true);
        eliminarProducto.setEnabled(true);
        GuardarCotizacion.setEnabled(true);
        tbnGuardarCotizacion.setEnabled(false);
    }//GEN-LAST:event_tbnGuardarCotizacionActionPerformed

    private void cancelarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCActionPerformed

        codigoProducCotizacion.setEditable(false);
        cantidadProductoCotizacion.setEditable(false);
        agregar.setEnabled(false);
        eliminarProducto.setEnabled(false);
        GuardarCotizacion.setEnabled(false);

        documentoClienteCotiza.setText("");
        vendedorCotizacion.setText("");
        buscar.cancelarCotizacion(idcotizacion);
        numeroCotizacion.setText(Integer.toString(idcotizacion));
        fechaCotizacion.setText(buscar.fechaActual());
        tbnGuardarCotizacion.setEnabled(true);
    }//GEN-LAST:event_cancelarCActionPerformed

    private void GuardarCotizacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCotizacion1ActionPerformed

        int numerocotiza = Integer.parseInt(buscar.codigoCotizacion()) -1;
       // System.out.println(numerocotiza);
        buscar.updateCompra(compraTotal,numerocotiza);
        codigoProducCotizacion.setEditable(false);
        cantidadProductoCotizacion.setEditable(false);
        agregar.setEnabled(false);
        eliminarProducto.setEnabled(false);
        GuardarCotizacion.setEnabled(false);
        documentoClienteCotiza.setText("");
        vendedorCotizacion.setText("");
        fechaCotizacion.setText(buscar.fechaActual());
        idcotizacion = Integer.parseInt(buscar.codigoCotizacion());
        numeroCotizacion.setText(Integer.toString(idcotizacion));
        tbnGuardarCotizacion.setEnabled(true);
        totalCompra.setText("Total: ");
        limpiarTabla();
    }//GEN-LAST:event_GuardarCotizacion1ActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salir1ActionPerformed
        
    public void agregar(String codigo, String nombre, String cantidad, String precio, String valort) {      
        dtm.addRow(new Object[]{
            codigo, nombre, cantidad, precio, valort
        });
    }

    public void eliminarProducto() {
        int fila = tlbDatos.getSelectedRow();
        String codigopro = tlbDatos.getValueAt(fila, 0).toString();
        dtm.removeRow(fila);
        int codigo = Integer.parseInt(codigopro);
        System.out.println(codigo);
        buscar.cancelarProducto(codigo);
    }
    

    public String sumarTotal() {
        float fila = 0;
        float totalCompra = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            fila = Float.parseFloat(dtm.getValueAt(i, 4).toString());
            totalCompra += fila;
        }
        return Float.toString(totalCompra);
    }

    public String restarTotal() {
        float fila = 0;
        float totalCompra = 0;
        for (int i = 0; i < dtm.getRowCount(); i++) {
            fila = Float.parseFloat(dtm.getValueAt(i, 4).toString());
            totalCompra -= fila;

        }
        return Float.toString(-totalCompra);
    }

    public String ivaProducto(double precio) {
        double iva = 0;
        iva = precio * 0.19;

        return Double.toString(iva);
    }
    
    public void limpiarTabla(){
        int filas = dtm.getRowCount();
        for (int i = 0; i < filas; i++) {
            dtm.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarCotizacion;
    private javax.swing.JButton GuardarCotizacion1;
    private javax.swing.JButton agregar;
    private javax.swing.JButton cancelarC;
    private javax.swing.JTextField cantidadProductoCotizacion;
    private javax.swing.JTextField codigoProducCotizacion;
    private javax.swing.JTextField documentoClienteCotiza;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField fechaCotizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numeroCotizacion;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir1;
    private javax.swing.JButton tbnGuardarCotizacion;
    private javax.swing.JTable tlbDatos;
    public javax.swing.JLabel totalCompra;
    private javax.swing.JTextField vendedorCotizacion;
    // End of variables declaration//GEN-END:variables
}
