/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package find_smallest_letter_greater_than_target;

/**
 *
 * @author Naveen Raj. K
 */
public class Find_smallest_letter_greater_than_target {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] letters = {'c','d','y','y'};
        char target = 'z';
        char ans=nextGreatestLetter(letters,target);
        System.out.println("Next greatest character : "+ans);
    }
    
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target < letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
  
}
