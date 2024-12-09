 public class A implements Runnable 
{

    public void run() 
{
        System.out.println(Thread.currentThreadisAlive().getName());
    }

    public static void main(String[] args)
 {
        A a1 = new A();
        Thread t1 = new Thread(a1, "one");
        Thread t2 = new Thread(a1, "two");
        Thread t3 = new Thread(a1, "three");

        t1.start();
        t2.start();
        t3.start(); 
    }
}
    
