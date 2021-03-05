public class Test3 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int ret=sum(arr);
        System.out.println(ret);
    }
    public static int sum(int[] a){
        int ret2=0;
        for(int x:a){
            ret2+=x;
        }
        return ret2;
    }
}
//public class Test40{
//    public static void main(String[] args) {
//        int[] arr={1,2,3};
//        int ret=sum(arr);
//        System.out.println(ret);
//    }
//    public static int sum(int[] a){
//        int ret2=0;
//        for(int x:a){
//            ret2+=x;
//        }
//        return ret2;
//    }
//}
//————————————————
//        版权声明：本文为CSDN博主「痴人痴笑」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/Nabandon/article/details/103756636