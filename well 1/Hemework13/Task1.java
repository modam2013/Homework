package Hemework13;

public class Task1 {



    public static void main (String[]args) {
        Author Igor =new Author("Igor ","Ibrogim");
        Author John =new Author("John ","King");
        Book book=new Book( " Сладкая жизнь-2,",Igor, 2022);
        Book book1=new Book( " Сладкая жизнь-1 ,",John, 2020);
        System.out.printf("(название книги )-"+book.getTitle()+ " (Имя и Фамилия автора)-"+book.getAuthor().getName() + book.getAuthor().getSurname()+" , год ");
        System.out.println(" "+book.setYear());
        System.out.printf(" ( книгa )-"+book1.getTitle()+ "( Имя и Фамилия автора) -"+book1.getAuthor().getName() + book1.getAuthor().getSurname()+" , год");
        System.out.println(" "+book1.setYear());

    }


}


