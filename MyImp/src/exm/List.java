package exm;
 
public class List {
Node head;

public List(){
	head = null;
}
public List(Node n){
	head = n;
}
public void add(Object i){

	Node N = new Node(head,i);
	head = N;
}
public Object Before(Object w){
	
	return head.before(head, w);
}
public Object Next(Object w){
	
	return head.next(head, w);
}
public int Len(){
	int i = 0;
	Node H = head;
	while (H!= null){
		i = i + 1;
	H =H.reference;
	}
	return i;
}
public Object val(int e){
	Node H = head;
	for(int i = Len();H!=null;i--){
		if (i==e){
		return H.value;	
		}
		H = H.reference;
	}
	return null;
}

}

