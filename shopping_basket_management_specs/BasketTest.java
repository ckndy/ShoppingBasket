import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import shopping_basket_management.*;

public class BasketTest {

  Customer customer;
  Basket basket;
  Item item1;
  Item item2;
  Item item3;
  Item item4;
  Item item5;

  @Before
  public void before() {
    // customer = new Customer();
    basket = new Basket();
    item1 = new Item("Uncharted 4: A Thief's End", 30);
    item2 = new Item("No Man's Sky", 30.00);
    item3 = new Item("FIFA 17", 30.00);
    item4 = new Item("Final Fantasy XV", 30.00);
    item5 = new Item("", 30.00);
    
  }

  @Test
  public void canCountItem() {
    assertEquals(5, basket.itemCount());
  }

  @Test
  public void canAddItem() {
    basket.addItem();
    assertEquals(1, basket.itemCount());
  }

  @Test
  public void canRemoveItem() {
    basket.addItem();
    basket.removeItem();
    assertEquals(0, basket.itemCount());
  }

  @Test
  public void canEmptyBasket() {
    basket.addItem();
    // basket.addItem();
    // basket.addItem();
    // basket.addItem();
    // basket.addItem();
    basket.empty();
    assertEquals(0, basket.itemCount());
  }

  // public void canGetTotalValue() {
  //   assertEquals(, basket.totalValue)
  // }
}

// // Apply discount
// // Get total value 
