package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        int date,month,year,salary;
        float tax;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name of employee");
        name=sc.nextLine();
        System.out.println("enter the date of your birth");
        date =sc.nextInt();
        System.out.println("enter the month of your birth");
        month = sc.nextInt();
        System.out.println("enter the year of your birth ");
        year = sc.nextInt();
        System.out.println("enter your monthly salary");
        salary = sc.nextInt();
        int age =2020-year;
        int annual_salary=(salary*12);


        if(annual_salary>=500000){
            tax=(annual_salary*20)/100;
            System.out.println("Employye name is " +name+  "Age is " +age+  "Annual Salary=" +annual_salary+  "Taxable Amount="+tax);

        }
        else if(annual_salary>=400000){
            tax=(annual_salary*15)/100;
            System.out.println("Employye name is " +name+  "Age is " +age+  "Annual Salary="+annual_salary+ "Taxable Amount="+tax);

        }
        else if(annual_salary>=300000){
            tax=(annual_salary*10)/100;
            System.out.println("Employye name is " +name+   "Age is " +age+ "Annual Salary="+annual_salary+ "Taxable Amount="+tax);

        }
        else if(annual_salary>=200000){
            tax=(annual_salary*5)/100;
            System.out.println("Employye name is " +name+"Age is " +age+    "Annual Salary="+annual_salary+ "Taxable Amount="+tax);

        }
        else{
            System.out.println("Employye name is " +name+   "Age is " +age+ "Annual Salary="+annual_salary+ "Taxable Amount = Not applicable");
        }
    }
}
