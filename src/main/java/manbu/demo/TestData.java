package manbu.demo;

/**
 * Created by manbu on 12/12/16.
 */
public class TestData {

    public static Person[] getData() {

        //年龄，班级，姓名

        Person p1 = new Person(20, 2, "张伟");
        Person p2 = new Person(20, 4, "王伟");
        Person p3 = new Person(20, 3, "张敏");
        Person p4 = new Person(20, 1, "刘伟");
        Person p5 = new Person(21, 2, "李伟");
        Person p6 = new Person(21, 1, "刘波");
        Person p7 = new Person(21, 3, "李刚");
        Person p8 = new Person(21, 2, "李海");
        Person p9 = new Person(22, 4, "张勇");
        Person p10 = new Person(22, 1, "王军");
        Person p11 = new Person(22, 2, "王芳");
        Person p12 = new Person(22, 4, "李娜");
        Person p13 = new Person(22, 2, "李静");
        Person p14 = new Person(23, 3, "王静");
        Person p15 = new Person(23, 1, "王秀英");
        Person p16 = new Person(23, 4, "王宁");
        Person p17 = new Person(23, 1, "赵秀");

        return new Person[] { p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17 };
    }

}
