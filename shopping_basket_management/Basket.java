package shopping_basket_management;
import java.util.ArrayList;

public class Basket {

  private ArrayList<Item> item;

  public Basket() {
    this.item = new ArrayList<Item>();
  }

  public ArrayList<Item> getItem() {
    return this.item;
  }

  public int itemCount() {
    return item.size();
  }

  public void addItem() {
    basket.addItem();
  }

  public void removeItem() {
    basket.removeItem();
  }

  public void emptyBasket() {
    basket.clear();
  }

  // public void applyDiscount() {

  // }

  // public void totalValue() {

  }
}


  


