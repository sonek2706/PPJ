public class Taskz0901{

    public static Square func(Square sq1, Square sq2){
        Square sq3 = new Square(Math.sqrt(sq1.getArea() + sq2.getArea()));
        return sq3;
    }

    public static void main(String[] args) {
        Square square1 = new Square(5);
        Square square2 = new Square(5);

        Square square3 = func(square1,square2);
        System.out.println("Reference: " + square3 + " \nlength: " + square3.getLength() + "\nArea: " + square3.getArea());
    }
}

