class constructer
{
   public  int sum(int a,int b)
    {
        return a+b;
    }
    public  int sum(int a,int b,int c)
    {
        return a+b+c;
    }

public double sum(double a,double b,double c)
    {
        return a+b+c;
    }
    public  int sum(int a,double b)
    {
        return a+(int)b;
    }

    public static void main(String[] args) {
        constructer c=new constructer();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,3));
        System.out.println(c.sum(1.1,3.7,1.2));
        System.out.println(c.sum(1,2.6));

    }
}