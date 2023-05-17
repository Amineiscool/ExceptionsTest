package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


     Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

            System.out.print("Enter numerator:\n ");

        int numerator = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter denominator:\n ");

           int denominator = Integer.parseInt(scanner.nextLine());

                int result = numerator / denominator;


                System.out.println("Result is\n " + result);

           break;

    } catch (  ArithmeticException e) {
                System.out.println("Cannot divide by zero!");


            }

            catch (NumberFormatException e) {

         System.out.println("You must enter a whole number ");
      }
        }




    }

}
