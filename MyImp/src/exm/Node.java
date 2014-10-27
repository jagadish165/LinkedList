package exm;

public class Node {
	Node reference;
	Object value;
	public Node(Node ref, Object o){
	reference = ref;
	value = o;
	}
	public Object before(Node ref,Object k){
		while (ref.reference!= null){
			if(ref.value == k){
				return ref.reference.value;	
			}
			else{
				ref = ref.reference;
			}
			
		}
		return "Not Found";
	}
	public Object next(Node ref,Object k){
		Object val = "Not Found";
		while (ref!= null){
			
			if(ref.value == k){
				return val;	
			}
			else{
				val = ref.value;
				ref = ref.reference;
			}
			
		}
		return "Not Found";
	}
} 
