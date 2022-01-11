package Taskz1002;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle (Square sq){
        this.radius = Math.sqrt(sq.getArea()/Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public static Square[] getSquares(Circle[] arr){
        Square[] res = new Square[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = new Square(arr[i]);
        }

        return res;
    }


    @Override
    public String toString(){
        return "Circle[" + radius + "]  ";
    }
}
