import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BasketTest {

  Customer customer;
  Basket basket;
  Item item;

  @Before
  public void before() {

    customer = new Customer();
    basket = new Basket();
    item = new item("Final Fantasy XV", 30.00);
  }

  @Test
  public void canAddItem() {
    basket.addItem(item);
    assertEquals(1, basket.itemCount());
  }

  @Test
  public void canRemoveItem() {
    basket.remove(item);
    assertEquals(1, basket.itemCount());
  }

  @Test
  public void canEmptyBasket() {
    basket.empty();
    assertEquals(0, basket.itemCount());
  }

// Apply discount
// Get total value 
