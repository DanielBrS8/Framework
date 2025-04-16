import org.junit.Test;

import static org.junit.Assert.*;

public class EscenaTest {

    @Test
    public void test(){
        EscenaTesteadora ET = new EscenaTesteadora();
        assertFalse(ET.getTester().inicializado());
        ET.getTester().inicializar();
        assertTrue(ET.getTester().inicializado());
        for(int i = 0; i<1253; i++){
            ET.getTester().ejecutarFrame();
        }
        assertEquals(1253,ET.getTester().frameCounter());
        ET.getTester().finalizar();
        assertFalse(ET.getTester().inicializado());
    }

}