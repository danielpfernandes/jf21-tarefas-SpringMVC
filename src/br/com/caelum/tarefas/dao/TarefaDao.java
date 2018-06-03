package br.com.caelum.tarefas.dao;

import java.util.List;

import br.com.caelum.tarefas.modelo.Tarefa;

public interface TarefaDao {
	
	void adiciona(Tarefa tarefa);
	List<Tarefa> lista();
	Tarefa buscaPorId(Long id);
	void altera(Tarefa tarefa);
	void finaliza(Long id);
	void remove(Tarefa tarefa);
}
