package ImplementingQueuesUsingArrays;

public class QueueDemo {

	public static void main(String[] args) {
		Queue myqueue = new Queue();
		myqueue.queueEnqueue(1);
		myqueue.queuePrint();
		
		myqueue.queueEnqueue(2);
		myqueue.queuePrint();
		
		myqueue.queueEnqueue(3);
		myqueue.queuePrint();
		
		myqueue.queueEnqueue(4);
		myqueue.queuePrint();
		
		myqueue.queueDequeue();
		myqueue.queuePrint();
		
		myqueue.queueEnqueue(4);
		myqueue.queuePrint();
		
		myqueue.queuePeek();
		System.out.println("Queue size = "+ myqueue.queueFindSize());
		
	}

}
