package Taskz1001;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person("Son", 2002);
        Person p2 = new Person("Tung", 1994);
        Person p3 = new Person("Janek");

        System.out.println(p1.getName());
        System.out.println(p1.getBirthYear());
        System.out.println(p1.isFemale());
        System.out.println(Person.getOlder(p1,p2));
        System.out.println(p1.isYounger(p2));
//        System.out.println(p1.isFemale());
//        System.out.println(p3.isFemale());
//        System.out.println(Person.getOlder(p1,p2));
//        System.out.println(p1.isYounger(p2));
//        System.out.println(Person.getOldest(new Person[]{p1,p2,p3}));
//        System.out.println(Person.getYoungestFemele(new Person[]{p1,p2,p3}));
//        System.out.println(Person.getYoungestFemele(new Person[]{p1,p2,p3, new Person("Linda", 2000)}));
    }
}
