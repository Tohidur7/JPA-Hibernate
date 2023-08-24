//package org.example;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class EmailGroup {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id ;
//    private String name ;
//
//    @ManyToMany(mappedBy = "emailGroups", fetch = FetchType.LAZY)
//    private List<Employee> employees = new ArrayList<>();
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
//
//    public void addMembers(Employee employee) {
//        this.employees.add(employee);
//    }
//}
