package com.linecomparison;

import java.util.Scanner;

public class UC2Problem {
    public static int EnterValue() {
        System.out.println("Enter values in order x1,x2,y1,y2 : ");
        Scanner sc = new Scanner(System.in);
        int valueof = sc.nextInt();
        return valueof;
    }
    public static void main(String[] args) {
        System.out.println("Enter co-ordinates of First line : ");
        int X1 = EnterValue();
        int X2 = EnterValue();
        int Y1 = EnterValue();
        int Y2 = EnterValue();

        System.out.println("Enter the co-ordinates of Second line : ");
        int secX1 = EnterValue();
        int secX2= EnterValue();
        int secY1 = EnterValue();
        int secY2 = EnterValue();

        Integer length_First_Line = ((X2 - X1) ^ 2 + (Y2 - Y1) ^ 2);
        Integer length_Second_Line = ((secX2 - secX1) ^ 2 + (secY2 - secY1) ^ 2);
        Boolean result=Equality(length_First_Line, length_Second_Line);
        if (result == true)
            System.out.println("Length of First line = length of Second line");

        else
            System.out.println("Length of both line are different");
    }

    public static Boolean Equality(Integer first, Integer second) {
        Integer length_firstLine = first;
        Integer length_secondLine = second;
        Boolean result = length_firstLine.equals(length_secondLine);
        return (result);
    }
}
