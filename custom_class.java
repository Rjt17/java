class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}

public class custom_class{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.salary = 1000;
        emp1.name = "rajat agrawal";
        emp2.salary = 1000;
        emp2.name = "rajat agrawal";
        System.out.println(emp1.getSalary());
        System.out.println(emp1.getName());
        emp1.setName("rohit");
        System.out.println(emp1.getName());
    }
}