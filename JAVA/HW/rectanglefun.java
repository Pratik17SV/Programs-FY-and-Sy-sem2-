import java.util.Scanner;

public class rectanglefun{
    public static int rectangle(int length, int bredth){
      return length*bredth;
    }
public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length:");
    int length = sc.nextInt();
    System.out.print("Enter bredth:");
    int bredth = sc.nextInt();
    System.out.println("The are of rectangle of length:"+length+" Bredth:"+bredth+" is "+rectangle(length,bredth));
    sc.close();
}
}