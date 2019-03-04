package metodogenerico;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class utilities{
    
    public static <T> void llenar (ArrayList<T> list, T val){
        for(int i=0;i< list.size(); i++){
            list.set(i, val);
        }
    }
    
    public static <T, U> int sumarpoint(ArrayList<T> list, U val){
        int sumapoint = 0;
        
        for(int i=0;i<list.size();i++){
            sumapoint = sumapoint +  ((Number)list.get(i)).intValue();
        }
        return sumapoint;
    }
   
    public static <V, U> String comparar(int val1, int val2){
        String result = "";
        
        if(val1!=val2){
            result = "Las listas son diferentes.";
        }
        else{
            if(val1==val2){
                result = "Las listas son iguales.";
            }
        }
        
        return result;
     
    }
   
     
}
