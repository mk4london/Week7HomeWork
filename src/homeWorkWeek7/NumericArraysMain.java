package homeWorkWeek7;

import java.util.Arrays;

public class NumericArraysMain {
    public static void main(String[] args) {
        NumericArrays a =new NumericArrays();

        System.out.println("Original Arrays" +Arrays.toString(a.y));
        Arrays.sort(a.y); // sort function
        System.out.println("Original Arrays" +Arrays.toString(a.y));
        System.out.println("Original Arrays" +Arrays.toString(a.z));
        Arrays.sort(a.z); // sort function
        System.out.println("Original Arrays" +Arrays.toString(a.z));


    }
}
