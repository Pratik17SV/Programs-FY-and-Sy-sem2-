package employee;
import java.util.Scanner;
public class Varible {
    public static void main(String agr[])
{
Scanner sc= new Scanner(System.in);
String name;
char gender;
byte age;
long mobile;
float percentage;
double per;
System.out.println("ENTER YOUR NAME :");
name=sc.next();
System.out.println("ENTER YOUR GENDER :");
gender=sc.next().charAt(0);
System.out.println("ENTER YOUR AGE :");
age=sc.nextByte();
System.out.println("ENTER YOUR MOBILE :");
mobile=sc.nextLong();
System.out.println("ENTER YOUR PERCENTAGE :");
percentage=sc.nextFloat();
System.out.println("ENTER YOUR PERCENTAGE FOR DOUBLE :");
per=sc.nextDouble();
sc.close();
int percent=(int)per;
System.out.println(name);
System.out.println(gender);
System.out.println(age);
System.out.println(mobile);
System.out.println(percentage);
System.out.println(percent);
}

}
