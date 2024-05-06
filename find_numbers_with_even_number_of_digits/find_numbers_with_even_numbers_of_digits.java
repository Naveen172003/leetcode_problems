/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package find_numbers_with_even_number_of_digits;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class find_numbers_with_even_numbers_of_digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        System.out.println("Result: " + solution.findNumbers(nums));

        sc.close();
    }
    
}
