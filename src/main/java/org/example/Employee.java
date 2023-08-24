//package org.example;
//
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//
//@Entity
//@Table(name="employee")
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id ;
//    private int age ;
//
//    @Enumerated(EnumType.STRING)
//    private EmployeeType employeeType ;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date dob ;
//
//    @Column(name = "employee_name", length = 100)
//    private String name ;
//
//    @Column(nullable = false, updatable = false)
//    private String email ;
//
//    @OneToOne
//    private AccessCard card;
//
//    @OneToMany(mappedBy = "employee")
//    private List<PayStub> payStubs =  new ArrayList<>();
//
//
//    @ManyToMany(fetch = FetchType.EAGER)
////    @JoinTable(name = "email_group_subscription.",
////            joinColumns = @JoinColumn(name = "Employee_id"),
////            inverseJoinColumns = @JoinColumn(name = "Email_Group_id")
////    )
//    private List<EmailGroup> emailGroups = new ArrayList<>();
//
//
//
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
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//
//    public EmployeeType getEmployeeType() {
//        return employeeType;
//    }
//
//    public void setEmployeeType(EmployeeType employeeType) {
//        this.employeeType = employeeType;
//    }
//
//    public AccessCard getCard() {
//        return card;
//    }
//
//    public void setCard(AccessCard card) {
//        this.card = card;
//    }
//
//    public List<PayStub> getPayStubs() {
//        return payStubs;
//    }
//
//    public void setPayStubs(List<PayStub> payStubs) {
//        this.payStubs = payStubs;
//    }
//
//    public void addPayStub(PayStub payStub) {
//        this.payStubs.add(payStub);
//    }
//
//    public List<EmailGroup> getEmailGroups() {
//        return emailGroups;
//    }
//
//    public void setEmailGroups(List<EmailGroup> emailGroups) {
//        this.emailGroups = emailGroups;
//    }
//
//    public void addEmailGroups(EmailGroup emailGroup) {
//        this.emailGroups.add(emailGroup);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", age=" + age +
//                ", employeeType=" + employeeType +
//                ", dob=" + dob +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", card=" + card +
//                '}';
//    }
//}
