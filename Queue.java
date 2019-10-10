
public interface Queue<T> 
{
	
	public T dequeue() throws Exception;
	public void enqueue(T item) throws Exception;
	public boolean empty();

}
