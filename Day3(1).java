package com.company;

import jdk.jfr.Percentage;

import java.util.Scanner;
    public class Main {

    public static void main(String[]  args){
        Scanner sc =new Scanner(System.in);
        int english,social,science,maths,cp;
        float total;
        float percentage;

        System.out.print("Enter the marks of english =");
        english = sc.nextInt();
        System.out.print("Enter the marks of social =");
        social = sc.nextInt();
        System.out.print("Enter the marks of science =");
        science = sc.nextInt();
        System.out.print("Enter the marks of maths =");
        maths = sc.nextInt();
        System.out.print("Enter the marks of cp =");
        cp = sc.nextInt();
        sc.next();

        total = english+social+science+maths+cp;
        sc.next();
        percentage = (total/500)*100;
        sc.next();
        System.out.println(percentage);

        if(percentage>=85 && percentage<=100){
            System.out.println(percentage + "A Grade");
        }
        else if(percentage>=70 && percentage<=84){
            System.out.println(percentage + "B Grade");
        }
        else if(percentage>=50 && percentage<=69){
            System.out.println(percentage + "C Grade");

        }
        else if(percentage<=49){
            System.out.println(percentage + "study hard");
        }
        else{
            System.out.println("Enter the marks correctly" );
        }


    }




}