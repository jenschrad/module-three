/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogame;

/**
 *
 * @author jensc_p34tez8
 */
public class GetVideoGame {
    
     public static void main(String[] args) {
        VideoGame videogame1 = new VideoGame("Night in the Woods ", 2017, " Mystery");
        VideoGame videogame2 = new VideoGame("Zelda Tears of the Kingdom ", 2023, " Adventure");
        VideoGame videogame3 = new VideoGame();
        
        System.out.println(videogame1);
        System.out.println(videogame2);
        System.out.println(videogame3);
    } 
}
