/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package richest_customer_wealth;

/**
 *
 * @author Naveen Raj. K
 */
public class Solution {
    public int maximumWealth(int[][] accounts){
        
        int max=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int wealth=0;
            for(int account=0;account<accounts[person].length;account++){
                wealth+=accounts[person][account];
            }
            if(wealth>max){
                max=wealth;
            }
        }
        return max;
    }
}
