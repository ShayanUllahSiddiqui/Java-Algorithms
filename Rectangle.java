public class Rectangle {

    int length;
    int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void printArea() {
        System.out.println("Area = " + length * breadth);
    }

    public void printPerimeter() {
        System.out.println("Perimeter = " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    public Square(int edge) {
        super(edge, edge);
    }
}

class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 7);
        System.out.println("\nArea And Perimeter Of Rectangle:");
        rectangle.printArea();
        rectangle.printPerimeter();


        Square square = new Square(6);
        System.out.println("\nArea And Perimeter Of Square:");
        square.printArea();
        square.printPerimeter();
        
    }
}