package Taskz1201;

public class Task {
    private String descr;
    private Task next;

    public Task(String d, Task n) {
        this.descr = d;
        this.next = n;
    }

    public Task(String d) {
        this(d, null);
    }

    public void printTasks() {
        Task tmp = this;
        while (tmp.next != null) {
            System.out.print(tmp.descr + " ");
            tmp = tmp.next;
        }

        System.out.print(tmp.descr);
    }

    public static void printTasks(Task head) {
        Task tmp = head;
        while (tmp.next != null) {
            System.out.print(tmp.descr + " ");
            tmp = tmp.next;
        }

        System.out.print(tmp.descr);
    }

    public void printTasksRev() {

        if (this.next == null) {
            System.out.print(this.descr + " ");
            return;
        }
        else {
            this.next.printTasksRev();
            System.out.print(this.descr + " ");
        }
    }

    public static void printTasksRev(Task head) {
        if (head.next == null) {
            System.out.print(head.descr + " ");
            return;
        }
        else {
            Task.printTasksRev(head.next);
            System.out.print(head.descr + " ");
        }
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Task getNext() {
        return next;
    }

    public void setNextTask(Task next) {
        this.next = next;
    }
}
