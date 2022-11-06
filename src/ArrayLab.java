import java.util.Random;
import java.util.Scanner;

public class ArrayLab {

    //int val = rnd.nextInt(100);  // gives a value from 0 to 99
    //int val = rnd.nextInt(100) + 1;  // gives a value from 1 to 100
    //int index = rnd.nextInt(myArray.length);  //gives a random valid index on myArray

    public static double getAverage(double values[])
    {
        double[] dataPointsTwo = new double[100];

        Random rnd = new Random();

        for(int i = 0; i < dataPointsTwo.length; i++){
            dataPointsTwo[i] = rnd.nextInt(100) + 1;
        }

        for(int i = 0; i < dataPointsTwo.length; i++){
            System.out.printf("%.2f | ", dataPointsTwo[i]);

        }

        double sum = 0;
        double average = 0;
        for(int i = 0; i < dataPointsTwo.length; i++){
            sum = sum + dataPointsTwo[i];
        }
        System.out.println("");
        average = sum / dataPointsTwo.length;


        return average;

    }

    public static void main(String[] args) {
        int[] dataPoints = new int[100];


        Random rnd = new Random();



        for(int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for(int i = 0; i < dataPoints.length; i++){
            System.out.printf("%d | ", dataPoints[i]);

        }

        double sum = 0;
        double average = 0;
        for(int i = 0; i < dataPoints.length; i++){
            sum = sum + dataPoints[i];
        }
        System.out.println("");
        average = sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        System.out.println("");

        Scanner in = new Scanner(System.in);

        int number = SafeInput.getRangedInt(in, "Please enter an integer from ", 1, 100);

        System.out.println(number);


        boolean found = false;
        int count = 0;
        System.out.println("\nSearching for " + number + "...");
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] == number){
                found = true;
                //System.out.printf("%n%d exists at index %d", number, i);
                count++;

            }
        }

        if(found){
            System.out.println(number + " appeared " + count + " time(s) in the array.");
            System.out.printf("%n%d exists in the array", number);
        }
        else{
            System.out.printf("%n%d does not exist in the array", number);
        }

        System.out.println("");

        Scanner inTwo = new Scanner(System.in);

        int numberTwo = SafeInput.getRangedInt(inTwo, "Please enter another integer from ", 1, 100);

        System.out.println(number);


        boolean foundTwo = false;
        System.out.println("\nSearching for " + numberTwo + "...");
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] == numberTwo){
                foundTwo = true;
                System.out.printf("%n%d was found at the array index %d", numberTwo, i);
                break;
            }
        }

        if(foundTwo){
            System.out.printf("%n%d exists in the array", numberTwo);
        }
        else{
            System.out.printf("%n%d does not exist in the array", numberTwo);
        }

        System.out.println("");

        int maxNumber = Integer.MIN_VALUE;
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] >= maxNumber){
                maxNumber = dataPoints[i];

            }
        }
        System.out.println("");
        System.out.println("The maximum number in the loop is: " + maxNumber);


        int minNumber = Integer.MAX_VALUE;
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] < minNumber){
                minNumber = dataPoints[i];

            }
        }
        System.out.println("");
        System.out.println("The minimum number in the loop is: " + minNumber);

        System.out.println("");


        double[] dataPointsTwo = new double[100];
        System.out.println("Average of dataPoints is: " + getAverage(dataPointsTwo));

    }



}
