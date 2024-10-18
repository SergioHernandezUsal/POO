package modelo;

public class Autor {
    private String nombre;
    private String apellidos;
    private boolean premioPlaneta;

    public Autor(String nombre, String apellidos, boolean premioPlaneta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.premioPlaneta = premioPlaneta;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    public boolean PremioPlaneta() {
        return premioPlaneta;
    }

    
}
