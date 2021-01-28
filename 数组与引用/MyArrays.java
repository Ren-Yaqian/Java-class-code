public class MyArrays {
    // "[1, 2, 3, 4]"
    public static String toString(long[] array) {
        String ans = "[";

        // 遍历 除了 最后一个元素之外的其余所有元素
        for (int i = 0; i < array.length - 1; i++) {
            long element = array[i];

            // String + long + String
            // String + String.valueOf(long) + String

            // "["
            // "[1, "
            // "[1, 2, "
            // "[1, 2, 3, "
            // "[1, 2, 3, 4, "
            ans = ans + element + ", ";
        }

        // 把最后一个元素添加到字符串 ans 中
        // 数组中最后一个元素的下标是 array.length - 1
        // 思考 array.length 的取值范围是多少 >= 0
        // "[1, 2, 3, 4, 5"
        if (array.length > 0) {
            long lastElement = array[array.length - 1];
            ans = ans + lastElement;
        }

        // "[1, 2, 3, 4, 5]"
        ans = ans + "]";

        return ans;
    }

    public static long[] copyOf(long[] original, int newLength) {
        if (newLength < 0) {
            throw new RuntimeException("newLength 必须 >= 0");
        }

        long[] ans = new long[newLength];

        // 下标(i) 走到哪个位置停下来？
        // original.length 和 ans.length 中小的一个
        int size = Integer.min(original.length, newLength);
        for (int i = 0; i < size; i++) {
            // 需要保证等号两边的下标使用都是合法的！！
            ans[i] = original[i];
        }

        // 如果 newLength > original.length 了
        // ans 中剩余的位置，已经是 long 类型的默认值了（0）
        // 所以我们不需要做什么事情了

        return ans;
    }

    // 0 <= from <= original.length && 0 <= from <= to
    public static long[] copyRangeOf(long[] original, int from, int to) {
        if (from < 0) {
            throw new RuntimeException("from 必须 >= 0");
        }

        if (from > to) {
            throw new RuntimeException("from 必须 <= to");
        }

        if (from > original.length) {
            throw new RuntimeException("from 必须 <= original.length");
        }

        int newLength = to - from;

        long[] ans = new long[newLength];

//        ans[0] = original[from];
//        ans[1] = original[from + 1];
//        ans[2] = original[from + 2];

        // i 假如代表的是 ans 的下标
        // i 的合法取值范围必须满足两个条件
        // 1. i 在 ans 中是合法下标  [0, ans.length)
        // 2. from + i 在 original 中是合法下标 [0, original.length)
        //    i 的取值范围 [-from, original.length - from)
        // 最后，i 的合法范围：[0, ans.length) 和 [-from, original.length - from) 的交集
        // i ~ [0, min(ans.length, original.length - from))
        int size = Integer.min(newLength, original.length - from);
        for (int i = 0; i < size; i++) {
            // 保证两边的下标都合法
            ans[i] = original[from + i];
        }

//        // i 假如代表的是 original 的下标
//        for (int i = from; i < ?; i++) {
//            ans[i - from] = original[i];
//        }

        // 思考过填充默认值的情况，和 copyOf 一样

        return ans;
    }

    public static void bubbleSort(long[] array) {
        // 一共有 array.length 个元素，需要经过 array.length - 1 次 “冒泡” 数组会有序

        for (int i = 0; i < array.length - 1; i++) {
            // 每循环一次，经过一次 “冒泡过程”
            // 把无序区间中的最大的数，冒泡到，无序区间的最后去

            // 数组看作一个整体区间，表示 [0, array.length)
            // 无序区间: [0, array.length - i)

            // 实现具体的冒泡过程
            // j 代表的是黑色下标
            // j ~ [0, array.length - i) 无序区间
            // j + 1 ~ [0, array.length - i) 无序区间 <=> j ~ [-1, array.length - i - 1)
            // j 需要取交集 [max(0, -1), min(array.length - i, array.length - i - 1))
            // j ~ [0, array.length - i - 1)
            for (int j = 0; j < array.length - i - 1; j++) {
                // j 需要保证 array[j] 和 array[j + 1] 的下标都合法
                if (array[j] > array[j + 1]) {
                    long t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

    // 前提：array 有序
    // 找到 target 所在的下标，如果 target 有多个，不保证找到哪一个
    // 如果没有找到，返回 -1
    public static int binarySearch(long[] array, long target) {
        // 待查找区间表示为: [low, high)
        // 带查找区间内的元素个数: high - low
        // 定义待查找区间的下限
        int lowIndex = 0;
        // 定义待查找区间的上限
        int highIndex = array.length;

        // 只要带查找区间内还有元素，查找过程就得继续
        while (highIndex - lowIndex > 0) {
            int midIndex = (lowIndex + highIndex) / 2;  // 暂时不考虑溢出的情况
            long midElement = array[midIndex];

            if (target == midElement) {
                return midIndex;
            } else if (target < midElement) {
                // 需要扔掉右边 [midIndex, ...)
                // highIndex 是开区间，所以 = midIndex，但区间里没有 midIndex 对应的元素
                highIndex = midIndex;
            } else {
                // 需要扔掉左边 [..., midIndex]
                // lowIndex 是闭区间，所以 = midIndex + 1，区间里没有 midIndex 对应的元素
                lowIndex = midIndex + 1;
            }
        }

        // high - low <= 0 换言之 带查找区间内一个元素都没有了
        // 说明 target 不在 array 中
        return -1;
    }

    public static int binarySearch左闭右闭(long[] array, long target) {
        // [low, high]
        // 区间内元素个数 high - low + 1

        int low = 0;
        int high = array.length - 1;

        // high - low + 1 > 0
        // high - low > -1
        while (high - low >= 0) {
            int mid = (low + high) / 2;
            long element = array[mid];
            if (target == element) {
                return mid;
            } else if (target < element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
