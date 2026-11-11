package POO.semana8_Taller;

public class Direccion { 
    private boolean subir;
    private boolean bajar;

    public Direccion(boolean subir, boolean bajar) {
        this.subir = subir;
        this.bajar = bajar;
    }

    public void subida() {
        subir = true;
        bajar = false;
    }
    
    public void bajada() {
        bajar = true;
        subir = false;
    }

    public getSubir() {
        return subir;
    }
    
    public getBajar() {
        return bajar;
    }
}