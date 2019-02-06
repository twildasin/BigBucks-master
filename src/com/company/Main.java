package com.company;


import java.io.*;
import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;

        //Instantiate an ArrayList object here called aryList
        List aryLst = new ArrayList();
        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.println("Please enter the name to whom the account belongs. ") ;
            name = kbReader.nextLine( );

            if( !name.equalsIgnoreCase("EXIT") ) {
                System.out.println("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" "); //gives an eye-pleasing blank line
                // Create a BankAccount object
                BankAccount myAccount = new BankAccount(name, amount);
                // Add it to the ArrayList object
                aryLst.add(myAccount);
                }
        } while(!name.equalsIgnoreCase("EXIT"));


        //Search aryList and print out the name and amount of the largest bank account



        BankAccount ba = (BankAccount) aryLst.get(0);//get first account in the list
        double maxBalance = ba.balance;
        String maxName = ba.name;

        //Starts at one because else it would just compare it to itself (repetitive)
            for(int j = 1; j < aryLst.size( ); j++) {
                ba = (BankAccount) aryLst.get(j);

                if(ba.balance > maxBalance)
                {
                    maxBalance = ba.balance;
                    maxName = ba.name;
                }
                //Step through the remaining objects and decide which one has
                //largest balance (compare each balance to maxBalance)
            }
            //Print answer
        System.out.println("Name: " + maxName + "\nBalance: " + maxBalance);
        }
    }

