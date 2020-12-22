import java.util.*;
public class CalcWithSwitch {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String doCalculation = "y";
        while (doCalculation.equals("y")) {
            System.out.println("choose a number "); double x = sc.nextDouble();
            System.out.println("choose another number"); double y = sc.nextDouble();
            System.out.println("what operation do you want to do with these numbers? \n" +
                    "do you want to: add(add, a or +),\n" +
                    "subtract(subtract, s  or -), \n" +
                    "multiply(multiply, m or *), \n" +
                    "divide(divide, d or /), \n" +
                    "raise to a power(power, p or ^), \n" +
                    "test for equality(equal, e or =), \n" +
                    "find remainder(mod, r or %)\n" +
                    "find nth root(sqrt or ^/)?");
            String operation = sc.next();
            switch (operation) {
                case "equal":
                case "e":
                case "=":
                    if (!(x == y)) {
                        if (x > y) {
                            System.out.println("Your first number is bigger");
                        } else if (y > x) {
                            System.out.println("Your second number is bigger");
                        }
                    } else if (x == y) {
                        System.out.println("These numbers are equal");
                    } else {
                        System.out.println("Confusion");
                    }
                    break;
                case "add":
                case "a":
                case "+":
                    System.out.println(x + y);
                    break;
                case "subtract":
                case "s":
                case "-":
                    System.out.println(x - y);
                    break;
                case "multiply":
                case "m":
                case "*":
                    System.out.println(x * y);
                    break;
                case "sqrt":
                case "^/":
                    System.out.println(Math.pow(x, 1/y));
                    break;
                case "divide":
                case "d":
                case "/":
                    System.out.println(x / y);
                    break;
                case "mod":
                case "r":
                case "%":
                    System.out.println(x % y);
                    break;
                case "power":
                case "p":
                case "^":
                    System.out.println(Math.pow(x, y));
                    break;
                default:
                    System.out.println("you did big oof");
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
