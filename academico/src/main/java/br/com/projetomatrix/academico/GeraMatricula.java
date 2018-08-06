package br.com.projetomatrix.academico;

import java.time.LocalDateTime;

public class GeraMatricula {
	int sequencial = 0;

	public String gerarMatricula(Pessoa pessoa) {

		int ano = LocalDateTime.now().getYear();
		String anoConvertido = Integer.toString(ano);

		int mes = LocalDateTime.now().getMonthValue();
		String semestre = mes <= 6 ? "10" : "20";

		String matricula = anoConvertido + semestre + sequencial;
		sequencial++;
		return matricula;
	}
}
