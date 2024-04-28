/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rotate_matrix_in_2d_array;

/**
 *
 * @author Naveen Raj. K
 */
public class Rotate_Matrix {
    public void rotatematrix(int[][] matrix){
        int n=matrix.length;
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int[] row:matrix){
            int left=0,right=n-1;
            while(left<right){
                temp=row[left];
                row[left]=row[right];
                row[right]=temp;
                left++;
                right--;
            }
        }
    }
}
