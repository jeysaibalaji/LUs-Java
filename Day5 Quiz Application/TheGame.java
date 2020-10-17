package com.QuizApplication;

public class TheGame {

    Question[] questions=new Question[5];
    Player player =new Player();
    String[] questionsdata ={"who is the Ceo of Tesla?","who is the ceo of Amazon?","who is the Founder of Ford?",
            "which is the nearest planet?","what is the capital of Serbia ?"};
    String[] options1={"Elon Musk","Elon Musk","Elon Musk","earth","Belgrade"};
    String[] options2={"jeff Bezos","jeff Bezos","jeff Bezos","Venus","Ankara"};
    String[] options3={"Warren Buffet","Warren Buffet","Warren Buffet","Mars","Ottoman"};
    String[] options4={"Henry Ford","Henry Ford","Henry Ford","Jupiter","Istanbul"};
    int[] ans={1,2,4,2,1};



    public void initGame()
    {
        // created five objects
        for(int i =0;i<5;i++){
            questions[i]=new Question();

        }
        // applying values  to the variables of the object
//        questions[0].question="who is the Ceo of Tesla?";
//        questions[0].option1 ="Elon Musk";
//        questions[0].option2 ="jeff Bezos";
//        questions[0].option3 ="Dev";
//        questions[0].option4 ="Henry Ford";
//        questions[0].correctAnswer=1;
//
//
//        questions[1].question="who is the ceo of Amazon?";
//        questions[1].option1 ="Elon Musk";
//        questions[1].option2 ="jeff Bezos";
//        questions[1].option3 ="Warren Buffet";
//        questions[1].option4 ="Henry Ford";
//        questions[1].correctAnswer=2;
//
//        questions[2].question="who is the Founder of Ford?";
//        questions[2].option1 ="Elon Musk";
//        questions[2].option2 ="jeff Bezos";
//        questions[2].option3 ="Warren Buffet";
//        questions[2].option4 ="Henry Ford";
//        questions[2].correctAnswer=4;
//
//        questions[3].question="which is the nearest planet?";
//        questions[3].option1 ="Mercury";
//        questions[3].option2 ="venus";
//        questions[3].option3 ="Jupiter";
//        questions[3].option4 ="Mars";
//        questions[3].correctAnswer=2;
//
//        questions[4].question="what is the capital of Serbia ?";
//        questions[4].option1 ="Belgrade";
//        questions[4].option2 ="Ankara";
//        questions[4].option3 ="Ottoman";
//        questions[4].option4 ="Istanbul";
//        questions[4].correctAnswer=1;

        for (int i= 0;i<5;i++)
        {
            questions[i].question=questionsdata[i];
        questions[i].option1 =options1[i];
        questions[i].option2 =options2[i];
        questions[i].option3 =options3[i];
        questions[i].option4 =options4[i];
        questions[i].correctAnswer=ans[i];
        }


    }
    public void play(){

        player.getDetails();
        for(int i = 0;i<5;i++)
        {
           boolean status = questions[i].askQuestion();
           if(status == true)
           {
               System.out.println("Good ,Keep going");
               player.Score++;
           }
           else{
               System.out.println("Try Again");
           }
        }
        System.out.println(player.Name+"your Score is " + player.Score);
    }
}
