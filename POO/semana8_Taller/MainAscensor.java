package POO.semana8_Taller;

public class MainAscensor {

    public static void main(String[] args) {
        SistemaControl sistema = new SistemaControl();
        Ascensor ascensor = sistema.getAscensor();

        System.out.println("===== INICIO =====");
        System.out.println(ascensor);

        // ---------- Viaje 1: del piso 3 al piso 5 ----------
        System.out.println("\n===== 1. Una persona en el piso 3 llama el ascensor para subir =====");
        sistema.getPiso(3).solicitarSubida();

        System.out.println("\n===== 2. El ascensor va a buscarla =====");
        sistema.procesarSoliciudes();

        System.out.println("\n===== 3. La persona entra y marca el piso 5 =====");
        ascensor.getBoton(5).presionar();

        System.out.println("\n===== 4. El ascensor la lleva al piso 5 =====");
        sistema.procesarSoliciudes();

        // ---------- Viaje 2: del piso 5 al piso 1 (el ascensor baja) ----------
        System.out.println("\n===== 5. Alguien en el piso 5 llama el ascensor para bajar =====");
        sistema.getPiso(5).solicitarBajada();

        System.out.println("\n===== 6. El ascensor ya esta ahi, la persona entra =====");
        sistema.procesarSoliciudes();

        System.out.println("\n===== 7. La persona marca el piso 1 =====");
        ascensor.getBoton(1).presionar();

        System.out.println("\n===== 8. El ascensor baja al piso 1 =====");
        sistema.procesarSoliciudes();

        // ---------- Sin solicitudes ----------
        System.out.println("\n===== 9. Ya nadie pidio nada =====");
        sistema.procesarSoliciudes();

        System.out.println("\n===== FIN =====");
        System.out.println(ascensor);
    }
}