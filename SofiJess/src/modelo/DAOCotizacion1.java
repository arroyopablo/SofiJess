package modelo;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAOCotizacion1 extends Cotizacion{
    controlador.ControladorConectarDB conexionPro;
    
    
    public DAOCotizacion1(){
      conexionPro = new controlador.ControladorConectarDB();
  }
    
    public String codigoCotizacion(){
      String SQL = "SELECT MAX(idCotizacion) FROM Cotizacion;";
      java.sql.ResultSet rs = null;
      rs = conexionPro.consulta(SQL);
      
      try{
          if(rs.next()){
              String codigo = rs.getString(1);
              int code = Integer.parseInt(codigo) + 1;
              //code +=1;
              String codigoproximo = Integer.toString(code);
              return (codigoproximo);
          }
      }catch(SQLException ex){
              System.out.println("Error");
      }
      return null;
  }
    
    public void insertarCotizacion() {

            String sql = "INSERT INTO Cotizacion(cedulaClien,cedulaEmple) VALUES(" 
                         + super.getCedulaClien() +", " + super.getCedulaEmple() + ")";
            conexionPro.insertar(sql);

    }
    
    public void insertarDetalleCotizacion() {

            String sql = "INSERT INTO DetalleCotizacion(idcotizacion,codigoproduc,cantidad,valorunitario,iva,total) VALUES(" 
                         + super.getIdCotizacion() +", " + super.getCodigoProducto() + ", " + super.getCantidad() 
                         + ", " + super.getValorUnitario()+", "+super.getIva()+", "+super.getTotal()+")";
            conexionPro.insertar(sql);

    }
    
    
    public String updateTotal() {
        String SQL = "UPDATE Cotizacion  SET totalCompra ="+ super.getTotalCompra() + "WHERE idCotizacion = "
                     + super.getIdCotizacion() + ";";
        String resultado = "";
        resultado = conexionPro.modifica(SQL);
        return resultado;
    }
    
    public String cancelaCotizacion() {
        String SQL = "DELETE FROM Cotizacion WHERE idCotizacion = " + super.getIdCotizacion();
        String resultado = "";
        resultado = conexionPro.eliminar(SQL);
        return resultado;
    }
    
    public String cancelaProductoC() {
        String SQL = "DELETE FROM DetalleCotizacion WHERE codigoProduc = " + super.getCodigoProducto();
        String resultado = "";
        resultado = conexionPro.eliminar(SQL);
        return resultado;
    }
    
    public String consultarCotizacion() {
        /*select * from cotizacion where idcotizacion = 1;
 select * from detallecotizacion where idcotizacion = 22;*/
        String SQL = "SELECT * FROM Cotizacion WHERE idcotizacion = " + super.getIdCotizacion();
        java.sql.ResultSet rs = null;
        rs = conexionPro.consulta(SQL);

        try {

            if (rs.next()) {
                String idcotizacion = rs.getString(1);
                String cedulaCli = rs.getString(2);
                String cedulaEmple = rs.getString(2);
                String fecha = rs.getString(4);
                String totalcompra = rs.getString(5);


                return ("NUMERO COTIZACION: " + idcotizacion + "\n " + " \n" + "CLIENTE: " + cedulaCli + "\n " 
                        + " \n" + "VENDEDOR: " + cedulaEmple + "\n "
                        + " \n" + "FECHA: " + fecha + " \n" + " \n" + "TOTAL COMPRA: " + totalcompra + " \n" + " \n");
            } else {
                JOptionPane.showMessageDialog(null, "Error Elemento no Encontrado");
                return "No esta";
            }
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    public String consultarDetalleCotizacion() {
        String SQL = "SELECT * FROM DetalleCotizacion WHERE idcotizacion = " + super.getIdCotizacion();
        java.sql.ResultSet rs = null;
        rs = conexionPro.consulta(SQL);
        String resultado = "";
        try {

            while (rs.next()) {
                String iddetallec = rs.getString(1);
                String codigopro = rs.getString(3);
                String cantidad = rs.getString(4);
                String valorunitario = rs.getString(5);
                String iva = rs.getString(6);
                String total = rs.getString(7);


                resultado += "IDENTIFICADOR: " + iddetallec + "\n " + " \n" + "CODIGO PRODUCTO: " + codigopro + "\n " 
                        + " \n" + "CANTIDAD: " + cantidad + "\n "
                        + " \n" + "VALOR UNITARIO: " + valorunitario + " \n" + " \n" + "IVA: " + iva + " \n" 
                        + " \n"+ "TOTAL: " + total + " \n" +
                        " \n" + "----------------------------------------------------------------------------------" + "\n";
            }
            if(!rs.next() && resultado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error Elemento no Encontrado");
                return "No esta";
            }else{
                return resultado;
            }
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println("Error Exception");
        }
        return null;
    }
    
    
}
