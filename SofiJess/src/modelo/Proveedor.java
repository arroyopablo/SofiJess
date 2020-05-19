
package modelo;

public class Proveedor {
    private String nombreProv;
    private int nitProv; 
    private int telefonoProv;
    private String direccionProv;
    private int precioProdProv;
    private String productoProv;
    
   public Proveedor(){
   }
   
   public Proveedor(String nombreProv,int nitProv, int telefonoProv, String direccionProv, int precioProdProv, String productoProv){
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
    
    public int getNitProv() {
        return nitProv;
    }

    public void setNitProv(int nitProv) {
        this.nitProv = nitProv;
    }
    
    public int getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(int telefonoProv) {
        this.telefonoProv = telefonoProv;
    }
    
    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }
    
    public int getPrecioProdProv() {
        return precioProdProv;
    }

    public void setPrecioProdProv(int precioProdProv) {
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
