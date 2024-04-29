/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threesumclosest;

import java.util.Arrays;

/**
 *
 * @author Naveen Raj. K
 */
public class ThreeSumClosestSolver {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closetsum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int sum=0,j=i+1,k=nums.length-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-closetsum)){
                    closetsum=sum;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closetsum;
    }
}


