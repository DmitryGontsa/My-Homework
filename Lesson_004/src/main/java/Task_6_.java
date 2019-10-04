import java.util.Scanner;

public class Task_6_ {

    // Return the sum of even digits in the number.
    public static void main(String[] args) {
        System.out.print("Здравствуйте! Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.err.println("Sum of even digits in the number: " + getEvenDigitSum(number));
    }

    static int getEvenDigitSum(int i) {
        int rest = 0;
        int acc = i;
        int count = 0;

        if (i == 0) return 0;
        if (i >> 31 != 0) return -1;

        while (acc != 0) {
            rest = acc % 10;
            acc = acc / 10;
            if (rest % 2 == 0)
                count += rest;
        }
        return count;
    }
}