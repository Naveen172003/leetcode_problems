/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remove_element;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Remove_Element {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        // Input value to remove
        System.out.print("Enter the value to remove: ");
        int val = scanner.nextInt();

        Solution solution = new Solution();
        int newLength = solution.removeElement(nums, val);

        // Print modified array
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("New length: " + newLength);
    }
    
}
