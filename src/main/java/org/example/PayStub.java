//package org.example;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//public class PayStub {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id ;
//    private Date payPeriodStart ;
//    private Date payPeriodEnd ;
//    private double salary ;
//    @ManyToOne
//    @JoinColumn(name="payStub_for")
//    private Employee employee;
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
//    public Date getPayPeriodStart() {
//        return payPeriodStart;
//    }
//
//    public void setPayPeriodStart(Date payPeriodStart) {
//        this.payPeriodStart = payPeriodStart;
//    }
//
//    public Date getPayPeriodEnd() {
//        return payPeriodEnd;
//    }
//
//    public void setPayPeriodEnd(Date payPeriodEnd) {
//        this.payPeriodEnd = payPeriodEnd;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//
//    @Override
//    public String toString() {
//        return "PayStub{" +
//                "id=" + id +
//                ", payPeriodStart=" + payPeriodStart +
//                ", payPeriodEnd=" + payPeriodEnd +
//                ", salary=" + salary +
//                ", employee=" + employee +
//                '}';
//    }
//}
