public class Task_11_ {

    // Figure Isosceles Triangle.
    public static void main(String[] args) {
        triangle(10);
    }

    private static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
