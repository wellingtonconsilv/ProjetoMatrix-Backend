package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import br.com.projetomatrix.academico.models.Curso;
import br.com.projetomatrix.academico.models.Disciplina;
import br.com.projetomatrix.academico.models.GeraCodigo;
import br.com.projetomatrix.academico.models.Professor;

public class DisciplinaService {

	Map<Integer, Disciplina> hashDisciplina = new HashMap<Integer, Disciplina>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Disciplina cadastrarDisciplina(Disciplina disciplina, Curso curso, List<Professor> professores) {
		if (ObjectUtils.isEmpty(professores) || hashDisciplina.containsKey(disciplina.getCodigo()))
			throw new IllegalArgumentException();
		disciplina.setCurso(curso);
		disciplina.setProfessores(professores);
		hashDisciplina.put(gerarCodigo.gerarCodigo(disciplina), disciplina);
		return disciplina;
	}

	public void removerDisciplina(Disciplina disciplina) {
		if (ObjectUtils.isEmpty(disciplina))
			throw new IllegalArgumentException();
		hashDisciplina.remove(disciplina.getCodigo());

	}

	public Disciplina atualizarDisciplina(Disciplina disciplina, Curso curso, List<Professor> professores) {
		if (ObjectUtils.isEmpty(professores) || ObjectUtils.isEmpty(disciplina) || ObjectUtils.isEmpty(curso))
			throw new IllegalArgumentException();
		removerDisciplina(disciplina);
		cadastrarDisciplina(disciplina, curso, professores);
		return disciplina;
	}

	public Disciplina recuperarDisciplina(Disciplina disciplina) {
		if (ObjectUtils.isEmpty(disciplina) || ObjectUtils.isEmpty(disciplina.getCodigo()))
			throw new IllegalArgumentException();

		return hashDisciplina.get(disciplina.getCodigo());

	}

}
