class WashingUpliquid implements Item{

private String name;
private int price;

public WashingUpliquid(String name, int price){
  this.name = name;
  this.price = price;
}

public String name(){
  return this.name;

}

public int price(){
  return this.price;
}


}