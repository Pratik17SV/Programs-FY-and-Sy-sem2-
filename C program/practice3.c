#include<stdio.h>
#include<conio.h>
void main()
{
    int fac=1,i=1,n,temp;
    printf("Enter the Number:");
    scanf("%d",&n);
    temp=n;
    while(i<=n)
    {
        fac=fac*i;
        i++;
    }
    printf("The factorial of %d is %d",temp,fac);
    getch();
}