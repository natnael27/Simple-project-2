public class Main {
    public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Rectangle();
    shapes[1] = new Square();
    shapes[2] = new Circle();
    for (Shape shape : shapes) {
    shape.displayShapeName();
    }
    }
   }
   
