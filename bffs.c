#include<stdio.h>
#include<conio.h>
void bfs(int v);
int adj[10][10],n;
void main()
{
 int i,j,v=1;
 clrscr();
 printf("\n \t \t BREAdTH FIRST SEARCH");
 printf("\nENTER THE NODES YOU NEED...");
 scanf("%d",&n);
 printf("\nENTER THE ADJACENCY MATRIX...");
 for(i=1;i<=n;i++)
 {
  for(j=1;j<=n;j++)
  {
   scanf("%d",&adj[i][j]);
  }
 }
 printf("\nTHE VISTED ORDER IS...");
 printf("\n %d",v);
 bfs(v);
 getch();
}






void bfs(int v)
{
 int u,w,q[10],i,vis[10],front=0,rear=0;
 for(i=1;i<=n;i++)
 vis[i]=0;
 vis[v]=1;
 u=v;
 while(v<=n)
 {
  front=0;
  rear=0;
  for(i=1;i<=n;i++)
  {
   q[i]=0;
  }
  for(w=1;w<=n;w++
  {
   if(adj[v][w]==1)
   {
    if(vis[w]==0)
    {
     front++;
     q[front]=w;
     vis[w]=1;
    }
   }
  }
  if((rear==0)&&(front==0))



  {
   return;
  }
  else
  {
   while(rear<front)
   {
    rear++;
    u=q[rear];
    printf(" -> %d",u);
   }
  }
  v++;
 }
