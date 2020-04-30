#include<stdio.h>
#include<conio.h>
void main()
{
 int b,i,count=0,d=0;
 char a[100],c[100];
 scanf("%s",a);
 scanf("  %d",b);
 for(i=0; a[i]!='\0'; i++)
  {
       if(a[i]=='a' || a[i]=='e' || a[i]=='i' ||
           a[i]=='o' || a[i]=='u' || a[i]=='A' ||
           a[i]=='E' || a[i]=='I' || a[i]=='O' ||
           a[i]=='U')
        {

        }
        else //if((a[i]>='a'&& a[i]<='z') || (a[i]>='A'&& a[i]<='Z'))
        {
            ++count;
        }
  }
  //c[d]='\o';
  printf("%d",count);

}
