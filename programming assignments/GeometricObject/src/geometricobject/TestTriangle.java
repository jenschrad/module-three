/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometricobject;

import java.util.Scanner;

/**
 *
 * @author jensc_p34tez8
 */
public class TestTriangle {
    public static void main(String[] args) {
        
        // scanner 
        Scanner input = new Scanner(System.in);
        
        // prompt for entering sides of triangles
        System.out.print("Enter values for three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        // prompt for entering color 
        System.out.print("Enter a color for the triagle: ");
        String color = input.next();
        
        // prompt for entering if triangle is filled or not
        System.out.print("Enter true if the triangle is filled, or false if it is not filled: ");
        boolean filled = input.nextBoolean();
        
        // create the triangle 
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        triangle.getArea();
        triangle.getPerimeter();
        
        // print out triangle details
        System.out.println(triangle.toString());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("Is the triangle filled? " + triangle.isFilled());
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter()); 
    }
    
}
