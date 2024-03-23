abstract class Shape {
    public abstract void displayShapeName();
   }
   class Rectangle extends Shape {
    @Override
    public void displayShapeName() {
    System.out.println("Rectangle");
    }
   }
   class Square extends Shape {
    @Override
    public void displayShapeName() {
    System.out.println("Square");
    }
   }
   class Circle extends Shape {
    @Override
    public void displayShapeName() {
    System.out.println("Circle");
    }
   }