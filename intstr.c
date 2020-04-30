#include<stdio.h>
#include<stdlib.h>
int main(){
    char a[100000];
    scanf("%[^\n]s",a);
    int i,x,odd=0,even=0;
    for(i=0;i<strlen(a);i++)
    {
        if(a[i]>='0'&&a[i]<='9'&&a[i]!=' ')
        {
        x=a[i]-'0';
        if(x%2==0)
        {
            even+=x;
        }
        else if(x%2!=0)
        {
            odd+=x;
        }
        }
        else if(a[i]==' ')
        {
            printf("Invalid");
            return 0;
        }
        else
        {
            printf("Invalid");
            return 0;
        }
    }
    int sum=odd-even;
    printf("%d",sum);
}
