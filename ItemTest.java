import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest {

Item item;

@Before
public void before(){
  item = new Item ("Washing Up Liquid", 250);
}

@Test
public void hasName(){
  assertEquals("Washing Up Liquid", item.getName());
}

@Test
public void hasPrice(){
  assertEquals(250, item.getPrice());
}


}