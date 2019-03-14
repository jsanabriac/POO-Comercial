package datos;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {

    private String nombre;
    private String apellido;
    private String nombreUsuario;
    private String id;
    private String contraseña;
    private String rol;
    private ArrayList<Licores> licores;
    private ArrayList<Alimentos> alimentos;
    private ArrayList<Aseo> productosAseo;

    public Usuario(String nombre, String apellido, String nombreUsuario, String id, String contraseña, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.id = id;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", nombreUsuario=" + nombreUsuario + ", id=" + id + ", contrase\u00f1a=" + contraseña + ", rol=" + rol + ", licores=" + licores + ", alimentos=" + alimentos + ", productosAseo=" + productosAseo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ArrayList<Licores> getLicores() {
        return licores;
    }

    public void setLicores(ArrayList<Licores> licores) {
        this.licores = licores;
    }

    public ArrayList<Alimentos> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(ArrayList<Alimentos> alimentos) {
        this.alimentos = alimentos;
    }

    public ArrayList<Aseo> getProductosAseo() {
        return productosAseo;
    }

    public void setProductosAseo(ArrayList<Aseo> productosAseo) {
        this.productosAseo = productosAseo;
    }

}
