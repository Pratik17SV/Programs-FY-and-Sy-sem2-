import java.util.Scanner;

public class student1 {
    
    
    int[] age = new int[3];
    String[] name = new String[3];
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student1 person = new student1();
        for(int i=0;i<3;i++)
        {
        System.out.print("Enter the name:");
        person.name[i]= sc.next();
        System.out.print("Enter the Age:");
        person.age[i] = sc.nextInt();
        }
        System.out.print("Enter the Age to find same age group: ");
        int a = sc.nextInt();
        sc.close();
         for(int j=0;j<3;j++)
        {
            
            if(a==person.age[j])
            {
                System.out.println("The Name: "+person.name[j]+" the age is:"+person.age[j]);
            }    
        }
    }
}
