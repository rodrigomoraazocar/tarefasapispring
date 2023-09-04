package br.com.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.todolist.entities.Todo;


//Esta Interface tiene herencia de JpaRepository de mi Entidad Todo y usa Long (debido al tipo de dato de Id)
public interface TodoRepository extends JpaRepository<Todo,Long> {

}






