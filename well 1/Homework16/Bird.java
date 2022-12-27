package Homework16;


import static Homework16.ValidateUtils.validateString;

public abstract class Bird extends Animal{
    private final String typeArea;

    public Bird(String name,int age, String livingEnvironmet,String typeMovement){
        super(name,age,livingEnvironmet);
        this.typeArea=validateString(typeMovement,"tropics");
    }

    public String getTypeArea() {
        return typeArea;
    }
    abstract public void hunting();
}
