public class primeseries {
  public static void main(String args[])
  {
    System.out.println("The prime number between 50 to 100 are :");
    for(int n=50;n<100;n++)
    {
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
       System.out.println(n);
     }
    }
  }
}