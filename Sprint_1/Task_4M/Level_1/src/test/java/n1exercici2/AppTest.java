package n1exercici2;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class AppTest extends TestCase {
    @Test
    void calculDniTest() {
        HashMap<Integer, String> aux = new HashMap<Integer, String>();
        Integer[] llistaNum = new Integer[]{15000000, 20000001, 30000001, 40000001, 50000001, 60000001, 70000001, 80000001, 90000001, 99999998};
        String[] llistaLletra = new String[]{"A","B","C","D","E","F","G","H","I","Z"};

        aux.put(15000000, "A");
        aux.put(20000001, "B");
        aux.put(30000001, "C");
        aux.put(40000001, "D");
        aux.put(5000000, "E");
        aux.put(60000001, "F");
        aux.put(70000001, "G");
        aux.put(80000001, "H");
        aux.put(90000001, "I");
        aux.put(99999998, "Z");

        CalculoDni dni = new CalculoDni();

        for(int i = 0; i < aux.size(); i++){
            Assertions.assertEquals(llistaLletra[i], dni.calcularLletra(llistaNum[i]));
            System.out.println("El dni " + llistaNum[i] + " amb lletra " + dni.calcularLletra(llistaNum[i]) + " es: " + llistaLletra[i]);
        }
    }
}
