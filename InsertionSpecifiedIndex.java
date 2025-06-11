package Demo;

import java.util.Scanner;

public class InsertionSpecifiedIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of an array:");
		int size=sc.nextInt();
		int a[]=new int[size];//old array
		int b[]=new int[a.length+1];//new array
		System.out.println("enter the values to an array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			}
		System.out.println("enter the  new element:");
		int ele=sc.nextInt();//200
		System.out.println("enter the specific index:");
		int index=sc.nextInt();//2
		for(int i=0;i<b.length;i++)
		{
			if(i==index)
			{
				b[i]=ele;
			}
			else if(i<index)
			{
				b[i]=a[i];
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		

	}

}
