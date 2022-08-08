package solid.p3ls.violation;

public class AreaCalculation {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10, 5);
    System.out.printf("The rectangle area is: %s%n", rectangle.getArea());

    rectangle = new Square(10, 5);
    System.out.printf("The rectangle area is: %s%n", rectangle.getArea());
  }

}
