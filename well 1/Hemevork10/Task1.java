package Hemevork10;

public class Task1 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = generateRandomArray();
        int amounts=0;
        for (int i = 0; i < arr.length; i++) {
            amounts = amounts + arr[i];
        }System.out.println  ( "Сумма трат за месяц составила  " +  amounts  + " рублей");

    }

}
