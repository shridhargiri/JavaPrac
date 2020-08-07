//3 threads; while 1 thread is executing other 2 should not interfere in between
class allMethods
{
    synchronized public void process1()
    {
        System.out.println("Process on thread 1:");
        for(int i = 0 ; i <= 5 ; i++)
        {
            System.out.println("ThOne- exec " + i);
        }
    }
    synchronized public void process2()
    {
        System.out.println("Process on thread 2:");
        for(int i = 0 ; i <= 5 ; i++)
        {
            System.out.println("ThTwo- exec " + i);
        }
    }
    synchronized public void process3()
    {
        System.out.println("Process on thread 3:");
        for(int i = 0 ; i <= 5 ; i++)
        {
            System.out.println("ThThree- exec " + i);
        }
    }
}
class A implements Runnable
{
    allMethods ref;
    public A(allMethods ref)
    {
        this.ref = ref;
    }
    public void run()
    {
        ref.process1();
    }
}
class B implements Runnable
{
    allMethods ref;
    public B(allMethods ref)
    {
        this.ref = ref;
    }
    public void run()
    {
        ref.process2();
    }
}
class C implements Runnable
{
    allMethods ref;
    public C(allMethods ref)
    {
        this.ref = ref;
    }
    public void run()
    {
        ref.process3();
    }
}
public class assign3 {
    public static void main(String[] args) {
        allMethods am = new allMethods();
        A a = new A(am);
        B b = new B(am);
        C c = new C(am);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }   
}