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
public abstract class Shape {
    
    protected String color;
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public void setColor(String c){
        this.color = c;
    }
    
    public String getColor(){
        return this.color;
    }
    
}
