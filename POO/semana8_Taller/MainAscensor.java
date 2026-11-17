package POO.semana8_Taller;

public class MainAscensor {

    public static void main(String[] args) {
        SistemaControl sistema = new SistemaControl();
        Ascensor ascensor = sistema.getAscensor();

        sistema.getPiso(3).solicitarBajada();  
        ascensor.getBoton(5).presionar();
        sistema.getPiso(2).solicitarSubida(); 
        sistema.procesarSoliciudes();
        sistema.procesarSoliciudes();
        sistema.procesarSoliciudes();
        sistema.procesarSoliciudes();           
    }
}