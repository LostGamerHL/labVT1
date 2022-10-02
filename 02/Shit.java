import java.util.*;
import java.lang.Math;

class Shit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Write 'x'");
		int x = sc.nextInt();
		System.out.println("Write 'y'");
		int y = sc.nextInt();

		if ( y >= -3 && y <= 0 && x >= -6 && x <= 6)
		      System.out.println("True");
		else if (y >= 0 && y <= 5 && x >= -4 && x <=4)
		      System.out.println("True");
		else
		      System.out.println("False");
	}
}
