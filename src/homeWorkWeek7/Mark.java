package homeWorkWeek7;

public class Mark {
    double persentage;

    public String StudentName(String a) {
        return a;
    }

    public Integer RoallNumber(int a) {
        return a;

    }

    public int Maths(int a) {
        if (a < 0 ) {
            System.out.println("invalid number");
        } else if (a > 100) {
            System.out.println("invalid number");
        } else {
            System.out.println("");
        }

        return a;
    }

    public int Science(int a) {
        if (a < 0) {
            System.out.println("invalid number");
        } else if (a > 100) {
            System.out.println("invalid number");
        } else {
            System.out.println();
        }

        return a;

    }

    public int English(int a) {
        if (a < 0) {
            System.out.println("invalid number");
        } else if (a > 100) {
            System.out.println("invalid number");
        } else {
            System.out.println("");
        }

        return a;

    }

    public  double Percentage() {


        if (persentage >= 80) {// if statement execute when its condition is true
            System.out.println("Grade A+");
        } else if (persentage >= 60) { // if condition is false this condition execute
            System.out.println("Grade A");

        } else if (persentage >= 50) { // if condition is false this condition execute
            System.out.println("Grade B");
        } else if (persentage >= 35) { // if condition is false this condition execute
            System.out.println("C");
        } else { // else if condition is false then this condition execute
            System.out.println(" You are Fail ");
        }
        return (double) persentage;
    }


    public String Grade (){
        String a ="Grade A+";
        String ab ="Grade A";
        String b ="Grade B";
        String c ="Grade C";
        if (persentage >= 80){
            return a;
        }else if (persentage >= 60){
            return b;
        }
        else if(persentage>=50){
            return ab;
        }else {
            return c;
        }

    }


    public String Result(){
        String p = "pass";
        String f = "fail";
        if (persentage <= 35) {
            //   System.out.println("Fail");
            return f;
        } else {
            //System.out.println("Pass");
            return p;
        }


    }


}

