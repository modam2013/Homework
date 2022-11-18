package Homework15;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[]args){
        Man man=new Man("Максим.", " Минск",1988,"бренд-менеджером.");
        Man anja=new Man("Аня."," Москва.",1993,"методистом образовательных программ.");
        Man katja=new Man("Катя."," Калининград.",1992,"продакт-менеджером.");
        Man artem=new Man("Артем."," Москва.",1995," директором по развитию бизнеса. ");
        artem.hello();
        man.hello();
        anja.hello();
        katja.hello();

        Car car=new Car("Lada"," Granta,",1.7f,"желтого цвета, ",2015,"сборка в России.");
        Car audi=new Car(" Audi ","A850LTDI quattro,",3.0f,"черный цвет кузова," ,2020," сборка в Германии.");
       Car bmw=new Car("BMW"," Z8,",3.0f,"черный цвет, ",2021," сборка в Германии ");
       Car kia=new Car("Kia ","Sportage 4-го поколения,",2.4f,"красный цвет,",2018,"сборка в Южной Корее ");
      Car hyundai=new Car("Hyundai ","Avante,",1.6f,"оранжевый цвет,",2016,"сборка в Южной Корее");

      car.featuresСar();
        audi.featuresСar();
        bmw.featuresСar();
        kia.featuresСar();
        hyundai.featuresСar();






    }
}
