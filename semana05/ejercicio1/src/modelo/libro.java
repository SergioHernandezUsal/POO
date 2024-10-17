package modelo;

public class Libro {
    private Autor autor;
    private String titulo;
    private int Publicacion;
    private int numPaginas;
    private float precio;

    public Libro(Autor autor, String titulo, int Publicacion, int numPaginas, double precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.Publicacion = Publicacion;
        this.numPaginas = numPaginas;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPublicacion() {
        return Publicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public float getPrecio() {
        return precio;
    }

    public float calcularTiempoLectura(int ritmoLectura) {
        return (float) numPaginas / ritmoLectura;
    }
}
