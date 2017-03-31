package pl.webtube.todolist.repositories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import pl.webtube.todolist.model.Task;

@ApplicationScoped

public class TaskRepositoryImpl implements TaskRepository {

    private List<Task> tasksList = new ArrayList();


    public TaskRepositoryImpl() {
    }
    
    @PostConstruct
    public void init() {
        Task task = new Task();
        task.setCompleted(true);
        task.setName("Task 1");
        task.setEditable(false);
        tasksList.add(task);

    }

    @Override
    public void create(Task tsk) {

    }
    @Override
    public void delete(Task tsk) {
        tasksList.remove(tsk);
    }
    
    @Override
    public void update(Task tsk) {
    }

    @Override
    public List<Task> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }
    
}


