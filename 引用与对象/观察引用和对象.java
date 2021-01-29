import java.util.Arrays;

public class 观察引用和对象 {
    public static void main(String[] args) {
        long[] a1 = { 1, 2, 3, 4, 5 };
        long[] a2 = { 1, 2, 3, 4, 5 };

        System.out.println(a1 == a2);
        System.out.println(Arrays.equals(a1, a2));
    }

    public static void main2(String[] args) {
        long[] a1 = null;

        long b = a1.length;

        System.out.println(b);
    }

    public static void main1(String[] args) {
        long[] a1 = { 1, 2, 3, 4, 5 };

        long[] a2 = a1;

        a1[0] = 100;

        System.out.println(Arrays.toString(a2));
    }
}
