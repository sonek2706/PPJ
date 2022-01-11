package Taskz1103;

import java.io.StringReader;

public class Person {
    private String name;
    private Car cars;

    public Person(String name, Car cars) {
        this.name = name;
        this.cars = cars;
    }

    public Person(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person buys(String make, int price) {
        Car car = new Car(make, price, this.cars);
        this.cars = car;

        return this;
    }

    public void showCars() {
        Car tmp = this.cars;
        while (tmp.getNext() != null) {
            System.out.print(tmp+ " ");
            tmp = tmp.getNext();
        }

        System.out.print(tmp+ " ");
    }

    public void showCarsReve(Car t) {
        if (t.getNext() == null) {
            System.out.print(t+ " ");
            return;
        }

        showCarsReve(t.getNext());
        System.out.print(t + " ");
    }

    public void showCarsRev() {
        showCarsReve(this.cars);
    }

    public int getTotalPrice(){
        int total = 0;
        Car tmp = this.cars;

        while (tmp.getNext() != null){
            total += tmp.getPrice();
            tmp = tmp.getNext();
        }

        total += tmp.getPrice();
        return total;
    }

    public boolean hasCar(String make){
        Car tmp = this.cars;
        while (tmp.getNext() != null){
            if (tmp.getName().equalsIgnoreCase(make)){
                return true;
            }

            tmp = tmp.getNext();
        }

        if (tmp.getName().equalsIgnoreCase(make)){
            return true;
        }

        return false;
    }

    public Car mostExpensive(){

        Car mostExpensive = null;
        int maxPrice = 0;
        Car tmp = this.cars;
        while (tmp.getNext() != null){
            if (tmp.getPrice() > maxPrice) {
                maxPrice = tmp.getPrice();
                mostExpensive = tmp;
            }

            tmp = tmp.getNext();
        }

        if (tmp.getPrice() > maxPrice) {
            maxPrice = tmp.getPrice();
            mostExpensive = tmp;
        }

        return mostExpensive;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
