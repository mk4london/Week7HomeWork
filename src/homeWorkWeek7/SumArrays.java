package homeWorkWeek7;
/*
 * Write a Java program to sum values of an array.
 */

public class SumArrays {

    public static void main(String[] args) {
        int a []= {100,200,300,400};
        int sum = 0;
        for (int i : a)
            sum+=i;
        System.out.println("The sum of arrays = " + sum);
    }

}




