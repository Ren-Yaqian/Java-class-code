import java.util.Arrays;

public class 使用Arrays中的方法 {
    public static void main(String[] args) {
        //testBinarySearch();
        //testEquals();
        //testFill();
        //testSort();
        //testCopy();
        testCopyRange();
    }

    private static void testCopyRange() {
        long[] a = { 1, 2, 3, 4, 5 };

        // [from, to)
        //long[] copy = Arrays.copyOfRange(a, 3, 4);
        //long[] copy = Arrays.copyOfRange(a, 3, a.length);
        long[] copy = Arrays.copyOfRange(a, 3, 10);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copy));
    }

    private static void testCopy() {
        long[] a = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(a));

        //long[] copy = Arrays.copyOf(a, 3);// 新数组长度小于源长度
        //long[] copy = Arrays.copyOf(a, 5);// 新数组长度等于源长度
        long[] copy = Arrays.copyOf(a, 10);// 新数组长度大于源长度

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copy));

        Arrays.fill(a, 100);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copy));
    }

    private static void testSort() {
        long[] a = { 9, 5, 2, 7, 1, 6, 8, 3, 0, 4 };
        System.out.println(Arrays.toString(a));
        Arrays.sort(a); // In-place Sort 原地排序
        System.out.println(Arrays.toString(a));
    }

    private static void testFill() {
        long[] a = new long[10];
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 1, 8, 100);
        System.out.println(Arrays.toString(a));
    }

    private static void testEquals() {
        long[] a = { 1, 2, 3, 4 };
        long[] b = { 1, 2, 3, 0 };

        b[3] = 4;
        System.out.println(Arrays.equals(a, b));
    }

    private static void testBinarySearch() {
        long[] a = { 9, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.binarySearch(a, 1));  // 由于数组无序，返回什么都是合理的

//        System.out.println(Arrays.binarySearch(a, 3));  // 2
//        System.out.println(Arrays.binarySearch(a, 4));  // 3 OR 4
//        System.out.println(Arrays.binarySearch(a, -1)); // -1
//        System.out.println(Arrays.binarySearch(a, 10)); // -11
    }
}
