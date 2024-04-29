/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package container_with_most_water;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Container_With_Most_Water {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] height = new int[n];
        System.out.println("Enter the heights of the vertical lines:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }
        
        most_water water=new most_water();

        int maxWater = water.maxArea(height);
        System.out.println("The maximum area of water that can be trapped is: " + maxWater);
        
    }
    
}
