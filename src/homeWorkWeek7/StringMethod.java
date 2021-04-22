package homeWorkWeek7;
/*
String method in java
Created with help of group

 */

public class StringMethod {

    public static void main(String[] args) {
        java.lang.String a = "My First java code";
        java.lang.String b = "Hello World";
        int name = a.length();

        System.out.println(name);// convert in int first then use .lenght() and sout variable name
        System.out.println(a.charAt(0));
        System.out.println(b.concat(a));// concat b+a String
        System.out.println(a.startsWith("My"));// get the boolean ans
        System.out.println(a.endsWith("e"));// find the string end with letter boolean ans
        System.out.println(b.equals(a));// check the equal boolean ans
        System.out.println(b.indexOf(a));
        System.out.println(b.isEmpty()); // boolean ans
        //System.out.println("A".replace());
        System.out.println(a.substring(1)); // return part of the string
        System.out.println(b.toCharArray()); // convert string in to char arrays
        System.out.println(a.toLowerCase());// lower case
        System.out.println(b.toUpperCase()); // uper case
        System.out.println(a.trim());

    }
}
