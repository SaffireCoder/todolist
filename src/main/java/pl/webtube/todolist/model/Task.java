package pl.webtube.todolist.model;

public class Task {
    private String name;
    private boolean completed;
    private boolean editable;
    private int id;

   
   
    public Task() {
    }
    
    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }  

    public Task(String name, boolean completed, boolean editable, int id) {
        this.name = name;
        this.completed = completed;
        this.editable = editable;
        this.id = id;
    }

    public Task(String name, boolean completed, boolean editable) {
        this.name = name;
        this.completed = completed;
        this.editable = editable;
    }
    
    

    
    
    
}
