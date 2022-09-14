package solid.p5di.violation;

import lombok.Getter;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Getter
@Setter
public class RegistrationCode {
  private String code;

  public boolean isInvalid() {
    return isBlank(code) || code.length() != 11;
  }
}
