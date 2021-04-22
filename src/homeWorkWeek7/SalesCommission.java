package homeWorkWeek7;

/*
 *Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * created with help of group
 *
 */


import java.util.Scanner;

public class SalesCommission {

    void Comission() {

        // scanner obj
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter sales Id : ");
        int ab = obj.nextInt();

// scanner obj

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter Seller Name  : ");
        String ac = obj2.nextLine();
// scanner obj

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter Basic salary amount : ");
        double sal = obj1.nextDouble();

        Scanner obj3 = new Scanner(System.in);
        System.out.println("Enter Sale amount : ");
        float  sales = obj3.nextFloat();
        if ( sales >30000  && sales >= 50000) {
            System.out.println("your commission is " + sales * 35 / 100);
        } else if (sales >20000 && sales <= 30000) {
            System.out.println("your commission is " + sales *20 / 100);
        } else if (sales >= 10000 && sales<= 20000) {
            System.out.println("your commission is " + sales * 10 / 100);
        } else if (sales == 10000) {
            System.out.println("your commission is " + sales *5 / 100);
        } else {
            System.out.println("your commission is " + sales * 2 / 100);
        }
    }
}

