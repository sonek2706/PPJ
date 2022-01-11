package Taskz1001;

public class Person{
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this(name, 1990);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isFemale(){
        return name.charAt(name.length()-1) == 'a';
    }

    public static Person getOlder(Person p1, Person p2){
        return (p1.birthYear < p2.birthYear)?p1:p2;
    }

    public boolean isYounger(Person p){
        return (birthYear > p.birthYear)?true:false;
    }

    public static Person getOldest(Person[] ps){
        Person oldest = ps[0];
        for (Person p: ps) {
            if (oldest.birthYear > p.birthYear) oldest = p;
        }
        return oldest;
    }

    public static Person getYoungestFemele(Person[] ps){
        Person youngestFemale = ps[0];
        for (Person p: ps) {
            if (p.isFemale() && (p.birthYear >= youngestFemale.getBirthYear() || !youngestFemale.isFemale())) youngestFemale = p;
        }

        return youngestFemale.isFemale()?youngestFemale:null;
    }

    @Override
    public String toString(){
        return "[" + name + ", " + birthYear + "]";
    }
}
