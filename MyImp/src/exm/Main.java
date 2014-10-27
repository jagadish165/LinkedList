package exm;
public class Main {
	 
	public static void main(String args[]) throws Exception{
	 List l = new List();
	
	 l.add(1);
	 l.add('s');
	 l.add(3);
	 l.add(5);
	 l.add(3);
	 l.add(2);
	 l.add(4);
	 System.out.print(l.Before(3));
	 System.out.print("\n");
	 System.out.print(l.Next(2));
	 System.out.print("\n");
	 System.out.print(l.Len());
	 System.out.print(l.val(8));
	}

}
