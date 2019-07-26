package array;

import java.util.Scanner;

public class OddOREven {
	private int[] input = new int[5];
	private int[] odd = new int[5];
	private int[] even = new int[5];
	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<5; i++)
		{
			System.out.println("Enter a numbers");
			input[i] = scan.nextInt();
		}
	}
	public void find()
	{	int ed =0;
		for (int i=0; i<5; i++)
		{
			//System.out.println(input[i]);
			if(input[i]%2==0)
			{
				//System.out.println(input[i]+" it's even ");
				even[ed]=input[i];
				ed++;
			}
			 
		}
		int od=0;
		for(int i=0; i<5; i++)
		{
		
		if(input[i]%2!=0)
		{
			
			odd[od]=input[i];
			od++;
			//System.out.println(input[i]+" it's odd");
		}
		
		}
		for(int j=0; j<ed; j++)
		{
			System.out.println("even number is"+ even[j]+"   position of array"+j);
			//System.out.println( "odd number is"+ odd[j]);	
		} 
		for(int j=0; j<od; j++)
		{
			System.out.println("odd number is"+ odd[j]+"  position of array"+j);
			//System.out.println( "odd number is"+ odd[j]);	
		} 
	}
	

}
