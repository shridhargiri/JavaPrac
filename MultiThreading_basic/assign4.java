//create 2 threads. Write a program which displays number 1 to 10 using class lock. 

public class assign4 implements Runnable
{
	static Class ps;
	static void primary()
	{
		
		synchronized(ps)
		{
			for(int i = 1 ; i <= 5 ; i++)
			{
				System.out.println(i);
			}
		}
	}
	static void secondary()
	{
		synchronized(ps)
		{
			for(int i = 6 ; i <= 10 ; i++)
			{
				System.out.println(i);
			}
		}
	}
	public void run()
	{
		primary();
		secondary();
	}
	public static void main(String[] args) throws ClassNotFoundException 
	  {
       	      ps = Class.forName("assign4");
	      assign4 po = new assign4();
	      assign4 po1 = new assign4();
	      Thread t1 = new Thread(po);
	      Thread t2 = new Thread(po1);
	      t1.start();
	      t2.start();
	  }
}
