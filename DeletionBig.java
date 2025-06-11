package Demo;

import java.util.Scanner;

public class DeletionBig {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values:");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		if(a.length==0)
		{
			System.out.println("Array is empty");
		}
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
			
		}
		size--;
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
