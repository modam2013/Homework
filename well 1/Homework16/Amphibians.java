package Homework16;

public final class Amphibians extends Animal {
    public Amphibians(String name,int age,String livingEnvironmet){
        super(name,age,livingEnvironmet);
    }
    @Override
    public void eat(){
        System.out.println("Питается насекомыми");
    }
    @Override
    public void sleep(){
        System.out.println("Спит в воде" );
    }
    @Override
    public void go(){
        System.out.println("Перемещается по воде и по суше");
    }

}
