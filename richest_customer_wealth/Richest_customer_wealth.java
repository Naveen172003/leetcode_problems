/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package richest_customer_wealth;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Richest_customer_wealth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int[][] accounts = {{1,2,3},{3,2,1},{5,3,8}};
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numOfPeople = scanner.nextInt();

        System.out.print("Enter the number of accounts per person: ");
        int numOfAccounts = scanner.nextInt();

        int[][] accounts = new int[numOfPeople][numOfAccounts];

        System.out.println("Enter the wealth for each account:");

        for (int i = 0; i < numOfPeople; i++) {
            for (int j = 0; j < numOfAccounts; j++) {
                System.out.print("Person " + (i + 1) + ", Account " + (j + 1) + ": ");
                accounts[i][j] = scanner.nextInt();
            }
        }

        Solution solution = new Solution();
        int maxWealth = solution.maximumWealth(accounts);

        System.out.println("Maximum wealth: " + maxWealth);
        
        
    }
    
}
