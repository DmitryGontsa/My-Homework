public class Task_1_ {

    // Java loops
    public static void main(String[] args) {

        int counter1 = 9;
        while (counter1 >= 9 & counter1 <= 19) {
            counter1++;
            System.out.print(" " + counter1);
        }
        System.out.println();


        int сounter2 = 10;
        do {
            System.out.print(" " + сounter2);
            сounter2++;
        } while (сounter2 <= 20);
        System.out.println();


        for (int counter3 = 10; counter3 >= 10 & counter3 <= 20; counter3++) {
            System.out.print(" " + counter3);
        }
        System.out.println();


        int[] arg = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i : arg) {
            System.out.print(" " + i);
        }
    }
}
