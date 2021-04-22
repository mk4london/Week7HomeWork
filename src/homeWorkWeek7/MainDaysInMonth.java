package homeWorkWeek7;

/*
 **
 * main methode for Days in month
 */

import java.util.Scanner;

import static homeWorkWeek7.DaysINMonth.getDaysInMonth;
import static homeWorkWeek7.DaysINMonth.isLeapYear;

public class MainDaysInMonth {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your year : ");
        int year = a.nextInt();
        System.out.println(isLeapYear(year));

        System.out.println("Enter your Month : ");
        int month = a.nextInt();
        System.out.println(getDaysInMonth(month, year));


    }


}

