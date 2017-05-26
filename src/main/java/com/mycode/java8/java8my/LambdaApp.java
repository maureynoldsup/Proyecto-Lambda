package com.mycode.java8.java8my;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp 
{
	public void ordenar(){
		List<String> lista = new ArrayList<>();
		lista.add("Esta");
		lista.add("prueba de Lambda");
		lista.add("es una ");
		//Sin Lambda
		/*Collections.sort(lista, new Comparator<String>(){
			public int compare(String o1, String o2){
				
				return o1.compareTo(o2);
			}
		});*/
		//Con Lambda
		Collections.sort(lista,(String p1,String p2)->p1.compareTo(p2));
		for(String elemento:lista){
			System.out.println(elemento);
		}
	}
    public static void main( String[] args )
    {
    	LambdaApp app = new LambdaApp();
    	app.ordenar();
        //System.out.println( "Hello World!" );
    }
    
}
