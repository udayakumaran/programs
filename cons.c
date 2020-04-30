#include <stdio.h>
int main()
{
    char line[100],t[100];
    int i, vowels, consonants, digits, spaces,a,d;
    vowels =  consonants = d = spaces = 0;
    scanf("%[^\n]", line);
    scanf("%d",&a);
    for(i=0; line[i]!='\0'; ++i)
    {
        if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
           line[i]=='o' || line[i]=='u' || line[i]=='A' ||
           line[i]=='E' || line[i]=='I' || line[i]=='O' ||
           line[i]=='U')
        {
            ++vowels;
        }
        else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
        {   t[d]=line[i];
            ++d;
            ++consonants;
        }

    }

    t[a]='\0';
    if(a<=d)
    {
    for(i=0; t[i]!='\0'; ++i)
    {
        printf("%c",t[i]);
    }
    }

    else{
        printf("invalid");
    }
    return 0;
}
