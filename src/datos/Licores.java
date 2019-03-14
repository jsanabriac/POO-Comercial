package datos;

public class Licores extends Producto {

    private String tipoLicor;

    public Licores(String tipoLicor, String nombre, double precio, int unidadesCaja, int cajas, String empresaFabricante, String codigo) {
        super(nombre, precio, unidadesCaja, cajas, empresaFabricante, codigo);
        this.tipoLicor = tipoLicor;
    }

    public Licores(String tipoLicor, String nombre, double precio, int unidadesCaja, String empresaFabricante) {
        super(nombre, precio, unidadesCaja, empresaFabricante);
        this.tipoLicor = tipoLicor;
    }

    public Licores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Licores{" + "tipoLicor=" + tipoLicor + '}';
    }

    public String getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(String tipoLicor) {
        this.tipoLicor = tipoLicor;
    }

}
