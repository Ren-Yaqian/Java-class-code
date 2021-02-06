package v1;

import v1.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        // 构造对象，并且得到 a 引用，用于以后操作对象
        Teacher a = new Teacher();

        // 通过 a 引用，为对象的属性进行赋值操作
        a.name = "陈沛鑫";
        a.age = 35;
        a.courseArray = new String[] { "JavaSE", "数据结构" };

        // 通过 a 引用，调用属于该对象的方法
        a.自我介绍();

        // 再来一个新的老师
        Teacher b = new Teacher();
        b.name = "王海斌";
        b.age = 33;
        b.courseArray = new String[] { "JavaSE", "C++", "Linux" };

        b.自我介绍();
    }
}
