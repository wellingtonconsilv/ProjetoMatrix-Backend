package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import br.com.projetomatrix.academico.models.Curso;
import br.com.projetomatrix.academico.models.Disciplina;
import br.com.projetomatrix.academico.models.GeraCodigo;

public class CursoService {
	Map<Integer, Curso> hashCurso = new HashMap<Integer, Curso>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Curso cadastrarCurso(Curso curso) {
		if (ObjectUtils.isEmpty(curso) || hashCurso.containsKey(curso.getCodigo()))
			throw new IllegalArgumentException();
		curso.setCodigo(gerarCodigo.gerarCodigo(curso));
		hashCurso.put(curso.getCodigo(), curso);
		return curso;
	}

	public void removerCurso(Curso curso) {
		if (ObjectUtils.isEmpty(curso))
			throw new IllegalArgumentException();
		hashCurso.remove(curso.getCodigo());

	}

	public Curso atualizarCurso(Curso curso) {
		if (ObjectUtils.isEmpty(curso) || ObjectUtils.isEmpty(curso.getCodigo()))
			throw new IllegalArgumentException();
		removerCurso(curso);
		cadastrarCurso(curso);
		return curso;
	}

	public Curso recuperarCurso(Curso curso) {
		if (ObjectUtils.isEmpty(curso) || ObjectUtils.isEmpty(curso.getCodigo()))
			throw new IllegalArgumentException();

		return hashCurso.get(curso.getCodigo());
		
	}	

}
