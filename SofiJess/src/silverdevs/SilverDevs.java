package silverdevs;

import javax.swing.UIManager;
import vista.RegistrarCotizacion;
import vista.RegistrarEmpleado;
import vista.GestionEmpleado;
import vista.LoginUsuario;
import vista.RegistarProveedor;
import vista.RegistrarCliente;
import vista.RegistrarProducto;

public class SilverDevs {
    
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            }
         catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginUsuario vista = new LoginUsuario();
                vista.setLocationRelativeTo(null);
                vista.setVisible(true);
            }
        });
        
    }
}
