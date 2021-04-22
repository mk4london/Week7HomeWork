package homeWorkWeek7;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
 * Created with help of group
 */

import java.util.Scanner;

// leapyear calculation
public class LeapYear {
    // instance methode
    public void add() {
        // import scanner for user input
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        // scanner object
        int c = obj.nextInt();
        //
        if (c % 4 == 0) { // execute if statement is true
            System.out.println(" Year is a leap year : ");
        } else if (c % 100 == 0) { // execute if statement is true
            System.out.println("Year is a leap year ; ");
        } else if (c % 400 == 0) {// execute if statement is true
            System.out.println("Year is a leap year ; ");

        } else {
            System.out.println("Year is not a leap year ; ");
        }

    }

}
