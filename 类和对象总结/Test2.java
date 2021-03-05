public class Test2 {
    public static void main(String[] args) {
        String str = "hello word";
        //替换所有指定内容
        System.out.println(str.replaceAll("l","-"));
        //替换首个内容
        System.out.println(str.replaceFirst("l","-"));
    }
}
//   原文链接：https://blog.csdn.net/qq_45914985/article/details/104927432