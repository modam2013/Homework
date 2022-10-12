package Homework9;

public class Task4 {
    public static void main(String[] args){
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 == 0) {
                System.out.println(weights[i]);
            } else {
                weights[i] = weights[i] + 1;
                System.out.println(weights[i]);
            }
        }




    }
}
