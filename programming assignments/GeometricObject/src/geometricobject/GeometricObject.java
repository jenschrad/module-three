/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometricobject;

/**
 *
 * @author jensc_p34tez8
 */

// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject {

    private String color = "white";
    private boolean filled;

    /**
     * Default construct
     */
    protected GeometricObject() {
    }

    /**
     * Construct a geometric object
     * 
     */
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter method for color
     *  
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter method for color
     * 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter method for filled.Since filled is boolean, so, the get method
 name is isFilled
     * 
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Setter method for filled
     * @param filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Abstract method findArea
     * @return 
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     * @return 
     */
    public abstract double getPerimeter();
}
    
