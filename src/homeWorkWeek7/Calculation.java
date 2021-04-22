package homeWorkWeek7;

import java.util.Scanner;
/*
 * Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
 * find addition, Subtraction, multiplication and division according to their symbol  (using if else)
 * created with help of group
 */

public class Calculation {

    public void cal(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1st number =  ");
        int a = obj.nextInt();
        System.out.println("Enter 2nd number = ");
        int b= obj.nextInt();
        System.out.println("Enter the  symbol + , - , * , /");
        char c= obj.next().charAt(0);
        if (c =='+'){
            System.out.println(a+b);
        }else if (c == '-'){
            System.out.println(a-b);

        }else  if (c == '*'){
            System.out.println(a*b);
        }else  if (c == '/'){
            System.out.println(a/b);
        }
        else System.out.println("Wrong Symblo");


    }



}

