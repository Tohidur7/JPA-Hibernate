package org.practice;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaStarterRead {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


//        Employee employee = entityManager.find(Employee.class, 1);
//        System.out.println(employee.getCard());


//        AccessCard card = entityManager.find(AccessCard.class, 3);
//        System.out.println(card.getOwner());

//        PayStub payStub = entityManager.find(PayStub.class, 5);
//        System.out.println(payStub.getEmployee());

//        System.out.println("before fetching the paystubs");
//        Employee employee = entityManager.find(Employee.class, 1);
//        System.out.println("After fetching the paystubs");
//        System.out.println(employee.getPayStubs());

        EmailGroup emailGroup = entityManager.find(EmailGroup.class, 7);
        System.out.println(emailGroup);
        System.out.println("Accessing members******");
        System.out.println(emailGroup.getMembers());

        entityManager.close();
        entityManagerFactory.close();
    }

}
