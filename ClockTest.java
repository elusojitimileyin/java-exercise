public class ClockTest{

public static void main(String[]args){

Clock myClock = new Clock(0, 0, 0);

     System.out.println("Initial time:");
        myClock.displayTime();


  myClock.setHour(58);
        myClock.setMinute(12);
        myClock.setSecond(455);

        System.out.println("\nAfter setting new values:");
         myClock.displayTime();

  myClock.setHour(2);
        myClock.setMinute(12);
        myClock.setSecond(40);

        System.out.println("\nAfter setting new values:");
         myClock.displayTime();


} 

}