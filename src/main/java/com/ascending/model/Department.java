package com.ascending.model;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    public Department(){};
    public Department(String name, String description, String location){
        this.name = name;
        this.description = description;
        this.location = location;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "location")
    private String location;

    public long getId(){ return id; }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }
}
