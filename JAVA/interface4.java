import java.util.Scanner;
public class interface4 {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the Passaward: ");
        String passward = scanner.nextLine();
        String name1 = "Pratik Gaikwad";
        String passward1 = "Pratik7738"; 
        if(name.equals(name1)&&passward.equals(passward1))
        {
            System.out.println("You can login.");
        }
        else
        {
            System.out.println("Please check Entered.");
        }
        scanner.close();
    }
}