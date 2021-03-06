import java.util.ArrayList;
import java.util.Arrays;

public class Honda implements Location
{
	private double[] Location;
	private double x;
	private double y;
	
	public Honda(double[] z)
	{
		Location = z;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000);
	}
	
	public void move(double nx, double ny)
	{
		x += nx;
		y += ny;
	}
	
	public double[] getLoc()
	{
		return Location;
	}
}