package br.com.alura.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Function;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("caelum");
		palavras.add("palavras");
		
		//Organizando
//		palavras.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
//		palavras.sort((s1, s2) -> s2.length() - s1.length());
//		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		//exibindo palavars
		palavras.forEach(s -> System.out.println(s));
		System.out.println("\n");
		palavras.forEach(System.out::println);
		
//		Function<String, Integer> funcao = new Function<String, Integer>(){
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//		};
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
		
		
//		Consumer<String> impressor = s -> System.out.println(s);
//		palavras.forEach(impressor);
		
//		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
	}

}