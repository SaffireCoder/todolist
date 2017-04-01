package pl.webtube.todolist.repositories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import pl.webtube.todolist.model.Task;

@Named
@ApplicationScoped

public class TaskRepositoryImpl implements TaskRepository {

    private List<Task> tasksList = new ArrayList();
    private int id =0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     @Override
    public List<Task> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }
    
 

    public TaskRepositoryImpl() {
    }
    
    @PostConstruct
    public void init() {
        Task task = new Task("Task 1",true,false,id);
        id++;
        task.setCompleted(true);
        task.setName("Task 1");
        task.setEditable(false);
        tasksList.add(task);

    }

    @Override
    public void create(Task tsk) {      
        tsk.setId(id);
        tasksList.add(tsk);
        id++;

    }
    @Override
    public void delete(Task tsk) {
        tasksList.remove(tsk);
    }
    
    @Override
    public void update(Task tsk) {      
        for (Task task : tasksList){            
            if (task.getId() == tsk.getId()){
                task.setName(tsk.getName());
                task.setCompleted(tsk.isCompleted());
            }      
        }
    }

   
    
}


