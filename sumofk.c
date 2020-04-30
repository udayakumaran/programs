#include<stdio.h>
#include<string.h>
void main()
{
    int a[20],k,s,sum=0,n,i,b[20];
    scanf("%d %d",&n,&k);
    for(i=1;i<=n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=1;i<=k;i++)
    {
        sum=sum+a[i];

    }
  s=n-k;
  for(i=s+1;i<=n;i++)
  {
     b[i]=sum-a[i];

  }
  for(i=s+1;i<=n;i++)
  {
     printf("  %d",b[i]);

  }

}
