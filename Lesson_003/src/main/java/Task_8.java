import java.util.ArrayList;

public class Task_8 {
    public static void main(String[] args) {
        int a = 72;
        int b = 101;
        int c = 108;
        int d = 108;
        int e = 111;
        int f = 87;
        int g = 111;
        int h = 114;
        int i = 108;
        int j = 100;
        System.out.println(transformIntToChar(a, b, c, d, e, f, g, h, i, j));
        printList(transformIntToChar(72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100));
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<Character>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private static void printList(ArrayList<Character> buffer) {
        for (char c : buffer) {
            System.out.print(c);
        }
    }
}
