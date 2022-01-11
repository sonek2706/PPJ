package Taskz0904;

public class Person {
    private String name;
    private Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Person(String name) {
        this.name = name;
        this.car = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public static Car[] getCars(Person[] ps) {
        int length = 0;
        for (int i = 0; i < ps.length; i++) {
            if (ps[i].car != null) length++;
        }

        Car[] result = new Car[length];
        int j = 0;
        for (int i = 0; i < ps.length; i++) {
            if (ps[i].car != null) {
                result[j] = ps[i].getCar();
                j++;
            }
        }

        return result;
    }

    public static Car[] expensiveCars(Person[] ps, int price_min) {

        int j = 0;
        for (Car c : Person.getCars(ps)) {
            if (c.getPrice() > price_min) {
                j++;
            }
        }

        Car[] result = new Car[j];
        j = 0;
        for (Car c : Person.getCars(ps)) {
            if (c.getPrice() > price_min) {
                result[j] = c;
                j++;
            }
        }

        return result;
    }

    public static int getPrice(Person[] ps, String name) {
        for (Person p : ps) {
            if (p.getName() == name) {
                if (p.car != null) return p.car.getPrice();
                else return -1;
            }
        }

        return -2;
    }
}
