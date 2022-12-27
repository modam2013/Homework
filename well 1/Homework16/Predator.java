package Homework16;

public class Predator extends Mammal{
    public Predator(String name,int age, String livingEnvironmet,int movementSpeed,String food){
        super(name,age,livingEnvironmet,movementSpeed,food);
    }
    @Override
    public void walk(){
        System.out.println("Гулять любит средне");
    }
    @Override
    public void eat(){
        System.out.println("Кушает:"+getFood());
    }
    @Override
    public void sleep(){
        System.out.println("Спит в пещере.");
    }
    @Override
    public void go(){
        System.out.println("Перемещается шагом и бегом");
    }
    public void hunting(){
        System.out.println("отится на других животных.");
    }

    @Override
    public String toString() {
        return "Predator{"+
                "name='"+getName()+'\''+
                ",age="+getAge()+
                ",livingEnvironmet='"+getLivingEnvironmet()+'\''+
                ",movementSpeed="+getMovementSpeed()+
                ",food='"+getFood()+'\''+
                '}';
    }
}
