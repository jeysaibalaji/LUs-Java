package com.QuizApplication;
import java.util.Scanner;
public class Question {
    String question,option1,option2,option3,option4;
    int ans,correctAnswer,UserAnswer ;
    Scanner sc=new Scanner(System.in);
     public boolean askQuestion() // boolean is taken sa as to return a value either it is ture or not
    {
        System.out.println(question);
        System.out.println("1. " +option1);
        System.out.println("2. " +option2);
        System.out.println("3. " +option3);
        System.out.println("4. " +option4);
        System.out.println("Please Enter your Option");
        ans=sc.nextInt();
        if(ans==correctAnswer){
            return true;

        }
       return false;
        //here the value is true or false so that it counts in the game class
    }

}
