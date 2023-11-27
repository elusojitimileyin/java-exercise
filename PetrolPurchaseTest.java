public class PetrolPurchaseTest{

public static void main(String[] args){

PetrolPurchase petrol = new PetrolPurchase("hi","yes", 1, 14,10.0);

System.out.println("the Station Location " + petrol.getStationLocation());
System.out.println("the Petrol name " + petrol.getPetrol());
System.out.println("the Quantity" + petrol.getQuantity());
System.out.println("the PricePerLiter" + petrol.getPricePerLiter());
System.out.println("the PercentageDiscount" + petrol.getPercentageDiscount());
System.out.println("the net amount is " + petrol.getAmount());



}


}