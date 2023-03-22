package edu.marciorodrigo.calculator;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Calculator exercices");
        Calculator.sum(3, 6);
        Calculator.subtraction(9, 1.8);
        Calculator.multiplication(7, 8);
        Calculator.division(5, 2.5);

        // Mensagem
        System.out.println("Test mensage");
        Message.getMessage(9);
        Message.getMessage(14);
        Message.getMessage(1);

        // Empréstimo
        System.out.println("Loan exerccices");
        Loan.calculate(1000, Loan.getTwoInstallments());
        Loan.calculate(1000, Loan.getTreeInstallments());
        Loan.calculate(1000, 5);

    }
}