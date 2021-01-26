public class 练习1 {
    /*
    数组的元素类型是 long
    在 array 数组中，从头往后找第一次出现的 target 位置
    找到返回其下标
    没有找到，返回 -1
     */
    public static int indexOf(long[] array, long target) {
        // 用到遍历（使用哪种遍历？）
        // 比较
        // 从前往后遍历 —— 用下标的角度 i ~ [0, array.length)
        for (int i = 0; i < array.length; i++) {
            long element = array[i];
            if (element == target) {
                // 相等，代表找到
                // 立即返回，代表，找到第一个就够了
                return i;
            }
        }
        // i 超过合法下标 <=> 数组中没有找到 target
        return -1;
    }

    // [fromIndex, toIndex)
    public static int indexOf(long[] array, int fromIndex, int toIndex, long target) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }

        for (int i = fromIndex; i < toIndex; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int lastIndexOf(long[] array, long target) {
        // 从后往前 i ~ (array.length, 0]
        for (int i = array.length - 1; i >= 0; i--) {
            long element = array[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }

    public static int lastIndexOf(long[] array, int fromIndex, int toIndex, long target) {
        if (fromIndex < 0 || fromIndex > toIndex || toIndex > array.length) {
            throw new RuntimeException("传入的参数不合法");
        }

        for (int i = toIndex - 1; i >= fromIndex; i--) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static long max(long[] array) {
        // 不考虑 array.length == 0 的情况
        long max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static long max(long[] array, int fromIndex, int toIndex) {
        return -1;
    }

    public static long min(long[] array) {
        // TODO
        return -1;
    }

    public static long min(long[] array, int fromIndex, int toIndex) {
        return -1;
    }


    public static long sum(long[] array) {
        // 不考虑和溢出的情况了
        long sum = 0;
        for (long element : array) {
            sum += element;
        }

        return sum;
    }

    public static long sum(long[] array, int fromIndex, int toIndex) {
        long sum = 0;
        for (int i = fromIndex; i < toIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void fill(long[] array, long target) {
        for (int i = 0; i < array.length; i++) {
            array[i] = target;
        }
    }

    public static void fill(long[] array, int fromIndex, int toIndex, long target) {
    }
}
