public class SistemaDeBiblioteca {

    private int isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public SistemaDeBiblioteca(int isbn, String titulo, String autor, int anioPublicacion, boolean disponible){
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;

    }

    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean prestar() {
        this.disponible = false;
        return this.disponible;
    }

    public boolean devolver() {
        this.disponible = true;
        return this.disponible;
    }

    public void estaDisponible() {
        if (disponible) {
            System.out.println("El libro esta disponible");
        } else {
            System.out.println("El libro no esta disponible");
        }
    }

    public String toString() {
        return "Libro [ isbn: " + isbn + " Titulo: " + titulo + " Autor: " + autor + " AnioPublicacion: " + anioPublicacion + " Disponible: " + disponible + "]";
    }

}