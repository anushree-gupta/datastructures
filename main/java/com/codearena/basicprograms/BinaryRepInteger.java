/*
 *This program will store  binary representation of a positive integer to a string.
 */
package com.codearena.basicprograms;
import java.util.Scanner;
/**
 *
 * @author anushreegupta
 */
public class BinaryRepInteger {
    
    public static void  main(String args[]){
    
    /*
        1. Read an input integer value and pass it to the method.
        2. Print the recieved value to the console.
        */

    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
    int i= scanner.nextInt();
        String binaryOfPosInt = binaryOfPosInt(i);
        System.out.println("The binary conversion of "+i+ " is "+ binaryOfPosInt);
    }
    
    public static  String binaryOfPosInt(int i){
        
         /*
        1. Initialize a String.
        2. Run a for loop with a logic of finding a decimal value of an integer
        3. Append it to the String and return its value.
        */
         
        String str="";
        for(int n=i; n>0; n /=2){
            str = (n%2) + str; 
        }
        
    return str;}
    
}
