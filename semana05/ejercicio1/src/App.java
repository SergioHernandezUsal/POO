import modelo.Libro;
import modelo.Almacen;
import modelo.Autor;

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanRef = new Scanner(System.in);
        Almacen almacen =null;
        boolean seguir =true;
        while (seguir){
        System.out.println("|----------------------------------------------|");
        System.out.println("| MIS LIBROS                                   |");
        System.out.println("|----------------------------------------------|");
        System.out.println("1) Nuevo almacén de libros");
        System.out.println("2) Establecer ritmo de lectura (páginas por minuto)");
        System.out.println("3) Añadir un nuevo libro al almacén");
        System.out.println("4) Mostrar información actual de libros");
        System.out.println("5) Salir (se borrará toda la información)");
        System.out.println("|----------------------------------------------|");
        System.out.print("Seleccione una opción (1-5): ");

        int opcion = scanRef.nextInt();
        
        
            
            switch (opcion) {
                case 1:
                System.out.print("Ingrese el tamano del nuevo almacén: ");
                int tam = scanRef.nextInt();
                almacen = new Almacen(tam);
                break;

                case 2:
                if (almacen==null){
                    System.out.println("Crea antes un almacen");
                }else{
                
                System.out.print("Ingrese el ritmo de lectura (páginas por minuto): ");
                int ritmoLectura = scanRef.nextInt();
                almacen.RitmoLectura(ritmoLectura);
                }
                break;
                    
                case 3:
                if (almacen==null){
                    System.out.println("Crea antes un almacen");
                }else{
                    scanRef.nextLine();  
                    System.out.print("Título del libro: ");
                    String titulo = scanRef.nextLine();
                    
                    System.out.print("Año de publicación: ");
                    int publicacion = scanRef.nextInt();
                    scanRef.nextLine();  
                    
                    System.out.print("Nombre del autor: ");
                    String nombre = scanRef.nextLine();
                    
                    System.out.print("Apellido del autor: ");
                    String apellidos = scanRef.nextLine();
                    
                    System.out.print("El autor ha ganado el Premio Planeta (true/false): ");
                    boolean premioPlaneta = scanRef.nextBoolean();
                    
                    System.out.print("Número de páginas del libro: ");
                    int numPaginas = scanRef.nextInt();
                    
                    System.out.print("Precio del libro: ");
                    float precio = scanRef.nextFloat();
                    scanRef.nextLine();  

                    Autor autor = new Autor(nombre, apellidos, premioPlaneta);
                    Libro libro = new Libro(autor, titulo, publicacion, numPaginas, precio);

                almacen.agregarLibro(libro);
                }
                break;
                case 4:
                if (almacen==null){
                    System.out.println("Crea antes un almacen");
                }else{
                almacen.mostrarLibros();
                }
                break;
                case 5:
                    seguir = false;
                    System.out.println("Saliendo del programa...");
                break;
                default:
                    System.out.println("Opción no válida.");
                break;
            }
        }
        scanRef.close();
    }
    
}
