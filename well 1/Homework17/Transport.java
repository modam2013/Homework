package Homework17;

import static Homework16.Transport.validateCarParameters;
import static Homework16.ValidateUtils.validateInteger;

public abstract class Transport {
    private final  String brand;
    private final  String model;
    private Integer enginePower;

    public Transport( String brand, String model,Integer enginePower){
        this.brand=validateCarParameters(brand);
        this.model=validateCarParameters(model);
        this.enginePower=validateInteger(enginePower,2);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    abstract void startToMove();
    abstract void finish();

   // validation


        @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
