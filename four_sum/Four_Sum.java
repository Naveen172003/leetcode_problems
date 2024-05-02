/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package four_sum;

import java.util.*;

/**
 *
 * @author Naveen Raj. K
 */
public class Four_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        Solution solution = new Solution();
        List<List<Integer>> result = solution.fourSum(nums, target);
        System.out.println("Quadruplets that sum up to " + target + ":");
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
    
}
