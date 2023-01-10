package Homework17;

public class Truck extends Transport implements Competing{
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;

    public Truck(String brand,
               String model,
               Integer enginePower,Integer pitStopTime,Integer maxSpeed,Integer bestLapTime) {
        super(brand, model, enginePower);
        this.bestLapTime = bestLapTime;
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
    }
    @Override
    void startToMove(){ System.out.println("Truck startred");}
    @Override
    void finish(){ System.out.println("Truck finished");}
    @Override
    public void getPitStopTime(){System.out.println("pit-stoptime is "+pitStopTime);}

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime(){System.out.println("best lap time is "+bestLapTime);}
    @Override
    public void getMaxSpeed(){System.out.println("max speed is "+maxSpeed);}


}
