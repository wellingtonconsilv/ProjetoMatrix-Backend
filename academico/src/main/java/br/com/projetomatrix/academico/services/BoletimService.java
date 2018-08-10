package br.com.projetomatrix.academico.services;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.projetomatrix.academico.enumeracoes.StatusAcademico;
import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Avaliacao;
import br.com.projetomatrix.academico.models.Boletim;
import br.com.projetomatrix.academico.models.Turma;

public class BoletimService {

	
	public Boletim gerarBoletim(Aluno aluno, Turma turma) {
		
		Boletim boletim = new Boletim();
		boletim.setAluno(aluno);
		boletim.setAvaliacoes(aluno.getAvaliacoes());
		boletim.setTurma(turma);
		return boletim;
	}

	public BigDecimal gerarMedia(Aluno aluno) {
		BigDecimal somaAluno = new BigDecimal("0");
		for (Avaliacao nota : aluno.getAvaliacoes())
			somaAluno.add(nota.getNota());
		return somaAluno.divide(BigDecimal.valueOf(3)).setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	public StatusAcademico getStatusAcademico(Aluno aluno) {
		BigDecimal media = BigDecimal.ZERO;
		media = gerarMedia(aluno);
		if (aluno.getAvaliacoes().size() < 3)
			 return StatusAcademico.REPROVADO;
		if(media.compareTo(BigDecimal.valueOf(6)) >= 1) {
			return StatusAcademico.APROVADO;
		}else if(media.compareTo(BigDecimal.valueOf(4)) >= 0) {
			return StatusAcademico.PROVA_FINAL;
		}else {
			return StatusAcademico.REPROVADO;
		}
	}

}
