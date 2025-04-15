import bpc.daw.consola.Sprite;

import java.awt.*;

public abstract class SpriteGameObject {

    private Sprite sprite;
    private Image imagen;
    private Point puntoInicial;

    public SpriteGameObject(Image img,int x,int y){

        this.imagen=img;
        this.sprite=null;
        this.puntoInicial=new Point(x,y);

    }

}
