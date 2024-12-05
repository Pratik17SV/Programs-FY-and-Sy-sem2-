public class Bank_Account {
 //instance are

 //this is used to store account type;
 String accounttype;

 //this is Balance of account
 double balance;
 Customer customer;
 public Bank_Account(String accounttype,Customer customer){
    this.accounttype = accounttype;
    this.customer = customer;
 }
 public void deposite(double amount){
    this.balance+= amount;
 }
 public void withdraw(double amount)throws Exception
 {
    if(amount>this.balance)
    {
        throw new Exception("Amount is greater then available balance");
    }
    this.balance += amount;
 }
 public String getAccountInfo(){
    return this.accounttype +": " +this.balance;
 }
 //return name and address for the bank account
 public String getCustomerInfo(){
    return this.customer.getname() + ": "+this.customer.getaddress();
 }
}

