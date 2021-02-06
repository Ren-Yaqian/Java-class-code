package v2;

public class Teacher {
    public String name;
    public int age;
    public String[] courseArray;

    // 定义一个构造器
    // 构造方法重载 —— 方法名一样，形参列表不同
    // 1
    public Teacher() {
        // 在一个构造方法中调用另一个构造方法（在重载的关系）
        // 能不能调用 4 构造方法 v2.Teacher(String name, int age, String[] courseArray)
        // 构造方法(null, 0, null);
//        name = null;
//        age = 0;
//        courseArray = null;

        // this 在这里看作方法名 —— 代表构造方法
        // 如果要使用这种用法，这句话必须是构造方法的第一条语
        this(null); // 调用 2
    }

    // 2
    public Teacher(String name) {
        this(name, 0);  // 调用 3
//        this.name = name;
//        this.age = 0;       // age = 0
//        this.courseArray = null;    // courseArray  null
    }

    // 3
    public Teacher(String name, int age) {
        this(name, age, null);  // 调用 4
//        this.name = name;
//        this.age = age;
//        this.courseArray = null;    // 重复工作了
    }

    // 4
//    public v2.Teacher(String a, int b, String[] c) {
//        name = a;
//        age = b;
//        courseArray = c;
//    }
    public Teacher(String name, int age, String[] courseArray) {
        // name 代表的是属性 OR 形参 —— 形参（就近原则）
//        name = name;
//        age = age;
//        courseArray = courseArray;
//        // 形参 形参
        this.name = name;
        this.age = age;
        this.courseArray = courseArray;

        // 左边：属性（大名），通过 this 引用找到对象中的属性
        // 右边：就近原则，形参
    }
}
