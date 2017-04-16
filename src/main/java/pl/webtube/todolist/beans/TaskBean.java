package pl.webtube.todolist.beans;


import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import pl.webtube.todolist.model.Task;
import pl.webtube.todolist.repositories.TaskRepository;


@Named("tasks")
@ApplicationScoped
public class TaskBean {

    
    private boolean completed;
    private String name;

    @Inject
    TaskRepository taskRepository;



    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
    }

    public TaskBean() {
    }
    

    public String editAction(Task task) {
        task.setEditable(true);
        return null;
    }

    public String saveAction(Task task) {
        task.setEditable(false);
        return null;

    }
    
    public String deleteAction(Task task){      
         taskRepository.delete(task);
        
        return null;
    }
    
    public String addAction() {
        Task task = new Task(name,completed,false);
        taskRepository.create(task);
        
        name = "";
        completed = false;
        
        return null;
                
    }

}
