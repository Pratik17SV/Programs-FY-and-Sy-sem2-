#include<stdio.h>
#include<conio.h>
void fibonacciseries(int n)
{
int first=0,second=1,next,i;
for(i=0;i<n;i++)
{
if(i<=1)
{
next=i;
}
else
{
next=first+second;
first=second;
second=next;
}
printf("%d ",next);
}
printf("\n");
}
void main()
{
int term;
printf("Enter the number of term for Fibonacci series: ");
scanf("%d",&term);
fibonacciseries(term);
getch();
}
