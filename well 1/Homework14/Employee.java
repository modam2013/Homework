package Homework14;

public class Employee {
       private String fio;
        private int Department;
        private double Salary;
        private int id;
        private static int caunter =0 ;
        public Employee ( String fio, int Department,double Salary ){
            this.fio=fio;
            this .Department= Department;
            this.Salary=Salary;
            caunter++;
        id=caunter;

    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return Salary;
    }

    public String getfio() {
        return fio;
    }

    public int getDepartment() {
        return Department;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void setDepartment(int department) {
        Department = department;
    }
    @Override
    public String toString(){
            return String.format(" %d.%s;номер отдела : %d;зарплата : %.2f",id,fio,Department,Salary);
    }

}




