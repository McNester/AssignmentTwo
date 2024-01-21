package models;

import com.sun.xml.internal.bind.v2.TODO;
import interfaces.Payable;

public abstract class Person implements Payable, Comparable<Person> {
    private static int currentId = 0;

    private int id;
    private String name;
    private String surname;

    public Person(){
        this.currentId++;
        this.id = currentId;

    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
    @Override
    public double getPaymentAmount() {
        return 0;
    }

    public String getPositon(){
        return "Human";
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public int compareTo(Person p) {

        int result = Double.compare(this.getPaymentAmount(),p.getPaymentAmount());

        return result;
    }


    //TODO in ascending order
}
