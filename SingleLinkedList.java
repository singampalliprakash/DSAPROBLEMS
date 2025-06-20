package Demo;

public class SingleLinkedList
{
	Node head;
	class Node
	{
		
	String data;
	Node nextNode;
	public Node(String data)
	{
		this.data=data;
		this.nextNode=null;
	}
	public String toString()
	{
		return data;
	}
	}
	
	public void insertFirst(String data) 
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		else
		{
			newnode.nextNode=head;
			head=newnode;
		}
		
		
	}
	public void insertLast(String data) 
	{	
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			return;
		}
		Node currentnode=head;
		while (currentnode.nextNode!=null) {
			currentnode=currentnode.nextNode;
			
		}
		currentnode.nextNode=newnode;
	}
	public void deleteFirst() 
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			head=head.nextNode;
		}
	}
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("list is empty...");
		}
		else if(head.nextNode==null)
		{
			head=null;
		}
		else
		{
			Node currentNode=head;
			while(currentNode.nextNode.nextNode!=null)
			{
				currentNode=currentNode.nextNode;
			}
			currentNode.nextNode=null;
		}
	}
	public void printList()
	{
		if(head==null)
		{
			System.out.println("there is no elements present");
			return;
		}
		Node currentNode=head;
		while(currentNode!=null)
		{
			System.out.println(currentNode);
			currentNode=currentNode.nextNode;
		}
		
	}

	public static void main(String[] args) 
	{
		SingleLinkedList list=new SingleLinkedList();
		list.insertFirst("java");
		list.insertFirst("python");
		list.insertLast("spring");
		list.insertFirst("dotnet");
		list.printList();
//		System.out.println(list.head);
		System.out.println("before deletion...");
		list.deleteFirst();
		list.deleteFirst();
		
		list.printList();


	}
	

}
