package Homework17;

public class TestCar {
    public static void main(String[]args){
        Car audi= new Car("audi",
                "Q8",
                1000,
                10,
                500,
                1);
        System.out.println(audi);
        DriverB<Car>driverB=new DriverB<>("Ivanov Ivan Ivanovich",true,20);
        System.out.println(driverB.getCarMessage(audi));

        Truck truck=new Truck("super truck",
                "B-901",
                2,
                20,
                100,
                5);
    }
}
