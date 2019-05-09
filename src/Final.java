import java.util.Scanner;

public class Final {
    public static void main(String[]args){
        Scanner equinox;
        equinox = new Scanner(System.in);
        String user, comp;
        System.out.println("Welcome to Rock Paper Scissors.\n  ");
        while(true) {
            String[] wordArray = {"Rock", "Paper", "Scissors"};
            int number = (int)(Math.random()*100);
           comp = comInput(number);
           System.out.println("I already have my play. Please enter your play.");
           user=equinox.nextLine();
           user=user.toUpperCase();
           System.out.println("My play was "+comp+" your play was "+user);
           outcome(comp, user);
           System.out.println("Lets play again. \n \n \n \n \n ");
        }
        }
    public static String comInput(int number){

        if(number<34){
            return "ROCK";
        }
        else if(number>65){
            return "PAPER";
        }
        else{
            return "SCISSORS";
        }

    }
    public static void outcome(String comp, String user){
        int compScore=0; int userScore=0;

        if(comp.equals(user)){
            System.out.println("Its a tie!");
        }
        else if(user.equals("ROCK")&&comp.equals("PAPER")){
            System.out.println("Paper beats rock. I win!");
           compScore=compScore+1;
        }
        else if(user.equals("ROCK")&&comp.equals("SCISSORS")){
            System.out.println("Rock beats scissors. You win!");
            userScore=userScore+1;
        }
        else if(user.equals("PAPER")&&comp.equals("SCISSORS")){
            System.out.println("Scissors beats paper. I win!");
            compScore=compScore +1;
        }
        else if(user.equals("PAPER")&&comp.equals("ROCK")){
            System.out.println("Paper beats rock. You win!");
            userScore=userScore+1;
        }
        else if(user.equals("SCISSORS")&&comp.equals("ROCK")){
            System.out.println("Rock beats scissors. I win!");
            compScore=compScore+1;
        }
        else if(user.equals("SCISSORS")&&comp.equals("PAPER")){
            System.out.println("Scissors beats paper. You win!");
            userScore=userScore+1;
        }
        System.out.println("My current score is "+compScore+". Your current score is "+userScore+".");
    }

}
