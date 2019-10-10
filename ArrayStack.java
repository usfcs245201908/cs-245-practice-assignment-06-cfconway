public class ArrayStack<T> implements Stack<T>
{ 	

	int top;
	T[] a;
	public ArrayStack()
	{	
		
		this.top = -1;
		this.a = (T[]) new Object[10]; 
	}



	public void push(T item)
	{	
		if (top == a.length-1)
		{
			growArray();
		}

		a[++top]=item;
		

	}
	public T pop() throws Exception
	{	//keeps track of top index of array, say ther is one thing in array,  top is 0, if its empty: -1
		if(empty())
			throw new Exception("the array is empty");
		
		return a[top--]; //will return top and then subtract 1 from it 
	}
	public T peek()
	{
		// int top = a.length-1;
		if(top==a.length-1)
		{
			growArray();
		}
		return a[top]; //returns top value in array but then doesnt decrement bc its not taking it off

	}

	private void growArray()
	{
		int length= a.length;
		T[] new_array = (T[]) new Object[length*2]; 
		for (int i=0; i<a.length; i++)
		{
			new_array[i]= a[i];

		}
		a=new_array;

	}
	public boolean empty()
	{	if(top==-1)
		{
			return true;
		}
		return false;

	}
}