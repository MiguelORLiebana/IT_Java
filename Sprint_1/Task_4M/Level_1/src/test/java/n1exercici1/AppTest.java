package n1exercici1;

import junit.framework.TestCase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    @Test
    void mesosLlistaComplertaTest(){
        Months months = new Months();
        List<String> mesos = new ArrayList<String>();
        mesos = months.afegirMesos();
        Assertions.assertEquals(12, mesos.size());
    }

    @Test
    void mesosOrdreTest() {
        Months months = new Months();
        List<String> mesos = new ArrayList<String>();
        mesos = months.afegirMesos();

        for(int i = 0; i < 12; i++){
            switch (i) {
                case 0:
                    Assertions.assertEquals("Gener", mesos.get(i));
                    break;
                case 1:
                    Assertions.assertEquals("Febrer", mesos.get(i));
                    break;
                case 2:
                    Assertions.assertEquals("Març", mesos.get(i));
                    break;
                case 3:
                    Assertions.assertEquals("Abril", mesos.get(i));
                    break;
                case 4:
                    Assertions.assertEquals("Maig", mesos.get(i));
                    break;
                case 5:
                    Assertions.assertEquals("Juny", mesos.get(i));
                    break;
                case 6:
                    Assertions.assertEquals("Juliol", mesos.get(i));
                    break;
                case 7:
                    Assertions.assertEquals("Agost", mesos.get(i));
                    break;
                case 8:
                    Assertions.assertEquals("Setembre", mesos.get(i));
                    break;
                case 9:
                    Assertions.assertEquals("Octubre", mesos.get(i));
                    break;
                case 10:
                    Assertions.assertEquals("Novembre", mesos.get(i));
                    break;
                case 11:
                    Assertions.assertEquals("Dessembre", mesos.get(i));
                    break;
                default:
                    break;
            }
        }
    }
}
