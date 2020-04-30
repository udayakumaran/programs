import java.util.*;
class pallind
{
public static void main(String ar[])
{
int i,n;

String s ;
Scanner t = new Scanner(System.in);
s=t.nextLine();
String r ="";
n=s.length();
System.out.println(n);
for(i=n-1;i>=0;i--)
{
r = r + s.charAt(i);
}
if(s.equals(r))
{
System.out.println("pallindrome");
}
else
{
System.out.println("not");
}
}
}