package day26_Arrays_Part3;

import java.util.Scanner;

public class RainffallClassEtnik {

public static void main(String[] args) {
		
		double rain[] = new double[12];
        double sum = 0;
        double avg = 0;
        double most = 0;
        double least = 0;
        String months[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        System.out.println("Please enter in the following rainfall for the months ahead: ");
        System.out.println("Month\tRainfall (In inches)");


        Scanner keyboard = new Scanner(System.in);
        
        for (int i=0;i<months.length;i++) {
            System.out.print(months[i]+" :");
            double val = keyboard.nextDouble();
            while(val<0){
                System.out.println("Do not Enter a negative number. Re-ENTER");
                val = keyboard.nextDouble();
            }
            rain[i]=val;
            sum+=val;
        }

        avg = sum / 12;
        most =getMaxValue(rain);
        least=getMinValue(rain);

        System.out.println("The sum of all the rain is: " + sum + " inches");
        System.out.println("The average rainfall was: " + avg + " inches");
        System.out.println("The max rain is: " + most + " inches");
        System.out.println("The min rain is: " + least + " inches");

    }

    public static double getMaxValue(double[] rain) {
        double max = 0;
        for (double i : rain) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double getMinValue(double[] rain) {

        double min = getMaxValue(rain);
        for (double i : rain) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

	}


