package com.mycompany.interfazcollection;

import java.util.Collection;

/**
 *
 * @author Omar
 */

public class Main {

public static void main (String [] args) {
    
    MyCollection<String> myStrCollection = new MyCollection<>();
        myStrCollection.add("Obiwan");
        myStrCollection.add("Anakin");
        myStrCollection.add("Lea");
        myStrCollection.add("Rey");
        
        MyCollection<Double> myDblCollection = new MyCollection<>();
        myDblCollection.add(1.0);
        myDblCollection.add(2.0);
        
        System.out.println(myStrCollection.size());
                
//        print(myStrCollection); 
//        print(myDblCollection);
        
           
}

//public static <T> MyCollection<T> print(MyCollection<T> coleccion){
//    coleccion.toString();
//    return coleccion;
//}



}