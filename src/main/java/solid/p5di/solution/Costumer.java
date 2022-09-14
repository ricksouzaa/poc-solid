package solid.p5di.solution;

import lombok.Getter;
import lombok.Setter;
import solid.p5di.violation.Email;
import solid.p5di.violation.Phone;
import solid.p5di.violation.RegistrationCode;

import java.time.LocalDate;

@Getter
@Setter
public class Costumer implements Validator {

  private Long id;
  private String name;
  private Email email;
  private Phone phone;
  private LocalDate birthday;
  private RegistrationCode registration;

  @Override
  public boolean isInvalid() {
    return email.isInvalid() || phone.isInvalid() || registration.isInvalid();
  }
}