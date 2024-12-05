public class Customer {

    //this is for name of cistomer
    String name;

    //this is for address of customer
    String address;
    
    public Customer(String name){
        this.name=name;
    } 
    public static void setAddress(String address){
        this.address = address;
    }
    //returing customer name
    public String getname(){
        return this.name;
    }
    public String getaddress(){
        return this.address;
    }

}
