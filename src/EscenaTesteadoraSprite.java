public class EscenaTesteadoraSprite extends Escena {
    private GameObject tester;

    public EscenaTesteadoraSprite(GameObject t) {
        this.tester = t;
    }

    @Override
    protected void añadirObjetosIniciales() {
        this.añadir(tester);
    }

    public GameObject getTester() {
        return this.tester;
    }
}
