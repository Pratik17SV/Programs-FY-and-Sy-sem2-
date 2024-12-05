#include<stdio.h>
int main()
{
  char a,c;  
  int k=0,b[32],d,i;
  printf("Enter the message:");
  scanf("%c",&c);
   for(a='A';a<='Z';a++)
   {
     if(c==a)
     {
      break;
     }
     k++;
   }
   printf("Decimal number: %d\n",k);
   d=k;
   for(i=0;d>0;i++)
   {
    b[i]=d%2;
    d=d/2;
   }
   printf("Binary conversion:");
    if(d==0)
   {
    printf("0");
   }
   for (int j = i - 1;j>=0;j--)
   {
    printf("%d",b[j]);
   }
   printf("\n");
  return 0;
}