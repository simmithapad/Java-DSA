package Basics.basicsOfProgramming;

/* Write a program that takes a character as input and prints:
 * 1 if character is(A - Z)
 * 0 if character is (a - z)
 * -1 if character is not an alphabet */

import java.util.Scanner;

public class basicsOfJava {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);


        if(Character.isUpperCase(ch)) {
            System.out.println("1");
        } 
        else if(Character.isLowerCase(ch)) {
            System.out.println("0");
        }
        else {
            System.out.println("-1");
        }
    }
}