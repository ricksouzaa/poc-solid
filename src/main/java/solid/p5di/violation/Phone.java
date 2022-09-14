package solid.p5di.violation;

import lombok.Getter;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Getter
@Setter
public class Phone {
  private String number;

  public boolean isInvalid() {
    return isBlank(number);
  }
}
