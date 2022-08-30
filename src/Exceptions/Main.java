package Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[scanner.nextInt()];
        System.out.println(scanner.nextLine());
        int c = 0;
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            String name = scanner.nextLine();
            for (int j = 0; j < name.length(); j++) {
                if (Character.isDigit(name.charAt(j))) {
                    c++;
                }
            }
            if (c==0) {
                employees[i].setName(name);
            } else {
                while (true) {
                    int k = 0;
                    System.out.println("bolboit kaira jaz");
                    name = scanner.nextLine();
                    for (int j = 0; j < name.length(); j++) {
                        if (Character.isDigit(name.charAt(j))) {
                            k++;
                        }
                    }
                    if (k==0){
                        break;
                    }
                }
                employees[i].setName(name);
            }
            int e = 0;
            String surname = scanner.nextLine();
            for (int j = 0; j < surname.length(); j++) {
                if (Character.isDigit(surname.charAt(j))) {
                    e++;
                }
            }
            if (e==0) {
                employees[i].setSurname(surname);
            } else {
                while (true) {
                    int k = 0;
                    System.out.println("bolboit kaira jaz");
                    surname = scanner.nextLine();
                    for (int j = 0; j < surname.length(); j++) {
                        if (Character.isDigit(surname.charAt(j))) {
                            k++;
                        }
                    }
                    if (k==0){
                        break;
                    }
                }
                employees[i].setSurname(surname);
            }
            try{int bornyear = scanner.nextInt();
            }catch (Exception exception)
            {
                while(true){
                   int bornyear = scanner.nextInt();
                   if(bornyear/1==bornyear){
                       employees[i].setBirthyear(bornyear);
                   }
                }
            }

            int workyear = scanner.nextInt();
        }
    }

}

