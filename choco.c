#include<stdio.h>
#include<conio.h>
void main()
{

    int a,b,c,i;
    scanf("%d",&a);
    scanf("%d",&b);
    for(i=1;i<=100;i++)
    {
        if((b*i)>=a)
           {
             if(b*i==a)
             {

               c=i;
             } else{

             c=i-1;
             }



             break;
            }

    }
    printf("%d",a-b*c);
}
