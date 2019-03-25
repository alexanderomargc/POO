/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.implementacioninterfazclonable;

/**
 *
 * @author Omar
 */
public class Main {

    public static void main (String [] args) {
        Drawable [] shapes = {
            new Circle (),
            new Rectangle ()
        };
        
        Circle original_circle = new Circle (10, 20, 1);
        Circle copia_circle = original_circle.clone();
        
        Rectangle original_rectangle = new Rectangle(10, 20, 30, 40);
        Rectangle copia_rectangle = original_rectangle.clone();

   
        System.out.println (shapes [0]);
        System.out.println("Los datos del circulo original, son: "+ original_circle.getX() + " " + original_circle.getY() + " " + original_circle.getRadius());
        System.out.println("Los datos del circulo copia, son: "+ copia_circle.getX() + " " + copia_circle.getY() + " " + copia_circle.getRadius());
        
        System.out.println("Los datos del rectangulo original, son: "+ original_rectangle.getX1() + " " + original_rectangle.getY1() + " " + original_rectangle.getX2() + " " + original_rectangle.getY2());
        System.out.println("Los datos del rectangulo copia, son: "+ copia_rectangle.getX1() + " " + copia_rectangle.getY1() + " " + copia_rectangle.getX2() + " " + copia_rectangle.getY2());
    }
    
}
