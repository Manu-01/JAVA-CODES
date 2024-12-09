    public class runnable extends Thread{
        String name;
        public runnable(String s){
             name=s;
          }
        public void run(){
         for(int i=0;i<10;i++){
               try{
                  sleep(1000);
                 }catch(InterruptedException e){
                    System.out.println(e);
                  }
             
        System.out.println(name+" "+i);
           } 
       }
       public static void main(String arg[]){
           runnable t=new  runnable("First");
            runnable t1=new runnable("Second");
           t.start();
           t1.start();
           System.out.println(t.currentThread());  
       } 
      }
