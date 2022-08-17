package solid.p3ls.solution;

public class AreaCalculation {

  public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(10, 5);
    System.out.printf("The rectangle area is: %s%n", rectangle.getArea());

    Square square = new Square(5, 5);
    System.out.printf("The square area is: %s%n", square.getArea());

    Parallelogram parallelogram;
    parallelogram = rectangle;
    System.out.printf("The parallelogram area is: %s%n", parallelogram.getArea());
    parallelogram = square;
    System.out.printf("The parallelogram area is: %s%n", parallelogram.getArea());
    parallelogram = new Square(1, 2);
    System.out.printf("The parallelogram area is: %s%n", parallelogram.getArea());
  }

}
