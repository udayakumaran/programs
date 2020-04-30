#include<stdio.h>
#include<conio.h>
 void main()
 {

     int n,a[100],i;
     int count = 0;
      while(scanf("%d",&n)>0)
     {
      a[count]=n;
      count++;
     }
     printf("%d",count);
     for(i=0;i<count;i++)
     {

         printf("%d",a[i]);

     }
 }
