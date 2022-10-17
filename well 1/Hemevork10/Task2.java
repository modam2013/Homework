package Hemevork10;

public class Task2 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int max = -1;
        int min = 200_001;
        for (int i = 0; i < arr.length; i++){
            if ( arr[i] > max){
                max = arr[i];
            } if ( arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println( "Максимальная сумма трат за день составила  " + max + " рублей");
        System.out.println( "Минимальная сумма трат за день составила  " +  min + " рублей");
    }

}