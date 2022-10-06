package com.linecomparison;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UC1Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value of X1: ");
         int x1=sc.nextInt();
        System.out.println("Enter The value of X2: ");
        int x2=sc.nextInt();
        System.out.println("Enter The value of Y1: ");
       int y1=sc.nextInt();
        System.out.println("Enter The value of Y2: ");
       int  y2=sc.nextInt();

        // Calculate distance between two points
        int length_of_line= (int) sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of Line between two points :" +length_of_line);
    }
}
