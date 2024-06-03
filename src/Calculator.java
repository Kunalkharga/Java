public class Calculator {

    public void printWelcomeMessage() {
        System.out.println("Welcome to the Calculator!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.printWelcomeMessage();

        int sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);

        double difference = calculator.subtract(10.5, 4.2);
        System.out.println("Difference: " + difference);

        int product = calculator.multiply(2, 3, 4);
        System.out.println("Product: " + product);

        boolean isEven = calculator.isEven(10);
        System.out.println("Is 10 even? " + isEven);

        calculator.printSum(7, 8);
    }
}
