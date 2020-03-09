package mavenproject.task6;
import java.util.*; 
public class LL {
	public static void main(String args[]) 
	{ 
		// Creating object of class linked list 
		LinkedList<Integer> object = new LinkedList<Integer>(); 
		Scanner sc=new Scanner(System.in);

		// Adding elements to the linked list 
		object.add(2); 
		object.add(3); 
		object.addLast(10); 
		object.addFirst(1); 
		object.add(5); 
		object.add(6);
		object.add(7);
		object.add(8);
		object.add(9); 
		object.add(4, 4); 
		int index;
		while (true) {
			int op;
			System.out.println("choose an option\n1:insert element\n2:remove element\n3:fetch element at an index\n4:display\n5:exit");
			op=sc.nextInt();
			switch(op) {
			
			case 1:		int e;
						System.out.println("eneter element to be added");
						e=sc.nextInt();
						object.add(e);
						break;
			case 2:		System.out.println("eneter index of element to be removed");
						index=sc.nextInt();
						if (index>=object.size())
							System.out.println("there are "+object.size()+" elements in the list");
						else
							object.remove(index);
						break;
			case 3:		System.out.println("eneter index of element to be fetched");
						index=sc.nextInt();
						if (index>=object.size())
							System.out.println("there are "+object.size()+" elements in the list");
						else
							System.out.println("element fetched :"+object.get(index));
						break;
			case 4:		System.out.println("Linked List is:"+object);
						break;
			case 5:		return;
			default:	System.out.println("incorrect input");
						break;
			
			}
		} 
	} 
} 