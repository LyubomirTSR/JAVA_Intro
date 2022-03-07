package QA.automation;

import java.util.Scanner;

public class MyFirstJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your surname");
        String surName = scanner.nextLine();

        System.out.println("Please enter your age");
        String userAge = scanner.nextLine();

        System.out.println("Please enter your favorite hobbies");
        String hobbies = scanner.nextLine();

        System.out.println("Your first name is " + firstName + " , your second name is " +
        surName + " , your age is " + userAge + "\n and your favorite hobbies are "
        + hobbies );

    }
}
