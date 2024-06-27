/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first_and_last_position_of_element;

import java.util.Arrays;

/**
 *
 * @author Naveen Raj. K
 */
public class First_and_last_position_of_element {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] ans=sol.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    
}
