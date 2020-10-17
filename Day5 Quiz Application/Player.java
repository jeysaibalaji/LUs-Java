package com.QuizApplication;
import java.util.Scanner;
public class Player {
    Scanner sc= new Scanner(System.in);
    String Name;
    int Score=0;//intially the score is zero


    public void getDetails(){

        System.out.println("Enter the Name of the Player");
        Name=sc.next();

    }
}
