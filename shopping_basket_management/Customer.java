package shopping_basket_management;

public class Customer {
  
  private String name;
  private String basket;
  private boolean loyaltyCard;

  public Customer(String name, String basket, boolean loyaltyCard) {
    this.name = name;
    this.basket = basket;
    this.loyaltyCard = loyaltyCard;
  }

  public String getName() {
    return this.name;
  }

  public String setName(String name) {
    this.name = name;
  }

  public String getBasket() {
    return this.basket;
  }

  public String setBasket() {
    this.basket = basket;
  }

  public boolean hasLoyaltyCard() {
    return this.loyaltyCard;
  }
}
