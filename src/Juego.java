import bpc.daw.consola.Consola;
import java.awt.event.KeyEvent;

public class Juego {
    private Consola consola;
    private Escena escena;
    private boolean detener;
    private Resolucion resolucion;


    public Juego(){

    }
    public void iniciar(Escena e, Resolucion r){
        Consola c1 = new Consola("Juego",(int)r.getResolucion().getHeight(),(int)r.getResolucion().getWidth());
        this.consola = c1;
        this.resolucion = r;
        this.setEscena(e);
        this.detener = false;
        while (!detener || this.consola.getTeclado().teclaPulsada(KeyEvent.VK_ESCAPE)){
            this.escena.ejecutarFrame();
            this.consola.esperarSiguienteFrame();
        }
    }
    public void setEscena(Escena e){
        this.escena = e;
        e.juego = this;
        e.consola = this.consola;
        e.inicializar();
    }
    public Escena getEscena(){
        return this.escena;
    }
    public void detener(){
        this.detener = true;
    }
    public int getAnchuraPantalla(){
        return (int)this.resolucion.getResolucion().getWidth();
    }
    public int getAlturaPantalla(){
        return (int)this.resolucion.getResolucion().getHeight();
    }
}
