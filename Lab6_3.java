//Pay check revisited
import java.util.Scanner;
import java.io.File;
public class Lab6_3 {
    public static void main(String args[])throws Exception
    {
        // create Scanner object to obtain input from file
       Scanner inputFile = new Scanner( new File ("PaycheckData3.txt") );
       
       //reserve spaces for variables
       double wage;
       double mon,tue,wed,thur,fri,sat,sun;
       double totalWorkhour;
       double e_mon,e_tue,e_wed,e_thur,e_fri,e_sat,e_sun;//total earings
       double e8_mon,e8_tue,e8_wed,e8_thur,e8_fri,e8_sat,e8_sun;//regular earings
       double ot_mon,ot_tue,ot_wed,ot_thur,ot_fri,ot_sat,ot_sun;//overtime earings
       //double e_weekday,e_weekend;//total earings
       double e8_weekday,e8_weekend;//regular earings
       double ot_weekday,ot_weekend;//overtime earings
       double sum;
       int    id;
       String first_name,last_name;
       
       //read data from file
       first_name=inputFile.next();
       last_name=inputFile.next();
       id=inputFile.nextInt();
       inputFile.nextLine();
       
       wage=inputFile.nextDouble();
       inputFile.nextLine();
       
       mon=inputFile.nextInt();
       inputFile.nextLine();
       
       tue=inputFile.nextInt();
       inputFile.nextLine();
       
       wed=inputFile.nextDouble();
       inputFile.nextLine();
       
       thur=inputFile.nextDouble();
       inputFile.nextLine();
       
       fri=inputFile.nextInt();
       inputFile.nextLine();
       
       sat=inputFile.nextInt();
       inputFile.nextLine();
       
       sun=inputFile.nextDouble();
       
       //computations
       totalWorkhour=mon+tue+wed+thur+fri+sat+sun;
       
       //monday earings
       if(mon>8){
       e8_mon=8*16.50;
       ot_mon=(mon-8)*16.50*1.5;
       e_mon=e8_mon+ot_mon;
       }
       else {
        e8_mon=mon*16.50;
        ot_mon=0.00;
        e_mon=e8_mon+ot_mon;
       }
       
       //tuesday earings
       if(tue>8){
       e8_tue=8*16.50;
       ot_tue=(tue-8)*16.50*1.5;
       e_tue=e8_tue+ot_tue;
       }
       else {
        e8_tue=tue*16.50;
        ot_tue=0.00;
        e_tue=e8_tue+ot_tue;
       }
       
       //wednesday earings
       if(wed>8){
       e8_wed=8*16.50;
       ot_wed=(wed-8)*16.50*1.5;
       e_wed=e8_wed+ot_wed;
       }
       else {
        e8_wed=wed*16.50;
        ot_wed=0.00;
        e_wed=e8_wed+ot_wed;
       }
       
       //Thursday earings
       if(thur>8){
       e8_thur=8*16.50;
       ot_thur=(thur-8)*16.50*1.5;
       e_thur=e8_thur+ot_thur;
       }
       else {
        e8_thur=thur*16.50;
        ot_thur=0.00;
        e_thur=e8_thur+ot_thur;
       }
       
       //Friday earings
       if(fri>8){
       e8_fri=8*16.50;
       ot_fri=(fri-8)*16.50*1.5;
       e_fri=e8_fri+ot_fri;
       }
       else {
        e8_fri=fri*16.50;
        ot_fri=0.00;
        e_fri=e8_fri+ot_fri;
       }
       
       //Saturday earings
       if(sat>8){
       e8_sat=8*16.50;
       ot_sat=(sat-8)*16.50*2.0;
       e_sat=e8_sat+ot_sat;
       }
       else {
        e8_sat=sat*16.50;
        ot_sat=0.00;
        e_sat=e8_sat+ot_sat;
       }
       
       //Sunday earings
       if(sun>8){
       e8_sun=8*16.50;
       ot_sun=(sun-8)*16.50*2.0;
       e_sun=e8_sun+ot_sun;
       }
       else {
        e8_sun=sun*16.50;
        ot_sun=0.00;
        e_sun=e8_sun+ot_sun;
       }
       
       
       
       e8_weekday=e8_mon+e8_tue+e8_wed+e8_thur+e8_fri;//weekday regular earings
       ot_weekday=ot_mon+ot_tue+ot_wed+ot_thur+ot_fri;//weekday overtime earings
       
       e8_weekend=e8_sat+e8_sun;//weekend regular earings
       ot_weekend=ot_sat+ot_sun;//weekend overtime earings
       
       
       sum=e8_weekday+ot_weekday+e8_weekend+ot_weekend;
       
       //display the title of this program
       System.out.println("Employee Paystub\n\n");
       
       System.out.println("Employee First Name       :"+first_name);
       System.out.println("Employee Last  Name       :"+last_name);
       System.out.println("Employee Number           :"+id);
       System.out.printf("Hourly wage               :$%7.2f",wage);
       System.out.println();
       System.out.println();
       
       System.out.printf("Hours worked on Monday    :%5.1f\n",mon);
       System.out.printf("Hours worked on Tuesday   :%5.1f\n",tue);
       System.out.printf("Hours worked on Wednesday :%5.1f\n",wed);
       System.out.printf("Hours worked on Thursday  :%5.1f\n",thur);
       System.out.printf("Hours worked on Friday    :%5.1f\n",fri);
       System.out.printf("Hours worked on Saturday  :%5.1f\n",sat);
       System.out.printf("Hours worked on Sunday    :%5.1f\n\n",sun);
       
       System.out.printf("Total Hours worked        :%5.1f\n\n",totalWorkhour);
       
       System.out.printf("Monday earnings           : $%7.2f\n",e_mon);
       System.out.printf("Tuesday earnings          : $%7.2f\n",e_tue);
       System.out.printf("Wednesday earnings        : $%7.2f\n",e_wed);
       System.out.printf("Thursday earnings         : $%7.2f\n",e_thur);
       System.out.printf("Friday earnings           : $%7.2f\n",e_fri);
       System.out.printf("Saturday earnings         : $%7.2f\n",e_sat);
       System.out.printf("Sunday earnings           : $%7.2f\n\n",e_sun);
       
       System.out.printf("Weekday regular earnings  : $%7.2f\n",e8_weekday);
       System.out.printf("Weekday overtime earnings : $%7.2f\n",ot_weekday);
       System.out.printf("Weekend regular earnings  : $%7.2f\n",e8_weekend);
       System.out.printf("Weekend overtime earnings : $%7.2f\n\n",ot_weekend);
       
       System.out.printf("Total Salary              : $%7.2f\n\n",sum);
       
       System.out.println("Make sure to download the data file which corresponds to this pay stub and include in the project directory.");
       
    }
}
