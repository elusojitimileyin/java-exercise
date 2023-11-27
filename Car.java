public class Car{
   private String model;
   private String year;
   private double price;

public Car(String model,String year, double price){
this.model = model;
this.year = year;
this.price = price;
}
public void setModelName(String modelName){
this.model = modelName;
}
public String getModelName(){
return model;
}

public void setYearName(String yearName){
this.year = yearName;
}
public String getYearName(){
return year;
}

public void setDoublePrice(double price){
this.price = price;
}
public double getDoublePrice(){
return price;
}

public double getDoublePrice1(){
double price1 = price * 0.07;
return price1;
}
public double getDoublePrice2(){
double price2 =price * 0.05;
return price2;
}
}