//Process data from a file
import java.util.Scanner;
import java.io.File;

public class Lab8_5 {

    public static void main(String args[]) throws Exception {
        // create Scanner object to obtain input from file
        Scanner inputFile = new Scanner(new File("Lab8Data.txt"));

        //reserve some spaces for variables
        int cycle = 0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int positive_count=0;
        int negative_count=0;
        int positive_sum=0;
        int  negative_sum=0;
        int tmp;
        int ordinal = 1;
        
        //display the title of program to monitor
        System.out.println("Statistical data file processing\n");
        System.out.println("The numbers processed are as follows:\n");

        cycle = inputFile.nextInt();
        while (cycle > 0) {
            tmp = inputFile.nextInt();
            System.out.printf("Number %2d :%5d", ordinal, tmp);
            System.out.println();
            if(tmp>0)
            {
            max=Math.max(max,tmp);
            positive_count++;
            positive_sum=positive_sum+tmp;
            
            
            }else if(tmp<0)
            {
            min=Math.min(min, tmp);
            negative_count++;
            negative_sum=negative_sum+tmp;
            
            }
            cycle--;
            ordinal++;
        }
        System.out.println();
        
        //display the total summary
        System.out.println("Statistics for Positive values");
        System.out.printf("Count of positive numbers :%5d",positive_count);
        System.out.println();
        System.out.printf("Sum of positive numbers   :%5d",positive_sum);
        System.out.println("\n");
        
        System.out.println("Statistics for Negative values");
        System.out.printf("Count of negative numbers :%5d",negative_count);
        System.out.println();
        System.out.printf("Sum of negative numbers   :%5d",negative_sum);
        System.out.println("\n");
        
        System.out.println("Overall Stats");
        System.out.printf("Maximum number            :%5d",max);
        System.out.println();
        System.out.printf("Minimum number            :%5d",min);
        System.out.println();

    }
}
