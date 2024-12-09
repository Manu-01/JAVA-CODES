import java.util.*;
 class Box{
	int l, b, w;
	public Box(){
		l = 10;
		b = 10;
		w = 10;
	}
	public Box(int x, int y, int z){
		l = x;
		b = y;
		w = z;
	}
	public Box(int x){
		l = x;
		b = x;
		w = x;
	}
	double volume(){
		return l*b*w;
	}
	
	public static void main(String[] args){
		Box b1 = new Box();
		System.out.println("Volume of b1: "+b1.volume());
		Box b2 = new Box(3, 4, 5);
		System.out.println("Volume of b1: "+b2.volume());
		Box b3 = new Box(20);
		System.out.println("Volume of b1: "+b3.volume());
	}
}