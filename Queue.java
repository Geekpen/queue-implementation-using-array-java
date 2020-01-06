package ImplementingQueuesUsingArrays;

public class Queue {
	
	int[]  numbers = new int[3];
	int indexHead = -1;
	int indexTail = -1;
	
	public void queueEnqueue(int data) {
		if(indexHead == -1) {
			indexHead +=1;
			indexTail +=1;
			numbers[indexHead] = data;
		}
		else {
			if(indexTail == numbers.length - 1) {
				System.out.println("Queue is full");
			}
			else {
				indexTail +=1;
				numbers[indexTail] = data;
				//System.out.println(Arrays.toString(numbers));
				
			}
			
		}
		
	}
	
	public void queueDequeue() {
		for(int i = 0; i < indexTail; i ++) {
			numbers[i] = numbers[i+1];
		}
		numbers[indexTail] = 0;
		indexTail -=1;
	}
	
	public int queueFindSize() {
		return Math.abs(indexTail - indexHead) + 1;
	}
	
	public void queuePeek() {
		if(indexTail == -1) {
			System.out.println();
		}
		else {
			System.out.println(numbers[indexHead]);
		}
	}
	
	public void queuePrint(){
		System.out.print("[");
		//only one element inserted
		if(indexTail ==-1) {
			//do nothing
		}else if(indexTail ==0) {
			System.out.print(numbers[indexHead]);
		}else {
			
			for(int i = 0; i < indexTail + 1; i++) {
				if( i != indexTail) {
					System.out.print(" "+ numbers[i] + " , ");
				}else {
					System.out.print(numbers[i]+" ");
				}
				
			}
		}
		
		System.out.print("]");
		System.out.println();
	}

}
