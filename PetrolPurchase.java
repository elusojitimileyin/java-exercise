public class PetrolPurchase {
  private String stationLocation;
  private String petrol;
  private int quantity;
  private double pricePerLiter;
  private double percentageDiscount;

public PetrolPurchase(String stationLocation, String petrol, int quantity,double pricePerLiter, double percentageDiscount){
this.stationLocation= stationLocation;
this.petrol = petrol;
this.quantity = quantity;
this.pricePerLiter = pricePerLiter;
this.percentageDiscount = percentageDiscount;
}
public void setStationLocation(String stationLocation){
this.stationLocation= stationLocation;
}
public String getStationLocation(){
return stationLocation;
}

public void setPetrol(String petrol){
this.petrol= petrol;
}
public String getPetrol(){
return petrol;
}

public void setQuantity( int quantity){
this.quantity = quantity;
}
public int getQuantity(){
return quantity;
}

public void setPricePerLiter(double pricePerLiter){
this.pricePerLiter = pricePerLiter;
}
public double getPricePerLiter(){
return pricePerLiter;
}

public void setPercentageDiscount(double percentageDiscount){
this.percentageDiscount = percentageDiscount;
}
public double getPercentageDiscount(){
return percentageDiscount;
}
public double getAmount(){
double amount=(quantity*pricePerLiter)-(percentageDiscount/100);

return amount;
}

}