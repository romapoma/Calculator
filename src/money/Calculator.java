package src.money;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        calc();
    }

    private static void calc() {
        Scanner in = new Scanner(System.in);
        double fnum, snum;
        String operator;

        System.out.println("Enter first number:");
        fnum = in.nextDouble();
        System.out.println("Enter Second number:");
        snum = in.nextDouble();
        System.out.println("What operation will be done? (+, -, *, /)");
        operator = in.next();

        Double ans = calculate(fnum, snum, operator);

        if (ans == null)
            System.out.println("wrong operator, please try either +, -, *, or /");
        else
            System.out.printf("Answer is %s%n", ans);

        System.out.println("Enter 'C' to quit or Any Key + Enter to Continue");
        String s = in.next();
        if (!s.equalsIgnoreCase("c"))
            calc();
    }

    /*
        I changed the signature of this function to return a value -- the answer to the calculation
        This is better practice for a bunch of reasons, the main one being that it makes testing your
        code easier in bigger projects and is just generally good form.

        The reason the return type is Double (capitalized) as opposed to double (lowercase) is
        that a Double can be null, when a double can't. I used that fact to indicate when an
        unsupported operator was requested.
        There are other (better) ways you could do that, like throwing exceptions but thats a whole other canoworms
     */
    private static Double calculate(double a, double b, String oper) {
        /*
        I changed your sequence of if-else's into a switch statement
        A switch is easier and more efficient when you are checking a range of values against one variable,
        like you were doing with oper and the different symbols.
        */
        switch (oper) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            default: //wrong operator case
                return null;
        }
    }
}
