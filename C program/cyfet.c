#include<stdio.h>
#include<string.h>
int main()
{
    int key,i=0,temp;
    char message[100],ch;
    printf("Enter the String: ");
    gets(message);
    printf("Enter the Key: ");
    scanf("%c %d",&ch,&key);
    temp=strlen(message);
    switch (ch)
    {
    case '+':
        for(i=0;i<=temp;i++)
    {
     message[i]=message[i]+key;
    }
    printf("%s",message);
        break;
    case '-':
    for(i=0;i<=temp;i++)
    {
     message[i]=message[i]-key;
    }
    printf("%s",message);
    break;
    case '*':
    for(i=0;i<=temp;i++)
    {
     message[i]=message[i]*key;
    }
    printf("%s",message);
    break;
    case '/':
    for(i=0;i<=temp;i++)
    {
     message[i]=message[i]/key;
    }
    printf("%s",message);
    break;
    
    default:
        break;
    }
 return 0;
}   