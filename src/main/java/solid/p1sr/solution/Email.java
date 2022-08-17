package solid.p1sr.solution;

import lombok.Getter;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Getter
@Setter
public class Email {
  private String address;

  public boolean isInvalid() {
    return isBlank(address) || !address.contains("@");
  }
}
