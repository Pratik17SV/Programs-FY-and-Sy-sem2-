import java.util.Scanner;

public class Arrays {
    public static void main(String[]args){
        int[] n = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter the number in Array ["+i+"]:");
            n[i]=sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int s = sc.nextInt();
        int x=0;
        for(int j=0;j<10;j++)
        {
            if(s==n[j])
            {
                x++;
            }
        }
        System.out.println("The number "+s+" is repeated "+x+" times.");
        sc.close();
    }
    
}
