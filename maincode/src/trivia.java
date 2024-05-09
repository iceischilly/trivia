
import java.util.Scanner;
public class trivia{

    public void Guess(){
        int points = 0;
        String title = "TRIVIA GAME";
        String questions1 = " Is Matteo good at basketball? 1 for yes or 0 for no.";
        Scanner myObj = new Scanner(System.in); {
        System.out.println(title + questions1);
        int Guess = myObj.nextInt();
        if (Guess == 0){
            System.out.println("correct +1 point");
            points =+ 1;}
        else{
            System.out.println("wrong no point");
            }
        } 
        System.out.println("This is how many points you have " + points );

        String questions2 = "Is Scottie barnes the best basketball player? 1 for yes or 0 for no.";

        
        System.out.println(questions2);
        int Guess2 = myObj.nextInt();
        if (Guess2 == 1){
            System.out.println("correct +1 point");
            points = points + 1;}
        else{
            System.out.println("wrong no point");
            }
            System.out.println("This is how many points you have " + points );

        String questions3 = "Does Matteo know how to shoot at basketball? 1 for yes or 0 for no.";

        
        System.out.println(questions3);
        int Guess3 = myObj.nextInt();
        if (Guess3 == 0){
            System.out.println("correct +1 point");
            points = points + 1;}
        else{
            System.out.println("wrong no point");
            }
            System.out.println("This is how many points you have " + points );

        String questions4 = " Did jaseem ever win a mvp in the NBA? 1 for yes or 0 for no.";
    

        System.out.println(questions4);
        int Guess4 = myObj.nextInt();
        if (Guess4 == 1){
            System.out.println("correct +1 point");
            points = points + 1;}
        else{
            System.out.println("wrong no point");
            }
            System.out.println("This is how many points you have " + points );
        
        String questions5 = "Is ati a hoodman? 1 for yes or 0 for no.";
    

        System.out.println(questions5);
        int Guess5 = myObj.nextInt();
        if (Guess5 == 1){
            System.out.println("correct +1 point");
            points = points + 1;}
        else{
            System.out.println("wrong no point");
            }
            System.out.println("This is how many points you have " + points );
        
        String questions6 = "Does Matteo have a normal sized nose? 1 for yes or 0 for no.";
    

        System.out.println(questions6);
        int Guess6 = myObj.nextInt();
        if (Guess6 == 0){
            System.out.println("correct +1 point");
            points = points + 1;}
        else{
            System.out.println("wrong no point");
            }
            System.out.println("This is how many points you have " + points );

    }



}


