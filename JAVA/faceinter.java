import java.util.Scanner;

interface area{
   public void getarea();
}
class rectangle implements area{
    int l,b;
    public void rectangle(int l , int b)
    {
        this.l=l;
        this.b=b;
    }
    public void getarea()
    {
        int r = l*b;
        System.out.println("The area of Rectangle is "+r);
    }
}
class faceinter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lnegth:");
        int l = sc.nextInt();
        System.out.println("Enter the Lnegth:");
        int b = sc.nextInt();
        rectangle ar = new rectangle(l,b);

        sc.close();
    }
}