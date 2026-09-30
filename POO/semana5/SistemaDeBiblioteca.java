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
    
    public boolean getDisponible(boolean disponible) {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean Prestar(boolean disponibilidad){
        return this.disponible = false;
    }
    public boolean devolver(boolean disponibilidad){
        return this.disponible = true;
    }

    public String estaDisponible(){
        return "El libro " + titulo + " esta disponible";
    }

    public String toString() {
        return "Libro [ isbn: " + isbn + " Titulo: " + titulo + "Autor: " + autor + "AnioPublicacion: " + anioPublicacion + "Disponible: " + disponible + "]";
    }

}