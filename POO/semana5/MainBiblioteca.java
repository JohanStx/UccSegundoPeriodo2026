public class MainBiblioteca {
    public static void main(String[] args) {

        SistemaDeBiblioteca libro1 = new SistemaDeBiblioteca(166, "Habitos Atomicos", "James", 2016, true);
        SistemaDeBiblioteca libro2 = new SistemaDeBiblioteca(511, "Deja de ser tu ", "Joe Dispensa", 2014, true);
        SistemaDeBiblioteca libro3 = new SistemaDeBiblioteca(111, "Cien años de soledad", "Grabiel Garcia",1967, true);
        SistemaDeBiblioteca libro4 = new SistemaDeBiblioteca(777, "Memento mori", "Humberto Montesinos", 2025, true);
        SistemaDeBiblioteca libro5 = new SistemaDeBiblioteca(123, "Fundamentos Java", "Juan", 2022, true);

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);

        libro1.estaDisponible();
        libro1.prestar();
        libro1.estaDisponible();
    } 
}
