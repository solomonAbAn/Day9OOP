package Pack1;

import java.util.LinkedList;
import java.util.Queue;

public class MyP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//queue is a link list (we didn't study it): i can study it
		
		
		//first in first out different that stack
		
		
		Queue<String> myList = new LinkedList<>();
		
		myList.add("Ashot");
		myList.add("Shadan");
		myList.add("behnaz");
		myList.add("Ehsan");
		System.out.println(myList);
		
		System.out.println("removing");
		myList.remove();	//it's like pop
		
		System.out.println(myList);
		System.out.println("ashot was removed");
		
	}

}
