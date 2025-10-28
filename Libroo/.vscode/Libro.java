public class Libro {

    private String autor;
    private String titulo;
    private String isbn;
    private double precio;

    public Libro(String autor, String titulo, String isbn, double precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
    }

    public Libro () {
        this.autor = "N/A";

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double obtenerPrecioConIva() {
        return this.precio * 1.19;
    }

    public double actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            return this.precio = nuevoPrecio;
        } else{
            System.out.println("Lo sentimos pon un valor positivo");
             return this.precio;
        }
       
    }

    @Override
    public String toString() {
        return String.format("""
        El autor es: %s
        El titulo es: %s
        El isbn es: %s
        El precio es: %.3f
                """, autor, titulo, isbn, precio);

    }

    
}

    