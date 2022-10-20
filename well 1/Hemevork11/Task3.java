package Hemevork11;

public class Task3 {
    public static void main(String[] args){
       // Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        // В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        String firstName = " Семён ";
        String middleName = " Семёнович ";
        String lastName = " Иванов ";
        String fullName = lastName + firstName + middleName  ;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — "+ fullName );
    }
}
