package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.GeraMatricula;
import br.com.projetomatrix.academico.Professor;

public class ProfessorService {

	Map<String, Professor> hashProfessor = new HashMap<String, Professor>();
	GeraMatricula gerar = new GeraMatricula();

	public Map<String, Professor> getHashCoordenador() {
		return hashProfessor;
	}

	public void setHashAluno(Map<String, Professor> hashCoordenador) {
		this.hashProfessor = hashCoordenador;
	}

	public Professor cadastrarProfessor(Professor professor) {
		if (professor == null || hashProfessor.containsKey(professor.getMatricula().length() == 0))
			throw new IllegalArgumentException();
		professor.setMatricula(gerar.gerarMatricula(professor));
		hashProfessor.put(professor.getMatricula(), professor);
		return professor;
	}

	public void removerProfessor(String matricula) {
		if (matricula == null || matricula.length() == 0)
			throw new IllegalArgumentException();

		hashProfessor.remove(matricula);

	}

	public Professor atualizarProfessor(Professor coordenador) {
		if (coordenador == null || coordenador.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		removerProfessor(coordenador.getMatricula());
		cadastrarProfessor(coordenador);
		return coordenador;
	}

	public Professor recuperarProfessor(String matricula) {
		if (matricula == null || matricula.length() == 0)
			throw new IllegalArgumentException();
		return hashProfessor.get(matricula);
	}
}
