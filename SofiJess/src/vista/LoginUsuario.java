package vista;

import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginUsuario extends javax.swing.JFrame {

    public LoginUsuario() {

        initComponents();
                
        this.setUndecorated(true);
        AWTUtilities.setWindowOpaque(this, false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassClave = new javax.swing.JPasswordField();
        aceptarlogin = new javax.swing.JButton();
        salirtext = new javax.swing.JButton();
        fondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1, 10, 409, 80);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cabecera.png"))); // NOI18N
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 410, 110);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sidebar_usuario-corporativo_opt.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 200, 40, 40);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(140, 140, 140));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setText("USUARIO");
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseReleased(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(110, 200, 220, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngocean.com.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 250, 40, 40);

        txtpassClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpassClave.setForeground(new java.awt.Color(140, 140, 140));
        txtpassClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassClave.setText("•••••••••••••••");
        txtpassClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassClaveMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtpassClaveMouseReleased(evt);
            }
        });
        txtpassClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassClaveKeyPressed(evt);
            }
        });
        jPanel1.add(txtpassClave);
        txtpassClave.setBounds(110, 250, 220, 40);

        aceptarlogin.setBackground(new java.awt.Color(2, 184, 2));
        aceptarlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aceptarlogin.setForeground(new java.awt.Color(255, 255, 255));
        aceptarlogin.setText("INGRESAR");
        aceptarlogin.setFocusable(false);
        aceptarlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarloginActionPerformed(evt);
            }
        });
        jPanel1.add(aceptarlogin);
        aceptarlogin.setBounds(100, 320, 109, 40);

        salirtext.setBackground(new java.awt.Color(255, 23, 23));
        salirtext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salirtext.setForeground(new java.awt.Color(255, 255, 255));
        salirtext.setText("SALIR");
        salirtext.setBorderPainted(false);
        salirtext.setFocusable(false);
        salirtext.setMaximumSize(new java.awt.Dimension(91, 25));
        salirtext.setMinimumSize(new java.awt.Dimension(91, 25));
        salirtext.setPreferredSize(new java.awt.Dimension(91, 25));
        salirtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirtextActionPerformed(evt);
            }
        });
        jPanel1.add(salirtext);
        salirtext.setBounds(230, 320, 91, 40);

        fondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_login2.jpg"))); // NOI18N
        fondoLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(fondoLogin);
        fondoLogin.setBounds(0, 0, 410, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 470);

        setBounds(0, 0, 411, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void salirtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirtextActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirtextActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (txtpassClave.getText().length() == 0) {
            txtpassClave.setText("•••••••••••••••");
        } else {

            if (txtUsuario.getText().equalsIgnoreCase("USUARIO")) {
                txtUsuario.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        if (txtpassClave.getText().length() == 0) {
            txtpassClave.setText("•••••••••••••••");
        } else {

            if (txtUsuario.getText().equalsIgnoreCase("USUARIO")) {
                txtUsuario.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseReleased
        if (txtpassClave.getText().length() == 0) {
            txtpassClave.setText("•••••••••••••••");
        } else {

            if (txtUsuario.getText().equalsIgnoreCase("USUARIO")) {
                txtUsuario.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txtUsuarioMouseReleased

    private void txtpassClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassClaveKeyPressed
        if (txtUsuario.getText().length() == 0) {
            txtUsuario.setText("USUARIO");
        } else {

            if (txtpassClave.getText().equalsIgnoreCase("•••••••••••••••")) {
                txtpassClave.setText(null);

            } else {
            }
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
            modelo.DAOEmpleado obj = new modelo.DAOEmpleado();
            controlador.EncriptarPassword encriptar = new controlador.EncriptarPassword();
            String usuario = txtUsuario.getText().trim();
            String password = txtpassClave.getText();
            obj.setUsuarioEmpleado(usuario);
            obj.setContrasenaEmpleado(encriptar.encriptar(password));

            if (obj.valide() == false) {
                JOptionPane.showMessageDialog(rootPane, "Datos Incorrectos");
            } else {
                String resultado = "";
                String nombre = "";                
                String cedula = "";
                resultado = obj.consultarCargo();
                nombre = obj.nombreEmple();
                cedula = obj.consultarCedula();

                if (resultado.equals("No esta")) {
                    JOptionPane.showMessageDialog(null, "No esta");

                } else if (resultado.equals("Jefe")) {

                    GestionJefe ge = new GestionJefe(cedula);
                    ge.setVisible(true);
                    ge.nombreEmpleado.setText(nombre);

                } else if (resultado.equals("Empleado")) {

                    GestionEmpleado ge1 = new GestionEmpleado();
                    ge1.setVisible(true);
                    ge1.nombreUsuario.setText(nombre);

                } 
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los datos");
        }
        }
    }//GEN-LAST:event_txtpassClaveKeyPressed

    private void txtpassClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassClaveMouseClicked
        if (txtUsuario.getText().length() == 0) {
            txtUsuario.setText("USUARIO");
        } else {

            if (txtpassClave.getText().equalsIgnoreCase("•••••••••••••••")) {
                txtpassClave.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txtpassClaveMouseClicked

    private void txtpassClaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassClaveMouseReleased
        if (txtUsuario.getText().length() == 0) {
            txtUsuario.setText("USUARIO");
        } else {

            if (txtpassClave.getText().equalsIgnoreCase("•••••••••••••••")) {
                txtpassClave.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txtpassClaveMouseReleased

    private void aceptarloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarloginActionPerformed
        try {
            modelo.DAOEmpleado obj = new modelo.DAOEmpleado();
            controlador.EncriptarPassword encriptar = new controlador.EncriptarPassword();
            String usuario = txtUsuario.getText().trim();
            String password = txtpassClave.getText();
            obj.setUsuarioEmpleado(usuario);
            obj.setContrasenaEmpleado(encriptar.encriptar(password));

            if (obj.valide() == false) {
                JOptionPane.showMessageDialog(rootPane, "Datos Incorrectos");
            } else {
                String resultado = "";
                String nombre = "";                
                String cedula = "";
                resultado = obj.consultarCargo();
                nombre = obj.nombreEmple();
                cedula = obj.consultarCedula();

                if (resultado.equals("No esta")) {
                    JOptionPane.showMessageDialog(null, "No esta");

                } else if (resultado.equals("Jefe")) {

                    GestionJefe ge = new GestionJefe(cedula);
                    ge.setVisible(true);
                    ge.nombreEmpleado.setText(nombre);

                } else if (resultado.equals("Empleado")) {

                    GestionEmpleado ge1 = new GestionEmpleado();
                    ge1.setVisible(true);
                    ge1.nombreUsuario.setText(nombre);

                } 
                this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar los datos");
        }
    }//GEN-LAST:event_aceptarloginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarlogin;
    private javax.swing.JLabel fondoLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salirtext;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpassClave;
    // End of variables declaration//GEN-END:variables
}
