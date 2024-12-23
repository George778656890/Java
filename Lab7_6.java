//Count words
import java.util.*;
import java.io.*;
public class Lab7_6 {
    public static void main(String args[]) throws IOException{
        File file=new File("Lincon.txt");
        Scanner input=new Scanner(file);
        
        int counter=0;
        while(input.hasNext()){
            counter++;
            input.next();
        }
        input.close();
        System.out.println("The number of words is : "+counter);
    }
}
