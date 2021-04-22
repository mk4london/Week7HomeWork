package homeWorkWeek7;

import java.util.Scanner;
/* Write a java program to print the numbers between 1 to 100
 * which can be divided by 3  and 5 separately.
 */

public class NumberDivision {
    public void division() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number=");
        int a = obj.nextInt();
        if (a >= 1 & a <= 100) {
            System.out.println("Your number is divide by 3 =" + a / 3);
            System.out.println("Your number is divide by 5 =" + a / 5);
        } else System.out.println("number is not Valid");
    }
}
