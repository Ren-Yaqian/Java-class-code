package v1;

import v1.MyDate;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate to = new MyDate();
        to.year = 2021;
        to.month = 1;
        to.day = 20;

        MyDate from = new MyDate();
        from.year = 2014;
        from.month = 8;
        from.day = 18;

        // 计算相差多少天
        int days = to.相差天数(from);
        System.out.println(days);
    }
}
