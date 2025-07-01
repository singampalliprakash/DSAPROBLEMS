package Demo;

import javax.swing.text.Position;

public class DoubleLinkedList {
	class Node{
		String data;
		Node prev;
		Node next;
		public Node(String data)
		{
			this.data=data;
			this.prev=null;
			this.next=null;
			size++;
		}
	}
	private Node head;
	private Node tail;
	private int size;
	public DoubleLinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	//insertion node at beging
	public void insertBeg(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	
	//insertion node at end
		public void insertEnd(String data)
		{
			Node newNode=new Node(data);
			if(tail==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				newNode.prev=tail;
				tail.next=newNode;
				tail=newNode;
			}
		}
	public int size()
	{
		return size;
	}
	
	public void Forward()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	public void Reverse()
	{
		Node current=tail;
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.prev;
		}
	}
	public void AtSpecificPosition(int position,String data)
	{
		if(position<0||position>size)
		{
			System.out.println("Not a valid Position");
			
		}
		Node newNode=new Node(data);
		if(position==0&&head!=null)
		{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
			
		}
		
		
	}

	public static void main(String[] args) {
		DoubleLinkedList d1=new DoubleLinkedList();
		d1.insertBeg("java");
		d1.insertEnd("css");
		d1.insertBeg("python");
		
		d1.insertEnd(".net");
		d1.insertBeg("html");
		d1.Forward();
		System.out.println("Size of the list when forward:"+d1.size);
		d1.Reverse();
		System.out.println("Size of the list when reversed:"+d1.size);
		

	}

}
