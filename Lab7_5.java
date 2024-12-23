//Write/read data
import java.util.*;
import java.io.*;
public class Lab7_5 {
    public static void main(String args[]) throws IOException{
                
        File file=new File("Task2.txt");
        if(file.exists()){
            System.out.println("File already exists");
            return;
        }else{
            PrintWriter output=new PrintWriter(file);
            for(int i=0;i<100;i++){
                output.print((int) (Math.random() * 100));
                output.print(" ");
            }
            output.close();
        }
        
        Scanner input=new Scanner(file);
        
        ArrayList<Integer> number=new ArrayList<>();
        
        while(input.hasNext()){
            number.add(input.nextInt());
        }
        input.close();
        
        Collections.sort(number);
        
        System.out.println(number);
        
        
    }
}
