package homeWorkWeek7;

import java.util.Scanner;
public class MarkMain {
    int abc,ab,a;

    public static void main(String[] args) {

        // user input
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String Student = obj.nextLine();
// user input
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter Student Roll Number : ");
        int roll = obj1.nextInt();
// user input
        Scanner obj2 = new Scanner(System.in);
        System.out.println(" Enter your Maths subject marks");
        int maths = obj2.nextInt();
        Mark a = new Mark();
        int abc = a.Maths(maths);



// user input
        Scanner obj4 = new Scanner(System.in);
        System.out.println(" Enter your science subject marks");
        int science = obj4.nextInt();
        int ab = a.Science(science);


// user input
        Scanner obj5 = new Scanner(System.in);
        System.out.println(" Enter your english subject marks");
        int english = obj5.nextInt();
        int ac = a.English(english);


        double totalmarks = abc + ab + ac;
        Mark b =new Mark();
        b.persentage= totalmarks * 100 / 300;
        //b.Percentage();
        //b.Result();
        // b.Result();


        System.out.println("---------------------------------------");
        System.out.println("|                                     |");
        System.out.println("|" +      "Mark Sheet"            +  "|");
        System.out.println("---------------------------------------");
        System.out.println("|"+ "Name : " +    Student       +    "|");
        System.out.println("|"+ "Roll Number ;"+ roll +           "|");
        System.out.println("----------------------------------------");
        System.out.println("|"    +"Subject"+       "Marks" +     "|");
        System.out.println("|"+     "Math" +    ":"+    abc+      "|");
        System.out.println("|"+     "Science"  +":"+    ab +      "|");
        System.out.println("|"+     "English"+  ":"+    ac +      "|");
        System.out.println("|--------------------------------------|");
        System.out.println("|"+     "Total" +   ":"+ totalmarks  +"|");
        System.out.println("|--------------------------------------|");
        System.out.println("|"+    "percentage"+":"+ b.persentage +"|");
        System.out.println("|"+    "Result"    +":" + b.Result()+    "|");
        System.out.print("|"+    "Grade"   + ":" );
        System.out.println(       b.Grade()+                 "|");
        System.out.println("|--------------------------------------|");

    }
}

