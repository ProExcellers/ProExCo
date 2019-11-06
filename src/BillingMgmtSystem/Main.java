/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillingMgmtSystem;
//import java.awt.desktop.QuitEvent;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("********** Welcome to SidLabs **********\n\n\n");
        Scanner scr = new Scanner(System.in);
        System.out.println("\n********** Choice Menu ********** " +
                            "\n>Enter 1 to create a list of items : "+"\n>Enter 2 to add an item : "+"\n>Enter 3 to remove an item : "+
                            "\n>Enter 4 to Pay & Checkout : "+"\n\t>Enter 0 to exit and reset the shopping cart : "
                            );
        int choice = scr.nextInt();
    switch (choice){
        case 1:
                ItemData itm = new ItemData();
                itm.ItemList();
                break;
                //return;        
        
//        case 2:
//                var sc = new SearchItem();
//                sc.Search();
//                break;
//
//        case 3:
//            System.out.println("\n Your choice is "+ choice);
//            break;
//        case 4:
//           System.out.println("\n Your choice is "+ choice);
//            break;
            default:
            System.out.println("\n Your choice is "+choice+" bye now!");
            break;
        }
  
    }
}