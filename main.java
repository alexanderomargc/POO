package metodogenerico;

import java.util.ArrayList;
import javax.swing.text.Utilities;

/**
 *
 * @author Omar
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> point1 = new ArrayList<>(5);
        ArrayList<Integer> point2 = new ArrayList<>(5);
        
        point1.add (10);
        point1.add (20);
        point1.add (30);
        point1.add (40);
        point1.add (50);
        
        point2.add (10);
        point2.add (20);
        point2.add (30);
        point2.add (40);
        point2.add (50);
        
        utilities.<Integer>llenar (point2, 100);
        
        System.out.println("Lista 1: " + point1);
        
        System.out.println("Lista 2: " + point2);
        
        int resp1 = utilities.sumarpoint(point1, args);
        int resp2 = utilities.sumarpoint(point2, args);
        System.out.println("La suma de la lista 1 es: " + resp1);
        System.out.println("La suma de la lista 2 es: " + resp2);
        
        String resultado = utilities.<Integer,Integer>comparar(resp1, resp2);
        System.out.println(resultado);

}
}