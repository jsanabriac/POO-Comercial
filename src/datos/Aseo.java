package datos;

public class Aseo extends Producto {

    private String tipoProducto;

    public Aseo(String tipoProducto, String nombre, double precio, int unidadesCaja, int cajas, String empresaFabricante, String codigo) {
        super(nombre, precio, unidadesCaja, cajas, empresaFabricante, codigo);
        this.tipoProducto = tipoProducto;
    }

    public Aseo(String tipoProducto, String nombre, double precio, int unidadesCaja, String empresaFabricante) {
        super(nombre, precio, unidadesCaja, empresaFabricante);
        this.tipoProducto = tipoProducto;
    }

    public Aseo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Aseo{" + "tipoProducto=" + tipoProducto + '}';
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

}
