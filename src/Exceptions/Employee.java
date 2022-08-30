package Exceptions;
import java.util.Scanner;
public class Employee {
    private String name;
    private String surname;
    private int birthyear;
    private int jobstartday;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public int getJobstartday() {
        return jobstartday;
    }

    public void setJobstartday(int jobstartday) {
        this.jobstartday = jobstartday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, String surname, int birthyear, int jobstartday) {
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
        this.jobstartday = jobstartday;
    }
public Employee(){

}
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthyear=" + birthyear +
                ", jobstartday=" + jobstartday +
                '}';
    }
}
