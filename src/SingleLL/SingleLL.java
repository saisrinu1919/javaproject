
package SingleLL;

public class SingleLL <E>{
	private class Node<E>
	{
		E element;
		Node<E> next;
		public Node(E e,Node<E> n)
		{
			element =e;
			next=n;
		}	
		///this is first change in code
		public E getElement()
		{
			return element;
		}
		public Node<E> getNext()
		{
		 return next;	
		}
		
		public void setElement(E element)
		{
			this.element = element;
		
			
		}
		public void seNext(Node<E> next)
		{
			this.next=next;
		}
		
	}
	private Node<E> head=null;
	private Node<E> tail=null;
	private int size=0;
public SingleLL()
{}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return (size==0);
	}
	public void addFirst(E element)
	{
		if(isEmpty())
		{
		head=new Node<E>(element ,null);
		tail=head;
		size++;
		}
		else
			head=new Node<E>(element,head);
	}


}
