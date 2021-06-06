package ex07.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String str1 = input.nextLine();
        int length = Integer.parseInt(str1);

        System.out.print("What is the width of the room in feet? ");
        String str2 = input.nextLine();
        int width = Integer.parseInt(str2);

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        int area = length * width;
        final double convFact = 0.09290304;
        double meters = area * convFact;

        System.out.println("The area is\n" + area + " square feet\n" + meters + " square meters.");
    }
}
