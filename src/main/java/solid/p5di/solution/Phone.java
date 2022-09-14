package solid.p5di.solution;

import lombok.Getter;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Getter
@Setter
public class Phone implements Validator {
  private String number;

  @Override
  public boolean isInvalid() {
    return isBlank(number);
  }
}
