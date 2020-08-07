public class assign5 
{
    public static void main(String[] args)
    {
        ThreadManager tm = new ThreadManager();
        ClA ob1 = new ClA(tm);
        ClB ob2 = new ClB(tm);
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();
    }
}
class ClA implements Runnable
{
    ThreadManager obj;
    public ClA(ThreadManager obj)
    {
        this.obj = obj;
    }
    public void run()
    {
     //   while(true)
       // {
            obj.print_normal();
        //}
    }
}
class ClB implements Runnable
{
    ThreadManager obj;
    public ClB(ThreadManager obj)
    {
        this.obj = obj;
    }
    public void run()
    {
        obj.print_reverse();
    }
}
class ThreadManager
{
    int num;
    static boolean toogle;
    synchronized void print_normal()
    {
        for(int i = 1 ; i <= 50 ; i++)
       {
           while(toogle)
           {
               try{
                    wait();
               }
               catch(InterruptedException ie)
               {
                   ie.printStackTrace();
               }
           }
           System.out.println("Th-1  " + i);
           notifyAll();
           toogle = true;
       }
    }
    synchronized void print_reverse()
    {
        for(int i = 50 ; i >= 1 ; i--)
       {
           while(!toogle)
           {
               try
               {
                    wait();
               }
               catch(InterruptedException ie)
               {
                   ie.printStackTrace();
               }
           }
           System.out.println("Th-2  " + i);
           notifyAll();
           toogle = false;
       }
    }
}