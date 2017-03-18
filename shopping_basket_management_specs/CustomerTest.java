import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

  Customer customer;
  Basket basket;
  LoyaltyCard loyaltyCard;

  @Before
  public void before() {
    customer = new Customer("Chris");
    basket = new Basket();
    loyaltyCard = new LoyaltyCard();
  }

  @Test
  public void hasName() {
    assertEquals("Chris", customer.getName());
  }

  @Test
  public void hasLoyaltyCard() {
    assertEquals(true, customer.hasLoyaltyCard());
  }
}