package org.practice;

import javax.persistence.*;
import java.util.List;

public class JpaJPQLExample {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        TypedQuery<Employee> query = entityManager.createNamedQuery("emp name asc", Employee.class);
        List<Employee> resultList = query.getResultList();

        for (Employee employee : resultList) {
            System.out.println(employee);
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}
