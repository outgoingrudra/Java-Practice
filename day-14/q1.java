class Employee{
    String name ;
    int salary ;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    
    void setSalary(int x){
        salary = x;
    }
    
}

class manager extends Employee{
    String pos;

    public manager( String name, int salary) {
        super(name, salary);
        this.pos ="Manager";
    }
    
}

class Developer extends Employee{
    String pos;

    public Developer( String name, int salary) {
        super(name, salary);
        this.pos ="Developer";
    }
    
}

class q1{
    public static void main(String[] args) {
        
        Employee x1 = new manager("Ajax", 100000);
        Employee x2 = new Developer("Doe", 10000);
     System.out.println(  x1.getName());
       System.out.println( x2.getSalary());
    }
}