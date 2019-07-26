package array;

import java.util.Scanner;

public class PosOrNeg {
	private int[] number = new int[5];
	Scanner scan = new Scanner(System.in);
	
	public void input()
	{
		for (int i=0; i<number.length; i++)
		{
			System.out.println("Enter a array va lue of "+i+" position");
			number[i]=scan.nextInt();
		}
	}
	public void check()
	{ 	int i;
		for(i=0;i<5; i++)
			
		{
		
		if(number[i]>0)
		{
			
			System.out.println("the number "+number[i]+" is Postivie");
			
		}
		
		else if (number[i]< 0)
		{
			
			System.out.println("the number "+number[i]+" is Negative");
			
		}
		else
		{
			System.out.println("that is nutural");
		}

		}
	}
}
