package homeWorkWeek7;

public class AverageValue {

    public static void main(String[] args) {

        float[] arr = {19, 12.89f, 16.5f, 200, 13.7f};
        float total = 0;
        /* arr.length returns the number of elements
         * present in the array
         */
        for(int i=0; i<arr.length; i++) {
            total = total + arr[i];
        }
        float average =total/ arr.length;
        System.out.println("The average is : " + average);




    }

}
