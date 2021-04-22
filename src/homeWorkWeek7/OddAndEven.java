package homeWorkWeek7;

/*
Odd and even number
 */

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in); // scanner obj
        System.out.println(" Enter The Number :- ");
        int ab = obj.nextInt(); // scanner variable
        String b = (ab % 2 != 0) ? "odd" : "even"; // Ternery operator
        System.out.println(" Your number is :- " + b);
    }

}

