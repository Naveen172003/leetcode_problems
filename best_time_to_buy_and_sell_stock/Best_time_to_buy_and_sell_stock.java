/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package best_time_to_buy_and_sell_stock;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Best_time_to_buy_and_sell_stock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter the prices of the stocks:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(prices);

        System.out.println("Maximum profit: " + maxProfit);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else if (price - minprice > maxprofit) {
                maxprofit = price - minprice;
            }
        }

        return maxprofit;
    }
}