package modelo;

public class Cliente {
    private String nombreCli;
    private String apellidoCli;
    private int cedulaCli; 
    private int telefonoCli;
    private String direccionCli;
    private String barrioCli;
    private String correoCli;
    
    public Cliente() {
    }
    
    public Cliente(String nombreCli, String apellidoCli, int cedulaCli,int telefonoCli, 
                   String direccionCli, String barrioCli, String correoCli ) {
        this.nombreCli = nombreCli;
        this.apellidoCli = apellidoCli;
        this.cedulaCli = cedulaCli;
        this.telefonoCli = telefonoCli;
        this.direccionCli = direccionCli;
        this.barrioCli = barrioCli;
        this.correoCli = correoCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public int getCedulaCli() {
        return cedulaCli;
    }

    public void setCedulaCli(int cedulaCli) {
        this.cedulaCli = cedulaCli;
    }

    public int getTelefonoCli() {
        return telefonoCli;
    }

    public void setTelefonoCli(int telefonoCli) {
        this.telefonoCli = telefonoCli;
    }

    public String getDireccionCli() {
        return direccionCli;
    }

    public void setDireccionCli(String direccionCli) {
        this.direccionCli = direccionCli;
    }

    public String getBarrioCli() {
        return barrioCli;
    }

    public void setBarrioCli(String barrioCli) {
        this.barrioCli = barrioCli;
    }

    public String getCorreoCli() {
        return correoCli;
    }

    public void setCorreoCli(String correoCli) {
        this.correoCli = correoCli;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nombreCli=" + nombreCli + ", apellidoCli=" + apellidoCli + ", cedulaCli=" + cedulaCli + ", telefonoCli=" + telefonoCli + ", direccionCli=" + direccionCli + ", barrioCli=" + barrioCli + '}';
    }

}
