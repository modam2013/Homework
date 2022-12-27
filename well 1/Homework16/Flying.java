package Homework16;

public class Flying extends Bird{
    public Flying(String name,int age, String livingEnvironmet,String typeMovement){
        super(name,age,livingEnvironmet,typeMovement);
    }
    @Override
    public void  hunting(){
        System.out.println("отится на мелких животных");
    }
    @Override
    public void eat(){
        System.out.println("Кушает мелких животных");
    }
    @Override
    public void sleep(){
        System.out.println("Спит в гнезде");
    }
    @Override
    public void go(){
        System.out.println("Летает");
    }
    public void toFly(){
        System.out.println("Летающая птица");
    }

    @Override
    public String toString() {
        return "Flying{"+
                "name='"+getName()+'\''+
                ",age="+getAge()+
                ",livingEnvironmet='"+getLivingEnvironmet()+'\''+
                ",typeArea='"+getTypeArea()+'\''+
                "}"+super.toString();
    }
}
