public class puppy{
    String name;
    int age;
    String designation;
    double salary;

    public  puppy(String name){
        this.name = name;
    }
    public void set_age(int age){
        this.age = age;
    }
    public void set_designation(String designation){
        this.designation = designation;
    }
    public void set_salary(int salary){
        this.salary = salary;
    }
   public  void print_puppy(){
        System.out.println("NAME: " + this.name);
        System.out.println("AGE: " + this.age);
        System.out.println("JOB: " + this.designation);
        System.out.println("SALARY: " + this.salary);

    }

}