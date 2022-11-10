package Homework14;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args){
        String str = "Привет";
        int num = str.length() / 2; //создаем переменную num, где длина строки делется на двое
        String[] parts = {str.substring(0,num), str.substring(num)}; //создаем массив parts и применяем метод .substring()
        System.out.println(Arrays.toString(parts)); //в выводе применяем метод Arrays.toString()

    }
}
