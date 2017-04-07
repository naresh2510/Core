package prgram.nn.java.Generics;

import java.util.ArrayList;

public class WhyGenerics {
	
	private String names[]= new String[100];
	private ArrayList namesAl = new ArrayList();
	
	
	public static void main(String[] args) {
		
		WhyGenerics gs = new WhyGenerics();
		gs.names[0]="Naresh";
		gs.names[1]="Haresh";
		gs.names[2]="Veer";
		gs.names[3]="vivan";
		//gs.names[4]= new Integer(10); //Not allowed compile time error
		
		System.out.println("value of Array  " + gs.names[0]);
		
		gs.namesAl.add("Naresh");
		gs.namesAl.add(new Integer(10)); //Arraylist will allow to add Integer object for names
		System.out.println("value of Array  " + gs.namesAl.get(0));
		System.out.println("value of Array  " + gs.namesAl.get(1));
		
		
		
	}

}
