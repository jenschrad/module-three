/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericmaxelement;


import java.util.Scanner;
/**
 *
 * @author jensc_p34tez8
 */
public class GenericMaxElement {
    
    public static <E extends Comparable<E>> E max(E[] list) {
        E maxElement = list[0];
        
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(maxElement) > 0) {
                maxElement = list[i];
            }
        }
        return maxElement;
    }
    
    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // scanner 
        Scanner input = new Scanner(System.in);
        
        // array that holds 10 nums
        Integer[] nums = new Integer[10];
        
        // prompt for entering 10 nums
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }
        
        // get max num
        Integer maxNumber = max(nums);
        
        // display
        System.out.println("Max number is: " + maxNumber);
    }
    
}
