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
public class Circle extends Shape {
    
    private double radius;
    
    @Override
    public double getArea(){
        
        return(Math.PI*(radius*radius));
        
    }
    
    @Override
    public double getPerimeter(){
        
        return ((radius*2)*Math.PI);
        
    }
    
}
