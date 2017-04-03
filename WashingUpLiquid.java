class WashingUpLiquid implements Item{

private String name;
private int price;
private boolean bogof;

public WashingUpLiquid(String name, int price, boolean bogof){
  this.name = name;
  this.price = price;
  this.bogof = bogof;
}

public String name(){
  return this.name;

}

public int price(){
  return this.price;
}

public boolean bogof(){
  return this.bogof;
}





}