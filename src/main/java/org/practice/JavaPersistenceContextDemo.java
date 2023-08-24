package org.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class JavaPersistenceContextDemo {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.setName("new employee");
        employee1.setSsn("12343");
        employee1.setDob(new Date());
        employee1.setAge(55);
        employee1.setType(EmployeeType.FULL_TIME);
        System.out.println("******************created employee instance");


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        System.out.println("**********************starting transaction");

        entityManager.persist(employee1);
        System.out.println("*********************after persist method called");

        // does it find the employee as the insert has not happened as of now
        Employee employeeFound = entityManager.find(Employee.class, 1);
        System.out.println(employeeFound); // ans: it doees find the emp
        System.out.println(employee1);

        transaction.commit();
        System.out.println("**********************after transaction closed");
        entityManager.close();
        entityManagerFactory.close();
    }
}
