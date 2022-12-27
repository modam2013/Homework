package Homework16;

public class Herbivore extends Mammal{
    public Herbivore(String name,int age, String livingEnvironmet,int movementSpeed,String food){
        super(name,age,livingEnvironmet,movementSpeed,food);
    }
    @Override
    public void eat(){
        System.out.println("Кушает:"+getFood());
    }
    @Override
    public void sleep(){
        System.out.println("Спит на земле.");
    }
    @Override
    public void go(){
        System.out.println("Перемещается по земле");
    }
    @Override
    public void walk(){
        System.out.println("Гуляет");
    }
    @Override
    public String toString() {
        return "Herbivore{"+
             "name='"+getName()+'\''+
               ",age="+getAge()+
                ",livingEnvironmet='"+getLivingEnvironmet()+'\''+
                ",movementSpeed="+getMovementSpeed()+
                ",food='"+getFood()+'\''+
                '}';
    }
}
