package array;

import java.util.Scanner;

public class Revese {
	private int[] number = new int[5];
	private int[] rev = new int[5];
	Scanner scan = new Scanner(System.in);
	
	public void input()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println("Enter a array value of "+i+" position");
			number[i]=scan.nextInt();
		}
	}
	void display()
	{
		
		//System.out.println("resvers value is--->");
		int j =1;
		for(int i=0; i<5; i++)
		{
			rev[5-j] = number[i] ;
			j++;
			//System.out.println("rev"+rev[] +"num"+ number[i]);
		}
		for(int i = 0; i< 5; i++)
		{
			System.out.println("The value of rev["+i+"] is "+rev[i]);
			
		}
		
	}

}
