package QA.automation;

import java.util.Scanner;

public class MySecondJava {
    public static void main(String[] args) {

        //First task
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Please enter your Soundbar brand");
        String soundBar = scanner.nextLine();

        System.out.println("Your Soundbar brand is " + soundBar);

        //Second task
        System.out.println("First Parameter");
        String firstString = scanner.nextLine();

        System.out.println("Second paramenter");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("Parameters are equal");
        }else { System.out.println("Parameters are not equal"); }

        //Third Task
        System.out.println("Enter some text and I will count the words in it:");
        String toBeCounted = scanner.nextLine();
        String [] stringArray = toBeCounted.split(" ");
        System.out.println( "\""+toBeCounted + "\"" + " has " + stringArray.length + " words.");

        //Fourth Task
        String book1 = ("The name of this book is LOD. ");
        String book2 = ("The main character is called Arthas. ");
        String book3 = ("And the plot is really interesting.");

        System.out.println(book1 + book2 + book3);


    }


    }
