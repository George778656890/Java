//MyThing class
import java.util.Arrays;
class MyThing implements Cloneable, Comparable<MyThing> {

    private int value;

    public MyThing() {
    }

    public MyThing(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyThing object) {
        if (value > object.value) {
            return 1;
        } else if (value < object.value) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "MyThing with value of " + value;
    }

    @Override
    public boolean equals(Object others) {
        if (others instanceof MyThing) {
            return value == ((MyThing) others).value;
        } else {
            return false;
        }
    }
}

public class Lab8_4 {

    public static void main(String[] args) {
        
        MyThing object1=new MyThing(1);
        MyThing object2=new MyThing(2);
        System.out.println("object1 equals object2 ? "+object1.equals(object2));
        System.out.println("object1 compareTo object2 , return value is :"+object1.compareTo(object2));
        System.out.println();
        
        MyThing object1_Copy=(MyThing)object1.clone();
        System.out.println("object1==object1_Copy is "+(object1==object1_Copy));
        System.out.println("object1.equals(object1_Copy) is "+(object1.equals(object1_Copy)));
        System.out.println();
        
        MyThing[] array=new MyThing[5];
        for(int i=0;i<array.length;i++){
            int randomNumber=(int)(Math.random()*100);
            array[i]=new MyThing(randomNumber);
        }
        
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
