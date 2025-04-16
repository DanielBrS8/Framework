public class EscenaTesteadora extends Escena{
    private GameObjectTesteador tester;

    public EscenaTesteadora(){
        this.tester=new GameObjectTesteador();
    }

    @Override
    public void inicializar(){
        this.tester.inicializar();
    }


    @Override
    protected void añadirObjetosIniciales() {
        super.añadir(this.tester);
    }

    @Override
    public void ejecutarFrame(){
        this.tester.ejecutarFrame();
    }
    @Override
    public void finalizar(){
        this.tester.finalizar();
    }
    public GameObjectTesteador getTester(){
        return this.tester;
    }


}
