import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String sub[] =  {"Maths","Physics","Chemistry","Biology","Social"};
        int marks[] = new int[sub.length];
        System.out.println("Enter the marks in each subject out of 100");
        

        for(int i=0;i<sub.length;i++)
        {
            System.out.print("Enter marks in " + sub[i] + " : ");
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<sub.length;i++)
        {
            System.out.println(sub[i] + " : " + marks[i]);
        }
        for(int i=0;i<sub.length;i++)
        {
            sum+=marks[i];
        }
        System.out.println();
        System.out.println("Total marks obtained in " + sub.length + " subjects is : " + sum);
        
        double avgPercentage = (sum)/(sub.length);
        System.out.println("The average percentage is : " + avgPercentage + " %");

        if(avgPercentage<10)
            System.out.println("Your grade is F");
        else if(avgPercentage>9 && avgPercentage<50)
            System.out.println("Your grade is D");
        else if(avgPercentage>49 && avgPercentage<75)
            System.out.println("Your grade is C");
        else if(avgPercentage>74 && avgPercentage<95)
            System.out.println("Your grade is B");
        else if(avgPercentage>94 && avgPercentage<=100)
            System.out.println("Your grade is A");

    }
}
