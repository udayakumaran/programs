#include <stdio.h>

int main()
{
    int i, j, n,val=1,r;
    scanf("%d", &n);
    r= (n/4);
     for(i=0; i<=r; i++)
    {

        for(j=0; j<=r; j++)
        {
            if(i==0)
            {
            printf("\t%d",val);
            val++;
            }
             else if(j==r)
            {

                printf("\t%d",val);
                val++;
            }

            else if(j==0)
            {

                printf("\t%d",n);
                n--;
            }
            else if(i==r)
            {
            printf("\t%d",n);
            n--;
            }

            else
                printf("\t");
        }
        printf("\n");
    }
    return 0;
}
