package POO.abstract_class;

public abstract class Boton {
    protected boolean iluminado;
    protected boolean funcional;

    public Boton(boolean iluminado, boolean funcional) {
        this.iluminado = iluminado;
        this.funcional = funcional;
    }

    public void setIluminado(boolean iluminado) {
        this.iluminado = iluminado;
    }

    public void setfuncional(boolean funcional) {
        this.funcional = funcional;
    }

    public abstract boolean iluminar ();
    public abstract boolean presionar ();

    public String emitirSonido(){
        return "Ring Ring Ring" ;
    }
}
