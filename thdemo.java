public class thdemo extends Thread{
    String name;
    public thdemo(String a){
        name = a;
    }
    public void run()
    {
        for (int i=0;i<10;i++){
            try{
                sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(name+" " +i);
        }

    }
    public static void main(String[] args) {
        thdemo t =new thdemo("First");
        t.start();
    }
    
}
