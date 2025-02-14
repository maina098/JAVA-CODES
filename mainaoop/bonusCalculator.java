//ANDERSON MAINA
//CT 101/G/20948/23
//THIS  PROGRAM ASKS USER TO ENTER SALARY AND USES IT TO CALCULATE THE  DISCOUNT TO BE ALLOCATED

import java.util.Scanner;

public class bonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of years in service: ");
        int numberOfYears = scanner.nextInt(); // Use int for whole years

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();//USE DOUBLE DATA TYPE TO CARTER FOR DECIMAL INPUT

        //use conditional statement to determine the discount to be allocated according to  salary
         if (numberOfYears > 10) {
           double  bonus = 0.12 *salary;
            System.out.println("your bonus is :"+bonus);

        } else if (numberOfYears >= 6) {
           double bonus= 0.1 *salary;
            System.out.println("your bonus is :"+bonus);

        } else if {
           double bonus= 0.08*salary;
            System.out.println("your bonus is :"+bonus);

        }else{
            System.out.println("your bonus is :"+bonus);
        }

        scanner.close();
    }
}