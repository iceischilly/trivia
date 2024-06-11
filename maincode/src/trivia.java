//imported java scanner
import java.util.Scanner;
import javax.swing.JOptionPane;

//class name
public class trivia{

    //method trivia game
    public void Guess(){
        //variable for points
        int points = 0;
        //string variable for title
        String title = "TRIVIA GAME";
        //string variable for questions1
        String questions1 = " Is Matteo good at basketball? 1 for yes or 0 for no.";
        //creates scannner object
        Scanner myObj = new Scanner(System.in); {
        //prints title and questions 1 in terminal
        JOptionPane.showMessageDialog(null, title + questions1);
        //sets variable guess to user input
        int Guess = myObj.nextInt();
        //if else loop for question 1
        if (Guess == 0){
            JOptionPane.showMessageDialog(null, "correct +1 point");
            points =+ 1;}
        else{
            JOptionPane.showMessageDialog(null, "wrong no point");
            }
        } 
        

        //variable for questions2
        String questions2 = "Is Scottie barnes the best basketball player? 1 for yes or 0 for no.";

        
        //print question 2 in terminal
        JOptionPane.showMessageDialog(null, questions2);
        //sets variable guess2 to user input
        int Guess2 = myObj.nextInt();
        //if else loop for question2
        if (Guess2 == 1){
            JOptionPane.showMessageDialog(null, "correct +1 point");
            points = points + 1;}
        else{
            JOptionPane.showMessageDialog(null, "wrong no point");
            }
            

        //variable for questions3
        String questions3 = "Does Matteo know how to shoot at basketball? 1 for yes or 0 for no.";

        
        //print questions3 in terminal
        JOptionPane.showMessageDialog(null, questions3);
        //sets variable guess3 to user input
        int Guess3 = myObj.nextInt();
        //if else loop for question3
        if (Guess3 == 0){
            JOptionPane.showMessageDialog(null, "correct +1 point");
            points = points + 1;}
        else{
            JOptionPane.showMessageDialog(null, "wrong no point");
            }
            

        //variable for questions4
        String questions4 = " Did jaseem ever win a mvp in the NBA? 1 for yes or 0 for no.";
    

        //print questions4 in terminal
        JOptionPane.showMessageDialog(null, questions4);
        //sets variable guess4 to user input
        int Guess4 = myObj.nextInt();
        //if else loop for question4
        if (Guess4 == 1){
            JOptionPane.showMessageDialog(null, "correct +1 point");
            points = points + 1;}
        else{
            JOptionPane.showMessageDialog(null, "wrong no point");
            }
            
        
        //variable for questions5
        String questions5 = "Is ati a hoodman? 1 for yes or 0 for no.";
    

        //print questions5 in terminal
        JOptionPane.showMessageDialog(null, questions5);
        //sets variable guess5 to user input
        int Guess5 = myObj.nextInt();
        //if else loop for question5
        if (Guess5 == 0){
            JOptionPane.showMessageDialog(null, "correct +1 point");
            points = points + 1;}
        else{
            JOptionPane.showMessageDialog(null, "wrong no point");
            }
           
        
         //variable for questions6
        String questions6 = "Does james have good curls, 1 for yes or 0 for no.";
    

         //print questions6 in terminal
         JOptionPane.showMessageDialog(null, questions6);
        //sets variable guess6 to user input
        int Guess6 = myObj.nextInt();
         //if else loop for question6
        if (Guess6 == 0){
            JOptionPane.showMessageDialog(null, "correct +1 point");
            points = points + 1;}
        else{
            JOptionPane.showMessageDialog(null, "wrong no point");
            }
            JOptionPane.showMessageDialog(null, "This is how many points you have " + points +"." );

    }



}


