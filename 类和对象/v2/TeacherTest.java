package v2;

import java.util.Arrays;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher a = new Teacher();  // 1 构造
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(Arrays.toString(a.courseArray));
        System.out.println("==================================");

        Teacher b = new Teacher("陈沛鑫"); // 2 构造
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(Arrays.toString(b.courseArray));
        System.out.println("==================================");

        Teacher c = new Teacher("陈沛鑫", 35); // 3 构造
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(Arrays.toString(c.courseArray));
        System.out.println("==================================");

        Teacher d = new Teacher(
                "陈沛鑫",
                35,
                new String[] { "JavaSE", "数据结构" }
        );  // 4 构造

        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(Arrays.toString(d.courseArray));
    }
}
