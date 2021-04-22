package homeWorkWeek7;

/*Number of Days In Month
 *Write a method isLeapYear with a parameter of type int named year.
 *The parameter needs to be greater than or equal to 1 and less than
 *or equal to 9999. If the parameter is not in that range return false.
 *Otherwise, if it is in the valid range, calculate if the year is a
 *leap year and return true if it is,  otherwise return false.
 * Created with help of google and group
 */

public class DaysINMonth {


    // static methode
    public static boolean isLeapYear( int year){
        if(year>0&& year<=9999){// if statement
            return (year%4==0&&year%100!=0||year%400==0&&year% 100 ==0); // return statement
        }
        else{return false;} }

    // static methode
    public static int getDaysInMonth(int month,int year){

        if(month<1||month>12){ // if statement
            return -1;
        }
        else if(year<1 || year>9999){
            return -1;
        }
        else{
            switch(month){ // switch statement
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 2: {
                    if(isLeapYear(year)){
                        return 29;
                    }
                    else{return 28;}}

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;

                default:
                    return -1;
            }
        }
    }

}

