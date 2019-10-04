public class Task_4_ {

    public static void main(String[] args) {

        // The sum of all elements of the array, except the first and last.
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
            System.out.print(i + " ");
        }

        System.out.println();

        for (int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();

        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        System.err.println("The sum of all elements of the array, except the first and last: " + sum);
    }
}
