package com.company;

import java.util.Scanner;

public class Avengers {
    Scanner sc=new Scanner(System.in);
    String Name,Power,Weapon,Planet;
    int age;


    public void getDetails(){
        System.out.println("Enter the name of Avenger");
        Name=sc.nextLine();
        System.out.println("enter th Age of avenger");
        age = sc.nextInt();
        System.out.println("enter th Power of avenger");
        Power=sc.nextLine();
        System.out.println("enter th Weapon of avenger");
        Weapon=sc.nextLine();
        System.out.println("enter th Planet of avenger");
        Planet=sc.nextLine();
    }


    public void displayDetails(){
        System.out.println("Enter the name of Avenger =" +Name);
        System.out.println("enter th Age of avenger =" +age);
        System.out.println("enter th Power of avenger ="+Power);
        System.out.println("enter th Weapon of avenger ="+Weapon);
        System.out.println("enter th Planet of avenger ="+Planet);
    }





}
