import java.util.Scanner;
public class Pratik3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] n= new String[3];
        String[] c= new String[3];
        for(int i=0;i<3;i++)
        {
        System.out.print("Enter the id: ");
        n[i] = scanner.nextLine();
        System.out.print("Enter the Student name: ");
        c[i] = scanner.nextLine();
        }
        for(int j=0;j<3;j++)
        {
            System.out.println(""+n[j]);
            System.out.println(""+c[j]);
        }
        scanner.close();
    }
}

