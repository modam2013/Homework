package Homework16;
import static Homework16.ValidateUtils.validateInteger;
import static Homework16.ValidateUtils.*;

public class Train extends Transport {
    private Integer travelTime;
    private String departure;
    private String destination;
    private Integer wagonsCount;

    public Train( String brand,String model,Integer year,String country,String color,Integer travelTime, String departure,String destination,Integer wagonsCount,Integer MaximumMovementSpeed){
        super(brand,model,year,country,color,MaximumMovementSpeed);
        this.travelTime=validateInteger(travelTime,60);
        this.departure=validateString(departure,"any station");
        this.destination=validateString(destination,"any station");
        this.wagonsCount=validateInteger( wagonsCount,2);
    }
    @Override
    void refill(String fuel ){ System.out.println(" The bus will be refueled with "+validateRefillTupe(fuel));}
    public static String validateRefillTupe(String value){
        if (validateString(value)&&value.equals("diesel")){
            return value;}else {
            return  "diesel";
        }
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getWagonsCount() {
        return wagonsCount;
    }

    public void setWagonsCount(Integer wagonsCount) {
        this.wagonsCount = wagonsCount;
    }
    @Override
    public String toString(){
        return "Train{"+
         "traveiTime="+travelTime+
           ",deparure='"+departure+'\''+
           ",destination='"+destination+'\''+
             ",wagonsCout="+wagonsCount+
                ",brand='"+getBrand()+'\''+
                ",model='"+getModel()+'\''+
           ",year="+getYear()+
          ",country='"+getCountry()+'\''+
         ",color='" +getColor()+'\''+
                ",MaximumMovementSpeed=" +getMaximumMovementSpeed()+'}';


    }
}
