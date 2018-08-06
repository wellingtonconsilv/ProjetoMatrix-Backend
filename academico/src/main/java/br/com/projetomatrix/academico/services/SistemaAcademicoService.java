package br.com.projetomatrix.academico.services;

import java.util.HashMap;
import java.util.Map;

import br.com.projetomatrix.academico.Aluno;
import br.com.projetomatrix.academico.Coordenador;
import br.com.projetomatrix.academico.Professor;
import br.com.projetomatrix.academico.Turma;
import br.com.projetomatrix.academico.curso.Avaliacao;
import br.com.projetomatrix.academico.curso.Curso;
import br.com.projetomatrix.academico.curso.Disciplina;
import br.com.projetomatrix.academico.curso.Horario;

public class SistemaAcademicoService {
	AlunoService alunoService = new AlunoService();
	CoordenadorService coordenadorService = new CoordenadorService();
	AvaliacaoService avaliacaoService = new AvaliacaoService();
	CursoService cursoService = new CursoService();
	DisciplinaService disciplinaService = new DisciplinaService();
	HorarioService horarioService = new HorarioService();
	ProfessorService professorService = new ProfessorService();
	TurmaService turmaService = new TurmaService();

	public Coordenador cadastrarCoordenador(Coordenador coordenador) {
		return coordenadorService.cadastrarCoordenador(coordenador);
	}

	public void removerCoordenador(String matricula) {
		coordenadorService.removerCoordenador(matricula);
	}

	public Coordenador atualizarCoordenador(Coordenador coordenador) {
		return coordenadorService.atualizarCoordenador(coordenador);
	}

	public Coordenador recuperarCoordenador(String matricula) {
		return coordenadorService.recuperarCoordenador(matricula);
	}

	//

	public Aluno cadastrarAluno(Aluno aluno) {
		return alunoService.cadastrarAluno(aluno);
	}

	public void removerAluno(String matricula) {
		alunoService.removerAluno(matricula);
	}

	public Aluno atualizarAluno(Aluno aluno) {
		return alunoService.atualizarAluno(aluno);
	}

	public Aluno recuperarAluno(String matricula) {
		return alunoService.recuperarAluno(matricula);
	}

	//

	public Avaliacao cadastrarAvaliacao(Avaliacao avaliacao) {
		return avaliacaoService.cadastarAvaliacao(avaliacao);
	}

	public void removerAvaliacao(Avaliacao avaliacao) {
		avaliacaoService.removerAvaliacao(avaliacao);
	}

	public Avaliacao atualizarAvaliacao(Avaliacao avaliacao) {
		return avaliacaoService.atualizarAvaliacao(avaliacao);
	}

	public Avaliacao recuperar(Avaliacao avaliacao) {
		return avaliacaoService.recuperarAvaliacao(avaliacao);
	}

	//

	public Curso cadastrarCurso(Curso curso) {
		return cursoService.cadastarCurso(curso);
	}

	public void removerCurso(Curso curso) {
		cursoService.removerCurso(curso);
	}

	public Curso atualizarCurso(Curso curso) {
		return cursoService.atualizarCurso(curso);
	}

	public Curso recuperarCurso(Curso curso) {
		return cursoService.recuperarCurso(curso);
	}

	//

	public Disciplina cadastrarCurso(Disciplina disciplina) {
		return disciplinaService.cadastarDisciplina(disciplina);
	}

	public void removerCurso(Disciplina disciplina) {
		disciplinaService.removerDisciplina(disciplina);
	}

	public Disciplina atualizarCurso(Disciplina disciplina) {
		return disciplinaService.atualizarDisciplina(disciplina);
	}

	public Disciplina recuperarCurso(Disciplina disciplina) {
		return disciplinaService.recuperarDisciplina(disciplina);
	}
	
	//
	public Horario cadastrarhorario(Horario horario) {
		return horarioService.cadastrarHorario(horario);
	}

	public void removerhorario(Horario horario) {
		horarioService.removerHorario(horario);
	}

	public Horario atualizarhorario(Horario horario) {
		return horarioService.atualizarHorario(horario);
	}

	public Horario recuperarhorario(Horario horario) {
		return horarioService.recuperarHorario(horario);
	}
	
	//
	
	public Professor cadastrarAluno(Professor professor) {
		return professorService.cadastrarProfessor(professor);
	}

	public void removerProfessor(String matricula) {
		professorService.removerProfessor(matricula);
	}

	public Professor atualizarAluno(Professor professor) {
		return professorService.atualizarProfessor(professor);
	}

	public Professor recuperarProfessor(String matricula) {
		return professorService.recuperarProfessor(matricula);
	}
	
	//
	
	public Turma cadastrarhorario(Turma turma) {
		return turmaService.cadastrarTurma(turma);
	}

	public void removerhorario(Turma turma) {
		turmaService.removerTurma(turma);
	}

	public Turma atualizarhorario(Turma turma) {
		return turmaService.atualizarTurma(turma);
	}

	public Turma recuperarhorario(Turma turma) {
		return turmaService.recuperarTurma(turma);
	}
}
