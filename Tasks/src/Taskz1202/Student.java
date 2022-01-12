package Taskz1202;

public class Student {
    public static int counter = 0;
    private int id;
    private String name;

    public Student(String name){
        this.id = ++counter;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }
}
