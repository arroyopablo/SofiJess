package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DAOEmpleado;




public class GestionEmpleado extends javax.swing.JFrame {
    DAOEmpleado emple = new DAOEmpleado();
    private int idcotizacion;
    
     modelo.DAOProducto listarPro = new modelo.DAOProducto();
    controlador.ControladorProducto produ = new controlador.ControladorProducto();
    
    controlador.ControladorCliente cliente  = new controlador.ControladorCliente();
    modelo.DAOCliente listarCli = new  modelo.DAOCliente();
    DefaultTableModel dtm = new DefaultTableModel();
    
    controlador.ControladorCotizacion buscar = new controlador.ControladorCotizacion();
    private double compraTotal;
    Color fondoNaranja = new Color(246,149,50);
    Color rojo = new Color(234,201,186);
    
    public GestionEmpleado(String cedula) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        
        String[] titulo = new String[]{"Codigo", "Nombre", "Cantidad", "V Unitario", "Valor Total"};
        dtm.setColumnIdentifiers(titulo);
        tlbDatos.setModel(dtm);
        
        fechaCotizacion.setEditable(false);
        fechaCotizacion.setText(buscar.fechaActual());
        numeroCotizacion.setEditable(false);
        vendedorCotizacion.setEditable(false);
        idcotizacion = Integer.parseInt(buscar.codigoCotizacion());
        numeroCotizacion.setText(Integer.toString(idcotizacion));
        vendedorCotizacion.setText(cedula);
        jTabbedPaneClientes.setVisible(true);
        jTabbedPaneCotizaciones.setVisible(false);
        jTabbedPaneProductos.setVisible(false);
        clientes.setBackground(rojo);
        cotizaciones.setBackground(fondoNaranja);
        botonProductos.setBackground(fondoNaranja);
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
        panelCrearCotizacion = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
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
        jLabel66 = new javax.swing.JLabel();
        precioVentaProducto = new javax.swing.JTextField();
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
        jLabel67 = new javax.swing.JLabel();
        precioVentaProduc = new javax.swing.JTextField();
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

        jPanelTituloEmp.setBackground(new java.awt.Color(158, 189, 213));
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

        jLayeredPane2.add(jPanelTituloEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1183, 68));

        jPanelMenuEmp.setBackground(new java.awt.Color(158, 189, 213));
        jPanelMenuEmp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenuEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonProductos.setBackground(new java.awt.Color(246, 149, 50));
        botonProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonProductos.setText("PRODUCTOS");
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
        jPanelMenuEmp.add(botonProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 290, 136, 36));

        clientes.setBackground(new java.awt.Color(246, 149, 50));
        clientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clientes.setText("CLIENTES");
        clientes.setMaximumSize(new java.awt.Dimension(107, 23));
        clientes.setMinimumSize(new java.awt.Dimension(107, 23));
        clientes.setPreferredSize(new java.awt.Dimension(107, 23));
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });
        jPanelMenuEmp.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 107, 136, 36));

        cotizaciones.setBackground(new java.awt.Color(246, 149, 50));
        cotizaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cotizaciones.setText("COTIZACIONES");
        cotizaciones.setMaximumSize(new java.awt.Dimension(107, 23));
        cotizaciones.setMinimumSize(new java.awt.Dimension(107, 23));
        cotizaciones.setPreferredSize(new java.awt.Dimension(107, 23));
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
        jPanelMenuEmp.add(cotizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 195, 136, 36));
        jPanelMenuEmp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 132, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        jPanelMenuEmp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 48, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cotizacion.png"))); // NOI18N
        jPanelMenuEmp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 190, 48, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clienteimagenqw.png"))); // NOI18N
        jLabel6.setFocusable(false);
        jPanelMenuEmp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 100, 48, -1));

        jLayeredPane2.add(jPanelMenuEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 70, 217, 560));

        jTabbedPaneClientes.setBackground(new java.awt.Color(158, 189, 213));
        jTabbedPaneClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTabbedPaneClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPaneClientes.setOpaque(true);

        jPanelCrearCli.setBackground(new java.awt.Color(233, 233, 233));
        jPanelCrearCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel47.setText("REGISTAR CLIENTE");
        jPanelCrearCli.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Nombre");
        jPanelCrearCli.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 95, 60, 30));
        jPanelCrearCli.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 211, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Barrio");
        jPanelCrearCli.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, 30));

        cedulaCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaClienteActionPerformed(evt);
            }
        });
        cedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaClienteKeyTyped(evt);
            }
        });
        jPanelCrearCli.add(cedulaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 355, 30));

        nombreCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCliente1ActionPerformed(evt);
            }
        });
        jPanelCrearCli.add(nombreCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 95, 360, 30));

        apellidoCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelCrearCli.add(apellidoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 355, 30));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Dirección");
        jPanelCrearCli.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, 30));

        guardarCliente1.setBackground(new java.awt.Color(255, 255, 255));
        guardarCliente1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarCliente1.setForeground(new java.awt.Color(0, 0, 153));
        guardarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible.png"))); // NOI18N
        guardarCliente1.setText("REGISTRAR CLIENTE");
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
        jPanelCrearCli.add(guardarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        telCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telCliente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telCliente1KeyTyped(evt);
            }
        });
        jPanelCrearCli.add(telCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 355, 30));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Correo");
        jPanelCrearCli.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, 30));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Cédula");
        jPanelCrearCli.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, 30));

        BarrioCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelCrearCli.add(BarrioCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 355, 30));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Teléfono");
        jPanelCrearCli.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 30));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Apellido");
        jPanelCrearCli.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 30));

        direccinCliete1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelCrearCli.add(direccinCliete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 355, 30));

        CorreoCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelCrearCli.add(CorreoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 355, 30));

        jTabbedPaneClientes.addTab("CREAR", jPanelCrearCli);

        jPanelBuscarCli.setBackground(new java.awt.Color(233, 233, 233));
        jPanelBuscarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("BUSCAR CLIENTE");
        jPanelBuscarCli.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));
        jPanelBuscarCli.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 302, -1, -1));

        buscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscarCliente.setForeground(new java.awt.Color(0, 0, 153));
        buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        buscarCliente.setText("BUSCAR");
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
        jPanelBuscarCli.add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Cédula del Cliente: ");
        jPanelBuscarCli.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        cedulCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedulCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulClienteKeyTyped(evt);
            }
        });
        jPanelBuscarCli.add(cedulCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 99, 370, 30));

        resultadoBusqueda1.setEditable(false);
        resultadoBusqueda1.setColumns(20);
        resultadoBusqueda1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resultadoBusqueda1.setRows(5);
        jScrollPane3.setViewportView(resultadoBusqueda1);

        jPanelBuscarCli.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 195, 502, 240));

        jTabbedPaneClientes.addTab("BUSCAR", jPanelBuscarCli);

        jPanelEliminarCli.setBackground(new java.awt.Color(233, 233, 233));
        jPanelEliminarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelEliminarCli.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 272, -1, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel43.setText("ELIMINAR CLIENTE");
        jPanelEliminarCli.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        botonBuscarCli1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBuscarCli1.setForeground(new java.awt.Color(0, 0, 153));
        botonBuscarCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        botonBuscarCli1.setText("BUSCAR CLIENTE");
        botonBuscarCli1.setBorder(null);
        botonBuscarCli1.setBorderPainted(false);
        botonBuscarCli1.setContentAreaFilled(false);
        botonBuscarCli1.setFocusPainted(false);
        botonBuscarCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCli1ActionPerformed(evt);
            }
        });
        jPanelEliminarCli.add(botonBuscarCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 50));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Cédula del Cliente: ");
        jPanelEliminarCli.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, 30));

        cedulCliente2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedulCliente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulCliente2KeyTyped(evt);
            }
        });
        jPanelEliminarCli.add(cedulCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 120, 310, 30));

        clienteaEliminar.setEditable(false);
        clienteaEliminar.setColumns(20);
        clienteaEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clienteaEliminar.setRows(5);
        jScrollPane5.setViewportView(clienteaEliminar);

        jPanelEliminarCli.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 444, 180));

        botonEliminar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonEliminar1.setForeground(new java.awt.Color(0, 0, 153));
        botonEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEliminar.png"))); // NOI18N
        botonEliminar1.setText("ELIMINAR");
        botonEliminar1.setBorder(null);
        botonEliminar1.setContentAreaFilled(false);
        botonEliminar1.setDefaultCapable(false);
        botonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar1ActionPerformed(evt);
            }
        });
        jPanelEliminarCli.add(botonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jTabbedPaneClientes.addTab("ELIMINAR", jPanelEliminarCli);

        jPanelEditarCli.setBackground(new java.awt.Color(233, 233, 233));
        jPanelEditarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Teléfono ");
        jPanelEditarCli.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 30));

        direccinCliete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelEditarCli.add(direccinCliete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 360, 30));

        apellidoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelEditarCli.add(apellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 360, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Apellido Cliente");
        jPanelEditarCli.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, 30));

        guardarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarCliente.setForeground(new java.awt.Color(0, 0, 153));
        guardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible.png"))); // NOI18N
        guardarCliente.setText("GUARDAR CLIENTE");
        guardarCliente.setBorder(null);
        guardarCliente.setBorderPainted(false);
        guardarCliente.setContentAreaFilled(false);
        guardarCliente.setFocusPainted(false);
        guardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarClienteActionPerformed(evt);
            }
        });
        jPanelEditarCli.add(guardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        nombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        jPanelEditarCli.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 360, 30));

        telCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telClienteKeyTyped(evt);
            }
        });
        jPanelEditarCli.add(telCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 360, 30));

        BarrioCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelEditarCli.add(BarrioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 360, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Barrio ");
        jPanelEditarCli.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Dirección ");
        jPanelEditarCli.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 30));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel37.setText("EDITAR CLIENTE");
        jPanelEditarCli.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Nombre Cliente");
        jPanelEditarCli.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 30));
        jPanelEditarCli.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 246, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Cédula del Cliente a Editar");
        jPanelEditarCli.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 30));

        cedulCliente1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedulCliente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cedulCliente1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulCliente1KeyTyped(evt);
            }
        });
        jPanelEditarCli.add(cedulCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 360, 30));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Correo");
        jPanelEditarCli.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, 30));

        CorreoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelEditarCli.add(CorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 360, 30));

        jTabbedPaneClientes.addTab("EDITAR", jPanelEditarCli);

        jPanelListarCli.setBackground(new java.awt.Color(233, 233, 233));
        jPanelListarCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO", "CÉDULA", "TELÉFONO", "DIRECCIÓN", "BARRIO", "CORREO"
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

        jPanelListarCli.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 860, 290));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel45.setText("LISTAR CLIENTE");
        jPanelListarCli.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        botonListar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonListar1.setForeground(new java.awt.Color(0, 0, 153));
        botonListar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar-el-simbolo-del-boton-cuadrado-para-la-interfaz.png"))); // NOI18N
        botonListar1.setText("MOSTRAR CLIENTES");
        botonListar1.setBorder(null);
        botonListar1.setBorderPainted(false);
        botonListar1.setContentAreaFilled(false);
        botonListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListar1ActionPerformed(evt);
            }
        });
        jPanelListarCli.add(botonListar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 200, 40));

        txtValorBusqueda1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelListarCli.add(txtValorBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 100, 520, 30));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("FILTRAR POR:");
        jPanelListarCli.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 30));

        cboxFiltro1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboxFiltro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre", "Apellido", "Barrio", " " }));
        cboxFiltro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltro1ActionPerformed(evt);
            }
        });
        jPanelListarCli.add(cboxFiltro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 150, 30));

        jTabbedPaneClientes.addTab("LISTAR", jPanelListarCli);

        jLayeredPane2.add(jTabbedPaneClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 966, 560));

        jTabbedPaneCotizaciones.setBackground(new java.awt.Color(158, 189, 213));
        jTabbedPaneCotizaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTabbedPaneCotizaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPaneCotizaciones.setOpaque(true);

        panelCrearCotizacion.setBackground(new java.awt.Color(233, 233, 233));
        panelCrearCotizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelCrearCotizacion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 10, 200));

        totalCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalCompra.setText("Total: ");
        panelCrearCotizacion.add(totalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 323, -1));

        agregar.setBackground(new java.awt.Color(102, 255, 0));
        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, -1));

        eliminarProducto.setBackground(new java.awt.Color(102, 255, 0));
        eliminarProducto.setText("ELIMINAR");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(eliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 85, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Documento Cliente");
        panelCrearCotizacion.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 25));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel57.setText("Cantidad");
        panelCrearCotizacion.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, 25));

        tbnGuardarCotizacion.setBackground(new java.awt.Color(102, 255, 0));
        tbnGuardarCotizacion.setText("GUARDAR");
        tbnGuardarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnGuardarCotizacionActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(tbnGuardarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        fecha.setText("AA/MM/DD");
        panelCrearCotizacion.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 25));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel58.setText("Número Cotización");
        panelCrearCotizacion.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, 25));

        cancelarC.setBackground(new java.awt.Color(102, 255, 0));
        cancelarC.setText("CANCELAR");
        cancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(cancelarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        fechaCotizacion.setBackground(new java.awt.Color(236, 236, 236));
        fechaCotizacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fechaCotizacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCrearCotizacion.add(fechaCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 97, 25));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setText("Fecha");
        panelCrearCotizacion.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 25));

        jScrollPane7.setForeground(new java.awt.Color(51, 51, 51));

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

        panelCrearCotizacion.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 300, 620, 100));

        numeroCotizacion.setBackground(new java.awt.Color(236, 236, 236));
        numeroCotizacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numeroCotizacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numeroCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCotizacionActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(numeroCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 117, 25));

        vendedorCotizacion.setBackground(new java.awt.Color(236, 236, 236));
        vendedorCotizacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vendedorCotizacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCrearCotizacion.add(vendedorCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, 25));

        GuardarCotizacion.setForeground(new java.awt.Color(51, 51, 51));
        GuardarCotizacion.setBorder(null);
        GuardarCotizacion.setBorderPainted(false);
        GuardarCotizacion.setContentAreaFilled(false);
        GuardarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCotizacionActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(GuardarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        documentoClienteCotiza.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelCrearCotizacion.add(documentoClienteCotiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 130, 25));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setText("Documento vendedor");
        panelCrearCotizacion.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 25));

        codigoProducCotizacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelCrearCotizacion.add(codigoProducCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 87, 25));

        cantidadProductoCotizacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cantidadProductoCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoCotizacionActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(cantidadProductoCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 86, 25));

        GuardarCotizacion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GuardarCotizacion1.setForeground(new java.awt.Color(0, 0, 153));
        GuardarCotizacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible.png"))); // NOI18N
        GuardarCotizacion1.setText("GUARDAR COTIZACIÓN");
        GuardarCotizacion1.setBorder(null);
        GuardarCotizacion1.setBorderPainted(false);
        GuardarCotizacion1.setContentAreaFilled(false);
        GuardarCotizacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCotizacion1ActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(GuardarCotizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 220, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("CREAR COTIZACIÓN");
        panelCrearCotizacion.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 10, 880, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setText("Código Producto");
        panelCrearCotizacion.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, 25));

        jTabbedPaneCotizaciones.addTab("CREAR", panelCrearCotizacion);

        jPanelBuscarCotizacion.setBackground(new java.awt.Color(233, 233, 233));
        jPanelBuscarCotizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Número Cotización:");
        jPanelBuscarCotizacion.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, 30));

        resultadocotizacion.setEditable(false);
        resultadocotizacion.setColumns(20);
        resultadocotizacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resultadocotizacion.setRows(5);
        jScrollPane8.setViewportView(resultadocotizacion);

        jPanelBuscarCotizacion.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 470, 130));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel64.setText("BUSCAR COTIZACION");
        jPanelBuscarCotizacion.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        buscarCotizacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscarCotizacion.setForeground(new java.awt.Color(0, 0, 153));
        buscarCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        buscarCotizacion.setText("BUSCAR");
        buscarCotizacion.setBorder(null);
        buscarCotizacion.setBorderPainted(false);
        buscarCotizacion.setContentAreaFilled(false);
        buscarCotizacion.setFocusPainted(false);
        buscarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCotizacionActionPerformed(evt);
            }
        });
        jPanelBuscarCotizacion.add(buscarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, 50));

        resultadodetalle.setEditable(false);
        resultadodetalle.setColumns(20);
        resultadodetalle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resultadodetalle.setRows(5);
        jScrollPane9.setViewportView(resultadodetalle);

        jPanelBuscarCotizacion.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 470, 180));

        numeroCotizacion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelBuscarCotizacion.add(numeroCotizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 200, 30));

        jTabbedPaneCotizaciones.addTab("BUSCAR", jPanelBuscarCotizacion);

        jLayeredPane2.add(jTabbedPaneCotizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 966, 560));

        jTabbedPaneProductos.setBackground(new java.awt.Color(158, 189, 213));
        jTabbedPaneProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTabbedPaneProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPaneProductos.setOpaque(true);
        jTabbedPaneProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneProductosMouseClicked(evt);
            }
        });

        panelCrear.setBackground(new java.awt.Color(233, 233, 233));
        panelCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("REGISTAR PRODUCTO");
        panelCrear.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 416, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Nombre");
        panelCrear.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 94, 80, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Código");
        panelCrear.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 70, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Precio de compra");
        panelCrear.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Descripción");
        panelCrear.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad");
        panelCrear.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, 30));

        guardarProducto.setBackground(new java.awt.Color(2, 184, 2));
        guardarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarProducto.setForeground(new java.awt.Color(0, 0, 153));
        guardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible.png"))); // NOI18N
        guardarProducto.setText("GUARDAR");
        guardarProducto.setBorderPainted(false);
        guardarProducto.setContentAreaFilled(false);
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });
        panelCrear.add(guardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, 50));

        nombreProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 94, 359, 30));

        codigoProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(codigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 359, 30));

        precioProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 361, 30));

        descripcionProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(descripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 361, 30));

        cantidadProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(cantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 361, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Proveedor");
        panelCrear.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, 30));

        proveedirProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(proveedirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 359, 30));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("Precio de venta");
        panelCrear.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 30));

        precioVentaProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(precioVentaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 361, 30));

        jTabbedPaneProductos.addTab("CREAR", panelCrear);

        panelEliminar.setBackground(new java.awt.Color(233, 233, 233));
        panelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("ELIMINAR PRODUCTO");
        panelEliminar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        botonBuscarCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBuscarCli.setForeground(new java.awt.Color(0, 0, 153));
        botonBuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        botonBuscarCli.setText("BUSCAR PRODUCTO");
        botonBuscarCli.setToolTipText("");
        botonBuscarCli.setBorder(null);
        botonBuscarCli.setBorderPainted(false);
        botonBuscarCli.setContentAreaFilled(false);
        botonBuscarCli.setFocusPainted(false);
        botonBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCliActionPerformed(evt);
            }
        });
        panelEliminar.add(botonBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Código del producto:");
        panelEliminar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 79, -1, 30));

        botonEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(0, 0, 153));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoEliminar.png"))); // NOI18N
        botonEliminar.setText("ELIMINAR");
        botonEliminar.setBorder(null);
        botonEliminar.setBorderPainted(false);
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelEliminar.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        codigoProduccto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        panelEliminar.add(codigoProduccto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 290, 30));

        productoEliminar.setEditable(false);
        productoEliminar.setColumns(20);
        productoEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        productoEliminar.setRows(5);
        jScrollPane1.setViewportView(productoEliminar);

        panelEliminar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 200, 444, 200));
        panelEliminar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 258, -1, -1));

        jTabbedPaneProductos.addTab("ELIMINAR", panelEliminar);

        panelEditar.setBackground(new java.awt.Color(233, 233, 233));
        panelEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcionProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionProducto1ActionPerformed(evt);
            }
        });
        panelEditar.add(descripcionProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 355, 30));

        precioProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelEditar.add(precioProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 355, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Descripción Producto");
        panelEditar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Nombre Producto");
        panelEditar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 30));

        cantidadProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelEditar.add(cantidadProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 355, 30));

        nitProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelEditar.add(nitProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 355, 30));

        nombrProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombrProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrProductoActionPerformed(evt);
            }
        });
        panelEditar.add(nombrProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 355, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Nit Proveedor");
        panelEditar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Cantidad");
        panelEditar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Código del producto a editar");
        panelEditar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 110, -1, 30));

        guardarProducto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarProducto1.setForeground(new java.awt.Color(0, 0, 153));
        guardarProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible.png"))); // NOI18N
        guardarProducto1.setText("GUARDAR CAMBIOS");
        guardarProducto1.setBorder(null);
        guardarProducto1.setBorderPainted(false);
        guardarProducto1.setContentAreaFilled(false);
        guardarProducto1.setFocusPainted(false);
        guardarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProducto1ActionPerformed(evt);
            }
        });
        panelEditar.add(guardarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));
        panelEditar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 268, -1, -1));

        codigoProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigoProducto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoProducto1KeyReleased(evt);
            }
        });
        panelEditar.add(codigoProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 354, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Precio de Compra");
        panelEditar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("EDITAR PRODUCTO");
        panelEditar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Precio de Venta");
        panelEditar.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, 30));

        precioVentaProduc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelEditar.add(precioVentaProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 355, 30));

        jTabbedPaneProductos.addTab("EDITAR", panelEditar);

        panelBuscar.setBackground(new java.awt.Color(233, 233, 233));
        panelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Código del producto:");
        panelBuscar.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, 30));

        buscarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscarProducto.setForeground(new java.awt.Color(0, 0, 153));
        buscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        buscarProducto.setText("BUSCAR ");
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
        panelBuscar.add(buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        resultadoBusqueda.setEditable(false);
        resultadoBusqueda.setColumns(20);
        resultadoBusqueda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadoBusqueda.setRows(5);
        jScrollPane2.setViewportView(resultadoBusqueda);

        panelBuscar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 444, 274));

        codigoProducto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        panelBuscar.add(codigoProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 300, 30));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setText("BUSCAR PRODUCTO");
        panelBuscar.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jTabbedPaneProductos.addTab("BUSCAR", panelBuscar);

        panelListar.setBackground(new java.awt.Color(233, 233, 233));
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

        panelListar.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 890, 280));

        txtValorBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelListar.add(txtValorBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 352, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("FILTRAR POR:");
        panelListar.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, 30));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel33.setText("LISTAR PRODUCTO");
        panelListar.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        cboxFiltro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre", "Precio", "Cantidad", "Nit Proveedor", " " }));
        cboxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltroActionPerformed(evt);
            }
        });
        panelListar.add(cboxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 185, 30));

        botonListar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonListar.setForeground(new java.awt.Color(0, 0, 153));
        botonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar-el-simbolo-del-boton-cuadrado-para-la-interfaz.png"))); // NOI18N
        botonListar.setText("MOSTRAR PRODUCTO(S)");
        botonListar.setBorder(null);
        botonListar.setBorderPainted(false);
        botonListar.setContentAreaFilled(false);
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });
        panelListar.add(botonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jTabbedPaneProductos.addTab("LISTAR", panelListar);

        jLayeredPane2.add(jTabbedPaneProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 966, 560));

        jPanelSalida.setBackground(new java.awt.Color(158, 189, 213));
        jPanelSalida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(246, 149, 50));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Exit_25px.png"))); // NOI18N
        jButton7.setText("CERRAR SESIÓN");
        jButton7.setMaximumSize(new java.awt.Dimension(107, 23));
        jButton7.setMinimumSize(new java.awt.Dimension(107, 23));
        jButton7.setPreferredSize(new java.awt.Dimension(107, 23));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelSalida.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 7, 190, 36));

        jLayeredPane2.add(jPanelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 630, 1183, 49));

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

    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
        if (nombreProducto.getText().isEmpty() || codigoProducto.getText().isEmpty() || precioProducto.getText().isEmpty() || precioVentaProducto.getText().isEmpty()
                || descripcionProducto.getText().isEmpty() || cantidadProducto.getText().isEmpty() || proveedirProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todo el formulario", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String nombre = nombreProducto.getText();
            String codigo = codigoProducto.getText();
            String precioCompra = precioProducto.getText();
            String precioVenta = precioVentaProducto.getText();
            String descripcion = descripcionProducto.getText();
            String cantidad = cantidadProducto.getText();
            String proveedor = proveedirProducto.getText();

            controlador.ControladorProducto producto = new controlador.ControladorProducto();
            String resultado = producto.verificarExitencia(codigo);

            if (resultado.equals("No esta")) {
                producto.guardarProducto(nombre, codigo, precioCompra, precioVenta, descripcion, cantidad, proveedor);
                limpiarCampos();
            }
        }
    }//GEN-LAST:event_guardarProductoActionPerformed

    private void botonBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCliActionPerformed
        String codigo = codigoProduccto.getText();
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
        produ.eliminarPro(codigoProduccto.getText());
        codigoProduccto.setText("");
        productoEliminar.setText("");
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
        objetoProducto.setCodigoPro(codigoProducto1.getText());
        objetoProducto.setNombrePro(nombrProducto.getText());
        objetoProducto.setPrecioPro(precioProducto1.getText());
        objetoProducto.setDescripcionPro(descripcionProducto1.getText());
        objetoProducto.setCantidadPro(cantidadProducto1.getText());
        objetoProducto.setProveedorPro(nitProveedor.getText());
        String resultado = "";
        resultado = objetoProducto.modificar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No se modifico");
        }else{
            JOptionPane.showMessageDialog(null, "Se modifico");
        }
        limpiarCampos();
    }//GEN-LAST:event_guardarProducto1ActionPerformed

    private void buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProductoActionPerformed
        controlador.ControladorProducto buscar  = new controlador.ControladorProducto();
        if(codigoProducto2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR EL CODIGO DEL PRODUCTO");
        }else{
            String codigoProd = codigoProducto2.getText();
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
            listarPro.setPrecioPro(txtValorBusqueda.getText());
            listarPro.setCantidadPro(txtValorBusqueda.getText());
            listarPro.setProveedorPro(txtValorBusqueda.getText());
            listarPro.listarProdu(txtValorBusqueda.getText(), cboxFiltro.getSelectedItem().toString(), tblDatos);
            limpiarCampos();
        }
    }//GEN-LAST:event_botonListarActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed

        controlador.ControladorCliente buscar  = new controlador.ControladorCliente();
        if(cedulCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA CEDULA DEL CLIENTE");
        }else{
            String cedula = cedulCliente.getText();
            resultadoBusqueda1.setText(buscar.buscarCli(cedula));
            cedulCliente.setText("");
        }

    }//GEN-LAST:event_buscarClienteActionPerformed

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
            objetoCliente.setCedulaCli(cedulCliente1.getText());
            objetoCliente.setNombreCli(nombreCliente.getText());
            objetoCliente.setApellidoCli(apellidoCliente.getText());
            objetoCliente.setTelefonoCli(telCliente.getText());
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

    private void cedulCliente1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulCliente1KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulCliente1KeyTyped

    private void botonBuscarCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCli1ActionPerformed
        String cedula = cedulCliente2.getText();
        if(cedulCliente2.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR LA CEDULA DEL CLIENTE");
        }else{
            clienteaEliminar.setText(cliente.buscarCli(cedula));
        }

    }//GEN-LAST:event_botonBuscarCli1ActionPerformed

    private void cedulCliente2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulCliente2KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulCliente2KeyTyped

    private void botonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar1ActionPerformed
        if(cedulCliente2.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE BUSCAR AL CLIENTE");
        }else if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el cliente, ¿desea continuar?",
            "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        cliente.eliminarCli(cedulCliente2.getText());
        cedulCliente2.setText("");
        clienteaEliminar.setText("");
        }
    }//GEN-LAST:event_botonEliminar1ActionPerformed

    private void botonListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListar1ActionPerformed
        if(txtValorBusqueda1.getText().equals("") && !cboxFiltro1.getSelectedItem().toString().equals("Todos")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        }else{
            listarCli.listarC(txtValorBusqueda1.getText(),cboxFiltro1.getSelectedItem().toString(),tblDatos1);
            txtValorBusqueda1.setText("");
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

        String nombreCli = nombreCliente1.getText();
        String apellido = apellidoCliente1.getText();
        String cedula = cedulaCliente.getText();
        String telefono = telCliente1.getText();
        String direccion = direccinCliete1.getText();
        String barrio = BarrioCliente1.getText();
        String correo = CorreoCliente1.getText();

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
        String codigo = codigopro;
        System.out.println(codigo);
        buscar.cancelarProducto(codigo);
    }
    
    private void buscarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCotizacionActionPerformed
        String cotizacion = numeroCotizacion1.getText();
        controlador.ControladorCotizacion buscar  = new controlador.ControladorCotizacion();
        resultadocotizacion.setText(buscar.buscarCotizacion(cotizacion));
        resultadodetalle.setText(buscar.buscardetalleCotizacion(cotizacion));
        numeroCotizacion1.setText("");
    }//GEN-LAST:event_buscarCotizacionActionPerformed

    private void jTabbedPaneProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneProductosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPaneProductosMouseClicked

    private void botonProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosMouseClicked
        jTabbedPaneProductos.setVisible(true);
        jTabbedPaneClientes.setVisible(false);
        jTabbedPaneCotizaciones.setVisible(false);
        
        clientes.setBackground(fondoNaranja);
        cotizaciones.setBackground(fondoNaranja);
        botonProductos.setBackground(rojo);
    }//GEN-LAST:event_botonProductosMouseClicked

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked
        jTabbedPaneClientes.setVisible(true);
        jTabbedPaneCotizaciones.setVisible(false);
        jTabbedPaneProductos.setVisible(false);
        
        clientes.setBackground(rojo);
        cotizaciones.setBackground(fondoNaranja);
        botonProductos.setBackground(fondoNaranja);
    }//GEN-LAST:event_clientesMouseClicked

    private void cotizacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cotizacionesMouseClicked
        jTabbedPaneCotizaciones.setVisible(true);
        jTabbedPaneClientes.setVisible(false);
        jTabbedPaneProductos.setVisible(false);
        
        clientes.setBackground(fondoNaranja);
        cotizaciones.setBackground(rojo);
        botonProductos.setBackground(fondoNaranja);
    }//GEN-LAST:event_cotizacionesMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        LoginUsuario vista = new LoginUsuario();
        vista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel65MouseClicked

    private void cedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaClienteKeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulaClienteKeyTyped

    private void telCliente1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telCliente1KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_telCliente1KeyTyped

    private void telClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telClienteKeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_telClienteKeyTyped

    private void cedulCliente1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulCliente1KeyReleased
        controlador.ControladorCliente buscarCliente = new controlador.ControladorCliente();

        String cedula_cliente = cedulCliente1.getText();
        if (cedula_cliente.length() >= 1) {
            String[] respuesta = buscarCliente.buscarCliEdit(cedula_cliente);
            nombreCliente.setText(respuesta[0]);
            apellidoCliente.setText(respuesta[1]);
            telCliente.setText(respuesta[2]);
            direccinCliete.setText(respuesta[3]);
            BarrioCliente.setText(respuesta[4]);
            CorreoCliente.setText(respuesta[5]);
        }else{
            nombreCliente.setText("");
            apellidoCliente.setText("");
            telCliente.setText("");
            direccinCliete.setText("");
            BarrioCliente.setText("");
            CorreoCliente.setText("");
        }
    }//GEN-LAST:event_cedulCliente1KeyReleased

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        try {

            String codigoProducto = codigoProducCotizacion.getText();
            controlador.ControladorCotizacion buscar1 = new controlador.ControladorCotizacion();
            String nombre = (buscar1.buscarPro(codigoProducto));
            String precio = (buscar1.buscarPrecio(codigoProducto));
            String codigo = (buscar1.buscarCodigo(codigoProducto));
            String cantidad = cantidadProductoCotizacion.getText();
            float valort1 = Float.parseFloat(cantidad) * Float.parseFloat(precio);
            String valort = Float.toString(valort1);
            String iva = ivaProducto(Double.parseDouble(precio));

            if (cantidad.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad");
            } else if (buscar1.isNumeric(cantidad)) {
                agregar(codigo, nombre, cantidad, precio, valort);
                buscar1.guardarDetalleC(Integer.toString(idcotizacion), codigoProducto, cantidad,
                    precio, iva, Float.toString(valort1));

                cantidadProductoCotizacion.setText("");
                codigoProducCotizacion.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un dato Correcto");
        }

        totalCompra.setText("Total: $" + sumarTotal());
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
        String cedulaClien = documentoClienteCotiza.getText();
        String cedulaEmple = vendedorCotizacion.getText();
        //Crea la cotizacion        
        controlador.ControladorCliente guardarCliente  = new controlador.ControladorCliente();
        
        String resultado = guardarCliente.verificarExitenciaCliente(cedulaClien);
        if (resultado.equals("No esta")) {
            JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            buscar.guardarCotizacion(cedulaClien, cedulaEmple);
            codigoProducCotizacion.setEditable(true);
            cantidadProductoCotizacion.setEditable(true);
            agregar.setEnabled(true);
            eliminarProducto.setEnabled(true);
            GuardarCotizacion.setEnabled(true);
            tbnGuardarCotizacion.setEnabled(false);
        }
    }//GEN-LAST:event_tbnGuardarCotizacionActionPerformed

    private void cancelarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCActionPerformed

        codigoProducCotizacion.setEditable(false);
        cantidadProductoCotizacion.setEditable(false);
        agregar.setEnabled(false);
        eliminarProducto.setEnabled(false);
        GuardarCotizacion.setEnabled(false);

        documentoClienteCotiza.setText("");
        buscar.cancelarCotizacion(Integer.toString(idcotizacion));
        numeroCotizacion.setText(Integer.toString(idcotizacion));
        fechaCotizacion.setText(buscar.fechaActual());
        tbnGuardarCotizacion.setEnabled(true);
    }//GEN-LAST:event_cancelarCActionPerformed

    private void numeroCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCotizacionActionPerformed

    private void GuardarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCotizacionActionPerformed

        int numerocotiza = Integer.parseInt(buscar.codigoCotizacion()) -1;
        System.out.println(numerocotiza);
        buscar.updateCompra(Double.toString(compraTotal),Integer.toString(numerocotiza));
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
        buscar.updateCompra(Double.toString(compraTotal),Integer.toString(numerocotiza));
        codigoProducCotizacion.setEditable(false);
        cantidadProductoCotizacion.setEditable(false);
        agregar.setEnabled(false);
        eliminarProducto.setEnabled(false);
        GuardarCotizacion.setEnabled(false);
        documentoClienteCotiza.setText("");
        fechaCotizacion.setText(buscar.fechaActual());
        idcotizacion = Integer.parseInt(buscar.codigoCotizacion());
        numeroCotizacion.setText(Integer.toString(idcotizacion));
        tbnGuardarCotizacion.setEnabled(true);
        totalCompra.setText("Total: ");
        limpiarTabla();

        JOptionPane.showMessageDialog(null, "Ha sido guardado exitosamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_GuardarCotizacion1ActionPerformed

    private void codigoProducto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoProducto1KeyReleased
        controlador.ControladorProducto buscarProducto = new controlador.ControladorProducto();

        String codigo_producto = codigoProducto1.getText();
        if (codigo_producto.length() >= 1) {
            String[] respuesta = buscarProducto.buscarProEdit(codigo_producto);
            nombrProducto.setText(respuesta[0]);
            precioProducto1.setText(respuesta[1]);
            precioVentaProduc.setText(respuesta[2]);
            descripcionProducto1.setText(respuesta[3]);
            cantidadProducto1.setText(respuesta[4]);
            nitProveedor.setText(respuesta[5]);
        }else{
            nombrProducto.setText("");
            precioProducto1.setText("");
            precioVentaProduc.setText("");
            descripcionProducto1.setText("");
            cantidadProducto1.setText("");
            nitProveedor.setText("");
        }
    }//GEN-LAST:event_codigoProducto1KeyReleased

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
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanelBuscarCli;
    private javax.swing.JPanel jPanelBuscarCotizacion;
    private javax.swing.JPanel jPanelCrearCli;
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
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JPanel panelCrearCotizacion;
    private javax.swing.JPanel panelEditar;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelListar;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JTextField precioProducto1;
    private javax.swing.JTextField precioVentaProduc;
    private javax.swing.JTextField precioVentaProducto;
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
