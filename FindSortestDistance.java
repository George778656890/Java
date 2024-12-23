//Lab Assignment1---find shortest distance of random generated points

import javafx.geometry.Point2D;

public class FindSortestDistance {

    public static void main(String[] args) {

        //reserve some spaces for variables
        final int ARRAY_LENGTH = 5;

        //create an array of Point2D objects
        Point2D[] pointObject = new Point2D[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
                double x=Math.random();
                double y=Math.random();
                pointObject[i]=new Point2D(x,y);
        }
        //calculate and compare distances
        double shortest = pointObject[0].distance(pointObject[1]);
        Point2D point1=pointObject[0];
        Point2D point2=pointObject[1];//By default,make the first pair of points the shortest one
        
        for(int i=0;i<ARRAY_LENGTH;i++){
                for(int j=i+1;j<ARRAY_LENGTH;j++){
                        if(pointObject[i].distance(pointObject[j])<shortest){
                            shortest=pointObject[i].distance(pointObject[j]);
                            point1=pointObject[i];
                            point2=pointObject[j];
                        }
                }
        }
        //print the final results
        System.out.println("The shortest distance is : "+shortest);
        System.out.println("The first point is       : ( "+point1.getX()+" , "+point1.getY()+" )");
        System.out.println("The second point is      : ( "+point2.getX()+" , "+point2.getY()+" )");
    }
}
