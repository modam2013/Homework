package Homework15;

public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    Car(String brand,String model,float engineVolume,String color,int year,String country){
        if (brand!=null&&!brand.isEmpty()&&!brand.isBlank() ){
            this.brand=brand;
        }else {
            this.brand="default";
        }if (model!=null&&!model.isEmpty()&&!model.isBlank() ){
            this.model=model;
        }else {
            this.model = "default";
        }if (country!=null&&!country.isEmpty()&&!country.isBlank() ){
            this.country=country;
        }else {
            this.country = "default";
        }if (engineVolume>0){
            this.engineVolume=engineVolume;
        }else {
            this.engineVolume=1.5f;
        }if (color!=null&&!color.isEmpty()&&!color.isBlank() ){
            this.color=color;
        }else {
            this.color = "цвет белый ";
        }if (year>0){
            this.year=year;
        }else {
            this.year = 2000;
        }

    }
    void featuresСar(){
        System.out.println("");
        System.out.println( brand+model+"объем двигателя "+engineVolume+"л,"+color+ year+ " года выпуска,"+ country);
    }
}
