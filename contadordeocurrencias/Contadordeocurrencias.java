
package contadordeocurrencias;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Contadordeocurrencias {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> list = new ArrayList<> (10);
        
        for(int i=0;i<5;i++){
            list.add((int)(Math.random()*20)+1);
        }
        
        System.out.println("Lista: " + list);
       
        int foo = 10;
        
        int cont = utilities.ocurrences(list, foo);
        
        String bar = String.format("El elemento %d aparece en la lista %d veces",foo,cont);
        
        System.out.println(bar);
       
    }
    
}
