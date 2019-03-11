/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadordeocurrencias;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class utilities {
   
    public static <T, U> int ocurrences(ArrayList<T> list, U val){
        int result = 0;
        
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(val)){
            result=result+1;
        }
        }
        
        
        return result;
    }

    
}

