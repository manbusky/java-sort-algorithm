package manbu.demo;

/**
 * Created by manbu on 12/12/16.
 */
public class Person implements Comparable<Person> {

    private int age;
    private int classId;
    private String name;

    public Person(int age, int classId, String name) {
        this.age = age;
        this.classId = classId;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "classId=" + classId +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getClassId(), o.getClassId());
    }
}
