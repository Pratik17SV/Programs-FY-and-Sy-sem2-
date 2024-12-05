
public class Smallest1 
{
    public static void main(String args[])
    {
        int a=1;
        int b=2;
        int c=3;
        if(a>b)
        {
            if(c>b)
            {
                System.out.print("The number "+b+" is smaller.");
            }
            else
            {
                System.out.print("The number "+c+" is smaller.");
            }
        }
        else if(a<c)
        {
            System.out.print("The number "+a+" is smaller.");
        }
        else
        {
            System.out.print("The number "+c+" is smaller.");
        }
    }
    
}
