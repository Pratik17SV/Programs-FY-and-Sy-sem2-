class superclass
{
    int age;
    superclass(int age){
        this.age=age;
    }
    public void getAge(){
        System.out.println("The value of the varible named age is super class is "+age);
    }
}
public class Subclass extends superclass{
    Subclass(int age){
    super(age);
    }
    public static void main(String[]args){
        Subclass s= new Subclass(24);
        s.getAge();
    }
}