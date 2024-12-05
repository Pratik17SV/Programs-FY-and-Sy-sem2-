import java.util.Scanner;
public class fac4 {
    public static void main(String[] arg)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the Number to find the Factorial: ");
        int n = scanner.nextInt();
        int fac = 1;
        for (int i=1;i<=n;i++) 
        {
          fac=fac*i; 
        }
        System.out.println("The factorial of number is "+fac );
        scanner.close();
    }
    
}
