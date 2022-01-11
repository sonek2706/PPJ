package Taskz1002;

public class Square {
    private double length;

    public Square (double length){
        this.length = length;
    }

    public Square (Circle c){
        this.length = Math.sqrt(c.getArea());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*length;
    }

    public double getPerimeter(){
        return 4*length;
    }

    public Circle getInscribedCircle(){
        return new Circle(length/2);
    }

    public Circle getCircumscribedCircle(){
        return new Circle(Math.sqrt(2)*length/2);
    }

    @Override
    public String toString(){
        return "Square[" + length + "]";
    }
}
