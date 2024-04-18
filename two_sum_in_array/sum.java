/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_sum_in_array;

import java.util.HashMap;

/**
 *
 * @author Naveen Raj. K
 */
public class sum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                return new int[]{i, hm.get(target - nums[i])};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }
}

