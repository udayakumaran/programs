#include <stdio.h>
#include<string.h>

int main()
{   char s[100];
   int i,j,n,m,k=1,l;
   scanf("%s",s);
   l=strlen(s);
   for(i=0;i<strlen(s);i++)
   {    l=1;
       for(j=strlen(s)-1;j>=0;j--)
       {
           if(i<=j)
           {
               printf("%c ",s[i]);
              
               
           }
           else
           {
                 printf("%c ",s[i-l]);
              
           l++;
           }
       }
       printf("\n");
   }
}
