public class prime8{
    public static void main (String args []){
    int n=7;
    int a=0;
    for(int i=1;i<=n;i++)
    {
    if(n%i==0)
    {
    a++;
    }
    }
    if(a==2)
    {
        System.out.println(n+" is prime number");
    }
    else
    {
    System.out.println(n+" is not prime number");
    }
    }
    }
    