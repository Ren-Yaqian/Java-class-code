package v1;

public class Teacher {
    // 在类中定义属性
    public String name;
    public int age;
    public String[] courseArray;     // 代码逻辑：教哪些课程

    // 在类中定义 普通方法
    public void 自我介绍() {
        // 在方法中可以直接使用属性
        // name 读取该对象中，属性 name 的值
        System.out.printf("我叫 %s，我今年 %d 岁，我教以下课程:\n", name, age);
        if (courseArray != null) {
            for (String course : courseArray) {
                System.out.println(course);
            }
        }
    }
}
