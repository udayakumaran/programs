#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
    char a[1000000000000] ,b[1000000000000];
    long int n,c;
    scanf("%ld %[^\n]",&n,a);
    while(n>=0)
    {
        strcpy(b,a);
        strcat(a,b);
        n--;
    }
    c=strlen(b);
    printf("%ld",c);
}
