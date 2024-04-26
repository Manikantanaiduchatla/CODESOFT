import java.util.*;
class A
{
    public void show()
    {
        System.out.println("Available Courses");
        System.out.println("1.BTech");
        System.out.println("2.MTech");
        System.out.println("3.Architecture");
        System.out.println("4.MBBS");
        System.out.println("5.Law");
    }
}


public class Task5
{                                       
         
    public static void main(String[] args)          
    {
        A obj = new A();
        Scanner sc = new Scanner(System.in);
        int num=1;
        
        String course[][]={{"1.EBCC101","2.BTech","3.B Tech full form Bachelor of Technology is a 4-year undergraduate engineering course that is available in several specializations.","4.Only 40 seats are available","5.Timings : 9 AM to 4 PM"},
        {"1.EBMT102","2.Mtech","3.MTech is a postgraduate degree programme of two years in the field of engineering",
        "4.Only 60 seats are available ","5.Timings : 9 AM to 1 PM"},
        {"1.EBAR103","2.Architecture","3.This program is the primary route to licensure, combining design, history, technology, and hands-on studio experiences over five years.",
        "4.Only 30 seats are available","5.Timings : 9 AM to 5 PM"},
        {"1.EBMB104","2.MBBS","3.MBBS degree is a five-year-long undergraduate medical degree programme. MBBS is derived from the Latin phrase Medicinae Baccalaureus Baccalaureus Chirurgiae.",
        "4.Only 20 seats are available","5.Timings : 8 AM to 3 PM"},
        {"1.EBLA105","2.Law","3.The course is designed to provide students with an understanding of the structure of the U.S. legal system.","4.Only 10 seats are available ","5.Timings : 9 AM to 2 PM"}};

        List<String> std =new ArrayList<>();
        std.add("ID : 1047\nNAME : Manikanta\n");
        std.add("ID : 1048\nNAME : Anu\n");
        std.add("ID : 1049\nNAME : Teja\n");
        std.add("ID : 1050\nNAME : Sri\n");
        std.add("ID : 1051\nNAME : Durga\n");

        List<String> arr = new ArrayList<>();
        arr.add("REGISTERED COURSE : BTech");
        arr.add("REGISTERED COURSE : MTech");
        arr.add("REGISTERED COURSE : Architecture");
        arr.add("REGISTERED COURSE : MBBS");
        arr.add("REGISTERED COURSE : Law");

        List<String> naya = new ArrayList<>();
        
        
        for(int i=1;i<=5;i++)
        {
            System.out.println();
            obj.show();
            System.out.print("Please enter interest for student " + i + " : ");
            int choice = sc.nextInt();
            if(choice>=1 && choice<=5){
                for(int j=0;j<5;j++)
                    System.out.println(course[choice-1][j]);
                System.out.println(std.get(i-1) + arr.get(choice-1));
                naya.add(arr.get(choice-1));
            }
            else{
                System.out.println("Invalid Selection..");
            }
            System.out.print("Do you want to drop your course student " + i +" Y=1/N=0 :");
            int option = sc.nextInt();
            if(option==1){
                System.out.print("Please select which course you want : ");
                int wish = sc.nextInt();
                if(wish>=1 && wish<=5){
                    for(int j=0;j<5;j++)
                        System.out.println(course[wish-1][j]);
                    System.out.println(std.get(i-1) + arr.get(wish-1));
                    naya.remove(arr.get(choice-1));
                    naya.add(arr.get(wish-1));
                    
                }
                else
                    System.out.println("Invalid Selection..");

            }
            else if(option==0)
                continue;
        }
        System.out.println();
        for(int i=0;i<5;i++)
        {
            System.out.println("For Student " + std.get(i)+ naya.get(i) + "\n");
            
        }
        
    }
    
    
}
