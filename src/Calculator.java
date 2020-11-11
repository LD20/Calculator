import java.util.*;
public class Calculator {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String doCalculation = "y";
        while  (doCalculation.equals("y")) {
            System.out.println("choose a number");
            double x = sc.nextDouble();
            System.out.println("choose another number");
            double y = sc.nextDouble();
            System.out.println("what operation do you want to do with these numbers? \n" +
                    "do you want to: add(add, a or +),\n" +
                    "subtract(subtract, s  or -), \n" +
                    "multiply(multiply, m or *), \n" +
                    "divide(divide, d or /), \n" +
                    "raise to a power(power, p or ^), \n" +
                    "test for equality(equal, e or =), \n" +
                    "find remainder(mod, r or %)?");
            String operation = sc.next();
            if (operation.equals("equal") || operation.equals("e") || operation.equals("=")) {
                if (x > y) {
                    System.out.println("Your first number is bigger");
                } else if (y > x) {
                    System.out.println("Your second number is bigger");
                } else if (y == x) {
                    System.out.println("the two numbers are equal");
                } else {
                    System.out.println("?");
                }
            }
            if (operation.equals("add") || operation.equals("a") || operation.equals("+")) {
                System.out.println(x + y);
            }
            if (operation.equals("subtract") || operation.equals("s") || operation.equals("-")) {
                System.out.println(x - y);
            }
            if (operation.equals("multiply") || operation.equals("m") || operation.equals("*")) {
                System.out.println(x * y);
            }
            if (operation.equals("divide") || operation.equals("d") || operation.equals("/")) {
                System.out.println(x / y);
            }
            if (operation.equals("mod") || operation.equals("r") || operation.equals("%")) {
                System.out.println(x % y);
            }
            if (operation.equals("power") || operation.equals("p") || operation.equals("^")) {
                System.out.println(Math.pow(x, y));
            }
            System.out.println("do you want to make any other calculations? y or n");
            String doCalcRequest = sc.next();
            if (doCalcRequest.equals("y")) {
                doCalculation = "y";
            }
            else {
                doCalculation = "n";
            }
        }
    }
}
