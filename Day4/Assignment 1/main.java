package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

	// write your code here
        Avengers[] avenger = new Avengers[5];

        for (int i=0;i<5;i++)
        {
            avenger[i] = new Avengers();
            avenger[i].getDetails();
            avenger[i].displayDetails();
        }
    }
}

