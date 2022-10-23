package Homevork12;

import java.time.LocalDate;

public class Task2 {

    public static void checkDevice(int Os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year <= currentYear && Os == 0) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (year > currentYear && Os == 0) {
            System.out.println(" Установите 'lite' версию приложения для IOS по ссылке ");
        } else if (year <= currentYear && Os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (year > currentYear && Os == 1) {
            System.out.println("Установите  'lite' версию приложения для  Android по ссылке ");
        }
    }
    public static void main (String[]args){

            checkDevice(1, 2010);
        }

}