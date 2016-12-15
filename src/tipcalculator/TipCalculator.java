/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipcalculator;


import java.util.Scanner;
 
public class TipCalculator {
 
  public static void main(String [] args) {
 
    double tenPercent = 0.10;
    double fifteenPercent = 0.15;
    double twentyPercent = 0.20;
 
    Scanner input = new Scanner(System.in);
 
    System.out.println("Welcome to York College Tip Calculator!");
    System.out.print("What was your total amount: $");
    
    double totalAmount = input.nextDouble();
    
    System.out.println("How much tip would you like to give: 1)10% 2)15% 3)20%");
    
    int categories = input.nextInt();
    
    switch(categories){
        
        case 1: System.out.printf("10%%: $%.2f \n", (totalAmount*tenPercent));
            break;
        
        case 2: System.out.printf("15%%: $%.2f \n", (totalAmount*fifteenPercent));
            break;
            
        case 3: System.out.printf("20%%: $%.2f \n", (totalAmount*twentyPercent)); 
            break;
         
        default: System.out.println("Not a valid input. Sorry, Goodbye :(");
    }

  }
}