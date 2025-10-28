import java.util.List;
import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Libro libro1 = new Libro();
        libro1.setAutor("Gabriel Garcia Marquez");
        libro1.setTitulo("Cien Años de Soledad");
        libro1.setIsbn("978-3-16-148410-0");
        libro1.setPrecio(30000);

        Libro libro2 = new Libro();
        libro2.setAutor("Isabel Allende");
        libro2.setTitulo("La Casa de los Espíritus");
        libro2.setIsbn("978-1-23-456789-0");
        libro2.setPrecio(25000);
        libro2.obtenerPrecioConIva(); 
        libro2.actualizarPrecio(28000);

        System.out.println("Precio sin IVA: " .concat(String.valueOf(libro2.getPrecio())));
        System.out.println("Precio con IVA: " .concat(String.valueOf(libro2.obtenerPrecioConIva())));


        List<Libro> libros = new ArrayList<>();

        libros.add(libro1);
        libros.add(libro2);

        for (var libro : libros) {
            System.out.println(libro.toString()); 
        }

        
    }
}
