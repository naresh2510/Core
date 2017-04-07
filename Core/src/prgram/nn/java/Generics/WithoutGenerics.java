package prgram.nn.java.Generics;
/*
 * without Generics you need to create another 
 * class which will mock  java Generics
 */

public class WithoutGenerics  {
	public static void main(String args[]){
		Gen<String> string =new Gen<String>("Naresh");
		Gen<Integer> integer = new Gen<Integer>(new Integer(10));
		//Gen<String> string =new Gen<String>(new Integer(10)); //String cannot accept integer
		
		System.out.println(string.getObj());
		System.out.println(integer.getObj());
	}
}

class Gen<T>{
	T obj;
	
	Gen(T obj){
		this.obj=obj;
	}
	public T getObj() {
		return obj;
	}
	public void show() {
		System.out.println(obj.toString());
	}
	
}
