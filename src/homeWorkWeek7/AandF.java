package homeWorkWeek7;

/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if  any other alphabet should be invalid entry
Created With help of group
 */

import java.util.Scanner;

public class AandF {

    void Charecter() {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Capital Alphabet : ");
        String ab = obj.nextLine();
       /* if (ab == "A" && ab == "B" && ab == "C" && ab == "D" && ab == "E" && ab == "F") {

        }*/
        switch (ab) { // switch statement
            case "A":
                System.out.println("Abu Dhabi");
                break;
            case "B":
                System.out.println("Bagshot");
                break;
            case "C":
                System.out.println("Cheenai");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("England");
                break;
            case "f":
                System.out.println("France");
                break;

            default:
                System.out.println("INVALID ALPHABETS");

        }


    }


}

