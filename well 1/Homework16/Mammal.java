package Homework16;

import static Homework16.ValidateUtils.validateInteger;
import static Homework16.ValidateUtils.validateString;

public abstract class Mammal extends Animal{
    private final int movementSpeed;
    private String food;

    public Mammal( String name,int age, String livingEnvironmet,int movementSpeed,String food ){
    super(name,age,livingEnvironmet);
    this.movementSpeed=validateInteger(movementSpeed,1);
    this.food=validateString(food,"millk");
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract void walk();
}
