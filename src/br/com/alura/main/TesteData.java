package br.com.alura.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class TesteData {
	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
//		System.out.println(hoje);
		
		LocalDate copa = LocalDate.of(2022, Month.DECEMBER, 10);
		
//		int anos = olimpiadas.getYear() - hoje.getYear();
//		
//		System.out.println(anos);
		
		Period periodo = Period.between(hoje, copa);
		periodo.getYears();
		
		LocalDate ProximasCopa = copa.plusYears(4);
		
		System.out.println(ProximasCopa);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = ProximasCopa.format(formatador);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		agora.toLocalDate();
		YearMonth mes = YearMonth.of(2021, Month.MARCH);
		System.out.println(mes);
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
		LocalDate agr = LocalDate.now();
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

		Period period = Period.between(agr, dataFutura);
		
		System.out.println(period);

	}
}