package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.com.projetomatrix.academico.models.Aluno;
import br.com.projetomatrix.academico.models.Avaliacao;
import br.com.projetomatrix.academico.models.GeraCodigo;

public class AvaliacaoService {
	Map<Integer, Avaliacao> hashAvaliacao = new HashMap<Integer, Avaliacao>();
	GeraCodigo gerarCodigo = new GeraCodigo();

	public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao, Aluno aluno) {
		if (ObjectUtils.isEmpty(avaliacao) || hashAvaliacao.containsKey(avaliacao.getCodigo()))
			throw new IllegalArgumentException();

		aluno.adicionarAvaliacao(avaliacao);
		avaliacao.setCodigo(gerarCodigo.gerarCodigo(avaliacao));
		hashAvaliacao.put(avaliacao.getCodigo(), avaliacao);
		return avaliacao;
	}

	public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao) {
		if (ObjectUtils.isEmpty(avaliacao) || hashAvaliacao.containsKey(avaliacao.getCodigo()))
			throw new IllegalArgumentException();

		hashAvaliacao.put(gerarCodigo.gerarCodigo(avaliacao), avaliacao);
		return avaliacao;
	}

	public void removerAvaliacao(Avaliacao avaliacao) {
		if (ObjectUtils.isEmpty(avaliacao))
			throw new IllegalArgumentException();
		hashAvaliacao.remove(avaliacao.getCodigo());

	}

	public Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
		if (ObjectUtils.isEmpty(avaliacao) || ObjectUtils.isEmpty(avaliacao))
			throw new IllegalArgumentException();
		removerAvaliacao(avaliacao);
		cadastrarAvaliacao(avaliacao);
		return avaliacao;
	}

	public Avaliacao recuperarAvaliacao(Avaliacao avaliacao) {
		if (ObjectUtils.isEmpty(avaliacao) || ObjectUtils.isEmpty(avaliacao))
			throw new IllegalArgumentException();

		return hashAvaliacao.get(avaliacao.getCodigo());

	}
}
