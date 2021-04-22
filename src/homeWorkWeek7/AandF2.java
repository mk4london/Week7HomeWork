package homeWorkWeek7;

import java.util.Scanner;

public class AandF2 {

    void Alphabet() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Capital Alphabet : ");
        char ab = obj.next().charAt(0);



        if (ab == 'A') {
            System.out.println("Abu Dhabi");
        } else if (ab == 'B') {
            System.out.println("Bagshot");
        } else if (ab == 'C') {
            System.out.println("Cheenai");
        } else if (ab == 'D') {
            System.out.println("Delhi");
        } else if (ab == 'E') {
            System.out.println("England");
        } else if (ab == 'F') {
            System.out.println("France");
        } else {
            System.out.println(" Invalid Alphabet");

        }


    }


}

