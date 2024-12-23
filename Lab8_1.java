//Abstract  Bank class
abstract class GeneralBank {

    protected GeneralBank() {
    }

    public abstract double getSavingInterestRate();

    public abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank {
    //data fields

    private double savingInterest= 0.04;
    private double fixedInterest= 0.085;

    public ICICIBank() {
        
    }

    public ICICIBank(double savingInterest, double fixedInterest) {
        this.savingInterest = savingInterest;
        this.fixedInterest = fixedInterest;
    }

    public void setSavingInterest(double savingInterest) {
        this.savingInterest = savingInterest;
    }

    public void setFixedInterest(double fixedInterest) {
        this.fixedInterest = fixedInterest;
    }
    

    @Override
    public double getSavingInterestRate(){
        return savingInterest;
    }
    @Override
    public  double getFixedInterestRate(){
        return fixedInterest;
    }
}

class KotMBank extends GeneralBank {
    //data fields

    private double savingInterest=0.06;
    private double fixedInterest=0.09;

    public KotMBank() {
        
    }

    public KotMBank(double savingInterest, double fixedInterest) {
        this.savingInterest = savingInterest;
        this.fixedInterest = fixedInterest;
    }

    public void setSavingInterest(double savingInterest) {
        this.savingInterest = savingInterest;
    }

    public void setFixedInterest(double fixedInterest) {
        this.fixedInterest = fixedInterest;
    }
    

    @Override
    public double getSavingInterestRate(){
        return savingInterest;
    }
    @Override
    public  double getFixedInterestRate(){
        return fixedInterest;
    }
}

public class Lab8_1 {

    public static void main(String[] args) {
        
        //super class reference variable could refet to all its subclass objects
        ICICIBank object1=new ICICIBank();
        KotMBank object2=new KotMBank();
        GeneralBank object3=new KotMBank();
        GeneralBank object4=new ICICIBank();
    }
}

