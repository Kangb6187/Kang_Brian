import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; 

public class Lab_GameGun
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[] clip;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String act = kb.nextLine();
		
			if(act.equals("R"))
			{
				reload();
			}
			if(act.equals("S")) 
			{
				shoot();
			}
			printClip();
		}
		System.out.println("Out of bullets!");
	}

	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{ 
			clip[i] = "[]";
		}
	}

	public static void shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = " [] ";
			shotCount--;
			System.out.println("Boom!");
		}
		else if(shotCount < 0)
		{
			System.out.println("Reload!!");
		}
	}

	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount = bulletCount - CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
			resetClip();
		}
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}

	public static void printClip()
	{
		String output = "";
		System.out.println("Bullets: \t " + bulletCount + "\n" + "Clip: \t");
	
		for(int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		System.out.print("\n" + output + "\n");
	}
}