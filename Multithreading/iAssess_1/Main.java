import java.util.*;
import java.io.*;
public class Main extends Thread
{
    String textCounter;

    Main(String textCounter){
        this.textCounter = textCounter;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Counters :");
        int num=sc.nextInt();
        sc.nextLine();
        Main[] obj=new Main[num];
        String[] input = new String[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter text for counter "+(i+1)+" :");
            input[i]=sc.nextLine();
            obj[i]=new Main(input[i]);
        }
        for(int i=0;i<num;i++){
            
            System.out.println("Counter " + (i+1)+" Result :");
            obj[i].start();
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
        }
    }
