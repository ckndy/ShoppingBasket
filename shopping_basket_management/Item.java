package shopping_basket_management;

public class Item {

  private String name;
  private Double price;

  public Item(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name
  }

  public String setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return this.price;
  }

  public Double setPrice() {
    this.price = price;

  }
}