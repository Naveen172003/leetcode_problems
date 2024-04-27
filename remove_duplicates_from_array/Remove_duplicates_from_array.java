/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remove_duplicates_from_array;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Remove_duplicates_from_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int resultLength = solution.removeDuplicates(nums);

        System.out.println("The length of the array after removing duplicates: " + resultLength);
        System.out.println("Array elements after removing duplicates:");
        for (int i = 0; i < resultLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!hs.contains(nums[i])) {
                hs.add(nums[i]);
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
