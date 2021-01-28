public class 数组定义与使用 {
    public static int indexof(long[] array,long target){
        for(int i=0;i<array.length;i++){
            long element=array[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
    public static long max(long[] array){
        long max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static long min(long[] array){
        return -1;
    }

    public static long sum(long[]array){
        long sum=0;
        for(long element:array){
            sum+=element;
        }
        return sum;
    }

    public static void fill(long[] array,long target){
        for(int i=0;i<array.length;i++){
            array[i]=target;
        }
    }
}
