package Homevork12;

public class Task3 {

    public static void delivery( int  deliveryDistance){
        int deliveryDays=1;
        if( deliveryDistance<=20){
            System.out.println( " Потребуется дней" +  deliveryDays);
        }else {if (deliveryDistance>=20 && deliveryDistance<=60) {
                deliveryDays=deliveryDays +deliveryDays;
                System.out.println(" Потребуется дней" + deliveryDays);
            }else if (deliveryDistance >= 60 && deliveryDistance<=100 ){
            deliveryDays=deliveryDays +deliveryDays+ deliveryDays;
            System.out.println(" Потребуется  " + deliveryDays+ " дня ");
            }
        }
    }



    public static void main (String[]args){

        delivery(95) ;
    }
}
