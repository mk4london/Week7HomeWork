package homeWorkWeek7;

import java.util.Scanner;

/*
 * Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)
 * created with help of group
 */
public class TernaryOperator {


    public void odd (){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int c =obj.nextInt();
        String b = (c%2!=0) ? "odd" : "even";

        System.out.println("Number You Enter is : " + b );

    }




}

