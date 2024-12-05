import java.util.Scanner;
public class createstring2 {
    public static void main(String[] agrs)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String userInput1 = scanner.nextLine();
        System.out.print("Enterthe string 2: ");
        String userInput2= scanner.nextLine();
        System.out.println("The user input string is: "+userInput1);
        System.out.println("The user input string 2: "+userInput2);
        scanner.close();

    }
}