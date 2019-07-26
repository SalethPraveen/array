package array;

import java.util.Scanner;

public class printBWnum {
	private int []print = new int[10];
	Scanner scan = new Scanner(System.in);
	public void input()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter a values");
			print[i]=scan.nextInt();
		}
	}
	public void BetWeen()
	{
		System.out.println("Enter the Starting Point");
		int start=scan.nextInt();
		System.out.println("Enter the ending Point");
		int end=scan.nextInt();
		for(int i=start;i<end-1; i++ )
		{
			System.out.println("the between number are"+print[i]);
		}
		
	}
	

}
