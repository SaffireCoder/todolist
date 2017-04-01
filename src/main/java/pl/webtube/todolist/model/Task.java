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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        if (this.completed != other.completed) {
            return false;
        }
        if (this.editable != other.editable) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    

    
    
    
}
