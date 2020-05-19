package modelo;

public class Cotizacion {

private String codigocotizacion;
private String cedulaClien;
private String cedulaEmple;
private String fecha;
private String totalCompra;
//atributos detallecotizacion
private String idDetalleCotizacion;
private String idCotizacion;
private String codigoProducto;
private String cantidad;
private String valorUnitario;
private String iva;
private String total;

    public Cotizacion() {
    }

    public Cotizacion(String codigocotizacion, String cedulaClien, String cedulaEmple, String fecha, String totalCompra, String idDetalleCotizacion, String idCotizacion, String codigoProducto, String cantidad, String valorUnitario, String iva, String total) {
        this.codigocotizacion = codigocotizacion;
        this.cedulaClien = cedulaClien;
        this.cedulaEmple = cedulaEmple;
        this.fecha = fecha;
        this.totalCompra = totalCompra;
        this.idDetalleCotizacion = idDetalleCotizacion;
        this.idCotizacion = idCotizacion;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.iva = iva;
        this.total = total;
    }

    public String getCodigocotizacion() {
        return codigocotizacion;
    }

    public void setCodigocotizacion(String codigocotizacion) {
        this.codigocotizacion = codigocotizacion;
    }

    public String getCedulaClien() {
        return cedulaClien;
    }

    public void setCedulaClien(String cedulaClien) {
        this.cedulaClien = cedulaClien;
    }

    public String getCedulaEmple() {
        return cedulaEmple;
    }

    public void setCedulaEmple(String cedulaEmple) {
        this.cedulaEmple = cedulaEmple;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(String totalCompra) {
        this.totalCompra = totalCompra;
    }

    public String getIdDetalleCotizacion() {
        return idDetalleCotizacion;
    }

    public void setIdDetalleCotizacion(String idDetalleCotizacion) {
        this.idDetalleCotizacion = idDetalleCotizacion;
    }

    public String getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(String idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
}
