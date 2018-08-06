package br.com.projetomatrix.academico.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.GeraMatricula;
import br.com.projetomatrix.academico.curso.Avaliacao;

public class AlunoService {
	Map<String, Aluno> hashAluno = new HashMap<String, Aluno>();
	GeraMatricula gerar = new GeraMatricula();

	public Map<String, Aluno> getHashAluno() {
		return hashAluno;
	}

	public void setHashAluno(Map<String, Aluno> hashAluno) {
		this.hashAluno = hashAluno;
	}

	public Aluno cadastrarAluno(Aluno aluno) {
		if (aluno == null)
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
	
	public BigDecimal pegarMedia(List<Avaliacao> avaliacoes){
		BigDecimal somaAluno = new BigDecimal("0");
		BigDecimal mediaAluno = new BigDecimal("0");
		for(Avaliacao nota:  avaliacoes) 
			somaAluno.add(nota.getNota());
		return mediaAluno = somaAluno.divide(BigDecimal.valueOf(3)).setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
	
}
