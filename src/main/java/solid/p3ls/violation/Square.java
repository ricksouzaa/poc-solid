package solid.p3ls.violation;

public class Square extends Rectangle {

  public Square(double height, double width) {
    super(height, width);
  }

  @Override
  public void setHeight(double height) {
    super.setHeight(height);
    super.setWidth(height);
  }

  @Override
  public void setWidth(double width) {
    super.setHeight(width);
    super.setWidth(width);
  }

}
