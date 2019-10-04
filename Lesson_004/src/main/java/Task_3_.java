public class Task_3_ {
    public static void main(String[] args) {

        // Array with numbers from 100 to 0.
        int[] arr = new int[101];
        for (int i = 0, j = arr.length - 1; i <= arr.length - 1 && j >= 0; i++, j--) {
            arr[i] = j;
            System.out.print(j + " ");
        }

        System.out.println();

        for (int h : arr)
            System.out.print(h + " ");
    }
}

