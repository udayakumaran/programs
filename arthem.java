class const
{
const(String s,int a,int b)
{
if(s=="+")
{
System.out.println("ADDITION" +(a+b));
          			
}
}

}
class cs
{
	public static void main(String ar[]) 
	{
         int a,b;
         a=Integer.parseInt(ar[0]);
	 b=Integer.parseInt(ar[1]);
         String s = ar[2];
         new const(s,a,b);

        

	}
}