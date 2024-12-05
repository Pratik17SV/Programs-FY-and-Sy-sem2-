import java.util.Scanner;
public class Divisiblitycheck 
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n1 = scanner.nextInt();
        if(n1%2==0)
        {
            System.out.println("The number is Divisible by 2.");
        }
        else
        {
            System.out.println("THe number is NOt Divisible by 2.");
        }
        scanner.close();


    }
    
}
