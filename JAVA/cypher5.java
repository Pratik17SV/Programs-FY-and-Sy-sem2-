import java.util.Scanner;
import java.util.Arrays;
public class cypher5 {
   
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        char ch;
        System.out.print("Enter the string:");
        String message = scanner.nextLine();
        System.out.print("Enter the key:");
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the operator(+,-,*,/):");
        ch=c.next().charAt(0);
        int key = scanner.nextInt();
        int i;
        String message1;
    switch (ch)
    {
    case '+':
        for(i=0;i<=message.length();i++)
    {
     message1.charAt(i)=(message.charAt(i)+key);
    }
    System.out.print(message);
        break;
    case '-':
    for(i=0;i<=message.length();i++)
    {
      message1.charAt(i)= message.charAt(i)-key;
    }
    System.out.print(message);
    break;
    case '*':
    for(i=0;i<=message.length();i++)
    {
     message1.charAt(i)= message.charAt(i)*key;
    }
    System.out.print(message);
    break;
    case '/':
    for(i=0;i<=message.length();i++)
    {
      message1.charAt(i)= message.charAt(i)/key;
    }
    System.out.print(message);
    break;
    
    default:
        break;
    }

    scanner.close();   
    }
    
}
