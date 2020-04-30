#include <stdio.h>

int main()
{
    int c = 0, count = 0,i;
    char s[1000];

    printf("Input a string\n");
    scanf("%s",s);

    while (s[c] != '\0')
    {
        if (s[c] == 'a' || s[c] == 'A' || s[c] == 'e' || s[c] == 'E' || s[c] == 'i' || s[c] == 'I' || s[c] =='o' || s[c]=='O' || s[c] == 'u' || s[c] == 'U')
            count++;
        c++;
    }
     if(count==0)
     {
         printf("-1");
         //return 0;
     }
     else if(count%2==0)
    {
        for(i=1; i<=c; i=i+2)
            printf("%c",s[i]);
    }
     else{

       for(i=0; i<=c; i=i+2)
            printf("%c",s[i]);
     }

    return 0;
}
