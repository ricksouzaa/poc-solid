package solid.p5di.solution;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CostumerServiceTest {

  @Mock
  private Repository<Costumer> repository;
  @Mock
  private EmailSender sender;

  @InjectMocks
  private ICostumerService service;

  @Test
  void test() {
  }
}