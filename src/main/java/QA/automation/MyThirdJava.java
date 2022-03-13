package QA.automation;

import java.util.Scanner;

public class MyThirdJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //First Task
        int fNumber;
        int sNumber;
        int tNumber;
        System.out.println("Enter the first number: ");
        fNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        sNumber = scanner.nextInt();
        System.out.println("Enter the third number: ");
        tNumber = scanner.nextInt();

        if (fNumber > sNumber) {
            if (fNumber > sNumber) {
                System.out.println("The first number is greatest");
            }
        } else if (sNumber > tNumber) {
            System.out.println("The second number is greatest ");
        } else System.out.println("The third number is greatest");


        //Second Task

        System.out.println("Please enter square height");
        int sQuareH = scanner.nextInt();

        System.out.println("Please enter square lenght");
        int squareL = scanner.nextInt();

        int area = (sQuareH * squareL);
        int perimeter = (2* (sQuareH+squareL));

        System.out.println("The area of the square is " + area + "\nAnd the perimeter of the square is " + perimeter);


        //Third Task

        System.out.println("Please enter random number ");

        int rNumber = scanner.nextInt();

        System.out.printf("You`ve Entered : " + rNumber);

        if(rNumber%2 == 0){
            System.out.printf("\nThe entered numbers is : " + rNumber + " and its even");
        }else{
            System.out.println("\nThe entered number is : " + rNumber + " and its odd");
        }



        //Fourth task

        System.out.println("\nPick a day from the week");
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("You picked one , so the day is Monday");
                break;
            case 2:
                System.out.println("You picked two , so the day is Tuesday");
                break;
            case 3:
                System.out.println("You picked three , so the day is Wednesday");
                break;
            case 4:
                System.out.println("You picked four , so the day is Thursday");
                break;
            case 5:
                System.out.println("You picked five , so the day is Friday");
                break;
            case 6:
                System.out.println("You picked six , so the day is Saturday");
                break;
            case 7:
                System.out.println("You picked seven , so the day is Sunday");
                break;
            default:
                System.out.println("You entered incorrect value");

    }
}
}
