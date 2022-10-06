package com.linecomparison;

import java.util.Scanner;

public class UC3Problem {
    public static int DataValue() {
        System.out.println("Enter values in order x1,x2,y1,y2 : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        return m;
    }
    public static void main(String[] args) {
        System.out.println("Enter co-ordinates of First line : ");
        int X1 = DataValue();
        int X2 = DataValue();
        int Y1 = DataValue();
        int Y2 = DataValue();

        System.out.println("Enter the co-ordinates of Second line : ");
        int secX1 = DataValue();
        int secX2= DataValue();
        int secY1 = DataValue();
        int secY2 = DataValue();

        Integer length_First_Line = ((X2 - X1) ^ 2 + (Y2 - Y1) ^ 2);
        Integer length_Second_Line = ((secX2 - secX1) ^ 2 + (secY2 - secY1) ^ 2);
        Integer result=Comparison(length_First_Line, length_Second_Line);
        if (result == 0)
            System.out.println("Length of First line = length of Second line");
        else if (result < 0)
            System.out.println("Length of First line < length of Second line");
        else
            System.out.println("Length of First line > length of Second line");
    }

    public static int Comparison(Integer first, Integer second) {
        Integer length_firstLine = first;
        Integer length_secondLine = second;
        Integer result = length_firstLine.compareTo(length_secondLine);
        return (result);
    }
}
