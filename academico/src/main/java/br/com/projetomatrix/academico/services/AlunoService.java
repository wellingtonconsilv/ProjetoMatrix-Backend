package br.com.projetomatrix.academico.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.ObjectUtils;

import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Avaliacao;
import br.com.projetomatrix.academico.models.Boletim;
import br.com.projetomatrix.academico.models.GeraMatricula;
import br.com.projetomatrix.academico.models.Turma;

public class AlunoService {
	private Map<String, Aluno> hashAluno = new HashMap<String, Aluno>();
	private GeraMatricula gerar = new GeraMatricula();

	public Aluno cadastrarAluno(Aluno aluno) {
		if (ObjectUtils.isEmpty(aluno) || hashAluno.containsKey(aluno.getMatricula()))
			throw new IllegalArgumentException(); 
		aluno.setMatricula(gerar.gerarMatricula(aluno));
		hashAluno.put(aluno.getMatricula(), aluno);
		return aluno;
	}

	public void removerAluno(String matricula) {
		if (matricula == null || matricula.length() == 0)
			throw new IllegalArgumentException();

		hashAluno.remove(matricula);
	}

	public Aluno atualizarAluno(Aluno aluno) {
		if (aluno == null || aluno.getMatricula().length() == 0)
			throw new IllegalArgumentException();

		removerAluno(aluno.getMatricula());
		cadastrarAluno(aluno);
		return aluno;
	}

	public Aluno recuperarAluno(String matricula) {
		if (matricula.equals(null) || matricula.length() == 0)
			throw new IllegalArgumentException();
		return hashAluno.get(matricula);
	}
	
	public List<Turma> buscarTurmasAluno(){
		
		return null;
	}
	
	

	
}
