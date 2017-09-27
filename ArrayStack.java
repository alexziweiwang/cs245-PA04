/**
 * ArrayStack.java
 */
public class ArrayStack implements Stack {

	private Object[] arr = new Object[10]; //default array 
	private int top=0;
	
	@Override
	public void push(Object item) {
		if(top == arr.length){
			grow_stack();
		}
		arr[top++] = item;

	}

	@Override
	public Object pop() {
		if(empty()){
			return null;
		}
		return arr[--top];
	}

	@Override
	public Object peek() {
		if(empty()){
			return null;
		}
		return arr[arr.length-1];
	}

	@Override
	public boolean empty() { 

		if(top ==0){		 
			return true;
		}
		return false;
	}
	
	
	/**
	 * resize the stack when it is full
	 */
	private void grow_stack(){
			
		for(int i=0; i <arr.length; i++){
		}
		
		Object[] new_arr = new Object[arr.length *2];
		System.arraycopy(arr, 0, new_arr, 0, arr.length);
		arr= new_arr;
		for(int i=0; i <arr.length; i++){
		}
	}


	
}
