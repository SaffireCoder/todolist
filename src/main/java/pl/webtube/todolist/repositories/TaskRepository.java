package pl.webtube.todolist.repositories;

import java.util.List;
import pl.webtube.todolist.model.Task;


public interface TaskRepository {
    
    public void create(Task tsk);
    public void delete(Task tsk);
    public List<Task> getTasksList();
    
}
