package vista;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionJefe extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    controlador.ControladorCotizacion buscar = new controlador.ControladorCotizacion();
    private int idcotizacion;
    Color fondoNaranja = new Color(246,149,50);
    Color rojo = new Color(234,201,186);
    private double compraTotal;
    RestrictedTextField r = null;
        
    public GestionJefe() {
        initComponents();
                
        limitarNumerosTelefono();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        panelCliente.setVisible(false);
        panelEmpleado.setVisible(false);
        panelCotizaciones.setVisible(false);
        panelProductos.setVisible(true);
        botonProducto.setBackground(rojo);
        panelProveedor.setVisible(false);
        panelReportes.setVisible(false);
        fechaCotizacion.setText(buscar.fechaActual());
        
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelPiePagina = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        panelProductos = new javax.swing.JTabbedPane();
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
        panelProveedor = new javax.swing.JTabbedPane();
        panelCrearProveedor = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        nombredeProveedor = new javax.swing.JTextField();
        nitProveedor1 = new javax.swing.JTextField();
        telefonoProveedor = new javax.swing.JTextField();
        direccionProveedor = new javax.swing.JTextField();
        guardarProv = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        nombreproductoprov = new javax.swing.JTextField();
        precioproductoprov = new javax.swing.JTextField();
        panelEliminarProveedor = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        botonEliminar1 = new javax.swing.JButton();
        nitProveedor2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        proveedorEliminar = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        botonBuscarProv = new javax.swing.JButton();
        panelEditarProveedor = new javax.swing.JPanel();
        nomProducProv = new javax.swing.JTextField();
        guardarProducto2 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        nitProveedor3 = new javax.swing.JTextField();
        nombrProveedor = new javax.swing.JTextField();
        telProveedor = new javax.swing.JTextField();
        precioProdprov = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        direccionProveedor1 = new javax.swing.JTextField();
        panelBuscarProveedor = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        busquedaProveedor = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        nitProveedor4 = new javax.swing.JTextField();
        buscarProveedor = new javax.swing.JButton();
        panelListarProveedor = new javax.swing.JPanel();
        txtValorBusqueda1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        cboxFiltro1 = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        botonListar1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDatos1 = new javax.swing.JTable();
        panelReportes = new javax.swing.JTabbedPane();
        panelReporteEmpleado = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        GenerarPdf = new javax.swing.JButton();
        jtxDato = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        panelReporteProductos = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jtxDato1 = new javax.swing.JTextField();
        GenerarPdf1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        panelReporteEditar = new javax.swing.JPanel();
        jtxDato2 = new javax.swing.JTextField();
        GenerarPdf2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        panelCotizaciones = new javax.swing.JTabbedPane();
        panelCrearCotizacion = new javax.swing.JPanel();
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
        panelBuscarCotizacion = new javax.swing.JPanel();
        buscarCotizacion = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        resultadodetalle = new javax.swing.JTextArea();
        jLabel65 = new javax.swing.JLabel();
        numeroCotizacion2 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        resultadocotizacion = new javax.swing.JTextArea();
        panelEmpleado = new javax.swing.JTabbedPane();
        panelCrearEmpleado = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        nombreEmpleado1 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JTextField();
        contrasenaUsuario = new javax.swing.JTextField();
        apellidoEmpleado = new javax.swing.JTextField();
        cedulaEmpleado = new javax.swing.JTextField();
        telefonoEmpleado = new javax.swing.JTextField();
        direccionEmpleado = new javax.swing.JTextField();
        sueldoEmpleado = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        barrioEmpleado = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        cargoEmpleado = new javax.swing.JComboBox<>();
        panelEliminarEmpleado = new javax.swing.JPanel();
        cedulEmpleado = new javax.swing.JTextField();
        botonEliminar2 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        empleadoEliminar = new javax.swing.JTextArea();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        botonBuscarEmp = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        panelEditarEmpleado = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        apellidoEmpleado1 = new javax.swing.JTextField();
        barrio = new javax.swing.JTextField();
        telefonoEmpleado1 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        cedulaEmpleado1 = new javax.swing.JTextField();
        guardar1 = new javax.swing.JLabel();
        nombreEmpleado2 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        panelBuscarEmpleado = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        resultadoBusqueda1 = new javax.swing.JTextArea();
        jLabel87 = new javax.swing.JLabel();
        cedulEmpleado1 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        buscarEmpleado = new javax.swing.JButton();
        panelListarEmpleado = new javax.swing.JPanel();
        botonListar2 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        cboxFiltro2 = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblDatos2 = new javax.swing.JTable();
        txtValorBusqueda2 = new javax.swing.JTextField();
        panelCliente = new javax.swing.JTabbedPane();
        panelCrearCliente = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        guardarCliente = new javax.swing.JButton();
        nombreCliente = new javax.swing.JTextField();
        apellidoCliente = new javax.swing.JTextField();
        cedulaCliente = new javax.swing.JTextField();
        telCliente = new javax.swing.JTextField();
        direccinCliete = new javax.swing.JTextField();
        BarrioCliente = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        CorreoCliente = new javax.swing.JTextField();
        panelEliminarCliente = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        botonBuscarCli1 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        cedulCliente = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        clienteaEliminar = new javax.swing.JTextArea();
        botonEliminar3 = new javax.swing.JButton();
        panelEditarCliente = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        guardarCliente1 = new javax.swing.JButton();
        nombreCliente1 = new javax.swing.JTextField();
        apellidoCliente1 = new javax.swing.JTextField();
        telCliente1 = new javax.swing.JTextField();
        direccinCliete1 = new javax.swing.JTextField();
        BarrioCliente1 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        cedulCliente1 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        CorreoCliente1 = new javax.swing.JTextField();
        panelBuscarCliente = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        buscarCliente = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        cedulCliente2 = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        resultadoBusqueda2 = new javax.swing.JTextArea();
        panelListarCliente = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tblDatos3 = new javax.swing.JTable();
        txtValorBusqueda3 = new javax.swing.JTextField();
        botonListar3 = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        cboxFiltro3 = new javax.swing.JComboBox<>();
        panelMenu = new javax.swing.JPanel();
        botonProducto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gestionProveedor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonReportes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        botonCotizacion = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        clientes = new javax.swing.JButton();
        Empleado = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreEmpleado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane1.setDoubleBuffered(true);
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPiePagina.setBackground(new java.awt.Color(158, 189, 213));
        panelPiePagina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelPiePagina.setMinimumSize(new java.awt.Dimension(668, 44));
        panelPiePagina.setPreferredSize(new java.awt.Dimension(633, 47));
        panelPiePagina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelPiePagina.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 7, 190, 36));

        jLayeredPane1.add(panelPiePagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 637, 1138, 49));

        panelProductos.setBackground(new java.awt.Color(158, 189, 213));
        panelProductos.setToolTipText("");
        panelProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelProductos.setOpaque(true);

        panelCrear.setBackground(new java.awt.Color(233, 233, 233));
        panelCrear.setMinimumSize(new java.awt.Dimension(730, 480));
        panelCrear.setPreferredSize(new java.awt.Dimension(730, 480));
        panelCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("REGISTAR PRODUCTO");
        panelCrear.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 416, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Nombre");
        panelCrear.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 60, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Codigo");
        panelCrear.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Precio");
        panelCrear.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Descrpcion");
        panelCrear.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad");
        panelCrear.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        guardarProducto.setBackground(new java.awt.Color(2, 184, 2));
        guardarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardarProducto.setForeground(new java.awt.Color(51, 153, 255));
        guardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUARDARBOTON.png"))); // NOI18N
        guardarProducto.setText("GUARDAR");
        guardarProducto.setContentAreaFilled(false);
        guardarProducto.setDefaultCapable(false);
        guardarProducto.setFocusable(false);
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });
        panelCrear.add(guardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, 50));

        nombreProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 359, 28));

        codigoProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoProductoKeyTyped(evt);
            }
        });
        panelCrear.add(codigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 359, 28));

        precioProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(precioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 361, 28));

        descripcionProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(descripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 361, 28));

        cantidadProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(cantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 361, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Proveedor");
        panelCrear.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        proveedirProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelCrear.add(proveedirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 359, 28));

        panelProductos.addTab("CREAR", panelCrear);

        panelEliminar.setBackground(new java.awt.Color(233, 233, 233));
        panelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("ELIMINAR PRODUCTO");
        panelEliminar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

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
        panelEliminar.add(botonBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 116, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        panelEliminar.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

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
        panelEliminar.add(codigoProduccto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 78, 300, -1));

        productoEliminar.setEditable(false);
        productoEliminar.setColumns(20);
        productoEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        productoEliminar.setRows(5);
        jScrollPane1.setViewportView(productoEliminar);

        panelEliminar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 200, 444, 162));
        panelEliminar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 258, -1, -1));

        panelProductos.addTab("ELIMINAR", panelEliminar);

        panelEditar.setBackground(new java.awt.Color(233, 233, 233));
        panelEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcionProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        descripcionProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionProducto1ActionPerformed(evt);
            }
        });
        panelEditar.add(descripcionProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 355, -1));

        precioProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelEditar.add(precioProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 355, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Descripcion Producto");
        panelEditar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 255, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Nombre Producto");
        panelEditar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 155, -1, -1));

        cantidadProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelEditar.add(cantidadProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 355, -1));

        nitProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelEditar.add(nitProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 355, -1));

        nombrProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombrProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrProductoActionPerformed(evt);
            }
        });
        panelEditar.add(nombrProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 355, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Nit Proveedor");
        panelEditar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 355, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Cantidad");
        panelEditar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 306, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        panelEditar.add(guardarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 413, -1, -1));
        panelEditar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 268, -1, -1));

        codigoProducto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigoProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProducto1ActionPerformed(evt);
            }
        });
        panelEditar.add(codigoProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 350, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Precio Producto");
        panelEditar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 205, -1, -1));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel27.setText("EDITAR PRODUCTO");
        panelEditar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        panelProductos.addTab("EDITAR", panelEditar);

        panelBuscar.setBackground(new java.awt.Color(233, 233, 233));
        panelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Codigo del producto");
        panelBuscar.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 94, -1, -1));

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
        panelBuscar.add(buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 127, -1, -1));

        resultadoBusqueda.setEditable(false);
        resultadoBusqueda.setColumns(20);
        resultadoBusqueda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadoBusqueda.setRows(5);
        jScrollPane2.setViewportView(resultadoBusqueda);

        panelBuscar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 180, 444, 274));

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
        panelBuscar.add(codigoProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 89, 267, 29));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel29.setText("BUSCAR PRODUCTO");
        panelBuscar.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 11, -1, -1));

        panelProductos.addTab("BUSCAR", panelBuscar);

        panelListar.setBackground(new java.awt.Color(233, 233, 233));
        panelListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        panelListar.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 193, 720, 250));

        txtValorBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panelListar.add(txtValorBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 110, 352, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("LISTAR POR:");
        panelListar.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 111, -1, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel33.setText("LISTAR PRODUCTO");
        panelListar.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 11, -1, -1));

        cboxFiltro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Precio", "Cantidad", "Nit Proveedor", "Todos" }));
        cboxFiltro.setOpaque(false);
        cboxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltroActionPerformed(evt);
            }
        });
        panelListar.add(cboxFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 185, -1));

        botonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonListar.PNG"))); // NOI18N
        botonListar.setBorder(null);
        botonListar.setBorderPainted(false);
        botonListar.setContentAreaFilled(false);
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });
        panelListar.add(botonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 141, -1, -1));

        panelProductos.addTab("LISTAR", panelListar);

        jLayeredPane1.add(panelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 69, 919, 570));
        panelProductos.getAccessibleContext().setAccessibleName("");

        panelProveedor.setBackground(new java.awt.Color(158, 189, 213));
        panelProveedor.setToolTipText("");
        panelProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelProveedor.setOpaque(true);

        panelCrearProveedor.setBackground(new java.awt.Color(233, 233, 233));
        panelCrearProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setText("REGISTRAR PROVEEDOR");
        panelCrearProveedor.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Nombre");
        panelCrearProveedor.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 128, -1, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("Nit");
        panelCrearProveedor.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 186, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Telefono");
        panelCrearProveedor.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 244, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Direccion");
        panelCrearProveedor.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 302, -1, -1));

        nombredeProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombredeProveedorActionPerformed(evt);
            }
        });
        panelCrearProveedor.add(nombredeProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 127, 309, -1));
        panelCrearProveedor.add(nitProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 185, 309, -1));
        panelCrearProveedor.add(telefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 243, 309, -1));
        panelCrearProveedor.add(direccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 301, 309, -1));

        guardarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProv.setBorder(null);
        guardarProv.setBorderPainted(false);
        guardarProv.setContentAreaFilled(false);
        guardarProv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProvActionPerformed(evt);
            }
        });
        panelCrearProveedor.add(guardarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Precio producto a proveer");
        panelCrearProveedor.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 418, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("Nombre producto a proveer");
        panelCrearProveedor.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        nombreproductoprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreproductoprovActionPerformed(evt);
            }
        });
        panelCrearProveedor.add(nombreproductoprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 359, 309, -1));

        precioproductoprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioproductoprovActionPerformed(evt);
            }
        });
        panelCrearProveedor.add(precioproductoprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 417, 309, -1));

        panelProveedor.addTab("CREAR", panelCrearProveedor);

        panelEliminarProveedor.setBackground(new java.awt.Color(233, 233, 233));
        panelEliminarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel39.setText("ELIMINAR PROVEEDOR");
        panelEliminarProveedor.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        botonEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar1.setBorder(null);
        botonEliminar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar1ActionPerformed(evt);
            }
        });
        panelEliminarProveedor.add(botonEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        nitProveedor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitProveedor2ActionPerformed(evt);
            }
        });
        nitProveedor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitProveedor2KeyTyped(evt);
            }
        });
        panelEliminarProveedor.add(nitProveedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 267, -1));

        proveedorEliminar.setEditable(false);
        proveedorEliminar.setColumns(20);
        proveedorEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        proveedorEliminar.setRows(5);
        jScrollPane3.setViewportView(proveedorEliminar);

        panelEliminarProveedor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 444, 162));
        panelEliminarProveedor.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Nit del Proveedor ");
        panelEliminarProveedor.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

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
        panelEliminarProveedor.add(botonBuscarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        panelProveedor.addTab("ELIMINAR", panelEliminarProveedor);

        panelEditarProveedor.setBackground(new java.awt.Color(233, 233, 233));
        panelEditarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelEditarProveedor.add(nomProducProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 302, -1));

        guardarProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto2.setBorder(null);
        guardarProducto2.setBorderPainted(false);
        guardarProducto2.setContentAreaFilled(false);
        guardarProducto2.setFocusPainted(false);
        guardarProducto2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardarProducto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProducto2ActionPerformed(evt);
            }
        });
        panelEditarProveedor.add(guardarProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("Precio del producto que provee");
        panelEditarProveedor.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 189, -1));

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Direccion Proveedor");
        panelEditarProveedor.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 189, -1));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel44.setText("EDITAR PROVEEDOR");
        panelEditarProveedor.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));
        panelEditarProveedor.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel46.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel46.setText("Telefono Proveedor");
        panelEditarProveedor.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 189, -1));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setText("Nombre del producto a proveer");
        panelEditarProveedor.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setText("Nombre Proveedor");
        panelEditarProveedor.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 189, -1));

        nitProveedor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitProveedor3ActionPerformed(evt);
            }
        });
        panelEditarProveedor.add(nitProveedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 300, -1));

        nombrProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrProveedorActionPerformed(evt);
            }
        });
        panelEditarProveedor.add(nombrProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 302, -1));
        panelEditarProveedor.add(telProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 302, -1));
        panelEditarProveedor.add(precioProdprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 302, -1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel49.setText("Nit del proveedor a editar");
        panelEditarProveedor.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        direccionProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionProveedor1ActionPerformed(evt);
            }
        });
        panelEditarProveedor.add(direccionProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 302, -1));

        panelProveedor.addTab("EDITAR", panelEditarProveedor);

        panelBuscarProveedor.setBackground(new java.awt.Color(233, 233, 233));
        panelBuscarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel50.setText("Nit Proveedor");
        panelBuscarProveedor.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        busquedaProveedor.setEditable(false);
        busquedaProveedor.setColumns(20);
        busquedaProveedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        busquedaProveedor.setRows(5);
        jScrollPane5.setViewportView(busquedaProveedor);

        panelBuscarProveedor.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 444, 296));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel51.setText("BUSCAR PROVEEDOR");
        panelBuscarProveedor.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        nitProveedor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitProveedor4ActionPerformed(evt);
            }
        });
        nitProveedor4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nitProveedor4KeyTyped(evt);
            }
        });
        panelBuscarProveedor.add(nitProveedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 267, -1));

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
        panelBuscarProveedor.add(buscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        panelProveedor.addTab("BUSCAR", panelBuscarProveedor);

        panelListarProveedor.setBackground(new java.awt.Color(233, 233, 233));
        panelListarProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelListarProveedor.add(txtValorBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 352, 20));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel52.setText("LISTAR PROVEEDOR");
        panelListarProveedor.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        cboxFiltro1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cboxFiltro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Precio", "Nombre Producto", "Todos" }));
        cboxFiltro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltro1ActionPerformed(evt);
            }
        });
        panelListarProveedor.add(cboxFiltro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 185, -1));

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setText("LISTAR POR:");
        panelListarProveedor.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, 20));

        botonListar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonListar.PNG"))); // NOI18N
        botonListar1.setBorder(null);
        botonListar1.setBorderPainted(false);
        botonListar1.setContentAreaFilled(false);
        botonListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListar1ActionPerformed(evt);
            }
        });
        panelListarProveedor.add(botonListar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        tblDatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "NIT", "TELEFONO", "DIRECCION", "PRECIO PRODUCTO", "NOMBRE PRODUCTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblDatos1);

        panelListarProveedor.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 167, 760, 300));

        panelProveedor.addTab("LISTAR", panelListarProveedor);

        jLayeredPane1.add(panelProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 69, 919, 570));

        panelReportes.setBackground(new java.awt.Color(158, 189, 213));
        panelReportes.setToolTipText("");
        panelReportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelReportes.setOpaque(true);

        panelReporteEmpleado.setBackground(new java.awt.Color(233, 233, 233));
        panelReporteEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cargo", "Salario", "Todo" }));
        panelReporteEmpleado.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 113, -1));

        GenerarPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPdf.PNG"))); // NOI18N
        GenerarPdf.setBorder(null);
        GenerarPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPdfActionPerformed(evt);
            }
        });
        panelReporteEmpleado.add(GenerarPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));
        panelReporteEmpleado.add(jtxDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 292, -1));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("GENERAR REPORTE EMPLEADO");
        panelReporteEmpleado.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 20, 920, -1));

        panelReportes.addTab("EMPLEADO", panelReporteEmpleado);

        panelReporteProductos.setBackground(new java.awt.Color(233, 233, 233));
        panelReporteProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("GENERAR REPORTE PRODUCTO");
        panelReporteProductos.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 920, -1));
        panelReporteProductos.add(jtxDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 292, -1));

        GenerarPdf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPdf.PNG"))); // NOI18N
        GenerarPdf1.setBorder(null);
        GenerarPdf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPdf1ActionPerformed(evt);
            }
        });
        panelReporteProductos.add(GenerarPdf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Precio", "Nombre Proveedor", "Todo" }));
        panelReporteProductos.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 113, -1));

        panelReportes.addTab("PRODUCTOS", panelReporteProductos);

        panelReporteEditar.setBackground(new java.awt.Color(233, 233, 233));
        panelReporteEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelReporteEditar.add(jtxDato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 292, -1));

        GenerarPdf2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonPdf.PNG"))); // NOI18N
        GenerarPdf2.setBorder(null);
        GenerarPdf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPdf2ActionPerformed(evt);
            }
        });
        panelReporteEditar.add(GenerarPdf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Barrio", "Todo" }));
        panelReporteEditar.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 113, -1));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("GENERAR REPORTE CLIENTE");
        panelReporteEditar.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 20, 930, -1));

        panelReportes.addTab("CLIENTE", panelReporteEditar);

        jLayeredPane1.add(panelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 69, 919, 570));

        panelCotizaciones.setBackground(new java.awt.Color(158, 189, 213));
        panelCotizaciones.setToolTipText("");
        panelCotizaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCotizaciones.setOpaque(true);

        panelCrearCotizacion.setBackground(new java.awt.Color(233, 233, 233));
        panelCrearCotizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        totalCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        totalCompra.setForeground(new java.awt.Color(51, 51, 51));
        totalCompra.setText("Total");
        panelCrearCotizacion.add(totalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 323, -1));

        agregar.setForeground(new java.awt.Color(51, 51, 51));
        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, -1));

        eliminarProducto.setForeground(new java.awt.Color(51, 51, 51));
        eliminarProducto.setText("ELIMINAR");
        eliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProductoActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(eliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 85, -1));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText("Documento Cliente");
        panelCrearCotizacion.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setText("Cantidad");
        panelCrearCotizacion.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        tbnGuardarCotizacion.setForeground(new java.awt.Color(51, 51, 51));
        tbnGuardarCotizacion.setText("GUARDAR");
        tbnGuardarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnGuardarCotizacionActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(tbnGuardarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        fecha.setForeground(new java.awt.Color(51, 51, 51));
        fecha.setText("AA/MM/DD");
        panelCrearCotizacion.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("Numero Cotizacion");
        panelCrearCotizacion.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        cancelarC.setForeground(new java.awt.Color(51, 51, 51));
        cancelarC.setText("CANCELAR");
        cancelarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(cancelarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        fechaCotizacion.setForeground(new java.awt.Color(51, 51, 51));
        fechaCotizacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelCrearCotizacion.add(fechaCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 97, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("Fecha");
        panelCrearCotizacion.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

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

        panelCrearCotizacion.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 300, 530, 100));

        numeroCotizacion.setForeground(new java.awt.Color(51, 51, 51));
        numeroCotizacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numeroCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCotizacionActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(numeroCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 117, -1));

        vendedorCotizacion.setForeground(new java.awt.Color(51, 51, 51));
        vendedorCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedorCotizacionActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(vendedorCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 322, -1));

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

        documentoClienteCotiza.setForeground(new java.awt.Color(51, 51, 51));
        panelCrearCotizacion.add(documentoClienteCotiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 322, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(51, 51, 51));
        jLabel60.setText("Documento vendedor");
        panelCrearCotizacion.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        codigoProducCotizacion.setForeground(new java.awt.Color(51, 51, 51));
        panelCrearCotizacion.add(codigoProducCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 87, -1));

        cantidadProductoCotizacion.setForeground(new java.awt.Color(51, 51, 51));
        cantidadProductoCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoCotizacionActionPerformed(evt);
            }
        });
        panelCrearCotizacion.add(cantidadProductoCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 86, -1));

        GuardarCotizacion1.setForeground(new java.awt.Color(51, 51, 51));
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
        panelCrearCotizacion.add(GuardarCotizacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 123, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(51, 51, 51));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("CREAR COTIZACION");
        panelCrearCotizacion.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 10, 880, -1));

        jLabel62.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(51, 51, 51));
        jLabel62.setText("Codigo Producto");
        panelCrearCotizacion.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        panelCotizaciones.addTab("CREAR", panelCrearCotizacion);

        panelBuscarCotizacion.setBackground(new java.awt.Color(233, 233, 233));
        panelBuscarCotizacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelBuscarCotizacion.add(buscarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        resultadodetalle.setEditable(false);
        resultadodetalle.setColumns(20);
        resultadodetalle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadodetalle.setRows(5);
        jScrollPane10.setViewportView(resultadodetalle);

        panelBuscarCotizacion.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 466, 196));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel65.setText("Numero Cotizacion ");
        panelBuscarCotizacion.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));
        panelBuscarCotizacion.add(numeroCotizacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 183, -1));

        jLabel67.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel67.setText("BUSCAR COTIZACION");
        panelBuscarCotizacion.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        resultadocotizacion.setEditable(false);
        resultadocotizacion.setColumns(20);
        resultadocotizacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadocotizacion.setRows(5);
        jScrollPane11.setViewportView(resultadocotizacion);

        panelBuscarCotizacion.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 466, 140));

        panelCotizaciones.addTab("BUSCAR", panelBuscarCotizacion);

        jLayeredPane1.add(panelCotizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 69, 919, 570));

        panelEmpleado.setBackground(new java.awt.Color(158, 189, 213));
        panelEmpleado.setToolTipText("");
        panelEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelEmpleado.setOpaque(true);

        panelCrearEmpleado.setBackground(new java.awt.Color(233, 233, 233));
        panelCrearEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel63.setText("Nombre Empleado");
        panelCrearEmpleado.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        nombreEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpleado1ActionPerformed(evt);
            }
        });
        panelCrearEmpleado.add(nombreEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 283, 25));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel64.setText("Apellido Empleado");
        panelCrearEmpleado.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel66.setText("Cedula");
        panelCrearEmpleado.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel68.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel68.setText("Telefono");
        panelCrearEmpleado.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel69.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel69.setText("Direccion");
        panelCrearEmpleado.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel70.setText("REGISTRAR EMPLEADO");
        panelCrearEmpleado.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardar.setBorder(null);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setFocusable(false);
        guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        panelCrearEmpleado.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        jLabel71.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel71.setText("Sueldo");
        panelCrearEmpleado.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel72.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel72.setText("Nombre Usuario");
        panelCrearEmpleado.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel73.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel73.setText("Contrasena Usuario");
        panelCrearEmpleado.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));
        panelCrearEmpleado.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 283, 25));
        panelCrearEmpleado.add(contrasenaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 283, 25));
        panelCrearEmpleado.add(apellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 283, 25));
        panelCrearEmpleado.add(cedulaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 283, 25));
        panelCrearEmpleado.add(telefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 283, 25));
        panelCrearEmpleado.add(direccionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 283, 25));
        panelCrearEmpleado.add(sueldoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 283, 25));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel75.setText("Barrio");
        panelCrearEmpleado.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));
        panelCrearEmpleado.add(barrioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 283, 25));

        jLabel76.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel76.setText("Cargo");
        panelCrearEmpleado.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, 20));

        cargoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe", "Empleado" }));
        panelCrearEmpleado.add(cargoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 283, 25));

        panelEmpleado.addTab("CREAR", panelCrearEmpleado);

        panelEliminarEmpleado.setBackground(new java.awt.Color(233, 233, 233));
        panelEliminarEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulEmpleadoActionPerformed(evt);
            }
        });
        cedulEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulEmpleadoKeyTyped(evt);
            }
        });
        panelEliminarEmpleado.add(cedulEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 267, -1));

        botonEliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar2.setBorder(null);
        botonEliminar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar2ActionPerformed(evt);
            }
        });
        panelEliminarEmpleado.add(botonEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        empleadoEliminar.setEditable(false);
        empleadoEliminar.setColumns(20);
        empleadoEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        empleadoEliminar.setRows(5);
        jScrollPane8.setViewportView(empleadoEliminar);

        panelEliminarEmpleado.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 444, 162));

        jLabel77.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel77.setText("Cedula del Empleado");
        panelEliminarEmpleado.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel78.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel78.setText("ELIMINAR EMPLEADO");
        panelEliminarEmpleado.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        botonBuscarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarEmp.setBorder(null);
        botonBuscarEmp.setBorderPainted(false);
        botonBuscarEmp.setContentAreaFilled(false);
        botonBuscarEmp.setFocusPainted(false);
        botonBuscarEmp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarEmp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        botonBuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarEmpActionPerformed(evt);
            }
        });
        panelEliminarEmpleado.add(botonBuscarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));
        panelEliminarEmpleado.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        panelEmpleado.addTab("ELIMINAR", panelEliminarEmpleado);

        panelEditarEmpleado.setBackground(new java.awt.Color(233, 233, 233));
        panelEditarEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel80.setText("Cedula del Empleado a Editar");
        panelEditarEmpleado.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel81.setText("Direccion");
        panelEditarEmpleado.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jLabel82.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel82.setText("Telefono");
        panelEditarEmpleado.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));
        panelEditarEmpleado.add(apellidoEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 314, -1));
        panelEditarEmpleado.add(barrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 314, -1));

        telefonoEmpleado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoEmpleado1KeyTyped(evt);
            }
        });
        panelEditarEmpleado.add(telefonoEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 314, -1));

        jLabel83.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel83.setText("EDITAR EMPLEADO");
        panelEditarEmpleado.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel84.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel84.setText("Barrio");
        panelEditarEmpleado.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));
        panelEditarEmpleado.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 314, -1));

        cedulaEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaEmpleado1ActionPerformed(evt);
            }
        });
        cedulaEmpleado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaEmpleado1KeyTyped(evt);
            }
        });
        panelEditarEmpleado.add(cedulaEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 314, -1));

        guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonGuardar.PNG"))); // NOI18N
        guardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardar1MouseClicked(evt);
            }
        });
        panelEditarEmpleado.add(guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));
        panelEditarEmpleado.add(nombreEmpleado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 314, -1));

        jLabel85.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel85.setText("Apellido Empleado");
        panelEditarEmpleado.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel86.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel86.setText("Nombre Empleado");
        panelEditarEmpleado.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        panelEmpleado.addTab("EDITAR", panelEditarEmpleado);

        panelBuscarEmpleado.setBackground(new java.awt.Color(233, 233, 233));
        panelBuscarEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultadoBusqueda1.setEditable(false);
        resultadoBusqueda1.setColumns(20);
        resultadoBusqueda1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadoBusqueda1.setRows(5);
        jScrollPane9.setViewportView(resultadoBusqueda1);

        panelBuscarEmpleado.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 444, 270));

        jLabel87.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel87.setText("Cedula del Cliente ");
        panelBuscarEmpleado.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        cedulEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulEmpleado1ActionPerformed(evt);
            }
        });
        cedulEmpleado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulEmpleado1KeyTyped(evt);
            }
        });
        panelBuscarEmpleado.add(cedulEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 267, -1));

        jLabel88.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel88.setText("BUSCAR EMPLEADO");
        panelBuscarEmpleado.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        buscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarEmpleado.setBorder(null);
        buscarEmpleado.setBorderPainted(false);
        buscarEmpleado.setContentAreaFilled(false);
        buscarEmpleado.setFocusPainted(false);
        buscarEmpleado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarEmpleado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCARBOTON.PNG"))); // NOI18N
        buscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEmpleadoActionPerformed(evt);
            }
        });
        panelBuscarEmpleado.add(buscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        panelEmpleado.addTab("BUSCAR", panelBuscarEmpleado);

        panelListarEmpleado.setBackground(new java.awt.Color(233, 233, 233));
        panelListarEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonListar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonListar.PNG"))); // NOI18N
        botonListar2.setBorder(null);
        botonListar2.setBorderPainted(false);
        botonListar2.setContentAreaFilled(false);
        botonListar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListar2ActionPerformed(evt);
            }
        });
        panelListarEmpleado.add(botonListar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel89.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel89.setText("LISTAR EMPELADO");
        panelListarEmpleado.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel90.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel90.setText("LISTAR POR:");
        panelListarEmpleado.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 30));

        cboxFiltro2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cboxFiltro2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre", "Apellido", "Cargo", "Sueldo", "Barrio", " " }));
        cboxFiltro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFiltro2ActionPerformed(evt);
            }
        });
        panelListarEmpleado.add(cboxFiltro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 185, 30));

        tblDatos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USUARIO", "NOMBRE", "APELLIDO", "CEDULA", "TELEFONO", "DIRECCION", "BARRIO", "SUELDO", "CARGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(tblDatos2);

        panelListarEmpleado.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 750, 327));

        txtValorBusqueda2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        panelListarEmpleado.add(txtValorBusqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 240, 30));

        panelEmpleado.addTab("LISTAR", panelListarEmpleado);

        jLayeredPane1.add(panelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 69, 919, 570));

        panelCliente.setBackground(new java.awt.Color(158, 189, 213));
        panelCliente.setToolTipText("");
        panelCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelCliente.setOpaque(true);

        panelCrearCliente.setBackground(new java.awt.Color(233, 233, 233));
        panelCrearCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel91.setText("REGISTAR CLIENTE");
        panelCrearCliente.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel92.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel92.setText("Nombre");
        panelCrearCliente.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel93.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel93.setText("Apellido");
        panelCrearCliente.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));
        panelCrearCliente.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel95.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel95.setText("Cedula");
        panelCrearCliente.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel96.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel96.setText("Telefono");
        panelCrearCliente.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel97.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel97.setText("Direccion");
        panelCrearCliente.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel98.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel98.setText("Barrio");
        panelCrearCliente.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

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
        panelCrearCliente.add(guardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });
        panelCrearCliente.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 355, -1));
        panelCrearCliente.add(apellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 355, -1));

        cedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaClienteActionPerformed(evt);
            }
        });
        panelCrearCliente.add(cedulaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 355, -1));
        panelCrearCliente.add(telCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 355, -1));
        panelCrearCliente.add(direccinCliete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 355, -1));
        panelCrearCliente.add(BarrioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 355, -1));

        jLabel99.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel99.setText("Correo");
        panelCrearCliente.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));
        panelCrearCliente.add(CorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 355, -1));

        panelCliente.addTab("CREAR", panelCrearCliente);

        panelEliminarCliente.setBackground(new java.awt.Color(233, 233, 233));
        panelEliminarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel100.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel100.setText("ELIMINAR CLIENTE");
        panelEliminarCliente.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));
        panelEliminarCliente.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

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
        panelEliminarCliente.add(botonBuscarCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jLabel102.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel102.setText("Cedula del Cliente ");
        panelEliminarCliente.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

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
        panelEliminarCliente.add(cedulCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 267, -1));

        clienteaEliminar.setEditable(false);
        clienteaEliminar.setColumns(20);
        clienteaEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clienteaEliminar.setRows(5);
        jScrollPane13.setViewportView(clienteaEliminar);

        panelEliminarCliente.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 444, 162));

        botonEliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar3.setBorder(null);
        botonEliminar3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonEliminar.PNG"))); // NOI18N
        botonEliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar3ActionPerformed(evt);
            }
        });
        panelEliminarCliente.add(botonEliminar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        panelCliente.addTab("ELIMINAR", panelEliminarCliente);

        panelEditarCliente.setBackground(new java.awt.Color(233, 233, 233));
        panelEditarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel103.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel103.setText("EDITAR CLIENTE");
        panelEditarCliente.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel104.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel104.setText("Nombre Cliente");
        panelEditarCliente.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel105.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel105.setText("Apellido Cliente");
        panelEditarCliente.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        panelEditarCliente.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel107.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel107.setText("Telefono ");
        panelEditarCliente.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabel108.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel108.setText("Direccion ");
        panelEditarCliente.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel109.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel109.setText("Barrio ");
        panelEditarCliente.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

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
        panelEditarCliente.add(guardarCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, -1, -1));

        nombreCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCliente1ActionPerformed(evt);
            }
        });
        nombreCliente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreCliente1KeyTyped(evt);
            }
        });
        panelEditarCliente.add(nombreCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 355, -1));
        panelEditarCliente.add(apellidoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 355, -1));
        panelEditarCliente.add(telCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 355, -1));
        panelEditarCliente.add(direccinCliete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 355, -1));
        panelEditarCliente.add(BarrioCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 355, -1));

        jLabel110.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel110.setText("Cedula del Cliente a Editar");
        panelEditarCliente.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

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
        panelEditarCliente.add(cedulCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 360, -1));

        jLabel111.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel111.setText("Correo");
        panelEditarCliente.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));
        panelEditarCliente.add(CorreoCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 355, -1));

        panelCliente.addTab("EDITAR", panelEditarCliente);

        panelBuscarCliente.setBackground(new java.awt.Color(233, 233, 233));
        panelBuscarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel112.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel112.setText("BUSCAR CLIENTE");
        panelBuscarCliente.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));
        panelBuscarCliente.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, -1));

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
        panelBuscarCliente.add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jLabel114.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel114.setText("Cedula del Cliente ");
        panelBuscarCliente.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

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
        panelBuscarCliente.add(cedulCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 267, -1));

        resultadoBusqueda2.setEditable(false);
        resultadoBusqueda2.setColumns(20);
        resultadoBusqueda2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resultadoBusqueda2.setRows(5);
        jScrollPane14.setViewportView(resultadoBusqueda2);

        panelBuscarCliente.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 444, 296));

        panelCliente.addTab("BUSCAR", panelBuscarCliente);

        panelListarCliente.setBackground(new java.awt.Color(233, 233, 233));
        panelListarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane15.setViewportView(tblDatos3);

        panelListarCliente.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 770, 327));
        panelListarCliente.add(txtValorBusqueda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 299, -1));

        botonListar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonListar.PNG"))); // NOI18N
        botonListar3.setBorder(null);
        botonListar3.setBorderPainted(false);
        botonListar3.setContentAreaFilled(false);
        botonListar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListar3ActionPerformed(evt);
            }
        });
        panelListarCliente.add(botonListar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        jLabel115.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel115.setText("LISTAR CLIENTE");
        panelListarCliente.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel116.setText("LISTAR POR:");
        panelListarCliente.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        cboxFiltro3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cboxFiltro3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Barrio", "Todos" }));
        panelListarCliente.add(cboxFiltro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 143, -1));

        panelCliente.addTab("LISTAR", panelListarCliente);

        jLayeredPane1.add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 69, 919, 570));

        panelMenu.setBackground(new java.awt.Color(158, 189, 213));
        panelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonProducto.setBackground(new java.awt.Color(246, 149, 50));
        botonProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonProducto.setText("PRODUCTOS");
        botonProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductoActionPerformed(evt);
            }
        });
        panelMenu.add(botonProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 32, 135, 36));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        panelMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoprovedor.png"))); // NOI18N
        panelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 120, -1, -1));

        gestionProveedor.setBackground(new java.awt.Color(246, 149, 50));
        gestionProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gestionProveedor.setText("PROVEEDOR");
        gestionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionProveedorActionPerformed(evt);
            }
        });
        panelMenu.add(gestionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 132, 136, 36));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REPORTES.png"))); // NOI18N
        panelMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 208, -1, -1));

        botonReportes.setBackground(new java.awt.Color(246, 149, 50));
        botonReportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonReportes.setText("REPORTES");
        botonReportes.setToolTipText("");
        botonReportes.setMaximumSize(new java.awt.Dimension(107, 23));
        botonReportes.setMinimumSize(new java.awt.Dimension(107, 23));
        botonReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReportesActionPerformed(evt);
            }
        });
        panelMenu.add(botonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 220, 136, 36));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cotizacion.png"))); // NOI18N
        panelMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 296, -1, -1));

        botonCotizacion.setBackground(new java.awt.Color(246, 149, 50));
        botonCotizacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonCotizacion.setText("COTIZACIONES");
        botonCotizacion.setMaximumSize(new java.awt.Dimension(107, 23));
        botonCotizacion.setMinimumSize(new java.awt.Dimension(107, 23));
        botonCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCotizacionActionPerformed(evt);
            }
        });
        panelMenu.add(botonCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 308, 136, 36));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONOeMPLEADO.png"))); // NOI18N
        panelMenu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 415, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clienteimagenqw.png"))); // NOI18N
        panelMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 493, 48, -1));

        clientes.setBackground(new java.awt.Color(246, 149, 50));
        clientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clientes.setText("CLIENTE");
        clientes.setMaximumSize(new java.awt.Dimension(107, 23));
        clientes.setMinimumSize(new java.awt.Dimension(107, 23));
        clientes.setPreferredSize(new java.awt.Dimension(107, 23));
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        panelMenu.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 505, 136, 36));

        Empleado.setBackground(new java.awt.Color(246, 149, 50));
        Empleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Empleado.setText("EMPLEADO");
        Empleado.setMaximumSize(new java.awt.Dimension(107, 23));
        Empleado.setMinimumSize(new java.awt.Dimension(107, 23));
        Empleado.setPreferredSize(new java.awt.Dimension(107, 23));
        Empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpleadoMouseClicked(evt);
            }
        });
        panelMenu.add(Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 427, 137, 36));

        jLayeredPane1.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 69, 217, 568));

        panelTitulo.setBackground(new java.awt.Color(158, 189, 213));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logopapeleria.png"))); // NOI18N
        panelTitulo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("GESTION ADMINISTRADOR");
        panelTitulo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit icon2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1102, 0, -1, -1));

        nombreEmpleado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        panelTitulo.add(nombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 41, -1, -1));

        jLayeredPane1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 1138, 68));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    controlador.ControladorEmpleado emplea = new controlador.ControladorEmpleado();
    controlador.ControladorCliente cliente  = new controlador.ControladorCliente();
    modelo.DAOCliente listarCli = new  modelo.DAOCliente();
    modelo.DAOEmpleado listarEmple = new modelo.DAOEmpleado();
    modelo.DAOEmpleado Emple = new modelo.DAOEmpleado();
    modelo.DAOProducto listarPro = new modelo.DAOProducto();
    modelo.DAOProveedor listarProv = new modelo.DAOProveedor();
    controlador.ControladorProducto produ = new controlador.ControladorProducto();
    controlador.ControladorProveedor prove = new controlador.ControladorProveedor();
    modelo.DAOProducto produ2 = new modelo.DAOProducto();
    modelo.DAOCliente clie = new modelo.DAOCliente();
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        LoginUsuario vista = new LoginUsuario();
        vista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void botonProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductoActionPerformed
        panelCliente.setVisible(false);
        panelEmpleado.setVisible(false);
        panelCotizaciones.setVisible(false);
        panelProductos.setVisible(true);        
        panelProveedor.setVisible(false);
        panelReportes.setVisible(false);
        
        botonReportes.setBackground(fondoNaranja);
        clientes.setBackground(fondoNaranja);
        botonProducto.setBackground(rojo);
        gestionProveedor.setBackground(fondoNaranja);
        botonCotizacion.setBackground(fondoNaranja);
        Empleado.setBackground(fondoNaranja);
    }//GEN-LAST:event_botonProductoActionPerformed

    private void gestionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionProveedorActionPerformed
        panelCliente.setVisible(false);
        panelEmpleado.setVisible(false);
        panelCotizaciones.setVisible(false);
        panelProductos.setVisible(false);
        panelProveedor.setVisible(true);       
        panelReportes.setVisible(false);
        
        botonReportes.setBackground(fondoNaranja);
        clientes.setBackground(fondoNaranja);
        botonProducto.setBackground(fondoNaranja);
        gestionProveedor.setBackground(rojo);
        botonCotizacion.setBackground(fondoNaranja);
        Empleado.setBackground(fondoNaranja);
    }//GEN-LAST:event_gestionProveedorActionPerformed

    private void botonReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReportesActionPerformed
        panelCliente.setVisible(false);
        panelEmpleado.setVisible(false);
        panelCotizaciones.setVisible(false);
        panelProductos.setVisible(false);
        panelProveedor.setVisible(false);
        panelReportes.setVisible(true);
        
        botonReportes.setBackground(rojo);
        clientes.setBackground(fondoNaranja);
        botonProducto.setBackground(fondoNaranja);
        gestionProveedor.setBackground(fondoNaranja);
        botonCotizacion.setBackground(fondoNaranja);
        Empleado.setBackground(fondoNaranja);
    }//GEN-LAST:event_botonReportesActionPerformed

    private void botonCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCotizacionActionPerformed
        panelCliente.setVisible(false);
        panelEmpleado.setVisible(false);
        panelCotizaciones.setVisible(true);        
        panelProductos.setVisible(false);
        panelProveedor.setVisible(false);
        panelReportes.setVisible(false);
        
        clientes.setBackground(fondoNaranja);
        botonProducto.setBackground(fondoNaranja);
        gestionProveedor.setBackground(fondoNaranja);
        botonReportes.setBackground(fondoNaranja);
        botonCotizacion.setBackground(rojo);
        Empleado.setBackground(fondoNaranja);
    }//GEN-LAST:event_botonCotizacionActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        panelCliente.setVisible(true);      
        panelEmpleado.setVisible(false);
        panelCotizaciones.setVisible(false);
        panelProductos.setVisible(false);
        panelProveedor.setVisible(false);
        panelReportes.setVisible(false);
        
        clientes.setBackground(rojo);
        botonProducto.setBackground(fondoNaranja);
        gestionProveedor.setBackground(fondoNaranja);
        botonReportes.setBackground(fondoNaranja);
        botonCotizacion.setBackground(fondoNaranja);
        Empleado.setBackground(fondoNaranja);
    }//GEN-LAST:event_clientesActionPerformed

    private void EmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpleadoMouseClicked
        panelCliente.setVisible(false);
        panelEmpleado.setVisible(true);
        panelCotizaciones.setVisible(false);
        panelProductos.setVisible(false);
        panelProveedor.setVisible(false);
        panelReportes.setVisible(false);
        
        botonReportes.setBackground(fondoNaranja);
        botonProducto.setBackground(fondoNaranja);
        gestionProveedor.setBackground(fondoNaranja);
        botonCotizacion.setBackground(fondoNaranja);
        Empleado.setBackground(rojo);
        clientes.setBackground(fondoNaranja);
    }//GEN-LAST:event_EmpleadoMouseClicked

    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
        if (nombreProducto.getText().isEmpty() || codigoProducto.getText().isEmpty() || precioProducto.getText().isEmpty() 
                ||  descripcionProducto.getText().isEmpty() || cantidadProducto.getText().isEmpty() || proveedirProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todo el formulario", "Error",JOptionPane.WARNING_MESSAGE);
        } else {
            String nombre = nombreProducto.getText();
            String codigo = codigoProducto.getText();
            String precio = precioProducto.getText();
            String descripcion = descripcionProducto.getText();
            String cantidad = cantidadProducto.getText();
            String proveedor = proveedirProducto.getText();

            controlador.ControladorProducto producto = new controlador.ControladorProducto();
            String resultado = producto.verificarExitencia(codigo);

            if (resultado.equals("No esta")) {
                producto.guardarProducto(nombre, codigo, precio, descripcion, cantidad, proveedor);
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

    private void codigoProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoProducto1ActionPerformed

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
        } else{            
            listarPro.setPrecioPro(txtValorBusqueda.getText());
            listarPro.setCantidadPro(txtValorBusqueda.getText());
            listarPro.setProveedorPro(txtValorBusqueda.getText());
            listarPro.listarProdu(txtValorBusqueda.getText(), cboxFiltro.getSelectedItem().toString(), tblDatos);
            limpiarCampos();
        }
    }//GEN-LAST:event_botonListarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void nombredeProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombredeProveedorActionPerformed

    }//GEN-LAST:event_nombredeProveedorActionPerformed

    private void guardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProvActionPerformed
        modelo.DAOProveedor  objProv;
        objProv = new modelo.DAOProveedor();

        String nit = nitProveedor1.getText();

        controlador.ControladorProveedor proveedor  = new controlador.ControladorProveedor();
        String resultado = proveedor.verificarExitencia(nit);
        if(resultado.equals("No esta")){
            objProv.setNombreProv(nombredeProveedor.getText());
            objProv.setNitProv(nitProveedor1.getText());
            objProv.setTelefonoProv(telefonoProveedor.getText());
            objProv.setDireccionProv(direccionProveedor.getText());
            objProv.setProductoProv(nombreproductoprov.getText());
            objProv.setPrecioProdProv(precioproductoprov.getText());
            objProv.insertar();
            JOptionPane.showMessageDialog(rootPane, "SE REGISTRO PROVEEDOR CON EXITO");
            limpiarCampos();
        }

    }//GEN-LAST:event_guardarProvActionPerformed

    private void nombreproductoprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreproductoprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreproductoprovActionPerformed

    private void precioproductoprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioproductoprovActionPerformed

    }//GEN-LAST:event_precioproductoprovActionPerformed

    private void botonEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar1ActionPerformed

        if(nitProveedor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE BUSCAR AL CLIENTE");
        }else if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el proveedor, ¿desea continuar?",
            "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        prove.eliminarProv(nitProveedor.getText());
        limpiarCampos();
        }
    }//GEN-LAST:event_botonEliminar1ActionPerformed

    private void nitProveedor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitProveedor2ActionPerformed

    }//GEN-LAST:event_nitProveedor2ActionPerformed

    private void nitProveedor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitProveedor2KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_nitProveedor2KeyTyped

    private void botonBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarProvActionPerformed
        String nit = nitProveedor2.getText();
        if(nitProveedor2.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR EL NIT DEL CLIENTE");
        }else{
            proveedorEliminar.setText(prove.buscarProv(nit));
        }
    }//GEN-LAST:event_botonBuscarProvActionPerformed

    private void guardarProducto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProducto2ActionPerformed
        modelo.DAOProveedor objetoProveedor= new modelo.DAOProveedor();
        objetoProveedor.setNitProv(nitProveedor3.getText());
        objetoProveedor.setNombreProv(nombrProveedor.getText());
        objetoProveedor.setTelefonoProv(telProveedor.getText());
        objetoProveedor.setDireccionProv(direccionProveedor1.getText());
        objetoProveedor.setPrecioProdProv(precioProdprov.getText());
        objetoProveedor.setProductoProv(nomProducProv.getText());
        String resultado = "";
        resultado = objetoProveedor.modificar();
        if(resultado.equals("Error")){
            JOptionPane.showMessageDialog(null, "No se modifico");
        }else{
            JOptionPane.showMessageDialog(null, "Se modifico");
        }
        limpiarCampos();
    }//GEN-LAST:event_guardarProducto2ActionPerformed

    private void nitProveedor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitProveedor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitProveedor3ActionPerformed

    private void nombrProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrProveedorActionPerformed

    }//GEN-LAST:event_nombrProveedorActionPerformed

    private void direccionProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionProveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionProveedor1ActionPerformed

    private void nitProveedor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitProveedor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitProveedor4ActionPerformed

    private void nitProveedor4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nitProveedor4KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_nitProveedor4KeyTyped

    private void buscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProveedorActionPerformed
        controlador.ControladorProveedor buscar  = new controlador.ControladorProveedor();
        if(nitProveedor4.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA CEDULA DEL CLIENTE");
        }else{
            String nit = nitProveedor4.getText();
            busquedaProveedor.setText(buscar.buscarProv(nit));
            nitProveedor4.setText("");
        }

    }//GEN-LAST:event_buscarProveedorActionPerformed

    private void cboxFiltro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFiltro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxFiltro1ActionPerformed

    private void botonListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListar1ActionPerformed
        if(txtValorBusqueda1.getText().equals("") && !cboxFiltro1.getSelectedItem().toString().equals("Todos")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        }else{
            listarProv.setPrecioProdProv(txtValorBusqueda1.getText());
            listarProv.listarProve(txtValorBusqueda1.getText(),cboxFiltro1.getSelectedItem().toString(),tblDatos);
            limpiarCampos();
        }

    }//GEN-LAST:event_botonListar1ActionPerformed

    private void GenerarPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPdfActionPerformed
        if(jComboBox1.getSelectedItem().toString().equals("Todo")){
            JOptionPane.showMessageDialog(null, "NO DEBE INGRESAR UN DATO");
            String dato = jtxDato.getText();
            Emple.generarPdf(dato,jComboBox1.getSelectedItem().toString());
        }else if(jtxDato.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        }else if(jComboBox1.getSelectedItem().toString().equals("Cargo")){
            String dato = jtxDato.getText();
            Emple.generarPdf(dato,jComboBox1.getSelectedItem().toString());
        }else{
            String dato = jtxDato.getText();
            Emple.setSueldo(Integer.parseInt(jtxDato.getText()));
            Emple.generarPdf(dato,jComboBox1.getSelectedItem().toString());
        }
    }//GEN-LAST:event_GenerarPdfActionPerformed

    private void GenerarPdf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPdf1ActionPerformed

        if(jComboBox2.getSelectedItem().toString().equals("Todo")){
            jtxDato1.setVisible(false);
            String dato = jtxDato1.getText();
            produ2.generarPdf(dato,jComboBox2.getSelectedItem().toString());
        }else if(jtxDato1.getText().equals("")){
            jtxDato1.setVisible(true);
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        }else{
            jtxDato1.setVisible(true);
            String dato = jtxDato1.getText();
            produ2.setPrecioPro(jtxDato1.getText());
            produ2.generarPdf(dato,jComboBox2.getSelectedItem().toString());
        }
    }//GEN-LAST:event_GenerarPdf1ActionPerformed

    private void GenerarPdf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPdf2ActionPerformed
        if(jComboBox3.getSelectedItem().toString().equals("Todo")){
            jtxDato2.setVisible(false);
            String dato = jtxDato2.getText();
            clie.generarPdf(dato,jComboBox3.getSelectedItem().toString());
        }else if(jtxDato2.getText().equals("")){
            jtxDato2.setVisible(true);
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        }else{
            jtxDato2.setVisible(true);
            String dato = jtxDato2.getText();
            clie.generarPdf(dato,jComboBox3.getSelectedItem().toString());
        }
    }//GEN-LAST:event_GenerarPdf2ActionPerformed

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
        String cedulaClien = documentoClienteCotiza.getText();
        String cedulaEmple = vendedorCotizacion.getText();
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
        buscar.cancelarCotizacion(Integer.toString(idcotizacion));
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
        vendedorCotizacion.setText("");
        fechaCotizacion.setText(buscar.fechaActual());
        idcotizacion = Integer.parseInt(buscar.codigoCotizacion());
        numeroCotizacion.setText(Integer.toString(idcotizacion));
        tbnGuardarCotizacion.setEnabled(true);
        totalCompra.setText("Total: ");
        limpiarTabla();
    }//GEN-LAST:event_GuardarCotizacion1ActionPerformed

    private void buscarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCotizacionActionPerformed
        String cotizacion = numeroCotizacion2.getText();
        controlador.ControladorCotizacion buscar2  = new controlador.ControladorCotizacion();
        resultadocotizacion.setText(buscar2.buscarCotizacion(cotizacion));
        resultadodetalle.setText(buscar2.buscardetalleCotizacion(cotizacion));
        numeroCotizacion2.setText("");
    }//GEN-LAST:event_buscarCotizacionActionPerformed

    private void nombreEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleado1ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        controlador.EncriptarPassword encriptar = new controlador.EncriptarPassword();
        String usuario = nombreUsuario.getText();
        String contrasena = contrasenaUsuario.getText();
        String contrasenaEncrip = encriptar.encriptar(contrasena);
        String nombre = nombreEmpleado1.getText();
        String apellido = apellidoEmpleado.getText();
        double cedula = Double.parseDouble(cedulaEmpleado.getText());
        double telefono = Double.parseDouble(telefonoEmpleado.getText());
        String direccion = direccionEmpleado.getText();
        String barrio = barrioEmpleado.getText();
        double sueldo = Double.parseDouble(sueldoEmpleado.getText());
        String cargo = cargoEmpleado.getSelectedItem().toString();
        //int codigoproduc = Integer.parseInt(codigoProductoE.getText());

        controlador.ControladorEmpleado guardaEmpleado = new controlador.ControladorEmpleado();

        String resultado = guardaEmpleado.verificarExitencia(cedula);
        if(resultado.equals("No esta")){
            guardaEmpleado.guardarEmpleado(usuario, contrasenaEncrip, nombre, apellido, cedula, telefono,
                direccion, barrio, sueldo, cargo);
            limpiarCampos();
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void cedulEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulEmpleadoActionPerformed

    }//GEN-LAST:event_cedulEmpleadoActionPerformed

    private void cedulEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulEmpleadoKeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulEmpleadoKeyTyped

    private void botonEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar2ActionPerformed
        if(cedulEmpleado.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE BUSCAR AL EMPLEADO");
        }else if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el empleado, ¿desea continuar?",
            "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        emplea.eliminarEmple(Integer.parseInt(cedulEmpleado.getText()));
        limpiarCampos();
        }
    }//GEN-LAST:event_botonEliminar2ActionPerformed

    private void botonBuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarEmpActionPerformed
        int cedula = Integer.parseInt(cedulEmpleado.getText());
        if(cedulEmpleado.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR LA CEDULA DEL EMPELADO");
        }else{
            empleadoEliminar.setText(emplea.buscarEmple(cedula));
        }
    }//GEN-LAST:event_botonBuscarEmpActionPerformed

    private void telefonoEmpleado1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoEmpleado1KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_telefonoEmpleado1KeyTyped

    private void cedulaEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaEmpleado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaEmpleado1ActionPerformed

    private void cedulaEmpleado1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaEmpleado1KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulaEmpleado1KeyTyped

    private void guardar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardar1MouseClicked
        int cedula = Integer.parseInt(cedulaEmpleado1.getText());
        String nombre = nombreEmpleado2.getText();
        String apellido = apellidoEmpleado1.getText();
        int telefono = Integer.parseInt(telefonoEmpleado1.getText());
        String direccionn = direccion.getText();
        String barrioo = barrio.getText();

        if(cedulaEmpleado.getText().equals("")||nombreEmpleado.getText().equals("")||apellidoEmpleado.getText().equals("")||telefonoEmpleado.getText().equals("")
            ||direccion.getText().equals("")||barrio.getText().equals("")||barrio.getText().equals("")){
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS");
        }else{
            controlador.ControladorEmpleado ce = new controlador.ControladorEmpleado();
            ce.editarEmpleado(cedula, nombre, apellido, telefono, direccionn, barrioo);
            limpiarCampos();
        }

    }//GEN-LAST:event_guardar1MouseClicked

    private void cedulEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulEmpleado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulEmpleado1ActionPerformed

    private void cedulEmpleado1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulEmpleado1KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulEmpleado1KeyTyped

    private void buscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEmpleadoActionPerformed
        controlador.ControladorEmpleado buscar  = new controlador.ControladorEmpleado();
        if(cedulEmpleado1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA CEDULA DEL EMPLEADO");
        }else{
            int cedula = Integer.parseInt(cedulEmpleado1.getText());
            resultadoBusqueda1.setText(buscar.buscarEmple(cedula));
            cedulEmpleado1.setText("");
        }

    }//GEN-LAST:event_buscarEmpleadoActionPerformed

    private void botonListar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListar2ActionPerformed
        if(txtValorBusqueda2.getText().equals("") && !cboxFiltro2.getSelectedItem().toString().equals("Todos")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        }else if(cboxFiltro2.getSelectedItem().toString().equals("Sueldo")){
            listarEmple.setSueldo(Integer.parseInt(txtValorBusqueda2.getText()));
            listarEmple.listarEmpl(txtValorBusqueda2.getText(),cboxFiltro2.getSelectedItem().toString(),tblDatos2);
        }else if(cboxFiltro2.getSelectedItem().toString().equals("Todos")){
            listarEmple.listarEmpl(txtValorBusqueda2.getText(),cboxFiltro2.getSelectedItem().toString(),tblDatos2);
        }else{
            listarEmple.listarEmpl(txtValorBusqueda2.getText(),cboxFiltro2.getSelectedItem().toString(),tblDatos2);
        }
        limpiarCampos();
    }//GEN-LAST:event_botonListar2ActionPerformed

    private void cboxFiltro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFiltro2ActionPerformed
        if(cboxFiltro2.getSelectedItem().toString().equals("Todos")){
            txtValorBusqueda2.setEnabled(false);
        }else{
            txtValorBusqueda2.setEnabled(true);
        }
    }//GEN-LAST:event_cboxFiltro2ActionPerformed

    private void guardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarClienteActionPerformed

        String nombreCli = nombreCliente.getText();
        String apellido = apellidoCliente.getText();
        String cedula = cedulaCliente.getText();
        String telefono = telCliente.getText();
        String direccion = direccinCliete.getText();
        String barrio = BarrioCliente.getText();
        String correo = CorreoCliente.getText();

        controlador.ControladorCliente guardarCliente  = new controlador.ControladorCliente();
        String resultado = guardarCliente.verificarExitencia(cedula);
        if(resultado.equals("No esta")){
            guardarCliente.guardarCliente(nombreCli, apellido, cedula, telefono, direccion, barrio,correo);
            limpiarCampos();
        }

    }//GEN-LAST:event_guardarClienteActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

    private void cedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaClienteActionPerformed

    private void botonBuscarCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCli1ActionPerformed
        String cedula = cedulCliente.getText();
        if(cedulCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR LA CEDULA DEL CLIENTE");
        }else{
            clienteaEliminar.setText(cliente.buscarCli(cedula));
        }

    }//GEN-LAST:event_botonBuscarCli1ActionPerformed

    private void cedulClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulClienteActionPerformed

    }//GEN-LAST:event_cedulClienteActionPerformed

    private void cedulClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulClienteKeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulClienteKeyTyped

    private void botonEliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar3ActionPerformed
        if(cedulCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE BUSCAR AL CLIENTE");
        }else if (JOptionPane.showConfirmDialog(rootPane, "Se eliminará el cliente, ¿desea continuar?",
            "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        cliente.eliminarCli(cedulCliente.getText());
        limpiarCampos();
        }
    }//GEN-LAST:event_botonEliminar3ActionPerformed

    private void guardarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCliente1ActionPerformed
        if(cedulCliente1.getText().equals("")||nombreCliente1.getText().equals("")||apellidoCliente1.getText().equals("")
            ||telCliente1.getText().equals("")||direccinCliete1.getText().equals("")||BarrioCliente1.getText().equals("")
            ||CorreoCliente1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR TODOS LOS DATOS");
        }else if(cedulCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"DEBE INGRESAR LA CEDULA");
        }else{
            modelo.DAOCliente objetoCliente = new modelo.DAOCliente();
            objetoCliente.setCedulaCli(cedulCliente1.getText());
            objetoCliente.setNombreCli(nombreCliente1.getText());
            objetoCliente.setApellidoCli(apellidoCliente1.getText());
            objetoCliente.setTelefonoCli(telCliente1.getText());
            objetoCliente.setDireccionCli(direccinCliete1.getText());
            objetoCliente.setBarrioCli(BarrioCliente1.getText());
            objetoCliente.setCorreoCli(CorreoCliente1.getText());
            String resultado = "";
            resultado = objetoCliente.modificar();
            if(resultado.equals("Error")){
                JOptionPane.showMessageDialog(null, "No se modifico");
            }else{
                JOptionPane.showMessageDialog(null, "Se modifico");
            }
            limpiarCampos();
        }

    }//GEN-LAST:event_guardarCliente1ActionPerformed

    private void nombreCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCliente1ActionPerformed

    }//GEN-LAST:event_nombreCliente1ActionPerformed

    private void nombreCliente1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreCliente1KeyTyped
        char dato = evt.getKeyChar();
        if((dato<'a'||dato>'z')&&(dato<'A'||dato>'Z'))evt.consume();
    }//GEN-LAST:event_nombreCliente1KeyTyped

    private void cedulCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulCliente1ActionPerformed

    private void cedulCliente1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulCliente1KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulCliente1KeyTyped

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed

        controlador.ControladorCliente buscar  = new controlador.ControladorCliente();
        if(cedulCliente2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR LA CEDULA DEL CLIENTE");
        }else{
            String cedula = cedulCliente2.getText();
            resultadoBusqueda2.setText(buscar.buscarCli(cedula));
            cedulCliente2.setText("");
        }

    }//GEN-LAST:event_buscarClienteActionPerformed

    private void cedulCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulCliente2ActionPerformed

    private void cedulCliente2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulCliente2KeyTyped
        char dato = evt.getKeyChar();
        if(dato<'0'||dato>'9')evt.consume();
    }//GEN-LAST:event_cedulCliente2KeyTyped

    private void botonListar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListar3ActionPerformed
        if(txtValorBusqueda3.getText().equals("") && !cboxFiltro3.getSelectedItem().toString().equals("Todos")){
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DATO");
        }else{
            txtValorBusqueda3.setEnabled(true);
            listarCli.listarC(txtValorBusqueda3.getText(),cboxFiltro3.getSelectedItem().toString(),tblDatos3);
            limpiarCampos();
        }
    }//GEN-LAST:event_botonListar3ActionPerformed

    private void codigoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoProductoKeyTyped
        char validar = evt.getKeyChar();
        if(validar<'0'||validar>'9')evt.consume();
        if(Character.isLetter(validar))JOptionPane.showMessageDialog(null, "Solo digite números", "Advertencia", JOptionPane.WARNING_MESSAGE);              
    }//GEN-LAST:event_codigoProductoKeyTyped

    public void limpiarCampos(){
        nombreUsuario.setText("");
        contrasenaUsuario.setText("");
        nombreEmpleado1.setText("");
        apellidoEmpleado.setText("");
        barrioEmpleado.setText("");
        direccionEmpleado.setText("");
        sueldoEmpleado.setText("");
        nombreProducto.setText("");
        codigoProducto.setText("");
        precioProducto.setText("");
        descripcionProducto.setText("");
        cantidadProducto.setText("");
        proveedirProducto.setText("");
        cedulEmpleado.setText("");
        empleadoEliminar.setText("");
        cedulaEmpleado.setText("");
        nombreEmpleado.setText("");
        apellidoEmpleado.setText("");
        telefonoEmpleado.setText("");
        direccion.setText("");
        barrio.setText("");
        txtValorBusqueda.setText("");
        nombreCliente.setText("");
        apellidoCliente.setText("");
        cedulaCliente.setText("");
        telCliente.setText("");
        direccinCliete.setText("");
        BarrioCliente.setText("");
        CorreoCliente.setText("");
        cedulCliente.setText("");
        clienteaEliminar.setText("");
        nombreCliente.setText("");
        apellidoCliente.setText("");
        telCliente.setText("");
        direccinCliete.setText("");
        BarrioCliente.setText("");
        CorreoCliente.setText("");
        txtValorBusqueda.setText("");
        codigoProducto1.setText("");
        nombrProducto.setText("");
        precioProducto1.setText("");
        descripcionProducto1.setText("");
        cantidadProducto1.setText("");
        nitProveedor.setText("");
        codigoProduccto.setText("");
        productoEliminar.setText("");
        txtValorBusqueda1.setText("");
        txtValorBusqueda3.setText("");
    }
    
    public void agregar(String codigo, String nombre, String cantidad, String precio, String valort) {      
        dtm.addRow(new Object[]{
            codigo, nombre, cantidad, precio, valort
        });
    }

    public void eliminarProducto() {
        int fila = tlbDatos.getSelectedRow();
        String codigopro = tlbDatos.getValueAt(fila, 0).toString();
        dtm.removeRow(fila);
        String codigo = codigopro;
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
    
    public void limitarNumerosTelefono(){
        limitarEmpleado();        
    }
    public void limitarEmpleado(){
        r = new RestrictedTextField(telefonoEmpleado);
        r.setLimit(10);
        r.setOnlyNums(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarrioCliente;
    private javax.swing.JTextField BarrioCliente1;
    private javax.swing.JTextField CorreoCliente;
    private javax.swing.JTextField CorreoCliente1;
    private javax.swing.JButton Empleado;
    private javax.swing.JButton GenerarPdf;
    private javax.swing.JButton GenerarPdf1;
    private javax.swing.JButton GenerarPdf2;
    private javax.swing.JButton GuardarCotizacion;
    private javax.swing.JButton GuardarCotizacion1;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellidoCliente;
    private javax.swing.JTextField apellidoCliente1;
    private javax.swing.JTextField apellidoEmpleado;
    private javax.swing.JTextField apellidoEmpleado1;
    private javax.swing.JTextField barrio;
    private javax.swing.JTextField barrioEmpleado;
    private javax.swing.JButton botonBuscarCli;
    private javax.swing.JButton botonBuscarCli1;
    private javax.swing.JButton botonBuscarEmp;
    private javax.swing.JButton botonBuscarProv;
    private javax.swing.JButton botonCotizacion;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEliminar1;
    private javax.swing.JButton botonEliminar2;
    private javax.swing.JButton botonEliminar3;
    private javax.swing.JButton botonListar;
    private javax.swing.JButton botonListar1;
    private javax.swing.JButton botonListar2;
    private javax.swing.JButton botonListar3;
    private javax.swing.JButton botonProducto;
    private javax.swing.JButton botonReportes;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JButton buscarCotizacion;
    private javax.swing.JButton buscarEmpleado;
    private javax.swing.JButton buscarProducto;
    private javax.swing.JButton buscarProveedor;
    private javax.swing.JTextArea busquedaProveedor;
    private javax.swing.JButton cancelarC;
    private javax.swing.JTextField cantidadProducto;
    private javax.swing.JTextField cantidadProducto1;
    private javax.swing.JTextField cantidadProductoCotizacion;
    private javax.swing.JComboBox<String> cargoEmpleado;
    private javax.swing.JComboBox<String> cboxFiltro;
    private javax.swing.JComboBox<String> cboxFiltro1;
    private javax.swing.JComboBox<String> cboxFiltro2;
    private javax.swing.JComboBox<String> cboxFiltro3;
    private javax.swing.JTextField cedulCliente;
    private javax.swing.JTextField cedulCliente1;
    private javax.swing.JTextField cedulCliente2;
    private javax.swing.JTextField cedulEmpleado;
    private javax.swing.JTextField cedulEmpleado1;
    private javax.swing.JTextField cedulaCliente;
    private javax.swing.JTextField cedulaEmpleado;
    private javax.swing.JTextField cedulaEmpleado1;
    private javax.swing.JTextArea clienteaEliminar;
    private javax.swing.JButton clientes;
    private javax.swing.JTextField codigoProducCotizacion;
    private javax.swing.JTextField codigoProduccto;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JTextField codigoProducto1;
    private javax.swing.JTextField codigoProducto2;
    private javax.swing.JTextField contrasenaUsuario;
    private javax.swing.JTextField descripcionProducto;
    private javax.swing.JTextField descripcionProducto1;
    private javax.swing.JTextField direccinCliete;
    private javax.swing.JTextField direccinCliete1;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField direccionEmpleado;
    private javax.swing.JTextField direccionProveedor;
    private javax.swing.JTextField direccionProveedor1;
    private javax.swing.JTextField documentoClienteCotiza;
    private javax.swing.JButton eliminarProducto;
    private javax.swing.JTextArea empleadoEliminar;
    private javax.swing.JLabel fecha;
    private javax.swing.JTextField fechaCotizacion;
    private javax.swing.JButton gestionProveedor;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel guardar1;
    private javax.swing.JButton guardarCliente;
    private javax.swing.JButton guardarCliente1;
    private javax.swing.JButton guardarProducto;
    private javax.swing.JButton guardarProducto1;
    private javax.swing.JButton guardarProducto2;
    private javax.swing.JButton guardarProv;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
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
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jtxDato;
    private javax.swing.JTextField jtxDato1;
    private javax.swing.JTextField jtxDato2;
    private javax.swing.JTextField nitProveedor;
    private javax.swing.JTextField nitProveedor1;
    private javax.swing.JTextField nitProveedor2;
    private javax.swing.JTextField nitProveedor3;
    private javax.swing.JTextField nitProveedor4;
    private javax.swing.JTextField nomProducProv;
    private javax.swing.JTextField nombrProducto;
    private javax.swing.JTextField nombrProveedor;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JTextField nombreCliente1;
    public javax.swing.JLabel nombreEmpleado;
    private javax.swing.JTextField nombreEmpleado1;
    private javax.swing.JTextField nombreEmpleado2;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTextField nombredeProveedor;
    private javax.swing.JTextField nombreproductoprov;
    private javax.swing.JTextField numeroCotizacion;
    private javax.swing.JTextField numeroCotizacion2;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelBuscarCliente;
    private javax.swing.JPanel panelBuscarCotizacion;
    private javax.swing.JPanel panelBuscarEmpleado;
    private javax.swing.JPanel panelBuscarProveedor;
    private javax.swing.JTabbedPane panelCliente;
    private javax.swing.JTabbedPane panelCotizaciones;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelCrearCliente;
    private javax.swing.JPanel panelCrearCotizacion;
    private javax.swing.JPanel panelCrearEmpleado;
    private javax.swing.JPanel panelCrearProveedor;
    private javax.swing.JPanel panelEditar;
    private javax.swing.JPanel panelEditarCliente;
    private javax.swing.JPanel panelEditarEmpleado;
    private javax.swing.JPanel panelEditarProveedor;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelEliminarCliente;
    private javax.swing.JPanel panelEliminarEmpleado;
    private javax.swing.JPanel panelEliminarProveedor;
    private javax.swing.JTabbedPane panelEmpleado;
    private javax.swing.JPanel panelListar;
    private javax.swing.JPanel panelListarCliente;
    private javax.swing.JPanel panelListarEmpleado;
    private javax.swing.JPanel panelListarProveedor;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPiePagina;
    private javax.swing.JTabbedPane panelProductos;
    private javax.swing.JTabbedPane panelProveedor;
    private javax.swing.JPanel panelReporteEditar;
    private javax.swing.JPanel panelReporteEmpleado;
    private javax.swing.JPanel panelReporteProductos;
    private javax.swing.JTabbedPane panelReportes;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField precioProdprov;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JTextField precioProducto1;
    private javax.swing.JTextField precioproductoprov;
    private javax.swing.JTextArea productoEliminar;
    private javax.swing.JTextField proveedirProducto;
    private javax.swing.JTextArea proveedorEliminar;
    private javax.swing.JTextArea resultadoBusqueda;
    private javax.swing.JTextArea resultadoBusqueda1;
    private javax.swing.JTextArea resultadoBusqueda2;
    private javax.swing.JTextArea resultadocotizacion;
    private javax.swing.JTextArea resultadodetalle;
    private javax.swing.JTextField sueldoEmpleado;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTable tblDatos1;
    private javax.swing.JTable tblDatos2;
    private javax.swing.JTable tblDatos3;
    private javax.swing.JButton tbnGuardarCotizacion;
    private javax.swing.JTextField telCliente;
    private javax.swing.JTextField telCliente1;
    private javax.swing.JTextField telProveedor;
    private javax.swing.JTextField telefonoEmpleado;
    private javax.swing.JTextField telefonoEmpleado1;
    private javax.swing.JTextField telefonoProveedor;
    private javax.swing.JTable tlbDatos;
    public javax.swing.JLabel totalCompra;
    private javax.swing.JTextField txtValorBusqueda;
    private javax.swing.JTextField txtValorBusqueda1;
    private javax.swing.JTextField txtValorBusqueda2;
    private javax.swing.JTextField txtValorBusqueda3;
    private javax.swing.JTextField vendedorCotizacion;
    // End of variables declaration//GEN-END:variables
void nombreEmpleado(String string) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
