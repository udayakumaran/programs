#include <stdio.h>
#include <string.h>

int main()
{
	char a[100][100], r[100], temp[100];
	int i, j = 0,k,n,l,m;



    scanf("%d",&n);
    printf("Enter a string: ");

	for(k=0;k<n;k++)
    {
      scanf("%s",&a[k]);
    }
      for(l=1;l<=n;l++)
      {
          for(m=1;m<=n;m++)
          {
      for(i=1; i <= strlen(a[l][m]); i++)
	{
	    if (isalnum(a[l][i]))
	    {
	        temp[j] = a[l][i];
	        j++;
	    }
	}
	temp[j] = '\0';

	i = 0;


	while( temp[i] ) {

      temp[i] = tolower(temp[i]);
      i++;
	}

   	strcpy(r, temp);


	strrev(r);



   	if( strcmp(temp,r) == 0){
		printf("yes");
	}else{
		printf("no");
	}
          }
      }

}
