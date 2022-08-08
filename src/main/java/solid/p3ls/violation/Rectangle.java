package solid.p3ls.violation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {

  private double height;
  private double width;

  public Rectangle(double height, double width) {
    setHeight(height);
    setWidth(width);
  }

  public double getArea() {
    return height * width;
  }

}
