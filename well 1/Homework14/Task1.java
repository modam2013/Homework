package Homework14;

public class Task1 {
    private  static Employee[] employees;//создали массив длиной 10

    public static void main(String[] args) {
        employees=new Employee[10]; // инициализировали его
        employees[0]=new Employee( " Сергей Сергеевич Синюхин ", 3,25144.42);
        employees[1]=new Employee( " Александр  Сергеевич Синюхин ", 2,31423.12);
        employees[2]=new Employee( " Сергей Александрович Говрилов ", 1,12351);
        printArray();
        System.out.println( " Сумма зарплат работников "+sumSalaries() );
        System.out.println( "Сотрудник с минимальной зарплатой "+ findEmployeeWithMinSalary() );
        System.out.println( "Сотрудник с максимальной зарплатой "+ findEmployeeWithMaxSalary() );
        System.out.printf( " Средняя зарплата сотрудников %.2f\n",everageSelery());
        printfio();

    }
    public static void printArray(){
     for ( int i = 0; i < employees.length ; i ++){
     if( employees[i]!=null){
    System.out.println(employees[i].toString());
    }
}
    }

    public static double sumSalaries(){
        double result=0;
        for ( int i = 0; i < employees.length ; i ++) {
            if (employees[i] != null) {
                result += employees[i].getSalary();}
            }
        return result;
        }
    public static Employee findEmployeeWithMinSalary(){    // сотрудник с мин з.п
        Employee  result=employees[0];
        double min = Double.POSITIVE_INFINITY;// + бесконечность
        for ( int i = 0; i < employees.length ; i ++) {
            if (employees[i] != null && employees[i].getSalary()<min ) {
                min=employees[i].getSalary();
                result =employees[i];
            }
        }
        return result;
    }public static Employee findEmployeeWithMaxSalary(){    // сотрудник с мин з.п
        Employee  result=employees[0];
        double max = Double.POSITIVE_INFINITY;// + бесконечность
        for ( int i = 0; i < employees.length ; i ++) {
            if (employees[i] != null && employees[i].getSalary()>max ) {
                max=employees[i].getSalary();
                result =employees[i];
            }
        }
        return result;
    }
    public static double everageSelery(){
        int counterOfNotNullElements=0;
        for ( int i = 0; i < employees.length ; i ++) {
            if (employees[i] != null  ) {
                counterOfNotNullElements ++;
            }
        }
        return sumSalaries()/counterOfNotNullElements;
    }
    public static void printfio() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getfio());
            }
        }
    }
}




