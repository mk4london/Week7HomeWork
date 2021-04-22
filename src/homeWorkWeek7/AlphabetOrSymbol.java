package homeWorkWeek7;

import java.util.Scanner;
/*
 Write a program that tells us input value is number or an alphabet or symbol.
 */


public class AlphabetOrSymbol {
    public char alpha() {
        // ASCII values of characters
        /*For capital alphabets 65 – 90,
        For small alphabets 97 – 122,
        For digits 48 – 57
        */
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Number = ");
        char input_char = obj.next().charAt(0);

        // CHECKING FOR ALPHABET
        if ((input_char >= 65 && input_char <= 90)
                || (input_char >= 97 && input_char <= 122)) {
            System.out.println(" Alphabet ");
        }

        // CHECKING FOR DIGITS
        else if (input_char >= 48 && input_char <= 57)
            System.out.println(" Digit ");


            // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println(" Special Character ");


        return input_char;
    }
}

