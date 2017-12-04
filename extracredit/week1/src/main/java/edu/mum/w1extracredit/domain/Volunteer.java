package edu.mum.w1extracredit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Volunteer {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String LastName;
    @ManyToMany(mappedBy = "volunteers")
    private List<Task> tasks;


    public Volunteer() {
        tasks=new ArrayList<>();
    }

    public void assignTask(Task task){
        tasks.add(task);
    }
    public Task unassignTask(Task task){
        tasks.remove(task);
     return task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
