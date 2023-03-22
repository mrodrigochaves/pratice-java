package edu.marciorodrigo.area;

public class Quadrilateral {

    public static double area(double side) {
        return side * side;
    }
    
    public static double area(double side1, double side2)  {
        return side1 * side2;
    }

    public static double area(double biggerBase, double minorBase, double heigth) {
       return ((biggerBase + minorBase)* heigth)/2;
    }

    public static void xpto() {

        System.out.println("Before");
        return;
    }

    public static double abc() {
        return 1.6;
    }
}
