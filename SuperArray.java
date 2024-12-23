//Classes as new types
public class SuperArray {
    
    //data fields
    private int[] arr;
    private static  final int NEGATIVE_ASSIGNMENT=20;
    
    
    
    //by-default constructor
    public SuperArray(){
        arr=new int[1];
    }
    //construct a new object with patameter of "size"
    public SuperArray(int size){
        if(size<=0) 
            size=NEGATIVE_ASSIGNMENT;
        arr=new int[size];
    }
    //fill the array with sequence
    public void fillSimple(){
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
    }
    //pint each element of array
    public void print(){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
    
    public static void main(String[] args){
        //arraySize=1(by-default constructor)
        SuperArray fillSimple1=new SuperArray();
        fillSimple1.fillSimple();
        fillSimple1.print();
        System.out.println();
        
        //arraySize=10
        SuperArray fillSimple2=new SuperArray(10);
        fillSimple2.fillSimple();
        fillSimple2.print();
        System.out.println();
        
        //arraySize=-10
        SuperArray fillSimple3=new SuperArray(-10);
        fillSimple3.fillSimple();
        fillSimple3.print();
        System.out.println();
        
        //arraySize=0
        SuperArray fillSimple4=new SuperArray(0);
        fillSimple4.fillSimple();
        fillSimple4.print();
        System.out.println();
    }
}
