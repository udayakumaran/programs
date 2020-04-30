class arconst
{

arconst(int h,int u)
{
System.out.println(h+u);
System.out.println(h-u);
System.out.println(h*u);
System.out.println(h/u);

         
} 
public static void main(String ar[]) 
	{
         int a,b;
         
         a=Integer.parseInt(ar[0]);
	 b=Integer.parseInt(ar[1]);
         new arconst(a,b);

        


}

}
