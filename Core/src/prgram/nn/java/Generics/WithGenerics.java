package prgram.nn.java.Generics;

import java.util.ArrayList;

public class WithGenerics {
	
	private ArrayList<String> arraylist = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		WithGenerics wg = new WithGenerics();
		wg.arraylist.add("Naresh");
		//wg.arraylist.add(new Integer(10));//Cannot take Integer value to String arraylist
		
		System.out.println(wg.arraylist.get(0));

	}

}
