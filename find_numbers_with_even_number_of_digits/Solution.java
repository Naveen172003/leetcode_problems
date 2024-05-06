/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package find_numbers_with_even_number_of_digits;

/**
 *
 * @author Naveen Raj. K
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int noofdigits = digits(num);
        return noofdigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num) + 1);
    }
}
