package polymorphism;
//method Overriding
 class SamsunGen2 {
	void cam()
	{
		System.out.println("potrait effect,wide shot");
	}
	static void call()
	{
		System.out.println("performs calling");
	}
 }
 public class SamsunGen1 extends SamsunGen2
 {
void cam()
	 {
		 System.out.println("moon shot,potrait effect,wide shot");
	 }
 
public static void main(String[] args) {
new SamsunGen1().cam();
}
}

