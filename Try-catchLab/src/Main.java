public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 10, 100};

        //1
        try {
            int invalidAccess = numbers[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!!!");
        }

        //2
        try {
            int result = 100 / numbers[0];
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!!!");
        }

        //3
        try {
            infinite();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow happened!!!");
        }

        //4
        try {
            int i = 0;
            int[][] crasher = new int[100000][];

            while (true) {
                crasher[i] = new int[99_000_000];
                System.out.println(i);
                i++;
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Ran out of memory !!!");
        }

        //5
        try {
            registration(10);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Registration process completed.");
        }

    }

    //3
    public static void infinite() {
        infinite();
    }

    //5
    public static void registration(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18+ !!!");
        } else {
            System.out.println("Successful!");
        }
    }
}
