package Taskz1103;

public class Car {
    private String name;
    private int price;
    private Car next;

    public Car(String name, int price, Car next){
        this.name = name;
        this.price = price;
        this.next = next;
    }

    public Car(String name, int price){
        this(name, price, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car getNext() {
        return next;
    }

    public void setNext(Car next) {
        this.next = next;
    }

    public void showCars() {
        Car tmp = this;
        while (tmp.next != null) {
            System.out.print(tmp);
            tmp = tmp.next;
        }

        System.out.print(tmp);
    }


    public void showCarsReve(Car t) {
        if (t.next == null) {
            System.out.print(t);
            return;
        }

        showCarsReve(t.next);
        System.out.print(t);
    }


    public void showCarsRev() {
        showCarsReve(this);
    }

    @Override
    public String toString(){
        return this.name + "(" + this.price + ")";
    }
}
