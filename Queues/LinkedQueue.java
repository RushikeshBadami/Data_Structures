
public class LinkedQueue{
private int length;
private ListNode front,rear;

public LinkedQueue(){
length=0;
front=rear=null;
}

public void enQueue(int data)
{
ListNode node=new ListNode(data);
if(isEmpty())
	{
	//System.out.println("First Check");
		front =node;
	
	}
else
	{
		rear.setNext(node);
	}
	rear=node;
	length++;	
	
}

public int deQueue() throws Exception
{
	if(isEmpty())
	{
	throw new Exception();		
	}
		int result=front.getData();
		front=front.getNext();
		length--;
	if(isEmpty())
	{
		rear=null;
	}
	return result;
}
public boolean isEmpty()
{
 	return (length==0);
}	
 public int size()
{
return length;
}
}


