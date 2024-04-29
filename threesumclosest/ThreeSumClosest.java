/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threesumclosest;

/**
 *
 * @author Naveen Raj. K
 */
public class ThreeSumClosest {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        ThreeSumClosestSolver solver = new ThreeSumClosestSolver();
        int closestSum = solver.threeSumClosest(nums, target);
        System.out.println("Closest sum to target " + target + " is: " + closestSum);
    }
    
}
