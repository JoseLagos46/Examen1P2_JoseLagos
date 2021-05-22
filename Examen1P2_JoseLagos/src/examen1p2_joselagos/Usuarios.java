package examen1p2_joselagos;

import java.util.ArrayList;
import java.util.Date;

public class Usuarios {
    private String usuario;
    private String clave;
    private Date nacimiento;
    private String numero;
    private String correo;
    private String nombre;
    private String genero;
    private ArrayList<Libros> libros = new ArrayList();
    private ArrayList amigos = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String usuario, String clave, Date nacimiento, String numero, String correo, String nombre, String genero) {
        this.usuario = usuario;
        this.clave = clave;
        this.nacimiento = nacimiento;
        this.numero = numero;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    

    @Override
    public String toString() {
        return  usuario+"  "+clave;
    }
    
    
}
