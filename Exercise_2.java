import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) {
        Random generator = new Random();
        int computer = generator.nextInt(3);
        String comp1 ="";
        if(computer==0){
            comp1="r";
        }
        else if(computer==1){
            comp1="p";
        }
        else if(computer==2)
        {
            comp1="s";
    }
       // for trial
        //System.out.println("Computer="+ comp1);
        String player;
        System.out.println("Enter r for rock,p for paper and s for scissor:");
        Scanner s=new Scanner(System.in);
        player= s.next();
         if(player.equals(comp1))
        {
            System.out.println("Tie!");
        }

        else if(player.equals("r")) {
        if (comp1.equals("p")) {
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
    }
    else if(player.equals("p")){
        if (comp1.equals("s")){
            System.out.println("You lose!");
        }
        else{
            System.out.println("You win!");
        }
    }
    else if(player.equals("s")){
        if(comp1.equals("r")){
            System.out.println("You lose!");
        }
        else
        {
            System.out.println("You win!");
        }
    }
    }
    }
