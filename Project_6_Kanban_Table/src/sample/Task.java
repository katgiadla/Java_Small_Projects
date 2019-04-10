package sample;

import java.time.LocalDate;

import static sample.Priority.*;

public class Task {

    private String title;
    private Priority priority;
    private LocalDate localDate;
    private String description;


    public String getTitle() {
        return title;
    }
    public Priority getPriority() {
        return priority;
    }
    public LocalDate getLocalDate(){
        return localDate;
    }
    public String getDescription(){
        return description;
    }


    public void setTitle(String title){
        this.title=title;
    }
    public void setPriority(Priority priority ){
        this.priority =priority ;
    }
    public void setLocalDate (LocalDate localDate ){
        this.localDate =localDate ;
    }


    public Task() {
        this.title = "JavaFx";
        this.description = " implement kanban method ";
        this.priority = tommorow;
        this.localDate = LocalDate.of(2019, 4, 8);
    }

    public Task(String title, Priority priority, LocalDate localDate, String description) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return title;
    }
}
