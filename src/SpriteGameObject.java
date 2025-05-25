import bpc.daw.consola.Consola;
import bpc.daw.consola.Sprite;

import java.awt.*;

public abstract class SpriteGameObject extends GameObject {
    private Sprite sprite;
    private Image imagen;
    private Point puntoInicial;


    public SpriteGameObject(Image img, int x, int y) {
        this.imagen = img;
        this.puntoInicial = new Point(x, y);
    }


    public int getX() {
        return this.sprite.getX();
    }

    public int getY() {
        return this.sprite.getY();
    }

    public void moverX(int cx) {
        this.sprite.moverX(cx);
    }

    public void moverY(int cy) {
        this.sprite.moverY(cy);
    }

    public void setX(int x) {
        int diferencia = x - sprite.getX();
        this.sprite.moverX(diferencia);
    }

    public void setY(int y) {
        int diferencia = y - this.sprite.getY();
        this.sprite.moverY(diferencia);
    }


    public int getAnchura() {
        return this.imagen.getWidth(null);
    }

    public int getAltura() {
        return this.imagen.getHeight(null);
    }


    @Override
    public void finalizar() {
        if (this.sprite != null) {
            super.consola.getCapaSprites().eliminarSprite(this.sprite);
        }
    }


    @Override
    public void inicializar() {
        this.sprite = super.consola.getCapaSprites().crearSprite(this.imagen,
                new Rectangle(this.puntoInicial.x,this.puntoInicial.y),
                this.imagen.getWidth(null),
                this.imagen.getHeight(null)
        );
    }
}