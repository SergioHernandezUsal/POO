package modelo;

public class Almacen {
    private Libro[] libros;
    private int librosGuardados = 0;
    private int paginasPorMinuto = 1;

    public Almacen(int tam) {
        libros = new Libro[tam];
    }

    public void RitmoLectura(int paginasPorMinuto) {
        this.paginasPorMinuto = paginasPorMinuto;
    }

    public void agregarLibro(Libro libro) {
        if (librosGuardados < libros.length) {
            libros[librosGuardados] = libro;
            librosGuardados++;
        } else {
            System.out.println("Álmacen completo");
        }
    }

    public void mostrarLibros() {
        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("| LIBROS EN EL ALMACÉN                                                              |");
        System.out.println("|-----------------------------------------------------------------------------------|");
        System.out.println("| Título | Año Publicación | Autor | Premio Planeta | Páginas | Tiempo Lectura Minutos | Precio |");
        System.out.println("|-----------------------------------------------------------------------------------|");
    
        float valor = 0;
        int tiempoT = 0;

        for(int i=0;i<librosGuardados;i++){
            Libro libro = libros[i];  
            float tiempoLectura = libro.tiempoLectura(paginasPorMinuto);
    
            
            valor += libro.getPrecio();
            tiempoT += tiempoLectura;
    
           
            System.out.printf("| %s | %d | %s | %s | %d | %.2f | %.2f € |\n",libro.getTitulo(), libro.getPublicacion(), libro.getAutor().getNombreCompleto(), (libro.getAutor().PremioPlaneta() ? "Sí" : "No"), libro.getNumPaginas(), tiempoLectura, libro.getPrecio());                    
        }

    System.out.println("|-----------------------------------------------------------------------------------|");
    System.out.printf("|   Tiempo de lectura total del almacén: %d minutos                                 |\n", tiempoT);
    System.out.printf("|   Valor total del almacén: %.2f €                                                 |\n", valor);
    System.out.println("|-----------------------------------------------------------------------------------|");
    }
}


