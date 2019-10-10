public class ArrayQueue<T> implements Queue<T>
{

		int size;
		T [] a;
		int tail;
		int head;
	
	public ArrayQueue() 
	{
		this.size =0;
		this.tail=0;
		this.head =0;
		this.a = (T[]) new Object[10];	
		
	}

	public T dequeue() throws Exception
	{	T item;
		if(empty())
		{
			throw new Exception("Queue is empty");
		}
		else 
		{
			item= a[head]; 
			head=(head+1)%a.length;
			size--;
	}	return item;
}
	public void enqueue(T item) throws Exception
	{
		//checks if array is full first
		if(full())
		{	
			growArray();
		}	
			a[tail]= item;
			tail= (tail+1)%a.length;
			size++;

	}
	public boolean empty()
	{ //checks to see if there is one spot empty, if there is only one spot empty, then the array is full
		if(size==0 ) //could just use size 
		{
			return true;
		}
		return false;
	}

	public boolean full()
	{	if (size==a.length)
		{
			return true;
		}
		return false;

	}	
	protected void growArray()
	{
		T[] newA = (T[]) new Object[a.length*2];
		for (int i=head; i<a.length; i++)
		{
			newA[i-head]=a[i];
		}
		for(int i=0; i<tail; i++)
		{
			newA[i+1]= a[i];
		}
		a=newA;
	}

}