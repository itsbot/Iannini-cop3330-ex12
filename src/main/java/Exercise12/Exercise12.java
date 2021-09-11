/*
 *  UCF COP3330 Fall 2021 Exercise 12 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise12;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println("Enter the principal: ");
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();

        System.out.println("Enter the rate of interest:" );
        double interestRate = (sc.nextDouble()/100);

        System.out.println("Enter the number of years: ");
        int years = sc.nextInt();

        double investment = (principal*(1+(interestRate*years)));
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println("After "+years+" years at "+interestRate*100+"%, the investment will be worth $"+df.format(investment)+".");
    }
}
