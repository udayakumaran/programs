abstract class encaps
{
	private int atmpin;



		public void getper(int pin1)
		{
		atmpin=pin1;

		}

		public int setpin()
		{
		return atmpin;
		}

		public void getper(String father)
		{
		System.out.println(father);
		}

		abstract void fathername();

		}
class mom extends encaps
	{
		void fathername()
		{
		System.out.println("fathername");
		}
		  public void getper()
		{
		super.getper("appa");
		System.out.println("son");
		}

		

	}
class son 
	{

		public static void main(String ar[])
		{
		mom c = new mom();
                c.getper(2453667);
		System.out.println(+c.setpin());
		c.fathername();
		c.getper();
		
		}

	}