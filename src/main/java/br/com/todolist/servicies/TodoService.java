package br.com.todolist.servicies;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.todolist.entities.Todo;
import br.com.todolist.repositories.TodoRepository;

@Service
public class TodoService {

	// Poderia haber colocado un AutoWired para Inyeccion de dependencia
	private TodoRepository todoRepository;

	// Via constructor para Inyección de dependencia
	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	// Crear lista
	public List<Todo> create(Todo todo) {

		 todoRepository.save(todo);
		 return list();
	}

	// Listar listas
	public List<Todo> list(){
	    Sort sort = Sort.by(Sort.Order.desc("prioridade"), Sort.Order.asc("nome"));
	    return todoRepository.findAll(sort);
	}


	//Atualizar
	public List<Todo> update(Todo todo) {
		
		todoRepository.save(todo);
		 return list();
	}

	
	//Deletar
	public List<Todo> delete(Long id) {
		todoRepository.deleteById(id);
		 return list();
	}

}
