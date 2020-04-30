
import java.util.*;
class ascci
{
public static void main(String args[])
{
int i,j,n,f;
String s,r="";
Scanner t = new Scanner(System.in);
s=t.nextLine();
n=s.length();

for(i=0;i<=n-1;i++)
{
int d = s.charAt(i);
if(d>=65 && d<=90)
{
d=d+32;
char k = (char)d;
System.out.println(k);

}
else
{
d=d-32;
char k = (char)d;
System.out.println(k);
}
}
}
}