package org.practice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// when a query need to get executed frequently. named query( naming a query) is  very useful.
@NamedQuery(query="select e from Employee e order by e.name", name="emp name asc")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE )
    private int id ;

    private String name ;

    @Column(unique = true)
    private String ssn ;

    @Temporal(TemporalType.DATE)
    private Date dob ;

    private int age ;

    @Enumerated(EnumType.STRING)
    private EmployeeType type ;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_Id")
    private AccessCard card ;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.REMOVE)
    private List<PayStub> payStubs = new ArrayList<>();

    @ManyToMany
    @JoinTable(name="Employee_EmailGroup",
        joinColumns = @JoinColumn(name = "Employee_Id"),
        inverseJoinColumns = @JoinColumn(name = "EmailGroup_Id")

    )
    private List<EmailGroup> emailGroups = new ArrayList<>();




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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public AccessCard getCard() {
        return card;
    }

    public void setCard(AccessCard card) {
        this.card = card;
    }

    public List<PayStub> getPayStubs() {
        return payStubs;
    }

    public void setPayStubs(List<PayStub> payStubs) {
        this.payStubs = payStubs;
    }

    public void addPayStub(PayStub payStub) {
        this.payStubs.add(payStub);
    }


    public List<EmailGroup> getEmailGroups() {
        return emailGroups;
    }

    public void setEmailGroups(List<EmailGroup> emailGroups) {
        this.emailGroups = emailGroups;
    }

    public void addEmailSubscription(EmailGroup emailGroup) {
        this.emailGroups.add(emailGroup );
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}
