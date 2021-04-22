package homeWorkWeek7;

import java.util.Scanner;

public class Days {
    public void days (){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7"  );
        int day=obj.nextInt();

        switch (day) { // switch statement is used .
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println(" Next Week");

        }




    }
}

