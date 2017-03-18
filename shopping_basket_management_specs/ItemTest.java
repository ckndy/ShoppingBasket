import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

  Item item;
  
  @Before 
  public void before() {
    item = new Item("Final Fantasy XV", 30.00);
  }

  @Test
  public void canGetName() {
    assertEquals("Final Fantasy XV", item.getName());
  }

  @Test
  public void canGetPrice() {
    assertEquals(30.00, item.getPrice());
  }

  @Test
  public void canSetPrice() {
    item.setPrice(30.00);
    assertEquals(30.00, item.getPrice);
  }

  @Test
  public void canGetBogof() {
    item.getBogof(true);
    assertEquals(true, item.getBogof());
  }
}
