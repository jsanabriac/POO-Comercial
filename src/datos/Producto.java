package datos;


public class Producto {
    
    private String nombre;
    private double precio;
    private int unidadesCaja;
    private int cajas;
    private String empresaFabricante;
    private String codigo;

    public Producto(String nombre, double precio, int unidadesCaja, int cajas, String empresaFabricante, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidadesCaja = unidadesCaja;
        this.cajas = cajas;
        this.empresaFabricante = empresaFabricante;
        this.codigo = codigo;
    }

    public Producto(String nombre, double precio, int unidadesCaja, String empresaFabricante) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidadesCaja = unidadesCaja;
        this.empresaFabricante = empresaFabricante;
    }
    
    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidadesCaja() {
        return unidadesCaja;
    }

    public void setUnidadesCaja(int unidadesCaja) {
        this.unidadesCaja = unidadesCaja;
    }

    public String getEmpresaFabricante() {
        return empresaFabricante;
    }

    public void setEmpresaFabricante(String empresaFabricante) {
        this.empresaFabricante = empresaFabricante;
    }

    public int getCajas() {
        return cajas;
    }

    public void setCajas(int cajas) {
        this.cajas = cajas;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", unidadesCaja=" + unidadesCaja + ", cajas=" + cajas + ", empresaFabricante=" + empresaFabricante + ", codigo=" + codigo + '}';
    }
    
    
    
    
    
}



