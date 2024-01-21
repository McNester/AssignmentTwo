package models;

public class Student extends Person{
    private double gpa;

    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name,surname);
        setGpa(gpa);
    }


    @Override
    public String toString() {
        return "Student: "+super.toString();
    }

    @Override
    public double getPaymentAmount() {
        double STIPEND = 36660.00;
        if(gpa > 2.67){
            return STIPEND;
        }
        return super.getPaymentAmount();
    }

    @Override
    public int compareTo(Person p) {
        return super.compareTo(p);
    }


    //getters and setters


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
