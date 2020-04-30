#include<iostream>
#include<conio.h>
int main()

{
long int a,b,sum1=0,sum2=0;
cin>>a;
while(a>0)
{
    b=a%10;
    if(isdigit(b)== 0)
    {
    if(b%2==0)
    {
     sum1=sum1+b;
     b=0;

    }
    else
    {
        sum2=sum2+b;
        b=0;

    }
    }
    else
    {

        cout<<"invalid";
        break;
    }
    a=a%2/10;
}

}
