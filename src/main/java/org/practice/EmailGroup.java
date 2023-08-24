package org.practice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class EmailGroup {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int id ;
    private String name ;

    @ManyToMany(mappedBy = "emailGroups")
    private List<Employee> members = new ArrayList<>();


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

    public List<Employee> getMembers() {
        return members;
    }

    public void setMembers(List<Employee> members) {
        this.members = members;
    }

    public void addMember(Employee employee) {
        this.members.add(employee);
    }



    @Override
    public String toString() {
        return "EmailGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
