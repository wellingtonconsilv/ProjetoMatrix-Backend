package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.com.projetomatrix.academico.models.GeraMatricula;
import br.com.projetomatrix.academico.models.Professor;

public class ProfessorService {

	Map<String, Professor> hashProfessor = new HashMap<String, Professor>();
	GeraMatricula gerar = new GeraMatricula();

	public Map<String, Professor> getHashCoordenador() {
		return hashProfessor;
	}

	public Professor cadastrarProfessor(Professor professor) {
		if (ObjectUtils.isEmpty(professor) || hashProfessor.containsKey(professor.getMatricula()))
			throw new IllegalArgumentException();
		professor.setMatricula(gerar.gerarMatricula(professor));
		hashProfessor.put(professor.getMatricula(), professor);
		return professor;
	}

	public void removerProfessor(String matricula) {
		if (StringUtils.isEmpty(matricula)|| StringUtils.isEmpty(matricula))
			throw new IllegalArgumentException();

		hashProfessor.remove(matricula);

	}

	public Professor atualizarProfessor(Professor professor) {
		if (ObjectUtils.isEmpty(professor) || ObjectUtils.isEmpty(professor.getMatricula()))
			throw new IllegalArgumentException();

		hashProfessor.put(professor.getMatricula(), professor);
		return professor;
	}

	public Professor recuperarProfessor(String matricula) {
		if (StringUtils.isEmpty(matricula))
			throw new IllegalArgumentException();
		return hashProfessor.get(matricula);
	}
}
