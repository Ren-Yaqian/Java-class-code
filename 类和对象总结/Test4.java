public class Test4 {
    public static void main(String[] args) {
        //找到了返回位置的开始的下标
        String str = "hello word";
        //从头开始查找子字符串位置
        System.out.println(str.indexOf("ell"));
        //从指定位置查找子字符串位置
        System.out.println(str.indexOf("or", 2));
        //没找到返回 -1
        System.out.println(str.indexOf("oll"));
    }
}
//public class Test {
//    public static void main(String[] args) {
//        //找到了返回位置的开始的下标
//        String str = "hello word";
//        //从头开始查找子字符串位置
//        System.out.println(str.indexOf("ell"));
//        //从指定位置查找子字符串位置
//        System.out.println(str.indexOf("or", 2));
//        //没找到返回 -1
//        System.out.println(str.indexOf("oll"));
//    }
//}
//————————————————
//        版权声明：本文为CSDN博主「JIAYU.」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/qq_45914985/article/details/104927266