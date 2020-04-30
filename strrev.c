#include <stdio.h>
#include<string.h>
int main() {
    int i,t,s,flag;
    char a[200];
    int test;
    scanf("%d",&test);
    while(test--){flag=0;
    scanf("%s",a);
    for(i=0;i<strlen(a);i++)
    {
        if(a[i]=='.')
        { s=i-1;
            while(s>=t)
            {
                printf("%c",a[s]);
                s--;
            }
            flag=0;
            printf(".");
        }
        else if(flag==0)
        {
            t=i;
            flag=1;
        }
    }
    s=strlen(a)-1;
        if(a[s]!='.')
        {
            while(s>=t)
            {
            printf("%c",a[s]);
            --s;
            }
        }
        printf("\n");
    }
    return 0;
}
