import bpc.daw.consola.Sprite;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SpriteTesteador extends GameObject {
    private Sprite sprite;
    private final Image imagen;
    private final int x, y;

    public SpriteTesteador(Image imagen, int x, int y) {
        this.imagen = imagen;
        this.x = x;
        this.y = y;
    }

    @Override
    public void inicializar() {
        // consola ya inyectada por Juego.setEscena()
        sprite = consola.getCapaSprites()
                .crearSprite(imagen, new Rectangle(x, y),
                        imagen.getWidth(null), imagen.getHeight(null));
    }

    @Override
    public void ejecutarFrame() {
        Teclado teclado = this.consola.getTeclado(); // Corregido aquí

        if (teclado.teclaPulsada(KeyEvent.VK_UP)) {
            sprite.moverY(-10);
        }

        if (teclado.teclaPulsada(KeyEvent.VK_DOWN)) {
            sprite.moverY(+10);
        }

        if (teclado.teclaPulsada(KeyEvent.VK_LEFT)) {
            sprite.moverX(-10);
        }

        if (teclado.teclaPulsada(KeyEvent.VK_RIGHT)) {
            sprite.moverX(+10);
        }
    }

    @Override
    public void finalizar() {
        consola.getCapaSprites().eliminarSprite(sprite);
    }
}





