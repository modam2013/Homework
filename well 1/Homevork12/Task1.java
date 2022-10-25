package Homevork12;

import java.time.Year;

public class Task1 {
    public static void isLeapYear(int year) {
        if ( year % 400==0){
            System.out.println(year+ " год является высокостным " );
        }else if ( year % 100==0){
            System.out.println( year+ " год не является высокостным ");
        }else if ( year % 4 ==0){
            System.out.println( year+ " является высокостным ");
        }else {
            System.out.println( year+ " год не является высокостным ");

        }

    }

    public static void main(String[] args) {

        isLeapYear(2022);

    }
}