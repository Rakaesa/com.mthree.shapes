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
public class Rectangle extends Shape{
    
    private double x = 4.5, y = 9;
    
    @Override
    public double getArea(){
        
        return (x*y);
        
    }
    
    @Override
    public double getPerimeter(){
        
        return ((2*x)+(2*y));
        
    }
    
}
