import java.util.Scanner;
import java.util.Random;

class Number
{
        int attempts=10,sum=0,count=10;
        Random ran = new Random();
        Scanner sc =new Scanner(System.in);
        int num= ran.nextInt(100)+1;
        int guess;
    public void show()
    {
        System.out.println("\nThis is the number guessing game..");
        System.out.println("In this game you have only 10 attempts..");
        System.out.println("Each attempt carries 10 marks..");
        System.out.println("Based on your no.of attempts taken to guess the number your score will be updated..");
    }
    public void repeat()
    {
        if(num>=50)
            System.out.println("\nHint : Your number is in between 50-100 ");
        else if(num<50)
            System.out.println("\nHint : Your number is in between 1-49 ");
        do{
            
            System.out.println("\nYou have " + count + " attempt's");
            System.out.print("Enter your guess in between 1-100 numbers : ");
            guess = sc.nextInt();
            if(guess==num)
                System.out.println("Your guess is Correct");
            else if(guess>num)
                System.out.println("Your guess is too high");
            else if(guess<num)
                System.out.println("Your guess is too low");
            count--;
        }while(num!=guess && attempts>=1);
        System.out.println("\nYour score is : " + (count+1)*10);
        attempts--;
    }
    
}
class Again extends Number{}

public class Task1
{
    public static void main(String[] args) 
    {
        Number obj = new Number();
        Number obj2 = new Again();
        
        Random ran = new Random();
        Scanner sc =new Scanner(System.in);
        int num= ran.nextInt(100)+1;
        int guess;
        System.out.println("\nHow many rounds you want to play");
        System.out.println("1.Single Round \n2.Multiple Rounds");
        System.out.print("Enter either 1 or 2 : ");
        int choice = sc.nextInt();
        if(choice==1){
            obj.show();
            obj.repeat();
        }
        else if(choice==2){
            System.out.println("\nIn this Multiple Round you have 2 Rounds..");
            obj.show();
            System.out.println("\nFirst Round.");
            obj.repeat();
            System.out.println("\nSecond Round.");
            obj2.repeat();
        }    
    }
}
