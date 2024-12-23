//
import java.util.ArrayList;
public class Lab6_1 {
    public static void main(String[] args){
        ArrayList list=new ArrayList<>();
        
        Date dateObject=new Date();
        list.add(dateObject);
        
        Loan loanObject=new Loan();
        list.add(loanObject);
        
        Circle2 circleObject=new Circle2();
        list.add(circleObject);
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
    }
}

class Loan{
    private double mortgage=0.0;

    public Loan() {
    }
    
    public Loan(double mortgate){
        this.mortgage=mortgate;
    }

    public double getMortgage() {
        return mortgage;
    }

    public void setMortgage(double mortgage) {
        this.mortgage = mortgage;
    }
    @Override
    public String toString(){
        return "Object of Loan class ";
    }
    
}
class Circle2{
    private double radius=0.0;

    public Circle2() {
    }
    
    public Circle2(double radius){
        this.radius=radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "Object of Circle2 class";
    
    }
    
}
class Date{
    private int year=0;
    private int month=0;
    private int day=0;

    public Date() {
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public String toString(){
        return "Object of Date class ";
    }
    
}