package solid.p5di.solution;

import lombok.Getter;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Getter
@Setter
public class RegistrationCode implements Validator {
  private String code;

  @Override
  public boolean isInvalid() {
    return isBlank(code) || code.length() != 11;
  }
}
