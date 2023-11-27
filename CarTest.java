public class CarTest{
 public static void main(String[]args){
  Car car1 = new Car("Volvo","2023", 5.0);
  Car car2 = new Car("BMW","20213", 3.0);

System.out.println("sas" + car1.getModelName());
System.out.println("sas" + car1.getYearName());
System.out.println("sas" + car1.getDoublePrice());

System.out.println("sys" + car2.getModelName());
System.out.println("sys" + car2.getYearName());
System.out.println("sys" + car2.getDoublePrice());


System.out.println("sas" + car1.getDoublePrice1());
System.out.println("sys" + car2.getDoublePrice2());
}

}
 