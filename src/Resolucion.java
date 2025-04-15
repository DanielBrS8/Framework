import java.awt.Dimension;
import java.awt.Toolkit;

public enum Resolucion {
    PANTALLA_COMPLETA(Toolkit.getDefaultToolkit().getScreenSize()),
    VENTANA_4K(new Dimension(4096, 2160)),
    VENTANA_FULLHD(new Dimension(1920, 1080)),
    VENTANA_QHD(new Dimension(2560, 1440)),
    VENTANA_VGA(new Dimension(800, 600));

    private final Dimension Resolucion;


    Resolucion(Dimension resolution) {
        this.Resolucion = resolution;
    }


    public Dimension getResolucion() {
        return Resolucion;
    }
}