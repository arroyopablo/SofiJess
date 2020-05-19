package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DAOEmpleado;




public class GestionEmpleado extends javax.swing.JFrame {
    DAOEmpleado emple = new DAOEmpleado();

    public GestionEmpleado() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        
        jTabbedPaneClientes.setVisible(true);
        jTabbedPaneCotizaciones.setVisible(false);
        jTabbedPaneProductos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanelTituloEmp = new javax.swing.JPanel();
        nombreUsuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanelMenuEmp = new javax.swing.JPanel();
        botonProductos = new javax.swing.JButton();
        clientes = new javax.swing.JButton();
        cotizaciones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPaneClientes = new javax.swing.JTabbedPane();
        jPanelCrearCli = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        cedulaCliente = new javax.swing.JTextField();
        nombreCliente1 = new javax.swing.JTextField();
        apellidoCliente1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        guardarCliente1 = new javax.swing.JButton();
        telCliente1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        BarrioCliente1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        direccinCliete1 = new javax.swing.JTextField();
        CorreoCliente1 = new javax.swing.JTextField();
        jPanelBuscarCli = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buscarCliente = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        cedulCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultadoBusqueda1 = new javax.swing.JTextArea();
        jPanelEliminarCli = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        botonBuscarCli1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        cedulCliente2 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        clienteaEliminar = new javax.swing.JTextArea();
        botonEliminar1 = new javax.swing.JButton();
        jPanelEditarCli = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        direccinCliete = new javax.swing.JTextField();
        apellidoCliente = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        guardarCliente = new javax.swing.JButton();
        nombreCliente = new javax.swing.JTextField();
        telCliente = new javax.swing.JTextField();
        BarrioCliente = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cedulCliente1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        CorreoCliente = new javax.swing.JTextField();
        jPanelListarCli = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDatos1 = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        botonListar1 = new javax.swing.JButton();
        txtValorBusqueda1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        cboxFiltro1 = new javax.swing.JComboBox<>();
        jTabbedPaneCotizaciones = new javax.swing.JTabbedPane();
        jPanelCrearCotizacion = new javax.swing.JPanel();
        totalCompra = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        eliminarProducto = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        tbnGuardarCotizacion = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        cancelarC = new javax.swing.JButton();
        fechaCotizacion = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tlbDatos = new javax.swing.JTable();
        numeroCotizacion = new javax.swing.JTextField();
        vendedorCotizacion = new javax.swing.JTextField();
        GuardarCotizacion = new javax.swing.JButton();
        documentoClienteCotiza = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        codigoProducCotizacion = new javax.swing.JTextField();
        cantidadProductoCotizacion = new javax.swing.JTextField();
        GuardarCotizacion1 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanelBuscarCotizacion = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        resultadocotizacion = new javax.swing.JTextArea();
        jLabel64 = new javax.swing.JLabel();
        buscarCotizacion = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        resultadodetalle = new javax.swing.JTextArea();
        numeroCotizacion1 = new javax.swing.JTextField();
        jTabbedPaneProductos = new javax.swing.JTabbedPane();
        panelCrear = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        guardarProducto = new javax.swing.JButton();
        nombreProducto = new javax.swing.JTextField();
        codigoProducto = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        descripcionProducto = new javax.swing.JTextField();
        cantidadProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        proveedirProducto = new javax.swing.JTextField();
        panelEliminar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        botonBuscarCli = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        codigoProduccto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productoEliminar = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        panelEditar = new javax.swing.JPanel();
        descripcionProducto1 = new javax.swing.JTextField();
        precioProducto1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cantidadProducto1 = new javax.swing.JTextField();
        nitProveedor = new javax.swing.JTextField();
        nombrProducto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        guardarProducto1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        codigoProducto1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        panelBuscar = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        buscarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadoBusqueda = new javax.swing.JTextArea();
        codigoProducto2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        panelListar = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        txtValorBusqueda = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cboxFiltro = new javax.swing.JComboBox<>();
        botonListar = new javax.swing.JButton();
        jPanelSalida = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane2.setOpaque(true);
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTituloEmp.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTituloEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanelTituloEmp.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 42, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONOUSUARIO.png"))); // NOI18N
        jPanelTituloEmp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("GESTION VENDEDOR");
        jPanelTituloEmp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 400, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logopapeleria.png"))); // NOI18N
        jPanelTituloEmp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, -1, 60));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit icon2.png"))); // NOI18N
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        jPanelTituloEmp.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, -1, -1));

        jLayeredPane2.add(jPanelTituloEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1183, 60));

        jPanelMenuEmp.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenuEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenuEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRODUCTOboton.PNG"))); // NOI18N
        botonProductos.setBorder(null);
        botonProductos.setBorderPainted(false);
        botonProductos.setContentAreaFilled(false);
        botonProductos.setFocusPainted(false);
        botonProductos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRODUCTOboton.PNG"))); // NOI18N
        botonProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PRODUCTOboton.PNG"))); // NOI18N
        botonProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonProductosMouseClicked(evt);
            }
        });
        botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosActionPerformed(evt);
            }
        });
        jPanelMenuEmp.add(botonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 130, -1));

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLIENTEBOTON.PNG"))); // NOI18N
        clientes.setBorder(null);
        clientes.setBorderPainted(false);
        clientes.setContentAreaFilled(false);
        clientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLIENTEBOTON.PNG"))); // NOI18N
        clientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLIENTEBOTON.PNG"))); // NOI18N
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        jPanelMenuEmp.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 130, -1));

        cotizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/COTIZACIONESboton.PNG"))); // NOI18N
        cotizaciones.setBorder(null);
        cotizaciones.setBorderPainted(false);
        cotizaciones.setContentAreaFilled(false);
        cotizaciones.setFocusPainted(false);
        cotizaciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/COTIZACIONESboton.PNG"))); // NOI18N
        cotizaciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/COTIZACIONESboton.PNG"))); // NOI18N
        cotizaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cotizacionesMouseClicked(evt);
            }
        });
        cotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizacionesActionPerformed(evt);
            }
        });
        jPanelMenuEmp.add(cotizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 130, -1));
        jPanelMenuEmp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 132, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        jPanelMenuEmp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cotizacion.png"))); // NOI18N
        jPanelMenuEmp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clienteimagenqw.png"))); // NOI18N
        jPanelMenuEmp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLayeredPane2.add(jPanelMenuEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 70, 217, 560));

        jTabbedPaneClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTabbedPaneClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanelCrearCli.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCrearCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel47.setText("REGISTAR CLIENTE");
        jPanelCrearCli.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setText("Nombre");
        jPanelCrearCli.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));
        jPanelCrearCli.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 211, -1, -1));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel50.setText("Barrio");
        jPanelCrearCli.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        cedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaClienteActionPerformed(evt);
            }
        });
        jPanelCrearCli.add(cedulaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 355, -1));

        nombreCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCliente1ActionPerformed(evt);
            }
        });
        jPanelCrearCli.add(nombreCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 95, 360, -1));
        jPanelCrearCli.add(apellidoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 355, -1));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel51.setText("Direccion");
        jPanelCrearCli.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        guardarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarCliente1.setBorder(null);
        guardarCliente1.setBorderPainted(false);
        guardarCliente1.setContentAreaFilled(false);
        guardarCliente1.setFocusPainted(false);
        guardarCliente1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarCliente1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCliente1ActionPerformed(evt);
            }
        });
        jPanelCrearCli.add(guardarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 471, -1, -1));
        jPanelCrearCli.add(telCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 355, -1));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel52.setText("Correo");
        jPanelCrearCli.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setText("Cedula");
        jPanelCrearCli.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
        jPanelCrearCli.add(BarrioCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 355, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Telefono");
        jPanelCrearCli.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Apellido");
        jPanelCrearCli.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));
        jPanelCrearCli.add(direccinCliete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 355, -1));
        jPanelCrearCli.add(CorreoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 355, -1));

        jTabbedPaneClientes.addTab("Crear", jPanelCrearCli);

        jPanelBuscarCli.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBuscarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("BUSCAR CLIENTE");
        jPanelBuscarCli.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));
        jPanelBuscarCli.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 302, -1, -1));

        buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarCliente.setBorder(null);
        buscarCliente.setBorderPainted(false);
        buscarCliente.setContentAreaFilled(false);
        buscarCliente.setFocusPainted(false);
        buscarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });
        jPanelBuscarCli.add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 88, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Cedula del Cliente ");
        jPanelBuscarCli.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 100, -1, -1));

        cedulCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulClienteActionPerformed(evt);
            }
        });
        cedulCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulClienteKeyTyped(evt);
            }
        });
        jPanelBuscarCli.add(cedulCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 99, 267, -1));

        resultadoBusqueda1.setEditable(false);
        resultadoBusqueda1.setColumns(20);
        resultadoBusqueda1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadoBusqueda1.setRows(5);
        jScrollPane3.setViewportView(resultadoBusqueda1);

        jPanelBuscarCli.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 195, 502, 296));

        jTabbedPaneClientes.addTab("Buscar", jPanelBuscarCli);

        jPanelEliminarCli.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEliminarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelEliminarCli.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 272, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel43.setText("ELIMINAR CLIENTE");
        jPanelEliminarCli.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        botonBuscarCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarCli1.setBorder(null);
        botonBuscarCli1.setBorderPainted(false);
        botonBuscarCli1.setContentAreaFilled(false);
        botonBuscarCli1.setFocusPainted(false);
        botonBuscarCli1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarCli1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCli1ActionPerformed(evt);
            }
        });
        jPanelEliminarCli.add(botonBuscarCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("Cedula del Cliente ");
        jPanelEliminarCli.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        cedulCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulCliente2ActionPerformed(evt);
            }
        });
        cedulCliente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulCliente2KeyTyped(evt);
            }
        });
        jPanelEliminarCli.add(cedulCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 267, -1));

        clienteaEliminar.setEditable(false);
        clienteaEliminar.setColumns(20);
        clienteaEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clienteaEliminar.setRows(5);
        jScrollPane5.setViewportView(clienteaEliminar);

        jPanelEliminarCli.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 444, 162));

        botonEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar1.setBorder(null);
        botonEliminar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar1ActionPerformed(evt);
            }
        });
        jPanelEliminarCli.add(botonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jTabbedPaneClientes.addTab("Eliminar", jPanelEliminarCli);

        jPanelEditarCli.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEditarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Telefono ");
        jPanelEditarCli.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));
        jPanelEditarCli.add(direccinCliete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 355, -1));
        jPanelEditarCli.add(apellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 355, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("Apellido Cliente");
        jPanelEditarCli.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        guardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarCliente.setBorder(null);
        guardarCliente.setBorderPainted(false);
        guardarCliente.setContentAreaFilled(false);
        guardarCliente.setFocusPainted(false);
        guardarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarClienteActionPerformed(evt);
            }
        });
        jPanelEditarCli.add(guardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });
        nombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreClienteKeyTyped(evt);
            }
        });
        jPanelEditarCli.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 355, -1));
        jPanelEditarCli.add(telCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 355, -1));
        jPanelEditarCli.add(BarrioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 355, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Barrio ");
        jPanelEditarCli.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Direccion ");
        jPanelEditarCli.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel37.setText("EDITAR CLIENTE");
        jPanelEditarCli.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Nombre Cliente");
        jPanelEditarCli.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));
        jPanelEditarCli.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 246, -1, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setText("Cedula del Cliente a Editar");
        jPanelEditarCli.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        cedulCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulCliente1ActionPerformed(evt);
            }
        });
        cedulCliente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulCliente1KeyTyped(evt);
            }
        });
        jPanelEditarCli.add(cedulCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 360, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Correo");
        jPanelEditarCli.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));
        jPanelEditarCli.add(CorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 355, -1));

        jTabbedPaneClientes.addTab("Editar", jPanelEditarCli);

        jPanelListarCli.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "CEDULA", "TELEFONO", "DIRECCION", "BARRIO", "CORREO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblDatos1);

        jPanelListarCli.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 196, 780, 290));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel45.setText("LISTAR CLIENTE");
        jPanelListarCli.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        botonListar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonListar.PNG"))); // NOI18N
        botonListar1.setBorder(null);
        botonListar1.setBorderPainted(false);
        botonListar1.setContentAreaFilled(false);
        botonListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListar1ActionPerformed(evt);
            }
        });
        jPanelListarCli.add(botonListar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 115, 34));
        jPanelListarCli.add(txtValorBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 81, 406, -1));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setText("LISTAR POR:");
        jPanelListarCli.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        cboxFiltro1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cboxFiltro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Barrio", "Todos" }));
        cboxFiltro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltro1ActionPerformed(evt);
            }
        });
        jPanelListarCli.add(cboxFiltro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 143, -1));

        jTabbedPaneClientes.addTab("Listar", jPanelListarCli);

        jLayeredPane2.add(jTabbedPaneClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 966, 560));

        jTabbedPaneCotizaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTabbedPaneCotizaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanelCrearCotizacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCrearCotizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalCompra.setText("Total");
        jPanelCrearCotizacion.add(totalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 437, 323, -1));

        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanelCrearCotizacion.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 220, -1, -1));

        eliminarProducto.setText("ELIMINAR");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });
        jPanelCrearCotizacion.add(eliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 220, 85, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Documento Cliente");
        jPanelCrearCotizacion.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 152, -1, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel57.setText("Cantidad");
        jPanelCrearCotizacion.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 175, -1, -1));

        tbnGuardarCotizacion.setText("GUARDAR");
        tbnGuardarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnGuardarCotizacionActionPerformed(evt);
            }
        });
        jPanelCrearCotizacion.add(tbnGuardarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 222, -1, -1));

        fecha.setText("AA/MM/DD");
        jPanelCrearCotizacion.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 97, -1, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel58.setText("Numero Cotizacion");
        jPanelCrearCotizacion.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 59, -1, -1));

        cancelarC.setText("CANCELAR");
        cancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCActionPerformed(evt);
            }
        });
        jPanelCrearCotizacion.add(cancelarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 222, -1, -1));
        jPanelCrearCotizacion.add(fechaCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 117, 97, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setText("Fecha");
        jPanelCrearCotizacion.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 117, -1, -1));

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
        jScrollPane7.setViewportView(tlbDatos);

        jPanelCrearCotizacion.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 299, -1, 120));

        numeroCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCotizacionActionPerformed(evt);
            }
        });
        jPanelCrearCotizacion.add(numeroCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 59, 117, -1));

        vendedorCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedorCotizacionActionPerformed(evt);
            }
        });
        jPanelCrearCotizacion.add(vendedorCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 193, 322, -1));

        GuardarCotizacion.setBorder(null);
        GuardarCotizacion.setBorderPainted(false);
        GuardarCotizacion.setContentAreaFilled(false);
        GuardarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCotizacionActionPerformed(evt);
            }
        });
        jPanelCrearCotizacion.add(GuardarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 528, -1, -1));
        jPanelCrearCotizacion.add(documentoClienteCotiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 155, 322, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setText("Documento vendedor");
        jPanelCrearCotizacion.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 187, -1, -1));
        jPanelCrearCotizacion.add(codigoProducCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 143, 87, -1));

        cantidadProductoCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoCotizacionActionPerformed(evt);
            }
        });
        jPanelCrearCotizacion.add(cantidadProductoCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 174, 86, -1));

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
        jPanelCrearCotizacion.add(GuardarCotizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 123, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel61.setText("CREAR COTIZACION");
        jPanelCrearCotizacion.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 407, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Codigo Producto");
        jPanelCrearCotizacion.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 144, -1, -1));

        jTabbedPaneCotizaciones.addTab("Crear", jPanelCrearCotizacion);

        jPanelBuscarCotizacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBuscarCotizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel63.setText("Numero Cotizacion ");
        jPanelBuscarCotizacion.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        resultadocotizacion.setEditable(false);
        resultadocotizacion.setColumns(20);
        resultadocotizacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadocotizacion.setRows(5);
        jScrollPane8.setViewportView(resultadocotizacion);

        jPanelBuscarCotizacion.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 470, 108));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel64.setText("BUSCAR COTIZACION");
        jPanelBuscarCotizacion.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        buscarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarCotizacion.setBorder(null);
        buscarCotizacion.setBorderPainted(false);
        buscarCotizacion.setContentAreaFilled(false);
        buscarCotizacion.setFocusPainted(false);
        buscarCotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarCotizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCotizacionActionPerformed(evt);
            }
        });
        jPanelBuscarCotizacion.add(buscarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        resultadodetalle.setEditable(false);
        resultadodetalle.setColumns(20);
        resultadodetalle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadodetalle.setRows(5);
        jScrollPane9.setViewportView(resultadodetalle);

        jPanelBuscarCotizacion.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 470, 168));
        jPanelBuscarCotizacion.add(numeroCotizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 183, -1));

        jTabbedPaneCotizaciones.addTab("Buscar", jPanelBuscarCotizacion);

        jLayeredPane2.add(jTabbedPaneCotizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 966, 560));

        jTabbedPaneProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTabbedPaneProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPaneProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneProductosMouseClicked(evt);
            }
        });

        panelCrear.setBackground(new java.awt.Color(255, 255, 255));
        panelCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("REGISTAR PRODUCTO");
        panelCrear.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 416, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Nombre");
        panelCrear.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Codigo");
        panelCrear.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Precio");
        panelCrear.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Descrpcion");
        panelCrear.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad");
        panelCrear.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        guardarProducto.setBackground(new java.awt.Color(2, 184, 2));
        guardarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        guardarProducto.setText("GUARDAR");
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });
        panelCrear.add(guardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, 35));
        panelCrear.add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 94, 359, 28));
        panelCrear.add(codigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 359, 28));
        panelCrear.add(precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 361, 28));
        panelCrear.add(descripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 361, 28));
        panelCrear.add(cantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 361, 28));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Proveedor");
        panelCrear.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));
        panelCrear.add(proveedirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 359, 28));

        jTabbedPaneProductos.addTab("Crear", panelCrear);

        panelEliminar.setBackground(new java.awt.Color(255, 255, 255));
        panelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("ELIMINAR PRODUCTO");
        panelEliminar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        botonBuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarCli.setBorder(null);
        botonBuscarCli.setBorderPainted(false);
        botonBuscarCli.setContentAreaFilled(false);
        botonBuscarCli.setFocusPainted(false);
        botonBuscarCli.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarCli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCliActionPerformed(evt);
            }
        });
        panelEliminar.add(botonBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Codigo del producto");
        panelEliminar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 79, -1, -1));

        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar.setBorder(null);
        botonEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelEliminar.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        codigoProduccto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProducctoActionPerformed(evt);
            }
        });
        codigoProduccto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoProducctoKeyTyped(evt);
            }
        });
        panelEliminar.add(codigoProduccto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 267, -1));

        productoEliminar.setEditable(false);
        productoEliminar.setColumns(20);
        productoEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        productoEliminar.setRows(5);
        jScrollPane1.setViewportView(productoEliminar);

        panelEliminar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 200, 444, 162));
        panelEliminar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 258, -1, -1));

        jTabbedPaneProductos.addTab("Eliminar", panelEliminar);

        panelEditar.setBackground(new java.awt.Color(255, 255, 255));
        panelEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcionProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionProducto1ActionPerformed(evt);
            }
        });
        panelEditar.add(descripcionProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 268, 355, -1));
        panelEditar.add(precioProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 218, 355, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Descripcion Producto");
        panelEditar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Nombre Producto");
        panelEditar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));
        panelEditar.add(cantidadProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 318, 355, -1));
        panelEditar.add(nitProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 368, 355, -1));

        nombrProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrProductoActionPerformed(evt);
            }
        });
        panelEditar.add(nombrProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 168, 355, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Nit Proveedor");
        panelEditar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Cantidad");
        panelEditar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Codigo del producto a editar");
        panelEditar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 105, -1, -1));

        guardarProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto1.setBorder(null);
        guardarProducto1.setBorderPainted(false);
        guardarProducto1.setContentAreaFilled(false);
        guardarProducto1.setFocusPainted(false);
        guardarProducto1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProducto1ActionPerformed(evt);
            }
        });
        panelEditar.add(guardarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));
        panelEditar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 268, -1, -1));

        codigoProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProducto1ActionPerformed(evt);
            }
        });
        panelEditar.add(codigoProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 104, 354, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setText("Precio Producto");
        panelEditar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("EDITAR PRODUCTO");
        panelEditar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jTabbedPaneProductos.addTab("Editar", panelEditar);

        panelBuscar.setBackground(new java.awt.Color(255, 255, 255));
        panelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Codigo del producto");
        panelBuscar.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        buscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarProducto.setBorder(null);
        buscarProducto.setBorderPainted(false);
        buscarProducto.setContentAreaFilled(false);
        buscarProducto.setFocusPainted(false);
        buscarProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProductoActionPerformed(evt);
            }
        });
        panelBuscar.add(buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        resultadoBusqueda.setEditable(false);
        resultadoBusqueda.setColumns(20);
        resultadoBusqueda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadoBusqueda.setRows(5);
        jScrollPane2.setViewportView(resultadoBusqueda);

        panelBuscar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 444, 274));

        codigoProducto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProducto2ActionPerformed(evt);
            }
        });
        codigoProducto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoProducto2KeyTyped(evt);
            }
        });
        panelBuscar.add(codigoProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 267, 29));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setText("BUSCAR PRODUCTO");
        panelBuscar.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jTabbedPaneProductos.addTab("Buscar", panelBuscar);

        panelListar.setBackground(new java.awt.Color(255, 255, 255));
        panelListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "CODIGO", "PRECIO", "DESCRIPCION", "CANTIDAD", "NIT PROVEEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblDatos);

        panelListar.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 708, 250));
        panelListar.add(txtValorBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 352, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("LISTAR POR:");
        panelListar.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 92, -1, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel33.setText("LISTAR PRODUCTO");
        panelListar.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        cboxFiltro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cboxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Precio", "Cantidad", "Nit Proveedor", "Todos" }));
        cboxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltroActionPerformed(evt);
            }
        });
        panelListar.add(cboxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 185, -1));

        botonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonListar.PNG"))); // NOI18N
        botonListar.setBorder(null);
        botonListar.setBorderPainted(false);
        botonListar.setContentAreaFilled(false);
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });
        panelListar.add(botonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jTabbedPaneProductos.addTab("Listar", panelListar);

        jLayeredPane2.add(jTabbedPaneProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 966, 560));

        jPanelSalida.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSalida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(0, 102, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("CERRAR SESIÓN");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMaximumSize(new java.awt.Dimension(107, 23));
        jButton7.setMinimumSize(new java.awt.Dimension(107, 23));
        jButton7.setPreferredSize(new java.awt.Dimension(107, 23));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelSalida.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 136, 36));

        jLayeredPane2.add(jPanelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 630, 1183, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    modelo.DAOProducto listarPro = new modelo.DAOProducto();
    controlador.ControladorProducto produ = new controlador.ControladorProducto();
    
    controlador.ControladorCliente cliente  = new controlador.ControladorCliente();
    modelo.DAOCliente listarCli = new  modelo.DAOCliente();
    DefaultTableModel dtm = new DefaultTableModel();
    
    controlador.ControladorCotizacion buscar = new controlador.ControladorCotizacion();
    private int idcotizacion;
    private double compraTotal;
 //   modelo.DAOCliente eliminarCli = new modelo.DAOCliente();
 //   modelo.DAOCliente listarCli = new modelo.DAOCliente();
 //   controlador.ControladorCliente cliente = new controlador.ControladorCliente();
    
    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
     //   ControlProducto vistaProducto = new ControlProducto();
     //   vistaProducto.setVisible(true);
               
    }//GEN-LAST:event_botonProductosActionPerformed

    private void cotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizacionesActionPerformed
     //   ControlCotizacion vistaCotizacion = new ControlCotizacion();
     //   vistaCotizacion.setVisible(true);
    }//GEN-LAST:event_cotizacionesActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
     //   ControlCLiente vistaCliente = new ControlCLiente();
     //   vistaCliente.setVisible(true);
    }//GEN-LAST:event_clientesActionPerformed

    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
        String nombre = nombreProducto.getText();
        int codigo = Integer.parseInt(codigoProducto.getText());
        double precio = Double.parseDouble(precioProducto.getText());
        String descripcion = descripcionProducto.getText();
        int cantidad = Integer.parseInt(cantidadProducto.getText());
        String proveedor = proveedirProducto.getText();

        controlador.ControladorProducto producto = new controlador.ControladorProducto();
        String resultado = producto.verificarExitencia(codigo);

        if (resultado.equals("No esta")) {
            producto.guardarProducto(nombre, codigo, precio, descripcion, cantidad, proveedor);
            limpiarCampos();
        }
    }//GEN-LAST:event_guardarProductoActionPerformed

    private void botonBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCliActionPerformed
        int codigo = Integer.parseInt(codigoProduccto.getText());
        if(codigoProduccto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR EL NIT DEL PRODUCTO");
        }else{
            productoEliminar.setText(produ.buscarPro(codigo));
        }
    }//GEN-LAST:event_botonBuscarCliActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(codigoProduccto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE BUSCAR EL PRODUCTO");
        }else if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el PRODUCTO, ¿desea continuar?",
            "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        produ.eliminarPro(Integer.parseInt(codigoProduccto.getText()));
        limpiarCampos();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void codigoProducctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProducctoActionPerformed

    }//GEN-LAST:event_codigoProducctoActionPerformed

    private void codigoProducctoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoProducctoKeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_codigoProducctoKeyTyped

    private void descripcionProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionProducto1ActionPerformed

    private void nombrProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrProductoActionPerformed

    }//GEN-LAST:event_nombrProductoActionPerformed

    private void guardarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProducto1ActionPerformed

        modelo.DAOProducto objetoProducto= new modelo.DAOProducto();
        objetoProducto.setCodigoPro(Integer.parseInt(codigoProducto1.getText()));
        objetoProducto.setNombrePro(nombrProducto.getText());
        objetoProducto.setPrecioPro(Integer.parseInt(precioProducto1.getText()));
        objetoProducto.setDescripcionPro(descripcionProducto1.getText());
        objetoProducto.setCantidadPro(Integer.parseInt(cantidadProducto1.getText()));
        objetoProducto.setProveedorPro(Integer.parseInt(nitProveedor.getText()));
        String resultado = "";
        resultado = objetoProducto.modificar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No se modifico");
        }else{
            JOptionPane.showMessageDialog(null, "Se modifico");
        }
        limpiarCampos();
    }//GEN-LAST:event_guardarProducto1ActionPerformed

    private void codigoProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoProducto1ActionPerformed

    private void buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoActionPerformed
        controlador.ControladorProducto buscar  = new controlador.ControladorProducto();
        if(codigoProducto2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL CODIGO DEL PRODUCTO");
        }else{
            int codigoProd = Integer.parseInt(codigoProducto2.getText());
            resultadoBusqueda.setText(buscar.buscarPro(codigoProd));
            codigoProducto2.setText("");
        }
    }//GEN-LAST:event_buscarProductoActionPerformed

    private void codigoProducto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProducto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoProducto2ActionPerformed

    private void codigoProducto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoProducto2KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_codigoProducto2KeyTyped

    private void cboxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxFiltroActionPerformed

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        if (txtValorBusqueda.getText().equals("") && !cboxFiltro.getSelectedItem().toString().equals("Todos")) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        } else if (cboxFiltro.getSelectedItem().toString().equals("Nombre") || cboxFiltro.getSelectedItem().toString().equals("Todos")) {
            listarPro.listarProdu(txtValorBusqueda.getText(), cboxFiltro.getSelectedItem().toString(), tblDatos);
        } else {
            listarPro.setPrecioPro(Integer.parseInt(txtValorBusqueda.getText()));
            listarPro.setCantidadPro(Integer.parseInt(txtValorBusqueda.getText()));
            listarPro.setProveedorPro(Integer.parseInt(txtValorBusqueda.getText()));
            listarPro.listarProdu(txtValorBusqueda.getText(), cboxFiltro.getSelectedItem().toString(), tblDatos);
            limpiarCampos();
        }
    }//GEN-LAST:event_botonListarActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed

        controlador.ControladorCliente buscar  = new controlador.ControladorCliente();
        if(cedulCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA CEDULA DEL CLIENTE");
        }else{
            int cedula = Integer.parseInt(cedulCliente.getText());
            resultadoBusqueda1.setText(buscar.buscarCli(cedula));
            cedulCliente.setText("");
        }

    }//GEN-LAST:event_buscarClienteActionPerformed

    private void cedulClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulClienteActionPerformed

    private void cedulClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulClienteKeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulClienteKeyTyped

    private void guardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarClienteActionPerformed
        if(cedulCliente1.getText().equals("")||nombreCliente.getText().equals("")||apellidoCliente.getText().equals("")
            ||telCliente.getText().equals("")||direccinCliete.getText().equals("")||BarrioCliente.getText().equals("")
            ||CorreoCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR TODOS LOS DATOS");
        }else if(cedulCliente1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR LA CEDULA");
        }else{
            modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
            objetoCliente.setCedulaCli(Integer.parseInt(cedulCliente1.getText()));
            objetoCliente.setNombreCli(nombreCliente.getText());
            objetoCliente.setApellidoCli(apellidoCliente.getText());
            objetoCliente.setTelefonoCli(Integer.parseInt(telCliente.getText()));
            objetoCliente.setDireccionCli(direccinCliete.getText());
            objetoCliente.setBarrioCli(BarrioCliente.getText());
            objetoCliente.setCorreoCli(CorreoCliente.getText());
            String resultado = "";
            resultado = objetoCliente.modificar();
            if(resultado.equals("Error")){
                JOptionPane.showMessageDialog(null, "No se modifico");
            }else{
                JOptionPane.showMessageDialog(null, "Se modifico");
            }
            limpiarCampos();
        }

    }//GEN-LAST:event_guardarClienteActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed

    }//GEN-LAST:event_nombreClienteActionPerformed

    private void nombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreClienteKeyTyped
        char dato = evt.getKeyChar();
        if((dato<'a'||dato>'z')&&(dato<'A'||dato>'Z'))evt.consume();
    }//GEN-LAST:event_nombreClienteKeyTyped

    private void cedulCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulCliente1ActionPerformed

    private void cedulCliente1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulCliente1KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulCliente1KeyTyped

    private void botonBuscarCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCli1ActionPerformed
        int cedula = Integer.parseInt(cedulCliente2.getText());
        if(cedulCliente2.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR LA CEDULA DEL CLIENTE");
        }else{
            clienteaEliminar.setText(cliente.buscarCli(cedula));
        }

    }//GEN-LAST:event_botonBuscarCli1ActionPerformed

    private void cedulCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulCliente2ActionPerformed

    }//GEN-LAST:event_cedulCliente2ActionPerformed

    private void cedulCliente2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulCliente2KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulCliente2KeyTyped

    private void botonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar1ActionPerformed
        if(cedulCliente2.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE BUSCAR AL CLIENTE");
        }else if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el cliente, ¿desea continuar?",
            "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        cliente.eliminarCli(Integer.parseInt(cedulCliente2.getText()));
        limpiarCampos();
        }
    }//GEN-LAST:event_botonEliminar1ActionPerformed

    private void botonListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListar1ActionPerformed
        if(txtValorBusqueda1.getText().equals("") && !cboxFiltro1.getSelectedItem().toString().equals("Todos")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        }else{
            listarCli.listarC(txtValorBusqueda.getText(),cboxFiltro1.getSelectedItem().toString(),tblDatos1);
            limpiarCampos();
        }
    }//GEN-LAST:event_botonListar1ActionPerformed

    private void cboxFiltro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFiltro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxFiltro1ActionPerformed

    private void cedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaClienteActionPerformed

    private void nombreCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCliente1ActionPerformed

    private void guardarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCliente1ActionPerformed

        String nombreCli = nombreCliente.getText();
        String apellido = apellidoCliente.getText();
        int cedula = Integer.parseInt(cedulaCliente.getText());
        int telefono = Integer.parseInt(telCliente.getText());
        String direccion = direccinCliete.getText();
        String barrio = BarrioCliente.getText();
        String correo = CorreoCliente.getText();

        controlador.ControladorCliente guardarCliente  = new controlador.ControladorCliente();
        String resultado = guardarCliente.verificarExitencia(cedula);
        if(resultado.equals("No esta")){
            guardarCliente.guardarCliente(nombreCli, apellido, cedula, telefono, direccion, barrio,correo);
            limpiarCampos();
        }

    }//GEN-LAST:event_guardarCliente1ActionPerformed

    public String ivaProducto(double precio) {
        double iva = 0;
        iva = precio * 0.19;

        return Double.toString(iva);
    }
    
    public void agregar(String codigo, String nombre, String cantidad, String precio, String valort) {      
        dtm.addRow(new Object[]{
            codigo, nombre, cantidad, precio, valort
        });
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
    
    public void limpiarTabla(){
        int filas = dtm.getRowCount();
        for (int i = 0; i < filas; i++) {
            dtm.removeRow(0);
        }
    }
    
    public void eliminarProducto() {
        int fila = tlbDatos.getSelectedRow();
        String codigopro = tlbDatos.getValueAt(fila, 0).toString();
        dtm.removeRow(fila);
        int codigo = Integer.parseInt(codigopro);
        System.out.println(codigo);
        buscar.cancelarProducto(codigo);
    }
    
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

    private void numeroCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCotizacionActionPerformed

    private void vendedorCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedorCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendedorCotizacionActionPerformed

    private void GuardarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCotizacionActionPerformed

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
    }//GEN-LAST:event_GuardarCotizacionActionPerformed

    private void cantidadProductoCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProductoCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProductoCotizacionActionPerformed

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

    private void buscarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCotizacionActionPerformed
        int cotizacion = Integer.parseInt(numeroCotizacion.getText());
        controlador.ControladorCotizacion buscar  = new controlador.ControladorCotizacion();
        resultadocotizacion.setText(buscar.buscarCotizacion(cotizacion));
        resultadodetalle.setText(buscar.buscardetalleCotizacion(cotizacion));
        numeroCotizacion.setText("");
    }//GEN-LAST:event_buscarCotizacionActionPerformed

    private void jTabbedPaneProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPaneProductosMouseClicked

    private void botonProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosMouseClicked
        jTabbedPaneProductos.setVisible(true);
        jTabbedPaneClientes.setVisible(false);
        jTabbedPaneCotizaciones.setVisible(false);
    }//GEN-LAST:event_botonProductosMouseClicked

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked
        jTabbedPaneClientes.setVisible(true);
        jTabbedPaneCotizaciones.setVisible(false);
        jTabbedPaneProductos.setVisible(false);
    }//GEN-LAST:event_clientesMouseClicked

    private void cotizacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cotizacionesMouseClicked
        jTabbedPaneCotizaciones.setVisible(true);
        jTabbedPaneClientes.setVisible(false);
        jTabbedPaneProductos.setVisible(false);
    }//GEN-LAST:event_cotizacionesMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        LoginUsuario vista = new LoginUsuario();
        vista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel65MouseClicked

    public void limpiarCampos() {
        cedulCliente.setText("");
        cedulCliente1.setText("");
        nombreCliente.setText("");
        nombreCliente1.setText("");
        apellidoCliente.setText("");
        apellidoCliente1.setText("");
        telCliente.setText("");
        telCliente1.setText("");
        direccinCliete.setText("");
        direccinCliete1.setText("");
        BarrioCliente.setText("");
        BarrioCliente1.setText("");
        CorreoCliente.setText("");
        CorreoCliente1.setText("");
        cedulCliente2.setText("");
        clienteaEliminar.setText("");
        nombreProducto.setText("");
        codigoProducto.setText("");
        precioProducto.setText("");
        descripcionProducto.setText("");
        cantidadProducto.setText("");
        proveedirProducto.setText("");
        txtValorBusqueda1.setText("");
        codigoProduccto.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarrioCliente;
    private javax.swing.JTextField BarrioCliente1;
    private javax.swing.JTextField CorreoCliente;
    private javax.swing.JTextField CorreoCliente1;
    private javax.swing.JButton GuardarCotizacion;
    private javax.swing.JButton GuardarCotizacion1;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellidoCliente;
    private javax.swing.JTextField apellidoCliente1;
    private javax.swing.JButton botonBuscarCli;
    private javax.swing.JButton botonBuscarCli1;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEliminar1;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton botonListar1;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JButton buscarCotizacion;
    private javax.swing.JButton buscarProducto;
    private javax.swing.JButton cancelarC;
    private javax.swing.JTextField cantidadProducto;
    private javax.swing.JTextField cantidadProducto1;
    private javax.swing.JTextField cantidadProductoCotizacion;
    private javax.swing.JComboBox<String> cboxFiltro;
    private javax.swing.JComboBox<String> cboxFiltro1;
    private javax.swing.JTextField cedulCliente;
    private javax.swing.JTextField cedulCliente1;
    private javax.swing.JTextField cedulCliente2;
    private javax.swing.JTextField cedulaCliente;
    private javax.swing.JTextArea clienteaEliminar;
    private javax.swing.JButton clientes;
    private javax.swing.JTextField codigoProducCotizacion;
    private javax.swing.JTextField codigoProduccto;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JTextField codigoProducto1;
    private javax.swing.JTextField codigoProducto2;
    private javax.swing.JButton cotizaciones;
    private javax.swing.JTextField descripcionProducto;
    private javax.swing.JTextField descripcionProducto1;
    private javax.swing.JTextField direccinCliete;
    private javax.swing.JTextField direccinCliete1;
    private javax.swing.JTextField documentoClienteCotiza;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField fechaCotizacion;
    private javax.swing.JButton guardarCliente;
    private javax.swing.JButton guardarCliente1;
    private javax.swing.JButton guardarProducto;
    private javax.swing.JButton guardarProducto1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanelBuscarCli;
    private javax.swing.JPanel jPanelBuscarCotizacion;
    private javax.swing.JPanel jPanelCrearCli;
    private javax.swing.JPanel jPanelCrearCotizacion;
    private javax.swing.JPanel jPanelEditarCli;
    private javax.swing.JPanel jPanelEliminarCli;
    private javax.swing.JPanel jPanelListarCli;
    private javax.swing.JPanel jPanelMenuEmp;
    private javax.swing.JPanel jPanelSalida;
    private javax.swing.JPanel jPanelTituloEmp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPaneClientes;
    private javax.swing.JTabbedPane jTabbedPaneCotizaciones;
    private javax.swing.JTabbedPane jTabbedPaneProductos;
    private javax.swing.JTextField nitProveedor;
    private javax.swing.JTextField nombrProducto;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField nombreCliente1;
    private javax.swing.JTextField nombreProducto;
    public javax.swing.JLabel nombreUsuario;
    private javax.swing.JTextField numeroCotizacion;
    private javax.swing.JTextField numeroCotizacion1;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelEditar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelListar;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JTextField precioProducto1;
    private javax.swing.JTextArea productoEliminar;
    private javax.swing.JTextField proveedirProducto;
    private javax.swing.JTextArea resultadoBusqueda;
    private javax.swing.JTextArea resultadoBusqueda1;
    private javax.swing.JTextArea resultadocotizacion;
    private javax.swing.JTextArea resultadodetalle;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTable tblDatos1;
    private javax.swing.JButton tbnGuardarCotizacion;
    private javax.swing.JTextField telCliente;
    private javax.swing.JTextField telCliente1;
    private javax.swing.JTable tlbDatos;
    public javax.swing.JLabel totalCompra;
    private javax.swing.JTextField txtValorBusqueda;
    private javax.swing.JTextField txtValorBusqueda1;
    private javax.swing.JTextField vendedorCotizacion;
    // End of variables declaration//GEN-END:variables

    void nombreUsuario(String string) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
