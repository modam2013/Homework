package Homework16;


import java.util.Objects;

import static Homework16.ValidateUtils.validateInteger;
import static Homework16.ValidateUtils.validateString;

public abstract class Animal {
    private String name;
    private int age;
    private String livingEnvironmet;

    protected Animal( String name,int age, String livingEnvironmet){
        this.name=validateString(name,"any name");
        this.age=validateInteger(age,1);
        this.livingEnvironmet=livingEnvironmet;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLivingEnvironmet() {
        return livingEnvironmet;
    }

    public void setLivingEnvironmet(String livingEnvironmet) {
        this.livingEnvironmet = livingEnvironmet;
    }
    abstract void eat();
    abstract void sleep();
    abstract void go();

          @Override
    public boolean equals(Object o){
         if (this==o)return true;
         if (o==null||getClass()!=o.getClass())return false;
         Animal animal=(Animal) o;
         return age==animal.age&& Objects.equals(name,animal.name)&& Objects.equals(livingEnvironmet,animal.livingEnvironmet);
          }
     @Override
    public int hashCode(){
              return Objects.hash(name,age,livingEnvironmet);
     }
}
