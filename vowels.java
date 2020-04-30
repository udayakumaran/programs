class vowels
{
public static void main(String ar[])
{
int i,n,j;

String s = ar[0];
String r;
n=s.length();
System.out.println(n);
char c[] = s.toCharArray();
for(i=0;i<=n;i++)
{
if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
{
System.out.println(c[i]);
}
}

for(i=0;i<=n;i++)
{
/*if((c[j]>'a'&&c[j]<'e')||(c[j]>'e'&&c[j]<'i')||(c[j]>'i'&&c[j]<'o')||(c[j]>'o'&&c[j]<'u')||(c[j]>'u'&&c[j]<='z'))
{
System.out.println(c[j]);
}*/
if((c[i]>'a'&&c[i]<'e'))
        {
           System.out.println(c[i]);
        }
        else if((c[i]>'e')&& (c[i]<'i'))
        {
            System.out.println(c[i]);
        }
        else if((c[i]>'i')&& (c[i]<'o'))
        {
            System.out.println(c[i]);
        }
        else if((c[i]>'o')&& (c[i]<'u'))
        {
            System.out.println(c[i]);
        }
 else if(c[i]>'u'&&c[i]<='z')
        {
            System.out.println(c[i]);
        }
//System.out.println(r);
}
}}