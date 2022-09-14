package solid.p5di.solution;

import lombok.Getter;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Getter
@Setter
public class Email implements Validator {
  private String address;

  @Override
  public boolean isInvalid() {
    return isBlank(address) || !address.contains("@");
  }
}
