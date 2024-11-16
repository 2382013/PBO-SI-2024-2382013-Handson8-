package repositories;

import entities.TodoList;

public interface TodoListRepository {
    TodoList[] getAll();

    void add(TodoList todolist);

    Boolean remove(Integer id);

    Boolean edit(TodoList todolist);
}