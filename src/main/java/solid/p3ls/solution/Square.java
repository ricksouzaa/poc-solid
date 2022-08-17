package solid.p3ls.solution;

public class Square extends Parallelogram {
  public Square(double height, double width) {
    super();
    if (height != width) {
      throw new IllegalArgumentException("Invalid square size");
    }
    setHeight(height);
    setWidth(width);
  }
}
