class cmdline
{
public static void main(String ar[]) 
{
int a , b;
a=Integer.parseInt(ar[0]);
b=Integer.parseInt(ar[1]);
a=a+b;
b=a-b;
a=a-b;
System.out.println(+a+"  "+b);
}
}