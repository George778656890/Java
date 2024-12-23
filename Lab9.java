//Main, MyThing and Set<E> class

import java.util.ArrayList;
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

class Set<E> {
    
    private int size = 0;
    private E[] data;
    private static final int DEFAULT_CAPACITY = 16;
    
    public Set() {
        Object[] tempArray = new Object[DEFAULT_CAPACITY];
        data = (E[]) tempArray;//Casting object tempArray into E[]
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public void add(E item) {
        if (!contains(item)) {//ignore the duplicate
            if (size >= data.length) {
                Object[] temp = new Object[data.length * 2];
                System.arraycopy(data, 0, temp, 0, data.length);
                data = (E[]) temp;
            }
            data[size++] = item;
        }
    }
    
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
    
    public boolean contains(E item) {
        for (int i = 0; i < size; i++) {
            if (item.equals(data[i])) {
                return true;
            }
        }
        return false;
    }
    
    public Set<E> union(Set<E> other) {
        Set<E> s = new Set<>();
        for (int i = 0; i < size; i++) {
            s.add(data[i]);
        }
        for (int i = 0; i < other.size(); i++) {
            if (!s.contains(other.get(i))) {//ignore the dupliate
                s.add(other.get(i));
            }
        }
        return s;
    }
    
    public Set<E> intersection(Set<E> other) {
        Set<E> s = new Set<>();
        for (int i = 0; i < size; i++) {
            if (other.contains(data[i])) {
                s.add(data[i]);
            }
        }
        return s;
    }
    
    public Set<E> difference(Set<E> other) {
        Set<E> s = new Set<>();
        for (int i = 0; i < size; i++) {
            if (!other.contains(data[i])) {
                s.add(data[i]);
            }
        }
        
        return s;
    }
    
}

public class Lab9 {
    
    public static void main(String[] args) {
        
        Set<String> setStringObject1 = new Set<String>();
        System.out.println("setStringObject1 is empty ? " + setStringObject1.isEmpty());
        System.out.println("The size of setStringObject1 is : " + setStringObject1.size());
        setStringObject1.add("Apple");
        setStringObject1.add("Pear");
        setStringObject1.add("Banana");
        System.out.println("setStringObject1 is empty ? " + setStringObject1.isEmpty());
        System.out.println("The size of setStringObject1 is : " + setStringObject1.size());
        System.out.println("The 0th object of setStringObject1 is : " + setStringObject1.get(0));
        System.out.println("setStringObject1 contains orange ? " + setStringObject1.contains("Orange"));
        
        Set<String> setStringObject2 = new Set<String>();
        setStringObject2.add("Apple");
        setStringObject2.add("Pear");
        setStringObject2.add("Orange");

        //setStringObject1={"Apple","Pear","Banana"}
        //setStringObject2={"Apple","Pear","Orange"}
        System.out.print("The union of setStringObject1 and setStringObject2 is : ");
        Set<String> setStringObject_Union = setStringObject1.union(setStringObject2);
        for (int i = 0; i < setStringObject_Union.size(); i++) {
            
            System.out.print(setStringObject_Union.get(i) + "  ");
        }
        
        System.out.println();
        System.out.print("The intersection of setStringObject1 and setStringObject2 is : ");
        Set<String> setStringObject_Intersection = setStringObject1.intersection(setStringObject2);
        for(int i=0;i<setStringObject_Intersection.size();i++){
            
            System.out.print(setStringObject_Intersection.get(i) + "  ");
        }
        
        System.out.println();
        System.out.print("The difference of setStringObject1 and setStringObject2 is : ");
        Set<String> setStringObject_Difference = setStringObject1.difference(setStringObject2);
        for(int i=0;i<setStringObject_Difference.size();i++){
            System.out.print(setStringObject_Difference.get(i) + "  ");
        }
        System.out.println("\n");
        
        Set<MyThing> setMyThingObject1=new Set<MyThing>();
        System.out.println("setMyThingObject1 is empty ? " + setMyThingObject1.isEmpty());
        System.out.println("The size of setMyThingObject1 is : " + setMyThingObject1.size());
        setMyThingObject1.add(new MyThing(1));
        setMyThingObject1.add(new MyThing(2));
        setMyThingObject1.add(new MyThing(3));
        System.out.println("setMyThingObject1 is empty ? " + setMyThingObject1.isEmpty());
        System.out.println("The size of setMyThingObject1 is : " + setMyThingObject1.size());
        System.out.println("The 0th object of setMyThingObject1 is : " + setMyThingObject1.get(0));
        System.out.println("setMyThingObject1 contains an object of MyThing(6) ? " + setMyThingObject1.contains(new MyThing(6)));
        
        Set<MyThing> setMyThingObject2=new Set<MyThing>();
        setMyThingObject2.add(new MyThing(1));
        setMyThingObject2.add(new MyThing(2));
        setMyThingObject2.add(new MyThing(6));
        
        //setMyThingObject1={1,2,3}
        //setMyThingObject2={1,2,6}
        System.out.print("The union of setMyThingObject1 and setMyThingObject2 is : ");
        Set<MyThing> setMyThingObject_Union = setMyThingObject1.union(setMyThingObject2);
        for (int i = 0; i < setMyThingObject_Union.size(); i++) {
            
            System.out.print(setMyThingObject_Union.get(i) + "  ");
        }
        
        System.out.println();
        System.out.print("The intersection of setMyThingObject1 and setMyThingObject2 is : ");
        Set<MyThing> setMyThingObject_Intersection = setMyThingObject1.intersection(setMyThingObject2);
        for (int i = 0; i < setMyThingObject_Intersection.size(); i++) {
            
            System.out.print(setMyThingObject_Intersection.get(i) + "  ");
        }
        
        System.out.println();
        System.out.print("The difference of setMyThingObject1 and setMyThingObject2 is : ");
        Set<MyThing> setMyThingObject_Difference = setMyThingObject1.difference(setMyThingObject2);
        for(int i=0;i<setMyThingObject_Difference.size();i++){
            System.out.print(setMyThingObject_Difference.get(i) + "  ");
        }
        System.out.println("\n");
        
    }
}
