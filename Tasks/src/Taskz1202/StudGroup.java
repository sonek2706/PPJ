package Taskz1202;

public class StudGroup {
    private String name;
    private StudNode head;

    public StudGroup(String name, StudNode head){
        this.name = name;
        this.head = head;
    }

    public StudGroup(String name){
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudNode getHead() {
        return head;
    }

    public void setHead(StudNode head) {
        this.head = head;
    }

    void addFront(Student s){
        StudNode h = new StudNode(s, this.head);
        this.head = h;
    }

    void addFront(String name){
        Student tmp = new Student(name);
        StudNode h = new StudNode(tmp, this.head);
        this.head = h;
    }

    void addBack(Student s){

        StudNode tmp = this.head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp = tmp.next;

        tmp.next = new StudNode(s,null);
    }

    void addBack(String name){

        StudNode tmp = this.head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp = tmp.next;

        Student s = new Student(name);
        tmp.next = new StudNode(s,null);
    }

    public int count(){
        int counter = 0;
        StudNode tmp = this.head;
        while(tmp.next!=null){
            counter++;
            tmp = tmp.next;
        }

        return ++counter;
    }

    public boolean isWithId(int id){

        StudNode tmp = this.head;
        while(tmp.next!=null){
            if (tmp.s.getId() == id) return true;
            tmp = tmp.next;
        }

        return false;
    }

    public Student[] getStudsWithName(String name){
        StudNode tmp = this.head;

        int counter = 0;
        while(tmp.next != null){
            if (tmp.s.getName() == name){
                counter++;
            }
        }


    }
}
