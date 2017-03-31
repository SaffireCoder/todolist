package pl.webtube.todolist.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import pl.webtube.todolist.model.Task;
import pl.webtube.todolist.repositories.TaskRepositoryImpl;


@Named("tasks")
@RequestScoped
public class TaskBean {

    private List<Task> tasksList;
    
    private boolean completed;
    private String name;

    @Inject
    TaskRepositoryImpl taskRepository;

    public List<Task> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }

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
        setTasksList(taskRepository.getTasksList());
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
        tasksList.remove(task);
        
        return null;
    }
    
    public String addAction() {

        Task task = new Task(name,completed,false);
        tasksList.add(task);
        
        name = "";
        completed = false;
        
        return "index";
                
    }

}
