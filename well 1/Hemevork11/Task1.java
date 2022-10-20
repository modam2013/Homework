package Hemevork11;

public class Task1 {
    public static void main(String[] args){
     //   Напишите четыре строки:

     //   первая с именем firstName — для хранения имени;

      //  вторая с именем middleName — для хранения отчества;

      //  третья с именем lastName — для хранения фамилии;

       // четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".

      //          Выведите в консоль фразу: “ФИО сотрудника — ….”

      //  В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName  ;
        System.out.println( "ФИО сотрудника-" + fullName);




    }
}
