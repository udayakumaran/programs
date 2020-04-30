#include<stdio.h>
void main()
{

    int n , i ,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(j==n/2||j==n/2-i||j==n/2+i)

            {
                printf("*");

            }
            else{printf(" ");}

        }
        printf("\n");
    }
}
