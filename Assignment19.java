public class ExceptionExample {

    public static void main(String[] args) {

        // Example 1: ArithmeticException
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("Arithmetic operation completed.");
        }


        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {10, 20, 30};

            System.out.println("Element: " + numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        finally {
            System.out.println("Array operation completed.");
        }
    }
}
