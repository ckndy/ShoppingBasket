import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import shopping_basket_management.*;

public class ItemTest {

  Item item1;
  Item item2;
  Item item3;
  Item item4;
  Item item5;
  
  @Before 
  public void before() {
    item1 = new Item("Uncharted 4: A Thief's End", 30);
    item2 = new Item("No Man's Sky", 30.00);
    item3 = new Item("FIFA 17", 30.00);
    item4 = new Item("Final Fantasy XV", 30.00);
    item5 = new Item("Overw", 30.00);
  }

  @Test
  public void canGetName() {
    assertEquals("Final Fantasy XV", item.getName());
  }

  // @Test
  // public void canSetName() {
  //   item.setName("Final Fantasy XV");
  //   assertEquals("Final Fantasy XV", item.getName());
  // }

  @Test
  public void canGetPrice() {
    assertEquals(30.00, item.getPrice());
  }

  // @Test
  // public void canSetPrice() {
  //   item.setPrice(30.00);
  //   assertEquals(30.00, item.getPrice);
  // }

  // @Test
  // public void canGetBogof() {
  //   item.getBogof(true);
  //   assertEquals(true, item.getBogof());
  // }
}
