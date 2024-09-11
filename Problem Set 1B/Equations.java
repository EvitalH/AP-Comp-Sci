/**
 * Evital Heyl
 * Question set 1B
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Equations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        //String formattedValue = df.format(value);

        //Celcius and Fahrenheit
        
        System.out.println("*** Celsius --> Fahrenheit ***");
        System.out.print("Enter a temperature in Celsius: ");
        double celcius = input.nextDouble();
        double fahrenheit = celcius * 9/5 + 32;
        System.out.println(celcius + " Celsius = " + fahrenheit + " Fahrenheit");

        //BMI

        System.out.println(" ");
        System.out.println("*** BMI Calculator ***");
        System.out.print("Enter a weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter a height in m: ");
        double height = input.nextDouble();
        long bmi = Math.round(weight/Math.pow(height,2));
        System.out.println("A " + height + "m tall adult who weighs " + weight + "kg has a BMI of " + bmi);

        // Days to weeks and days
        
        System.out.println(" ");
        System.out.println("*** Days --> Weeks and Days ***");
        System.out.print("Enter a number of days: ");
        int days = input.nextInt();
        int weeks = days/7;
        int remainingDays = days%7;
        System.out.println(days + " days is equal to " + weeks + " weeks, and " + remainingDays + " days.");

          
        //Reciept Generator

        System.out.println(" ");
        System.out.println("*** Receipt Generator ***");
        System.out.print("Number of units you're buying: ");
        int units = input.nextInt();
        System.out.print("Price per unit: ");
        double price = input.nextDouble();
        System.out.print("Tax rate: ");
        double tax = input.nextDouble();
        double costNoTax = units * price;
        double costWithTax = tax/100 * costNoTax + costNoTax;
        String costWithTaxRounded = df.format(costWithTax);
        System.out.println("Purchasing " + units + " units at $" + price + " with " + tax + "% tax will cost $" + costWithTaxRounded);

         
        
        //Sum of digits
        
        System.out.println(" ");
        System.out.println("*** Sum of digits ***");
        System.out.print("Enter a positive, three digit number: ");
        int numberOriginal = input.nextInt();
        int number = numberOriginal;
        int digitHundred = number/100;
        number = number % 100;
        int digitTen = number/10;
        number = number % 10;
        int digitOne = number/1;
        int sum = digitHundred + digitTen + digitOne;
        System.out.println("The sum of the digits of " + numberOriginal + " is " + sum);
        
        input.close();
    }
}
