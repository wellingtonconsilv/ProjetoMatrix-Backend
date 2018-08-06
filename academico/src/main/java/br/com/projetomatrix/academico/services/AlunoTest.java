package br.com.projetomatrix.academico.services;

import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.curso.Curso;
import br.com.projetomatrix.academico.enumeracoes.Status;

public class AlunoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlunoService t = new AlunoService();

		Curso cc = new Curso();
		cc.setDescricao("CC");
		Curso adm = new Curso();
		adm.setDescricao("ADM");

		Aluno a = new Aluno();
		a.setNome("Ru");
		a.setEndereço("end");
		a.setTelefone("554");
		a.setStatus(Status.ATIVO);
		a.setCurso(cc);
		
		Aluno b = new Aluno();
		b.setNome("Lipao");
		b.setEndereço("lOs");
		b.setTelefone("985");
		b.setStatus(Status.ATIVO);
		b.setCurso(cc);
		t.cadastrarAluno(b);
		
		System.out.println("Matricula: " + t.cadastrarAluno(b).getMatricula());
		System.out.println("Nome: " + t.recuperarAluno(b.getMatricula()).getNome());
		System.out.println("Status: " +t.recuperarAluno(b.getMatricula()).getStatus());
		System.out.println("Telefone: " +t.recuperarAluno(b.getMatricula()).getTelefone());
		System.out.println("Curso: " +t.recuperarAluno(b.getMatricula()).getCurso().getDescricao());

		System.out.println();
		System.out.println("Matricula: " + t.cadastrarAluno(a).getMatricula());
		System.out.println("Nome: " + t.recuperarAluno(a.getMatricula()).getNome());
		System.out.println("Status: " +t.recuperarAluno(a.getMatricula()).getStatus());
		System.out.println("Telefone: " +t.recuperarAluno(a.getMatricula()).getTelefone());
		System.out.println("Curso: " +t.recuperarAluno(a.getMatricula()).getCurso().getDescricao());
		t.removerAluno(a.getMatricula()); 
		System.out.println();
		a.setNome("Ru");
		a.setEndereço("erd");
		a.setTelefone("5564");
		a.setStatus(Status.ATIVO);
		a.setCurso(adm);
		t.atualizarAluno(a);
		System.out.println("Matricula: " + t.recuperarAluno(a.getMatricula()).getMatricula());
		System.out.println("Nome: " + t.recuperarAluno(a.getMatricula()).getNome());
		System.out.println("Status: " +t.recuperarAluno(a.getMatricula()).getStatus());
		System.out.println("Telefone: " +t.recuperarAluno(a.getMatricula()).getTelefone());
		System.out.println("Curso: " +t.recuperarAluno(a.getMatricula()).getCurso().getDescricao());

	}

}
