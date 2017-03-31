import java.util.*;
public class Basket {

private ArrayList<Item> cart;

public Basket(){
  this.cart = new ArrayList<Item>();
}

public int basketCount(){
  return cart.size();
}

public void addToBasket(Item product){
  cart.add(product);
}

public void emptyTheBasket(){
  cart.clear();
}

public void removeItemFromBasket(Item product){
 cart.remove(product);
}

public int totalPrice(){
  int counter = 0;

  for(Item item : cart){
    counter = counter + item.price();
  }
  return counter;
}

}