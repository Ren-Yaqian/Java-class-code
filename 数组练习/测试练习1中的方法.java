public class 测试练习1中的方法 {
    public static void main(String[] args) {
        /*
        1. 测试的时候，尽可能全面（把各种情况都测试看看）
        2. 找边界的位置是比较好的选择
        3. 调用非本类的方法时，类名 .  方法名 调用
         */
        //test1();
        //test2();

        //ssss();     // Alt + Enter
    }

    private static void test2() {
        long[] a1 = { 1, 2, 3, 4, 3, 2, 1 };

//        System.out.println(练习1.indexOf(a1, 7, 6, 100));

//        System.out.println(练习1.indexOf(a1, 2, 5, 1));   // -1
//        System.out.println(练习1.indexOf(a1, 2, 5, 3));   // 2
//        System.out.println(练习1.lastIndexOf(a1, 2, 5, 3));   // 4
    }

    private static void test1() {
        long[] a1 = { 1, 2, 3, 4, 5 };

        System.out.println(练习1.indexOf(a1, 1));     // 0
        System.out.println(练习1.indexOf(a1, 5));     // 4
        System.out.println(练习1.indexOf(a1, -1));    // -1
        System.out.println(练习1.indexOf(a1, 6));     // -1

        long[] a2 = { 1, 2, 3, 4, 3, 2, 1 };
        System.out.println(练习1.indexOf(a2, 1));     // 0
        System.out.println(练习1.lastIndexOf(a2, 1)); // 6
        System.out.println(练习1.lastIndexOf(a2, -1));    // -1
    }
}
