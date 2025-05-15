package stack;

public class Implementation_array {
	static class Stack {
		private int[] arr;
		private int top;
		
		Stack(int size){
			arr = new int[size];
			top = -1;
		}
		
		public boolean isEmpty() {
			return top == -1;
		}
		
		public void push(int data) {
			if(top >= arr.length-1) {
				resize();
			}
			arr[++top] = data;
		}
		
		public int pop() {
			if (isEmpty()) return -1;
			return arr[top--];				
		}
		
		public int peek() {
			if (isEmpty()) return -1;
			return arr[top];
		}
		
		private void resize() {
			int[] newarr = new int[arr.length*2];
			for(int i=0; i<arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
	}
	
	public static void main(String[] args) {
		Stack st = new Stack(2);
		
		st.push(24);
		st.push(45);
		st.push(96);
		st.push(87);
		st.push(54);
		
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
