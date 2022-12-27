package Homework16;


import java.security.Key;
import java.time.LocalDate;
import java.util.regex.Pattern;

import static Homework16.ValidateUtils.validateBoolean;
import static Homework16.ValidateUtils.validateString;
public class Car extends Transport{
   private String bodyType;
   private boolean isSummerRubber;
   private String transmission;
   private String number;
   private final int seatCount;
   private double enginePower;
   private Key key;
   private Insurance insurance;

   public Car(String brand,String model,Integer year,String country,String color,String bodyType,boolean isSummerRubber,String transmission,String number,int seatCount,double enginePower,Integer maxSpeed,String refillType){
      super(brand,model,year,country,color,maxSpeed);

      bodyType=validateCarParameters(bodyType);
      this .isSummerRubber=isSummerRubber;
      this .transmission=validateTransmission(transmission);
      this .number=validateCarNumber(number);
      this.seatCount =validateSeatCount(seatCount);
      this .enginePower=validateEngine(enginePower);
   }

   public String getBodyType() {
      return bodyType;
   }

   public boolean isSummerRubber() {
      return isSummerRubber;
   }



   public String getTransmission() {
      return transmission;
   }

   public void setTransmission(String transmission) {
      this.transmission = transmission;
   }

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public int getSeatCount() {
      return seatCount;
   }
   public void setSummerRubber(boolean summerRubber){
      isSummerRubber=summerRubber;
   }

   public double getEnginePower() {
      return enginePower;
   }

   public void setEnginePower(double enginePower) {
      this.enginePower = enginePower;
   }
   public void setKey(Key key) {
      this.key = key;
   }
   public void setInsurance(Insurance insurance) {
      this.insurance = insurance;}
   public void switchRubber(){setSummerRubber(!this.isSummerRubber);}

  // validation
public String validateCarNumber(String number){
      if (Pattern.matches("[a-я][0-9]{3}[а-я]{2}[0-9]{3}",number)){
         return number;
      }else {
         System.out.println("номер некорректный");
         return "неверный номер";
      }
}
   public int validateSeatCount(int seatCount ){ return seatCount<=0?4:seatCount;}
   public static double validateEngine( double value){return value<=0?1.5:value;}
   public static String validateCarParameters(String value){return value==null?"не указано":value;}
   public static String validateRefillType(String value){
      if (validateString(value)&&(value.equals("electricity")||value.equals("petrol")||value.equals("disel"))){
         return value;}else {
         return "petrol";
      }
   }
   public static String validateTransmission(String value){ return validateString(value,"автомат");}
   @Override
   void refill(String fuel){ System.out.println("The Car will be refueled with"+ validateRefillType(fuel));}

   public class Key {
      private final Boolean remoteStart;
      private final Boolean keylessAccess;

      public Key(Boolean remoteStart, Boolean
      keylessAccess){
         this.remoteStart = validateBoolean(remoteStart);
         this.keylessAccess = validateBoolean(keylessAccess);
      }

      @Override
      public String toString() {
         return "Key" +
                 "remoteStart='" + remoteStart + '\'' +
                 ",keylessAccess='" + keylessAccess + '\'' +
                 '}';
      }
   }

   public class Insurance{
      private final LocalDate duration;
      private final double cost;
      private final String number;

      public Insurance( LocalDate duration,double cost,String number){
         this.duration=checkDuration(duration);
         this.cost=validateCost(cost);
         this.number=isValidSerialNumber(number)?number:"000000000";
      }
      public  double validateCost(double value){
         return value<=0?1000:value;}

      private boolean isValidSerialNumber(String number){
         if (Pattern.matches("[а-яА-Яa-zA-Z0-9]{9}",number)){
            return true;}else {
            System.out.println("номер некорректный");
            return false;}
      }

      public LocalDate checkDuration( LocalDate duration){
         if (LocalDate.now().isAfter(duration)){
            System.out.println("Страховка просрочена.Оформите новую");
            return LocalDate.now();
         }else {
            return duration;
         }
      }
   }
}
