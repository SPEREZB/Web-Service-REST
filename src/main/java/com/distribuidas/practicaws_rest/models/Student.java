package com.distribuidas.practicaws_rest.models;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="people")
@lombok.Data
public class Student implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String last_name;
    private Integer age;
    public Student() {
        this.id=id;
        this.name=name;
        this.last_name=last_name;
        this.age=age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) { this.last_name = last_name;
    }
    public void setAge(int age) { this.age = age;
    }
}
