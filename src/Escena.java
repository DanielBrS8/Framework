import bpc.daw.consola.Consola;

import java.util.ArrayList;
import java.util.List;

public abstract class Escena implements ElementoJuego{
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> objetos;

    public Escena(){
        this.juego=null;
        this.consola=null;
        this.objetos=null;
    }
    public void añadir(GameObject obj){
        obj.consola=this.consola;
        obj.juego=this.juego;
        obj.Escena=this;
        obj.inicializar();
    }
    public void finalizar(GameObject obj){
        obj.finalizar();
        this.objetos.remove(obj);
        this.juego=null;
        this.consola=null;
    }
    protected abstract void añadirObjetosIniciales();

    @Override
    public void inicializar(){
        //if(this.consola==null || this.juego==null){
            throw new IllegalStateException("hay que añadir la escena al juego para poder inicializarla");
        /*}else{
            this.objetos=new ArrayList<>();
            this.añadirObjetosIniciales();
        }*/
    }

    @Override
    public void ejecutarFrame(){
        for(int i = 0; i<this.objetos.size(); i++){
            this.objetos.get(i).ejecutarFrame();
        }
    }
    @Override
    public void finalizar(){
        for(int i = 0; i<this.objetos.size(); i++){
            this.objetos.remove(i);
        }
    }



}
