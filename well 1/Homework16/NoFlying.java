package Homework16;

public class NoFlying extends Bird{
    public NoFlying(String name,int age, String livingEnvironmet,String typeMovement){
        super(name,age,livingEnvironmet,typeMovement);
    }
    public void walk(){
        System.out.println("Ходит пешком ");
    }
    @Override
    public void eat(){
        System.out.println("Кушает насекомых");
    }
    @Override
    public void sleep(){
        System.out.println("Спит в гнезде");
    }
    @Override
    public void go(){
        System.out.println("Перемещается по земле");
    }
    public void hunting(){
        System.out.println("отится на насекомых.");
    }

    @Override
    public String toString() {
        return "NoFlying{"+
                "name='"+getName()+'\''+
                ",age="+getAge()+
                ",livingEnvironmet='"+getLivingEnvironmet()+'\''+
                ",typeArea='"+getTypeArea()+'\''+
                '}';

    }
}


