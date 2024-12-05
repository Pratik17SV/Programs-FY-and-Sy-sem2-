public class amstrong3
{
     public static void main(String args[])
    {
        int n=155;
        int sum=0;
        int rem;
        int temp=n;
        int i;
       for( i=0;n!=0;i++)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        
        if(sum==temp)
        {
            System.out.println(temp+" is an amstrong nuber.");
        }
        else
        {
            System.out.println(temp+" is not an Amstrong number");
        }
    }
}
    

