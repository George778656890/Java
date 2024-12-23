//Lab Assignment 5 Inheritance and Polymorphism- Algorithm Efficiency
class Fruit {

    private static int numberOfFruit = 0;
    protected String name = "";

    public Fruit() {
        numberOfFruit++;
    }

    public Fruit(String name) {
        this.name = name;
        numberOfFruit++;
    }

    public static int getNumberOfFruit() {
        return numberOfFruit;
    }

    public String getName() {
        return name;
    }

    public static void setNumberOfFruit(int numberOfFruit) {
        Fruit.numberOfFruit = numberOfFruit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String whatAmI() {
        return "Fruit ";
    }

    @Override
    public String toString() {
        return whatAmI();
    }
}

class DryFruit extends Fruit {

    public DryFruit() {
    }

    public DryFruit(String name) {
        super(name);
    }

    @Override
    public String whatAmI() {
        return "Dry Fruit " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this instanceof DryFruit && o instanceof DryFruit) {
            DryFruit tmp=(DryFruit)o;
            return this.name.equals(tmp.name);
        } else {
            return false;
        }

    }

}

class FleshyFruit extends DryFruit{

    public FleshyFruit() {
    }
    public FleshyFruit(String name){
            super(name);
    }
    @Override
    public String whatAmI() {
        return "Fleshy Fruit " + name;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this instanceof FleshyFruit && o instanceof FleshyFruit) {
            FleshyFruit tmp=(FleshyFruit)o;
            return this.name.equals(tmp.name);
        } else {
            return false;
        }

    }
    
}

public class Lab5 {

    public static void main(String[] args) {
         Fruit a,b,c,d,e,f;
        a = new Fruit();
        b = new FleshyFruit("Apple");
        c = new FleshyFruit("Apple");
        d = new FleshyFruit("apple");
        e = new DryFruit("Hazelnut");
        System.out.println("The number of Fruit is: "+Fruit.getNumberOfFruit());
        System.out.println("The number of Fruit is: "+a.getNumberOfFruit());
        System.out.println(a);
        System.out.println(b);
        System.out.println(e.whatAmI());
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));
        System.out.println(b.equals(e));
        f = a;
        System.out.println(f.equals(a));
    }
}
