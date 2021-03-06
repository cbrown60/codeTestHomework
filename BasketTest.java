import static org.junit.Assert.*;
import org.junit.*;

public class BasketTest {
Basket basket;
WashingUpLiquid washingUpliquid;

@Before
public void before(){
  basket = new Basket();
  washingUpliquid = new WashingUpLiquid("Daz", 250, true);

}

@Test
public void basketStartsEmpty(){
  assertEquals(0, basket.basketCount());
}

@Test 
public void canAddToBasket(){
basket.addToBasket(washingUpliquid);
assertEquals(1, basket.basketCount());
}

@Test
public void canEmptyBasket(){
  basket.addToBasket(washingUpliquid);
  basket.emptyTheBasket();
  assertEquals(0,basket.basketCount());
}

@Test
public void canRemoveItemFromBasket(){
  basket.addToBasket(washingUpliquid);
  basket.removeItemFromBasket(washingUpliquid);
  assertEquals(0, basket.basketCount());
}

@Test 

public void totalPriceOfBasket(){
  basket.addToBasket(washingUpliquid);
  basket.addToBasket(washingUpliquid);
  assertEquals(500, basket.totalPrice());
}

@Test 
public void containsThatItem(){
  basket.addToBasket(washingUpliquid);
  assertEquals("Hello", basket.containsTheItem());
}

@Test
public void checkMoreThanOne(){
  basket.addToBasket(washingUpliquid);
  basket.addToBasket(washingUpliquid);
  assertEquals(2, basket.moreThanOnce(washingUpliquid));
}

@Test
public void checkFinalPriceIsRight(){
  basket.addToBasket(washingUpliquid);
  basket.addToBasket(washingUpliquid);
  assertEquals(250, basket.bogof(washingUpliquid));
}



}