/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to XYZ Bank!");
        System.out.println("Choose from the following accounts.");
        System.out.println("1.Regular account");
      System.out.println("2.Interest account");
     System.out.println("3.Checking account");
     System.out.println("4.CD account");
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter pin:");
        int pin= scn.nextInt();
        switch(pin){
            case 1:
                System.out.println("Charges: 10% of the available balance every month");
                System.out.println("Interests: None");
                System.out.println("Minimum balance: 50000.00");
                System.out.println("Penalties: 10.00 when balance is below a minimum of 50000.00");
                 break;
               
            case 2:
                 System.out.println("Charges: 10% of the available balance every month");
                System.out.println("Interests: 7% every month");
                System.out.println("Minimum balance: None");
                System.out.println("Penalties: None");
                break;
                
            case 3:
                System.out.println("Charges are: 10% of the available balance every month");
                System.out.println("Interests: 7% monthly");
                System.out.println("Charges per transaction: 0.10");
                System.out.println("Minimum balance: Zero");
                System.out.println("Penalties: 10.00 when balance falls a minimum of 10000.00");
            break;    
            case 4 :
                System.out.println("Charges are: 10% of the available balance every month");
                System.out.println("Interests: 15% yearly");
                System.out.println("Minimum balance: Zero");
                System.out.println("Penalties: 20% of balance when withdraw made before 12 months from opening of account");
                break;
            default:
                System.out.println("Wrong PIN");
                main(null);
                break;
        }
                
                
        } 
    }
    

