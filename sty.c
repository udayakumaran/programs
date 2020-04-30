#include<stdio.h>
#include<conio.h>
#include<string.h>

void main() {
     int testcase;
    char contents [2000];

    scanf ("%d\n",&testcase);
;
while(testcase--)
{
   scanf("%s",contents);
   char str[10];

   int i = 0, j = 0;


   while (contents[i] != '\0')
    {
      if (contents[i] != '.')
      {
         str[j] = contents[i];
         j++;
      }
   else
    {
         str[j] = '\0';
         int k = 0,temp,h;
        h = strlen(str) - 1;

        while (k < h) {
        temp = str[k];
        str[k] = str[h];
        str[h] = temp;
        k++;
        h--;
   }
         printf("%s", str);
         printf(".");
         j = 0;
      }
      i++;
   }

   str[j] = '\0';
   int k = 0,temp,h;
        h = strlen(str) - 1;

        while (k < h) {
        temp = str[k];
        str[k] = str[h];
        str[h] = temp;
        k++;
        h--;
   }
   printf("%s", str);
}
   getch();
}
