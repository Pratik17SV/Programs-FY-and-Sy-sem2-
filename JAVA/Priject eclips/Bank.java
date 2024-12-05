import java.util.Scanner;

public class Bank{
    public static void main(String[] args) {
        // created new instence of Bank to call
        Bank bank = new Bank();
        // call the run method
        bank.run();
    }
    public void run(){
        System.out.println("Welcom to the bank");
        Scanner sc= new Scanner(System.in);
        //get input of customer name
        System.out.print("Enter the name:");
        String name = sc.next();
        System.out.println("Hello"+name+"we are creating checking and saving account for you.");
        System.out.println("Enter the address:");
        String address = sc.next();
        customer.setAddress(address);
        Bank_Account checkingAccount = new Bank_Account("checking",address);

        sc.close();
    }
}