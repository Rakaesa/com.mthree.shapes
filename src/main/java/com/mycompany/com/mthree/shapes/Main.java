/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.com.mthree.shapes;

/**
 *
 * @author Connor Doonan
 */
public class Main {
    
    public static void main(String[] args){
        
        Square sq = new Square();
        Rectangle rq = new Rectangle();
        Triangle tri = new Triangle();
        Circle cir = new Circle();
        
        sq.setColor("Red");
        
        System.out.println("Square perimeter: "+sq.getPerimeter());
        System.out.println("Square Area: "+sq.getArea());
        System.out.println("Square Color: "+sq.getColor());
        
        System.out.println("Rectangle Area: "+rq.getArea());
        
        System.out.println("Triangle area: "+tri.getArea());
        
        System.out.println("Circle area: "+cir.getArea());
        
    }
    
}
