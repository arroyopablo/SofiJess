
package modelo;

public class Proveedor {
    private String nombreProv;
    private String nitProv; 
    private String telefonoProv;
    private String direccionProv;
    private String precioProdProv;
    private String productoProv;
    
   public Proveedor(){
   }
   
   public Proveedor(String nombreProv,String nitProv, String telefonoProv, String direccionProv, String precioProdProv, String productoProv){
       this.nombreProv = nombreProv;
       this.nitProv = nitProv;
       this.telefonoProv = telefonoProv;
       this.direccionProv = direccionProv;
       this.precioProdProv = precioProdProv;
       this.productoProv = productoProv;
   }
   
   public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }
    
    public String getNitProv() {
        return nitProv;
    }

    public void setNitProv(String nitProv) {
        this.nitProv = nitProv;
    }
    
    public String getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(String telefonoProv) {
        this.telefonoProv = telefonoProv;
    }
    
    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }
    
    public String getPrecioProdProv() {
        return precioProdProv;
    }

    public void setPrecioProdProv(String precioProdProv) {
        this.precioProdProv = precioProdProv;
    }
    
    public String getProductoProv() {
        return productoProv;
    }

    public void setProductoProv(String productoProv) {
        this.productoProv = productoProv;
    }
    
    @Override
    public String toString() {
        return "Proveedor=" + "nombreProv=" + nombreProv + ", nitProv=" + nitProv + ", telefonoProv=" + telefonoProv + ", direccionProv=" + direccionProv + ", precioProdProv=" + precioProdProv + ", productoProv=" + productoProv + '}';
    }  
}
