#include<stdio.h>
#include<conio.h>
void main()
{

    int test,a;
    char b[100];
    scanf("%d",&test);
    int sum=0;
    while(test--)
    {
        scanf("%s %d",b,&a);
        if(b== "up" || "UP")
        {
          sum=sum+a;
        }
         if(b == "down" || "DOWN")
        {

            sum=sum-a;
        }

    }
    printf("%d",sum);

    }

