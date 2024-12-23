//Lab Assignment #3
public class Circle {
    //data field
    private double x;
    private double y;
    private double radius;

    public Circle() {
        x=0.0;
        y=0.0;
        radius=1.0;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double area=Math.round(3.1415926*radius*radius*10.0)/10.0;
        return area;
        
    }
    
    @Override
    public String toString(){
        return " Circle at ( "+String.valueOf(this.x)+","+String.valueOf(this.y)+" ) with radius:"+String.valueOf(this.radius);
    }
    
    
    public double getPerimeter(){
        double perimeter=Math.round(2*3.1415926*radius*10.0)/10.0;
        return perimeter;
    }
    
    public boolean contains(double x, double y){
            if( Math.sqrt(  (this.x-x)*(this.x-x)+(this.y-y)*(this.y-y) ) <= this.radius ){
                return true;
            }
            else return false;
    }
    
    public boolean contains(Circle other) {
            if(distanceCentreToCentre(other)<=Math.abs(this.radius-other.radius)){
                return true;
            }
            else return false;
    }
    
    public double distanceCentreToCentre(Circle other){
            double distance=Math.sqrt((this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y) );
            double round_distance=Math.round(distance*10.0)/10.0;
            return round_distance;
    }
    
     public boolean overlapsWith(Circle other){
            if(distanceCentreToCentre(other)<=this.radius+other.radius){
                return true;
            }
            else return false;
     }
    public static void main(String[] args) {
       	Circle a = new Circle();
       	Circle b = new Circle(2.1,2.1,1.0);
	
       	System.out.println("a: "+a);
       	System.out.println("b: "+b); 
	
       	System.out.print("b's x, y, and radius: "+b.getX()+" "+b.getY()+" ");
       	System.out.println(b.getRadius());
       	System.out.println("Distance between centres of a and b: "+a.distanceCentreToCentre(b));       
       	System.out.println("Does a contain the point (0.4,0.4)? "+a.contains(0.4,0.4));
       	System.out.println("The area of a is: "+a.getArea());
       	System.out.println("The area of b is: "+b.getArea());
       	System.out.println("The perimeter of a is: "+a.getPerimeter());
       	System.out.println("The perimeter of b is: "+b.getPerimeter());
       	System.out.println("Does a contain b? "+a.contains(b));
       	System.out.println("Does b contain a? "+b.contains(a));
       	System.out.println("Do a and b overlap? "+a.overlapsWith(b));
       	System.out.println("Do b and a overlap? "+b.overlapsWith(a));
        b.setRadius(2.5);
        System.out.println("Does b contain a? "+b.contains(a));
        System.out.println("Do a and b overlap? "+a.overlapsWith(b));
       	System.out.println("Do b and a overlap? "+b.overlapsWith(a));
        b.setX(1.0);
	b.setY(1.0);
        a.setRadius(0.1);
        System.out.println("Does b contain a? "+b.contains(a));
	
    }
}
