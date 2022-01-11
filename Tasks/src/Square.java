public class Square {

    private double length = 1;

    public Square(double length) {
        this.length = length;
    }

    public Square() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * length;
    }

    public double getDiagonal() {
        return length * Math.sqrt(2);
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public Square getDoubled() {
        return new Square(2 * length);
    }

    public static double getTotalArea(Square[] sqs) {
        double sum = 0;
        for (Square sq : sqs) {
            sum += sq.getArea();
        }

        return sum;
    }

    public static Square getMax(Square[] sqs) {
        Square max = new Square(1);
        for (Square sq : sqs) {
            if (sq.length > max.length) max = sq;
        }

        return max;
    }

    @Override
    public String toString() {
        return "Square[" + this.getLength() + "]";
    }

    public static void main(String[] args) {
        Square s2 = new Square(2);
        Square s1 = new Square();

        System.out.println(s2 + " " + s1);
        System.out.println("Side    " + s2.getLength());
        System.out.println("Area    " + s2.getArea());
        System.out.println("Diag    " + s2.getDiagonal());
        System.out.println("Perim   " + s2.getPerimeter());
        System.out.println("Doubled " + s2.getDoubled());

        Square[] sqs = {s1, s2, new Square(3)};
        System.out.println("Total area: " + Square.getTotalArea(sqs));
        System.out.println("Greatest  : " + getMax(sqs));
    }
}
