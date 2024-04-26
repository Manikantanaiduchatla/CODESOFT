import java.util.Scanner;

class A
{
	public void show()
	{
		System.out.println("Welcome to Quiz Competition");
		System.out.println("In this competition you have 5 questions");                 
		System.out.println("Each question carries 10 marks");
		System.out.println("!-----You Have Time Limit-----!");
		System.out.println();
	}
}
public class Task4
{
	public static void main(String[] args){
		A obj1 = new A();
		
		
		
		obj1.show();
		Scanner sc = new Scanner(System.in);
		int count=0,corr=0,incorr=0;

		String ques[] = new String[5];
		ques[0]="A.What ingredient is not used to make a Ratatouille?";
		ques[1]="B.When did the construction of the Golden Gate Bridge in San Francisco start?";
		ques[2]="C.On which time zone is London?";
		ques[3]="D.How many bones are there in an adult human body?";
		ques[4]="E.How long is a marathon?";

		String opn[][] = {{"1.Courgette","1.1933","1.Greenwich Mean Time","1.186","1.22.195"},{"2.Aubergine","2.1943","2.Central European Standard Time","2.196","2.32.195"},
		{"3.Spinach","3.1953","3.Australian Eastern Daylight Time","3.206","3.42.195"},{"4.Tomato","4.1963","4.Eastern Standard Time","4.216","4.52.195"}};
		
		String ans[] = {"Spinach","1933","Greenwich Mean Time","206","42.195"};
		for(int i=1;i<=5;i++)
		{
			System.out.println(ques[count]);
			for(int j=0;j<opn.length;j++)
				System.out.println(opn[j][count]);
			System.out.println("Time is running out");
			System.out.print("Answer : ");
			long start = System.currentTimeMillis();
			int a = sc.nextInt();
			long end = System.currentTimeMillis();
			double result = (end-start)/1000;
			switch(count)
			{
				case 0:
					if(a==3 && result<=5.0){
						System.out.println("Correct Answer");
						System.out.println("You answerd in : " + result + " sec");
						corr++;
					}
					else if(a!=3 && result<=5.0){
						System.out.println("Incorrect Answer");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
					else if(result>5.0)
					{
						System.out.println("Your time ranout");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;	
					}
				break;
				case 1:
					if(a==1 && result<=5.0){
						System.out.println("Correct Answer");
						System.out.println("You answerd in : " + result + " sec");
						corr++;
					}
					else if(a!=1 && result<=5.0){
						System.out.println("Incorrect Answer");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
					else if(result>5.0)
					{
						System.out.println("Your time ranout");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
				break;
				case 2:
					if(a==1 && result<=5.0){
						System.out.println("Correct Answer");
						System.out.println("You answerd in : " + result + " sec");
						corr++;
					}
					else if(a!=1 && result<=5.0){
						System.out.println("Incorrect Answer");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
					else if(result>5.0)
					{
						System.out.println("Your time ranout");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
				break;
				case 3:
					if(a==3 && result<=5.0){
						System.out.println("Correct Answer");
						System.out.println("You answerd in : " + result + " sec");
						corr++;
					}
					else if(a!=3 && result<=5.0){
						System.out.println("Incorrect Answer");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
					else if(result>5.0)
					{
						System.out.println("Your time ranout");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
				break;
				case 4:
					if(a==3 && result<=5.0){
						System.out.println("Correct Answer");
						System.out.println("You answerd in : " + result + " sec");
						corr++;
					}
					else if(a!=3 && result<=5.0){
						System.out.println("Incorrect Answer");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
					else if(result>5.0)
					{
						System.out.println("Your time ranout");
						System.out.println("You answerd in : " + result + " sec");
						incorr++;
					}
				break;
				default:
					System.out.println("Invalid option");
			}
			count++;
			System.out.println();
			
		}
		System.out.println("Number of correct answers are : " + corr);
		System.out.println("Number of incorrect answers are : " + incorr);
		System.out.println("Your total score is : " + (corr*10));
		
		
		
		
	}
}
