package Interface;

import java.util.*;
class student
{
    String name;
    int roll_no;
    public void get_details()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Name:");
        name = sc.nextLine();
        System.out.print("Enter Roll No:");
        roll_no = sc.nextInt();
        sc.close();
    }
}
class marks extends student
{
    int m1,m2,m3;
    public void get_marks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject 1 marks:");
        m1 = sc.nextInt();
        System.out.print("Enter subject 2 marks:");
        m2 = sc.nextInt();
        System.out.print("Enter subject 3 marks:");
        m3 = sc.nextInt();
        sc.close();
    }
}
class result extends marks
{
    int total;
    float percentage;
    public void calculate()
    {
        total = 0;
        total = m1+m2+m3;
        percentage = ((float) total/300) * 100;
    }
    public void display()
    {
        System.out.println("Student Details");
        System.out.println("Name: " +name);
        System.out.println("Roll No: " +roll_no);
        System.out.println("Marks in Subject 1 : " +m1);
        System.out.println("Marks in Subject 2 : " +m2);
        System.out.println("Marks in Subject 3 : " +m3);
        System.out.println("Total: " +total);
        System.out.println("Percentage: " +percentage);
    }
}
public class display_student_details
{
    public static void main (String args[])
    {
      result r = new result();
      r.get_details();
      r.get_marks();
      r.calculate();
      r.display();
    }    
}

