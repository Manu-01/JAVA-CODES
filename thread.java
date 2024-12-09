public class thread implements Runnable{
    public void run(){
    for(int i=0;i<10;i++){
    try{
    Thread.sleep(1000);
    }
    catch(InterruptedException e){
    System.out.println(e);
    }
    System.out.println(i);
}
    }
    public static void main(String[] args){
    thread a1 = new thread();
    Thread t1,t2;
    t1=new Thread(a1,"one");
    t2=new Thread(a1,"Two");
    t1.start();
    t2.start();
System.out.println(t1.isAlive()?"Thread is Live":"Thread is DEad");
    }
    }