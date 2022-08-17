package solid.p1sr.solution;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Costumer {

  private Long id;
  private String name;
  private Email email;
  private Phone phone;
  private LocalDate birthday;
  private RegistrationCode registration;

  public boolean isInvalid() {
    return email.isInvalid() || phone.isInvalid() || registration.isInvalid();
  }
}