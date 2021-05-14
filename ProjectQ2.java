package project.q2;
import java.util.Scanner;
public class ProjectQ2 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("inseart maximum redundancy ratio");
         double r=s.nextDouble();
         binary_search_tree x1=new binary_search_tree();
         
            double current_r=0.0;
            int count=0;
            while(current_r<r)
            {
                count++;
                System.out.println("enter a number " +count+ " & -1 to exit");
                int num=s.nextInt();
                if(num==-1){
                    break;
                }
                 x1.insert(num);
                 current_r=x1.get_current_ratio(); 
            }
         //************************************************
         if(current_r>=r)
             System.out.println("many repetitions");
         else
             System.out.println("only few repetitions");
    }   
}
