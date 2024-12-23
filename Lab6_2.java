//
import java.util.ArrayList;
import java.util.Date;
public class Lab6_2 {

    public static void main(String[] args) {
        Account georgeAccount=new Account("George",1122,1000);
        
        georgeAccount.deposit(30);
        georgeAccount.deposit(40);
        georgeAccount.deposit(50);
        
        georgeAccount.withdraw(5);
        georgeAccount.withdraw(4);
        georgeAccount.withdraw(2);
        
        georgeAccount.printAccountSummary();
    }
}

class Account {

    private String name;
    private int id;
    private double balance;
    private final static double INTEREST_RATE = 1.5;
    private ArrayList<Transaction> transactions;

    public Account() {
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
        } else {
            System.out.println("There's no enough money in your bank account.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));

    }

    public void printAccountSummary() {
        System.out.println("Account Summary as follow : ");
        System.out.print("Account Holder Name : " + name + "\n" + "Interest Rate : " + INTEREST_RATE + "\n" + "Balance : " + balance);
        System.out.println();
        System.out.println("Transaction Details : ");
        for(int i=0;i<transactions.size();i++){
            transactions.get(i).printTransaction();
            System.out.println();
        }

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(ArrayList transactions) {
        this.transactions = transactions;
    }

}

class Transaction {

    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction() {

    }

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public void printTransaction() {

        System.out.print("Date and Time :" + date + "  Type : " + type + "  Amount : " + amount + "  Balance : " + balance + " Description :" + description);
    }

    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
