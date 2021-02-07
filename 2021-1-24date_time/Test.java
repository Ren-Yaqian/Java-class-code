package date_time;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyDateTime datetime = new MyDateTime(2021, 12, 31, 23, 59, 53);


        while (true) {
            System.out.println(datetime);
            datetime.next();
            TimeUnit.SECONDS.sleep(1);  // 让代码停顿 1 秒
        }
    }
}
