//Better Arithmetic Testing
import java.util.Scanner;
public class Lab8_2 {
    public static void main(String args[])
    {
        //creates a Scanner object to obtain input from console window
         Scanner input = new Scanner( System.in );
         
         //reserve some space for variables
         int result;
         int x=0;
         int y=0;
         int type=0;
         int trytimes;
         int count=0;
         int correctnumber=0;
         int ordinal=1;//Question 1,2,3....
         int userinput;
         
         //display the title of program to monitor
         System.out.println("Arithmetic Practice Program\n");
                             
         //get input data from the user
         System.out.print( "How many questions do you wish to try:" ); //prompt user for an action
         trytimes=input.nextInt();//read what the user enters
         System.out.println();
         
         
         while(count<trytimes){
         //generate integers randomly for x and y
         x=(int)((Math.random())*20+1);
         y=(int)((Math.random())*20+1);
         
         //generate a random number from 0 to 4
         type=(int)(Math.random()*5);
         count++;
         
         //Addition
         if(type==0){
             result=x+y;
             System.out.print("Question "+ordinal+":"+x+"+"+y+"=");
             ordinal++;
             userinput=input.nextInt();
             
             if(userinput==result){
             System.out.println("Correct\n");
             correctnumber++;
             
             }
             else {
                 System.out.println("Not Correct – the correct answer is:"+result);
                 System.out.println();
                  }
         }
         
         //Subtraction
         if(type==1){
             result=x-y;
             System.out.print("Question "+ordinal+":"+x+"-"+y+"=");
             ordinal++;
             userinput=input.nextInt();
             
             if(userinput==result){
             System.out.println("Correct\n");
             correctnumber++;
             
             }
             else {
                 System.out.println("Not Correct – the correct answer is:"+result);
                 System.out.println();
                  }
         }
         
         //Multiplication
         if(type==2){
             result=x*y;
             System.out.print("Question "+ordinal+":"+x+"*"+y+"=");
             ordinal++;
             userinput=input.nextInt();
             
             if(userinput==result){
             System.out.println("Correct\n");
             correctnumber++;
             
             }
             else {
                 System.out.println("Not Correct – the correct answer is:"+result);
                 System.out.println();
                  }
         }
         
         //Division
         if(type==3){
             result=x/y;
             System.out.print("Question "+ordinal+":"+x+"/"+y+"=");
             ordinal++;
             userinput=input.nextInt();
             
             if(userinput==result){
             System.out.println("Correct\n");
             correctnumber++;
             
             }
             else {
                 System.out.println("Not Correct – the correct answer is:"+result);
                 System.out.println();
                  }
         }
         
         //Modulo
          if(type==4){
             result=x%y;
             System.out.print("Question "+ordinal+":"+x+"%"+y+"=");
             ordinal++;
             userinput=input.nextInt();
             
             if(userinput==result){
             System.out.println("Correct\n");
             correctnumber++;
             
             }
             else {
                 System.out.println("Not Correct – the correct answer is:"+result);
                 System.out.println();
                  }
         }
         }
         
         
         
         
         //display the final scores
         System.out.println("You got "+correctnumber+" correct answer out of "+trytimes+ " questions given.");
         
         
    }
    
}
