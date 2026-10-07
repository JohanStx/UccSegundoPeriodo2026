public class MainBiblioteca {
    public static void main(String[] args) {

        SistemaDeBiblioteca libro1 = new SistemaDeBiblioteca(166, "Habitos Atomicos", "James", 2016, true);
        SistemaDeBiblioteca libro2 = new SistemaDeBiblioteca(511, "Deja de ser tu", "Joe Dispensa", 2013, true);
        SistemaDeBiblioteca libro3 = new SistemaDeBiblioteca(111, "Cien años de soledad", "Grabiel Garcia",1967, true);
        SistemaDeBiblioteca libro4 = new SistemaDeBiblioteca(777, "Memento mori", "Humberto Montesinos", 2025, true);
        SistemaDeBiblioteca libro5 = new SistemaDeBiblioteca(123, "Luna de Pluton", " Dross Rotzank", 2015, true);

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);

        System.out.println(libro2.getTitulo());
        System.out.println(libro2.getDisponible());
        libro2.prestar();
        libro2.estaDisponible();

        System.out.println(libro5.getTitulo());
        System.out.println(libro5.getAnioPublicacion());

        libro2.devolver();
        libro2.estaDisponible();
        libro5.prestar();

    } 
}
