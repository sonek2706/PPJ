package Taskz0903;

import java.util.Arrays;

public class Taskz0903 {

    public static Person[] sort(Person[] ps) {

        int i, j, min_idx;
        for (i = 0; i < ps.length - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < ps.length; j++) {
                if (ps[j].compareTo(ps[min_idx]) < 0)
                    min_idx = j;
            }

            Person tmp = ps[min_idx];
            ps[min_idx] = ps[i];
            ps[i] = tmp;
        }

        return ps;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Son", 19);
        Person p2 = new Person("Linh", 17);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.compareTo(p2));


        Person[] ps = new Person[]{p1,p2,new Person("Kuba", 27)};
        System.out.println("Before: ");

        System.out.println(Arrays.toString(ps));
        sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}
