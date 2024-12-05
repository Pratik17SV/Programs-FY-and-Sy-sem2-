import java.util.Scanner;

class sclass {
    int age;
    String name;

    public sclass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void getAge() {
        System.out.println("The value of the variable named is " + name + " and age in the superclass is " + age);
    }
}
public class Subclass2 extends sclass {
    public Subclass2(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        Subclass2 s = new Subclass2(0, null);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name:");
        s.name = sc.nextLine();
        
        System.out.print("Enter the age:");
        s.age = sc.nextInt();
        
        sc.close();
        s.getAge();
        
    }
}
