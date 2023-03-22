package edu.marciorodrigo.calculator;

public class Loan {

    public static int getTwoInstallments() {
        return 2;
    }

    public static int getTreeInstallments() {

        return 3;
    }

    public static double getTaxsTwoInstallments() {

        return 0.3;
    }

    public static double getTaxsTreeInstallments() {

        return 0.45;
    }

    public static void calculate(double value, int installments) {

        if (installments == 2) {

            double finalValue = value + (value * getTaxsTwoInstallments());

            System.out.println("Final loan amount for 2 installments: R$ " + finalValue);
        } else if (installments == 3) {

            double finalValue = value + (value * getTaxsTreeInstallments());

            System.out.println("Final loan amount for 3 installments: R$ " + finalValue);
        } else {
            System.out.println("Number of installments not accepted.");
        }

    }

}
