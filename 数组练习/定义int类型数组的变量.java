import java.util.Arrays;

public class 定义int类型数组的变量 {
    private static int[] method() {
        return new int[] { 9, 8, 7, 6 };
    }

    public static void main(String[] args) {
        //int[]  a;       // a 变量没有被初始化
        //System.out.println(a);

        //int[] a = { 1, 2, 3, 4 };
        //System.out.println(a);

//        int[] a;
//
//        a = { 1, 2, 3, 4 };
//
//        System.out.println(a);

//        String[] a = new String[] { "Hello", "World" };     // 初始化
//
//        a = new String[] { "Go", "Come", "Yes", "No" };     // 赋值
//
//        int[] b = method();

//        int[] a = new int[5];   // 定义一个数组，元素类型是 int，长度是 5
//                                // 其中，每个元素的值都是 int 类型的默认值 —— 0

        //int[] a = { 1, 2, 3, 4 };
        //int[] a = new int[5];

        //System.out.println(a.length);

//        String s = Arrays.toString(a);
//        System.out.println(s);

        String[] a = { "Hello", "World", "你好", "世界" };
//        for (int i = 0; i < a.length; i++) {
//            String b = a[i];
//            System.out.printf("第 %d 个元素是 %s\n", i + 1, b);
//        }

        for (String b : a) {
            System.out.println(b);
        }
    }
}
