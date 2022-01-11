package Taskz0903;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    public int compareTo(Person p) {
        return this.age-p.getAge();
//        if (this.age == p.age) return 0;
//        else if (this.age > p.age) return 1;
//        else return -1;
    }
}
