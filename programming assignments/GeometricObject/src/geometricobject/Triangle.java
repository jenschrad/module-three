/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricobject;

/**
 *
 * @author jensc_p34tez8
 */
public class Triangle extends GeometricObject {
    // data fields
    private double side1;
    private double side2;
    private double side3;
    
    // default constructor
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    
    // constructor with specified sides
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }
    
    // accessor methods for sides
    public double getSide1() {
        return side1;
    }
    
    public double getSide2() {
        return side2;
    }
    
    public double getSide3() {
        return side3;
    }
    
    // method to get area
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s *(s - side1) * (s - side2) * (s - side3));
        return area;
    }
    
    // method to get perimeter
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
    
    // override tostring method so it can print to console 
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2
                + " side3 = " + side3;  
    }
    

    
}
