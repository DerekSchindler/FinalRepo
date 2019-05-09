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
           System.out.println(user);


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

}
