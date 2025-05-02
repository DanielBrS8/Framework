import bpc.daw.consola.Consola;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ProgramaPruebas {

    public static void main(String[] args) {


        Image img = Toolkit.getDefaultToolkit().getImage("images.jpg");

        Juego juego = new Juego();
        SpriteTesteador tst = new SpriteTesteador(img, 100, 100);
        EscenaTesteadoraSprite escena = new EscenaTesteadoraSprite(tst);
        juego.iniciar(escena, Resolucion.VENTANA_FULLHD);

    }

}
