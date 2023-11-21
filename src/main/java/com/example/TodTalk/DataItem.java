package com.example.TodTalk;

public class DataItem {
    private Long id;
    private String name;
    private String description;

    // Constructors (default and parameterized)
    public DataItem(){

    }
    public DataItem(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getter and Setter methods


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}