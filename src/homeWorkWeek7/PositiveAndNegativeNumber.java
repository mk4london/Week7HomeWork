package homeWorkWeek7;

import java.util.Scanner;
/*
 *
 */

public class PositiveAndNegativeNumber {


    public void number(){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your number =");
        int a =obj.nextInt();
        if(a<0){
            System.out.println("Number is Negative");
        }else if (a>0){
            System.out.println("Number is Positive");
        } else if (a==0){
            System.out.println("Number is Zero");
        }

    }
}

