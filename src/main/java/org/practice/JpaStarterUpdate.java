package org.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaStarterUpdate {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //getting the data
        Employee employee = entityManager.find(Employee.class, 2);
        EmailGroup emailGroup = entityManager.find(EmailGroup.class, 8);

        //setting new values
        employee.addEmailSubscription(emailGroup);
        emailGroup.addMember(employee);




        //persisting updated objects in database
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(employee);
        entityManager.persist(emailGroup);

        transaction.commit();




        entityManager.close();
        entityManagerFactory.close();


    }
}
