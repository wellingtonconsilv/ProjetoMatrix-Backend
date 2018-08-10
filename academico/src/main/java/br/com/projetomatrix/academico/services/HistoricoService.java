package br.com.projetomatrix.academico.services;

import java.util.List;

import org.springframework.util.ObjectUtils;

import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Boletim;
import br.com.projetomatrix.academico.models.Historico;

public class HistoricoService {

	public Historico gerarHistorico(Aluno aluno, List<Boletim> boletim){
		if(ObjectUtils.isEmpty(aluno) || ObjectUtils.isEmpty(boletim))
			throw new IllegalArgumentException();
		Historico historico= new Historico();
		historico.setAluno(aluno);
		historico.setBoletinsAluno(boletim);
		return historico;
	}
}
