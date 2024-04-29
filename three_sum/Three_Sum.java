/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Three_Sum {

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

        List<List<Integer>> result = threeSum(nums);
        System.out.println("Triplets with sum zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }

        scanner.close();
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> resultSet = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        int target = 0;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    resultSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        resultList.addAll(resultSet);
        return resultList;
    }
}
