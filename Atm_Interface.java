import java.util.Scanner;

class AtmMachine 
{
  Scanner sc = new Scanner(System.in);
  double balance = (double)(Math.random()*10000);
  
  public void show()
  {
    System.out.println();
    System.out.println("HELLO USER..\n");
    System.out.println("*****GOOD MORNING*****\n");
    System.out.println("Welcome to AutoMatic Teller Machine\n");
    System.out.println("Select your Language..");
    System.out.println("1.English");
    System.out.println("2.Telugu");
    System.out.println("3.Hindi");
    System.out.print("Choose 1 or 2 or 3 : ");
    int choice = sc.nextInt();

    switch(choice)
    {
      case 1:
      System.out.println("Your selected language is English");
      break;
      case 2:
      System.out.println("Your selected language is Telugu");
      break;
      case 3:
      System.out.println("Your selected language is Hindi");
      break;
      default:
      System.out.println("Invalid option..");
      break;
    }
    System.out.println();
    System.out.println("Select your account type..");
    System.out.println("1.Current Account");
    System.out.println("2.Savings Account");
    System.out.print("Choose 1 or 2 : ");
    int choose2 = sc.nextInt();
    switch(choose2)
    {
      case 1:
      System.out.println("You selected Current Account");
      break;
      case 2:
      System.out.println("You selected Savings Account");
      break;
      default:
      System.out.println("Invalid option..");
    }
    System.out.println();

  }
  
  public void withdrawl()
  {
      
      System.out.print("Enter amount to withdrawl : ");
      int amount = sc.nextInt();
      
      if(balance<amount)
      {
        System.out.println("Insufficient Balance");
        System.out.println("ThankYou for visiting...Have a nice day");
      }
      else{
        System.out.println("Your transaction is in process...");
        System.out.println("Your amount is debited successfully");;
        System.out.println("You withdrawl amount is : " + amount);
        System.out.print("Your current balance is : ");
        System.out.format("%.2f",balance-amount);
        System.out.println();
        System.out.println("ThankYou for visiting...Have a nice day");

      }
      
  }
  public void deposit()
  {
    System.out.print("Enter amount to deposit : ");
    int amount = sc.nextInt();
    System.out.println("Your deposition is in process...");
    System.out.println("Your amount is credited successfully");
    System.out.println("You deposited amount is : " + amount);
    System.out.print("Your current balance is : ");
    System.out.format("%.2f",balance+amount);
    System.out.println();
    System.out.println("ThankYou for visiting...Have a nice day");


  }
  public void checkBalance()
  {
    System.out.print("Your account balance is : ");
    System.out.format("%.2f",balance);
    System.out.println();
    System.out.println("ThankYou for visiting...Have a nice day");
  }
}
class bankAccount extends AtmMachine
{
  public void display()
  {
      System.out.print("Your balance is : ");
      System.out.format("%.2f",balance);
      System.out.println();
      System.out.println("1.Withdrawl");
      System.out.println("2.Deposit");
      System.out.println("3.Check Balance");
      System.out.print("Choose 1 or 2 or 3 : ");

      int select = sc.nextInt();
      if(select==1)
        withdrawl();
      else if(select==2)
        deposit();
      else if(select==3)
        checkBalance();
      else
        System.out.println("Invalid selection");
  }
}
public class Task3
{
  public static void main(String[] args) 
  {
      bankAccount atm = new bankAccount();
      atm.show();
      atm.display();
  
  }
}
