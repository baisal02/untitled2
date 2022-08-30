package Exceptions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < employees.length; i++){
            employees[i] = new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
    }}
}



//        Scanner scanner = new Scanner(System.in);
//        int[]a=new int[5];
//        for (int i = 0; i <a.length ; i++) {
//            a[i]= scanner.nextInt();
//        }
//       try{
//           int b= scanner.nextInt();
//           System.out.println(a[b]);
//       }catch (Exception e){
//           System.err.println( e.getMessage());
//       }


