package array;

import java.util.Scanner;

public class replace {
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
	
	void get(){
		System.out.println("enter the array position--->");
		int n = scan.nextInt();
		System.out.println("change new value--->");
		int nn=scan.nextInt();
		number[n]=nn;
		for(int i=0; i<5; i++)
		{
			System.out.println(number[i]);
		}
	}
	void print()
	{
		
		System.out.println("select a value to replace");
		int v=scan.nextInt();
		System.out.println("replace new value is");
		int nv = scan.nextInt();
		for(int i =0;i<5;i++ )
		{
			if(number[i]==v)
			{
				number[i]=nv;
			}
			System.out.println(number[i]);
		}  
	}

}
