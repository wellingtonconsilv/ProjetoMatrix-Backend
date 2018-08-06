package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.GeraCodigo;
import br.com.projetomatrix.academico.curso.Disciplina;

public class DisciplinaService {

	Map<Integer, Disciplina> hashDisciplina = new HashMap<Integer, Disciplina>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Disciplina cadastarDisciplina(Disciplina disciplina) {
		if (disciplina == null && hashDisciplina.containsKey(disciplina.getCodigo() == 0))
			throw new IllegalArgumentException();

		hashDisciplina.put(gerarCodigo.gerarCodigo(disciplina), disciplina);
		return disciplina;
	}

	public void removerDisciplina(Disciplina disciplina) {
		if (disciplina == null)
			throw new IllegalArgumentException();
		hashDisciplina.remove(disciplina.getCodigo());

	}

	public Disciplina atualizarDisciplina(Disciplina disciplina) {
		if (disciplina == null || disciplina.getCodigo() == 0)
			throw new IllegalArgumentException();
		removerDisciplina(disciplina);
		cadastarDisciplina(disciplina);
		return disciplina;
	}

	public Disciplina recuperarDisciplina(Disciplina disciplina) {
		if (disciplina == null || disciplina.getCodigo() == 0)
			throw new IllegalArgumentException();

		return hashDisciplina.get(disciplina.getCodigo());

	}

}
