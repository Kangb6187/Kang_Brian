import java.util.Scanner;
public class Lab_Cube
{
	static double side;
	static double sa;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length of a side of your cube?");
		side = kb.nextDouble();
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = side*side*6;
	}
	
	public static void print()
	{
		System.out.printf ("The surface area of a cube whose sides are " + side + " in length is %.5f" + ".", sa);
	}
}	