//understanding multi-threading

class alpha1 extends Thread
{
    public void run()
    {
        for(char ch = 'a' ; ch <='j' ; ch++)
        {
            System.out.println(ch);
        }
    }
}
class alpha2 extends Thread
{
    public void run()
    {
        for(char ch = 'A' ; ch <='J' ; ch++)
        {
            System.out.println(ch);
        }
    }
}
class assign1
{
    public static void main(String[] args) {
        alpha1 a1 = new alpha1();
        alpha2 a2 = new alpha2();
        a1.start();   
        a2.start();
    }
}