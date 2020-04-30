class fibo
{
public static void main(String ar[])
{ int i;
 int a[] = new int[100];
a[0]=0;
a[1]=1;
System.out.println(+a[0]);
System.out.println(+a[1]);
for(i=2;i<=10;i++)
{
a[i]=a[i-2]+a[i-1];
System.out.println(+a[i]);
}



}
}