package Demo;

import java.util.Scanner;

public class DeletionEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[a.length-1];
		System.out.println("Enter the values:");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
	}

}
