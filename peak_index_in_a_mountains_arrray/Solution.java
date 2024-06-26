/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peak_index_in_a_mountains_arrray;

/**
 *
 * @author Naveen Raj. K
 */
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int mid;
        
        
         while(start<end)
         {
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }    
        }
    return start;

    }
}
