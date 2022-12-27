package Homework16;
import static Homework16.ValidateUtils.validateString;

public class Bus extends Transport {
    public Bus(String brand,String model,Integer year,String country,String color,Integer MaximumMovementSpeed){
        super(brand,model,year,country,color,MaximumMovementSpeed);}
    @Override
    void refill(String fuel){ System.out.println(" The bus will be refueled with "+ validateRefillTupe(fuel));}
    public static String validateRefillTupe(String value){
        if (validateString(value)&&(value.equals("diesel")||value.equals("petrol"))){
            return value;
        }else {
            return "diesel";
        }
    }

    @Override
    public String toString() {
        return "Bus{"+
                "brand='"+getBrand()+'\''+
                ",model='"+getModel()+'\''+
                ",yar="+getYear()+
                ",country+'"+getCountry()+'\''+
                ",color+'"+getColor()+'\''+
                ",maximumMovementSpeed="+getMaximumMovementSpeed()+
                ",fuel='"+getFuel()+'\''+
                '}';
    }




}
