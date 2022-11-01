package Hemework13;

public class Task1 {


    public static void main(String[] args) {
        Author Igor = new Author("Igor ", "Ibrogim");
        Author John = new Author("John ", "King");
        Book book = new Book(" Сладкая жизнь-2,", Igor, 2022);
        Book book1 = new Book(" Сладкая жизнь-1 ,", John, 2020);

        System.out.println(" "+book  +John);
        System.out.println();
        System.out.printf(" " + book1 +John);

    }


}


