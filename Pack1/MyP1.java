package Pack1;

import java.util.Stack;

public class MyP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//THIS IS NOT DEMANDED FOR THIS COURSE
		
		//TAKE A LINKEDIN CLASS TO LEARN IT IS IMPORTANT: IT MAY BE USED IN FB NEWSFEED STACKING
		
		Stack<String> studentList = new Stack<>();
		
		studentList.push("Sleiman");
		studentList.push("Ehsan");
		studentList.push("Shadan");
		
		System.out.println(studentList);
		studentList.pop();//pop the last//last in first out
		System.out.println(studentList);
		
		//purpose of using it:
		//if i want if i know it is in the right order or not?????
		//idk what is the purpose
		
		System.out.println(studentList.peek());
		//hashmap is also a data structure type code
		System.out.println(studentList.isEmpty());
		
		
		
		
		
		
	}

}
