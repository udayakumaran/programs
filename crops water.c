#include <stdio.h>

int main()
{
   int a,b,c,d,sum=0,i;
   scanf("%d %d %d %d",&a,&b,&c,&d);
   for(i=1;i<=c;i++)
   {
       sum+=a*b;
       b=b-d;
   }
   printf("%d",sum);
   
}
