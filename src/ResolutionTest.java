import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ResolutionTest {

    @Test
    public void test1() {
        Dimension[] esperadas = {
                Toolkit.getDefaultToolkit().getScreenSize(), // PANTALLA_COMPLETA
                new Dimension(4096, 2160),  // VENTANA_4K
                new Dimension(1920, 1080),  // VENTANA_FULLHD
                new Dimension(2560, 1440),  // VENTANA_QHD
                new Dimension(800, 600)     // VENTANA_VGA
        };

        Resolucion[] resoluciones = Resolucion.values();

        for (int i = 0; i < esperadas.length; i++) {
            assertEquals(esperadas[i], resoluciones[i].getResolucion());
        }

    }


}