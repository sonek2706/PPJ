package Taskz1202;

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student("Ala");
        Student s2 = new Student("Ma");
        Student s3 = new Student("Kota");

        StudNode s = new StudNode(s1, new StudNode(s2, new StudNode(s3)));
        StudGroup sg = new StudGroup("Group 1", s);

        sg.addFront("Siema");
        sg.addBack("Lol");
        System.out.println(sg.getHead().s.getName());
        System.out.println(sg.count());
        System.out.println(sg.isWithId(2));
        System.out.println(sg.isWithId(10));


    }
}
