package Hemevork10;
public class Task3 {
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
        float amounts = 0f;
        float amountsAverage = 0f;
        for (int i = 0; i < arr.length; i++) {
            amounts = amounts + arr[i];
            amountsAverage = amounts / (float) arr.length;
        } System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f",amountsAverage) +  " рублей");

    }
}