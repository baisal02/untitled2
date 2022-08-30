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
        char[] n = name.toCharArray();
        char[] s = surname.toCharArray();
        int c = 0;
        int f = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(n[i])) {
                c++;
            }
        }
        if (c == name.length()) {
            this.name = name;
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("kaira jaz");
            }
        }
        for (int i = 0; i < surname.length(); i++) {
            if (Character.isLetter(n[i])) {
                f++;
            }
        }
        if (f == surname.length()) {
            this.surname = surname;
        } else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("kata");
            }
        }
        this.birthyear = birthyear;
        this.jobstartday = jobstartday;
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
