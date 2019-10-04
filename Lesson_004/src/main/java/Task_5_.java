public class Task_5_ {

    // Function which calculates and returns the minimum of 4 arguments.
    public static void main(String[] args) {
        min(15, 25);
    }

    public static int show(int value) {
        System.out.println("Multiplication result: " + value);
        return value;
    }

    public static int min(int a, int b, int c, int d) {
        int multiplication = a * b * c * d;
        return show(multiplication);
    }

    public static int min(int a, int b) {
        int value1 = a;
        int value2 = b;
        int value3 = 35;
        int value4 = 45;
        return min(value1, value2, value3, value4);
    }
}
