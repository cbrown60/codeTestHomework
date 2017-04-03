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

public String containsTheItem(){
 if (cart.contains ("washing up liquid"));
      return "Hello";
  
}

public String containsTheItem(Item product){
 if (cart.contains (product));
      return "Hello";
  
}


public int moreThanOnce(Item items) 
{
    int count = 0;

    for (Item item : cart){
      if(items.name() == item.name())
      count = count + 1;
    }

    return count;
}


public int bogof(Item items){

int finalPrice = totalPrice() - items.price();
if((moreThanOnce(items) == 2) && items.bogof() == true)
return finalPrice;
else if ((moreThanOnce(items) % 2 == 1) && items.bogof() == true)
return finalPrice;
else
return totalPrice();

}

public int tenPercentOff(){
  
}


}