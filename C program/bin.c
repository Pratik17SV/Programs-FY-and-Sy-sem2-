#include<stdio.h>

void main(){
    int n,r,d=0,base=1;

     scanf("%d",&n);
      while(n>0){
        r=n%10;
        d=d+r*base;
        n=n/10;
      }
      printf("the number is :%d",n);
}