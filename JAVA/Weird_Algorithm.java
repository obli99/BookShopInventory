package Introductory_Problems;
import java.util.*;
public class Weird_Algorithm {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		while(n!=1)
		{
			System.out.print(n+" ");
			if(n%2!=0)
			{
				n = (n * 3) + 1;
			}
			else if(n%2==0)
			{
				n = n/2;
			}
		}
		System.out.println(1);
	}

}
