package models;

public class Employee extends Person{
    private String position;
    private double salary;

    public Employee(){
        super();
    }
    public Employee(String name, String surname, String position, double salary){
        super(name,surname);
        setPosition(position);
        setSalary(salary);

    }



    @Override
    public String toString() {
        return "Employee: "+ super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return this.salary;
    }

    @Override
    public int compareTo(Person p) {
        return super.compareTo(p);
    }

    //getters and setters


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
