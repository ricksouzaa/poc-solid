package solid.p5di.solution;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class CostumerServiceTest {

  private Repository<Costumer> repository;
  @Mock
  private EmailSender sender;

  private ICostumerService service;

  @Test
  void test() {
    repository = new CostumerMySqlRepository();
    service = new CostumerService(repository, sender);
  }
}