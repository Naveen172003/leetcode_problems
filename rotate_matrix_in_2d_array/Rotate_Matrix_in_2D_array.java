/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotate_matrix_in_2d_array;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Rotate_Matrix_in_2D_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        Rotate_Matrix Rotate=new Rotate_Matrix();
        Rotate.rotatematrix(matrix);
        
        System.out.println("After Rotating the Matrix in 90 degree:");
        printMatrix(matrix);
        
    }
    
    private static void printMatrix(int[][] matrix){
        for(int[] row:matrix){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    
}
