package br.com.alura.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import br.com.alura.mainbr.com.alura.model.Curso;

public class TesteOrdenacaoCursos {
	
	public static void main(String[] args) {
			
			List<Curso> cursos = new ArrayList<Curso>();
	cursos.add(new Curso("Python", 45));
	cursos.add(new Curso("JavaScript", 150));
	cursos.add(new Curso("Java 8", 113));
	cursos.add(new Curso("C", 55));

	cursos.sort(Comparator.comparing(c -> c.getAlunos()));
	cursos.forEach(c -> System.out.println(c.getNome()));
	
//	cursos.stream().filter(c -> c.getAlunos() >= 100)
//	.forEach(c -> System.out.println(c.getNome()));
	
	cursos.stream().filter(c -> c.getAlunos() >= 100)
	.map(c -> c.getAlunos())
	.forEach(total -> System.out.println(total));
	System.out.println("\n\n");
	
	OptionalDouble media = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos)
			.average();
	
	System.out.println("Média de alunos acima de 100 alunos: " + media);
	
	 int sum = cursos.stream().filter(c -> c.getAlunos() >= 100)
	.mapToInt(c -> c.getAlunos())
	.sum();
	
	int[] valores = cursos.stream().filter(c -> c.getAlunos() >= 100)
	.mapToInt(c -> c.getAlunos())
	.toArray();
	
	for (int i = 0; i < valores.length; i++) {
		System.out.println(valores[i]);
	}
	
	System.out.println("\n\n");
	System.out.println(sum);
	
	//------- Trabalhando com Optional ---------------
	
	Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny();
	
	Curso curso = optionalCurso.orElse(null);
	System.out.println(curso.getNome());
	
	cursos.stream().filter( c -> c.getAlunos() >= 100)
	.findAny()
	.isPresent();
	
	cursos = cursos.stream().filter( c -> c.getAlunos() >= 100)
	.collect(Collectors.toList());
	
	cursos.forEach(c -> System.out.println(c.getNome()));
	
	Map<String, Integer> map = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
	
	cursos.stream()
	.filter(c -> c.getAlunos() >= 100)
	.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
	.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
	
	System.out.println(map);
	
	//-------- stream paralelo -----------
	
	cursos.parallelStream()
	.filter(c -> c.getAlunos() >= 100)
	.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
	.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
	
//	cursos.stream().filter(c -> c.getAlunos() >= 100)
//	.map(Curso::getAlunos)
//	.forEach(System.out::println);
	
	
	}
}
