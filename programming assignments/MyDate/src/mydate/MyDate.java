/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mydate;
import java.util.GregorianCalendar;

/**
 *
 * @author jensc_p34tez8
 */
public class MyDate {

    /**
     * @param args the command line arguments
     */
    private int year;
    private int month;
    private int day;
    
    // no arg constructor using gregorian calendar class
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar(); // new cal object
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        
    }
    
    // constructor with specified elapsed time since midnight, jan 1, 1970 in ms
    public MyDate(long elaspedTime) {
        setDate(elaspedTime);
    }
    // constructor with specified year, month, day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // override tostring method so it can print to console 
    @Override
    public String toString() {
        return 
        "Year: " + year
        + " Month: " + month
        + " Day: " + day;
    }
    
    // get method for year
    public int getYear() {
        
        return year;
    }
    
    // get method for month
    public int getMonth() {
        return month;
    }
    
    // get method for day
    public int getDay() {
        return day;
    }
    
    // method for setting new date with elapsed time
    private void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        
    }
    
}
