#include<stdio.h>
#include<conio.h>
int replace(long int number,int n)
{

if (number == 0)
return 0;



int digit = number % 10;
if (digit == n)
digit = 0;
return replace(number/10,n) * 10 + digit;
}
int Convert(long int number)
{
if (number == 0)
 {
     return 1;
 };


else
{
    int n=number;
    int d = n%10;
    return replace(number,d);
}
}

int main()
{
long int number;
printf("\n");
scanf("%d", &number);
printf("%d\n", Convert(number));
return 0;
}
