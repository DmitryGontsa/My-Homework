import java.util.Scanner;

public class Task_7_ {

    public static void main(String[] args) {
        // The greatest common divisor of two numbers.
        System.out.println("Введите два числа!");
        System.out.print("Первое число: ");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();

        System.out.print("Второе число: ");
        int second = in.nextInt();

        System.out.print("The greatest common divisor of two numbers: ");
        System.err.print(getGreatestCommonDivisor(first, second));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;

        while (second != 0) {
            int divisor = first % second;
            first = second;
            second = divisor;
        }
        return first;
    }
}
