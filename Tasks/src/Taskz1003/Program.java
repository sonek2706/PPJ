package Taskz1003;

public class Program {
    public static void main(String[] args) {
        SortedSLL list = new SortedSLL();
        list.addSorted(4);
        list.addSorted(1);
        list.addSorted(6);
        list.addSorted(3);

        list.show();
    }
}
