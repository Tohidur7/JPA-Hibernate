package org.practice;

import javax.persistence.*;
import java.util.Date;


@Entity
public class PayStub {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id ;

    private Date payStartPeriod ;

    private Date payEndPeriod;

    private float salary ;

    @ManyToOne
    private Employee employee ;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPayStartPeriod() {
        return payStartPeriod;
    }

    public void setPayStartPeriod(Date payStartPeriod) {
        this.payStartPeriod = payStartPeriod;
    }

    public Date getPayEndPeriod() {
        return payEndPeriod;
    }

    public void setPayEndPeriod(Date payEndPeriod) {
        this.payEndPeriod = payEndPeriod;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "PayStub{" +
                "id=" + id +
                ", payStartPeriod=" + payStartPeriod +
                ", payEndPeriod=" + payEndPeriod +
                ", salary=" + salary +
                '}';
    }
}
