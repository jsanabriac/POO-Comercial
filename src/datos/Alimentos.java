package datos;

public class Alimentos extends Producto {

    private String tipoAlimento;

    public Alimentos(String tipoAlimento, String nombre, double precio, int unidadesCaja, int cajas, String empresaFabricante, String codigo) {
        super(nombre, precio, unidadesCaja, cajas, empresaFabricante, codigo);
        this.tipoAlimento = tipoAlimento;
    }

    public Alimentos(String tipoAlimento, String nombre, double precio, int unidadesCaja, String empresaFabricante) {
        super(nombre, precio, unidadesCaja, empresaFabricante);
        this.tipoAlimento = tipoAlimento;
    }

    public Alimentos() {

    }

    @Override
    public String toString() {
        return "Alimentos{" + "tipoAlimento=" + tipoAlimento + '}';
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

}
