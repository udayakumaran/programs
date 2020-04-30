class oddeven
{
public static void main(String ar[]) 
{
int i,j,c[100];
for(i=1;i<=100;i++)
{
if(i%2==0)
{
System.out.println("evens are "+i);
}
else
{
c[i]=i;
}
}
for(i=1;i<100;i++)
{
System.out.println("odds are "+c[i]);
}
}
}