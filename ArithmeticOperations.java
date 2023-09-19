package kahitAno;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 60;

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int difference = num2 - num1;
        System.out.println("Difference: " + difference);

        int product = num1 * num2;
        System.out.println("Product: " + product);

        if (num1 != 0 && num2 != 0) {
            int quotient = num2 / num1;
            int remainder = num2 % num1;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
