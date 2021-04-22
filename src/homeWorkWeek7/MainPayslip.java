package homeWorkWeek7;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 * HRA = basic salary 10%
 *DA = Basic salary 8%
 *TA = Basic salary 9%
 *PF= Basic salary 20%
 *Gross salary = basic salary + HRA + TA + DA –PF
 *Print in following format
 *
 *created with help of group
 */
import java.util.Scanner;

public class MainPayslip {
    double basicsalary; // global varriable
    public static void main(String[] args) {
        MainPayslip a = new MainPayslip(); // mainpayslip object


// scanner obj
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int ab = obj.nextInt();

// scanner obj
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter Employee Name  : ");
        String ac = obj2.nextLine();
// scanner obj
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter Basic salary : ");
        a.basicsalary = obj1.nextDouble();
// variable
        double hra= (int) (a.basicsalary * 10 / 100);
        double da= (float) (a.basicsalary  * 8/100);
        double ta= a.basicsalary  * 9/100;
        double pf= a.basicsalary * 20 / 100 ;
        double gross = a.basicsalary +hra+da+ta-pf ;

        System.out.println("");
        System.out.println("");
        // Salary Slip
        System.out.println("|________________________________________|");
        System.out.println("|" +         "SalarySlip" +             "|");
        System.out.println("|________________________________________|");
        System.out.println("|" + "Employee Id   : " +       ab +    "|");
        System.out.println("|" + "Employee Name :" +      ac  +     "|");
        System.out.println("|" + "Basic salary  :" + a.basicsalary+ "|");
        System.out.println("|" + "HRA           :"         +  hra  +"|");
        System.out.println("|" + "TA"        + ":"+   ta        + "|");
        System.out.println("|" + "DA"        + ":"   +   da      +"|");
        System.out.println("|" + "PF"       +  ":"    +   pf+     "|");
        System.out.println("|________________________________________|");
        System.out.println("|" + "Gross Salary  :" +   gross +    "|");
        System.out.println("|________________________________________|");



    }


}
