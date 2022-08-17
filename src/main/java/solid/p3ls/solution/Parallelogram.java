package solid.p3ls.solution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parallelogram {
  private double height;
  private double width;

  public Parallelogram() {
  }

  public Parallelogram(double height, double width) {
    setHeight(height);
    setWidth(width);
  }

  public double getArea() {
    return height * width;
  }
}
