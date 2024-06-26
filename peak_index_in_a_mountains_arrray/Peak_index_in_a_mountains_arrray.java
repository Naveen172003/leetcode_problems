/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peak_index_in_a_mountains_arrray;

/**
 *
 * @author Naveen Raj. K
 */
public class Peak_index_in_a_mountains_arrray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Solution solution = new Solution();
        int[] arr = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        int peakIndex = solution.peakIndexInMountainArray(arr);
        System.out.println("Peak index: " + peakIndex);
    }
    
}
