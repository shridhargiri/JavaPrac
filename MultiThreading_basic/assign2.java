//multi-threading using Runnable interface


class alpha1 implements Runnable
{
    synchronized public void run()
    {
        for(char ch = 'a' ; ch <='j' ; ch++)
        {
            System.out.println(ch);
        }
    }
}
class alpha2 implements Runnable
{
    synchronized public void run()
    {
        for(char ch = 'A' ; ch <='J' ; ch++)
        {
            System.out.println(ch);
        }
    }
}
class assign2
{
    public static void main(String[] args) {
        alpha1 a1 = new alpha1();
        alpha2 a2 = new alpha2();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        t1.start();   
        t2.start();
    }
}