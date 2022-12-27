package Homework16;

public class TestCar {
    public static void main(String[]args){
        Car audi=new Car("audi","08",1000," ","yellow","hatchbach",false,null,"y345pa174",4,20,200,"petrol");
        System.out.println(audi);
        audi.refill("petrol");

        Train train=new Train("Ласточка","B-901",2011,"Rus","grey",60,"Белорусский вокзал","Минск",11,301);
        System.out.println(train);
        train.refill("diesel");
    }
}
