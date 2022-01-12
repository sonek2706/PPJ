package Taskz1202;

public class StudNode {
    Student s;
    StudNode next;

    public StudNode(Student s, StudNode next){
        this.s = s;
        this.next = next;
    }

    public StudNode(Student s){
        this(s, null);
    }

}
