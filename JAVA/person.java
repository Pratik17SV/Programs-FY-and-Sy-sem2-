import java.util.Scanner;

public class person {
    int age[] = new int[3];
    String name[]= new String[3];
    public static void main(String[] args) {
        person detail = new person();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
         System.out.print("Enter the name:");
         detail.name[i]= sc.next(); 
         System.out.print("Enter the age:");
         detail.age[i]= sc.nextInt();
        }
        System.out.print("Enter the age to search:");
        int s =sc.nextInt();
        for(int j=0;j<3;j++)
        {
          if(s==detail.age[j])
          {
           System.out.println("Name: "+detail.name[j]+" Age: "+detail.age[j]);
          }
        }
        sc.close();
    }
    
}
