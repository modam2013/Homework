package Hemevork11;

public class Task2 {
    public static void main(String[] args){
       // Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        // В качестве строки с исходными данными используйте строку fullName.
        //      Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName  ;
        System.out.println( "Данные ФИО сотрудника для заполнения отчета —" + fullName.toUpperCase());


    }
}
