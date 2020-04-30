#include<stdio.h>
#include<conio.h>
 void main()
 {

     int x,y,z,p,q,r,temp=0;
     scanf("%d",&x);
     scanf("%d",&y);
     scanf("%d",&z);
     //temp = x%100;
     p = (x/10)%10;
     temp=0;
     temp = y%100;
     q=temp/10;
     temp=0;
     temp=z%100;
     r=temp/10;
     printf("%d %d %d",p,q,r);





 }
