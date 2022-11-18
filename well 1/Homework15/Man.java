package Homework15;

public class Man {
    String name;
    String yearOfBirth;
    int town;
    String jobTitle;

    Man(String name, String yearOfBirth, int town, String jobTitle) {
        if (jobTitle!=null&&!jobTitle.isEmpty()&&!jobTitle.isBlank()){
            this.jobTitle =jobTitle;
        }else {
            this.jobTitle=" Информация не указана при выводе в консоль.";
        }
        if (name!=null&&!name.isEmpty()&&!name.isBlank()){
            this.name =name;
        }else {
            this.name=" Информация не указана при выводе в консоль.";
        }
        if (yearOfBirth!=null&&!yearOfBirth.isEmpty()&&!yearOfBirth.isBlank()){
            this.yearOfBirth=yearOfBirth;
        }else {
            this.yearOfBirth=" Информация не указана при выводе в консоль.";
        }
           if (town >= 0) {
                this.town = town;
            } else {
                this.town = Math.abs(town);
            }
    }public void hello(){
        System.out.print("Привет! Меня зовут " + name);
        System.out.print("Я из города " + yearOfBirth);
        System.out.print(" Я родился в " + town + " году.");
        System.out.print("Я работаю на должности " + jobTitle + " Будем знакомы!");
        System.out.println("");}

}




