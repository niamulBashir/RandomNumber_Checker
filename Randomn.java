import java.util.Scanner;
class Randomnum {
    private int randomnNumber;
    public int randomegenerator(){
    int randomnNumber = (int) (Math.random()*10);
      return randomnNumber;
    } 

    public void compareNumber(int d){
   
        if(d==randomnNumber)
        {
            System.out.println("Great Game , You have Won");
        }
        else {
            if(randomnNumber>d) System.out.println("Random Number is Higher Than Input Number ");
            else System.out.println("Random Number is Lower Than Input Number ");
         Randomn.limitNumber();
        }
     }
   
}

public class Randomn{
    public static int count =5;
    public static void main(String a [])
    {
        Randomnum obj1 = new Randomnum();
        System.out.println("Welcome to Guess Game,You can take " + (count-1) + " Attempts");
        limitNumber();
    }
    public static void limitNumber(){
    count--;    
    if(count>0)
    {
    Randomnum obj2 = new Randomnum();    
    System.out.println("Please Enter Number : ");    
    Scanner  scana = new Scanner(System.in);
    int b = scana.nextInt();
    obj2.compareNumber(b);
    }
    else {
        System.out.println("Yout count has been finished");
    }

    }
}