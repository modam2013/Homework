package Homework17;

public class DriverC < T extends Truck> extends Driver{
    public DriverC(String name,Boolean hasLicense,Integer experience){  super(name,hasLicense,experience);}

    @Override
    public String start(){return "Car has started";}
    @Override
    public String stop(){return "Car has stopped";}
    @Override
    public String refeul(){return "Car is charging with petrol";}
    public String getCarMessage(T truck){
        return "Driver"+ getName()+" is driving car "+ truck.getBrand()+ " " + truck.getModel() + " will participate in race ";
    }
}
