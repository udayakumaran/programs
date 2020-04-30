class student
{
public static void main(String ar[]) 
{
int i,n,sum=0;
int a[]= new int[50];
n=Integer.parseInt(ar[0]);
for(i=1;i<=n;i++)
{
a[i]=Integer.parseInt(ar[i]);
}
for(i=1;i<=n;i++)
{
sum+=a[i];
}
System.out.println("TOTAL");
System.out.println(+sum);
System.out.println("AVERAGE ");
 int avg=sum/n;
System.out.println(+avg);
System.out.println("GRADE");
if(avg>90)
{
System.out.println("S GRADE");
}
else if(avg>80 && avg<=90)
{

System.out.println("A GRADE");
}
else if(avg>70 && avg<=80)
{
System.out.println("B grade");

}
else if(avg>60 && avg <=70)
{
System.out.println("C grade");
}
else if(avg>55 && avg <=60)
{
System.out.println("D grade");
}
else if(avg<=50 && avg >=55)
{
System.out.println("E grade");
}
else
{
System.out.println("F grade");
}
}}