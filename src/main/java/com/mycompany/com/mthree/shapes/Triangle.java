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
public class Triangle extends Shape{
    
    private double x = 5, y = 6, side1 = 5, side2 = 5;
    
    @Override
    public double getArea(){
        
        return ((x*y)/2);
        
    }
    
    @Override
    public double getPerimeter(){
        
        return (x+side1+side2);
        
    }
    
    
}
