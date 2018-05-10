package Datastructures;


class Node<T> implements Comparable<T>{

	private T value;
	private Node<T> nextRef;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	@Override
	public int compareTo(T o) {
		if(this.value==o)
			return 0;
		else
			return 1;
	}
	
}

public class LinkedListExample<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample<Integer> list = new LinkedListExample<Integer>();
		list.add(1);
		/*list.add(2);
		list.add(3);
		list.add(4);*/
		
		list.traverse();

	}
	
	void add(T element){
		Node<T> node = new Node<T>();
		node.setValue(element);
		if(head==null){
			head = node;
			tail = node;
		}else{
			tail.setNextRef(node);
			tail=node;
		}
	}
	
	void traverse(){
		Node<T> tmp = head;
		while(true){
			if(tmp==null){
				break;
			}
			System.out.println(tmp.getValue());
			tmp=tmp.getNextRef();
		}
	}
	

}
