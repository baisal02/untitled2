import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Person[]people = {new Person("person1",20,Gender.MALE,Payment.PAID),
                         new Person("person2",18,Gender.FEMALE,Payment.PAID),
                         new Person("person3",19,Gender.MALE,Payment.NOTPAID),
                         new Person("person4",22,Gender.FEMALE,Payment.NOTPAID)};
         for (Person p:
             people) {
            System.out.println(p);
            System.out.println(p.getGender().deviz);
             System.out.println("________________");
         }
    }
}