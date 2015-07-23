import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("hello");
		myList.add("World");
		
		for (String word : myList){
		System.out.println(word);}
		
		ArrayList<Object> objectList = new ArrayList<Object>();
		objectList.add("July");
		objectList.add("1234567");
		String[] helloWorld = {"Hello", " World"};
		objectList.add(helloWorld);
		System.out.println(objectList.get(1));
	}
}
