
/**
 * 
 */
public class Colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="RRRBBBGGGRb".toLowerCase();
if(str.contains("gbr")||str.contains("rbg")||str.contains("brg")||str.contains("grb")||str.contains("rgb")||str.contains("bgr")) {
	System.out.println("B&w");
	}
else
{
	System.out.println("colorfull");
}
	}
}