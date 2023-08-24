//package org.example;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.util.Date;
//import java.util.List;
//
//
//public class JpaStarterWrite {
//    public static void main(String[] args) {
//
//        Employee employee1 = new Employee();
//        employee1.setAge(100);
//        employee1.setEmployeeType(EmployeeType.FULL_TIME);
//        employee1.setDob(new Date());
//        employee1.setName("foo bar");
//        employee1.setEmail("hello@gmail.com");
//
//        Employee employee2 = new Employee();
//        employee2.setAge(60);
//        employee2.setEmployeeType(EmployeeType.CONTRACTOR);
//        employee2.setDob(new Date());
//        employee2.setName("bar bar");
//        employee2.setEmail("bar@aec.ac.in");
//
//
//        AccessCard card1 = new AccessCard();
//        card1.setIssuedDate(new Date());
//        card1.setActive(true);
//        card1.setFirmwareVersion("1.0.0");
//        card1.setOwner(employee1);
//        employee1.setCard(card1);
//
//        AccessCard card2 = new AccessCard();
//        card2.setIssuedDate(new Date());
//        card2.setActive(false);
//        card2.setFirmwareVersion("1.2.0");
//        card2.setOwner(employee2);
//        employee2.setCard(card2);
//
//        PayStub payStub1 = new PayStub();
//        payStub1.setPayPeriodStart(new Date());
//        payStub1.setPayPeriodEnd(new Date());
//        payStub1.setSalary(400);
//        payStub1.setEmployee(employee1);
//        employee1.addPayStub(payStub1);
//
//        PayStub payStub2 = new PayStub();
//        payStub2.setPayPeriodStart(new Date());
//        payStub2.setPayPeriodEnd(new Date());
//        payStub2.setSalary(1000);
//        payStub2.setEmployee(employee1);
//        employee1.addPayStub(payStub2);
//
//
//
//        EmailGroup emailGroup1 = new EmailGroup();
//        emailGroup1.setName("company waterCooler discussions");
//        emailGroup1.addMembers(employee1);
//        emailGroup1.addMembers(employee2);
//        employee1.addEmailGroups(emailGroup1);
//        employee2.addEmailGroups(emailGroup1);
//
//
//
//        EmailGroup emailGroup2 = new EmailGroup();
//        emailGroup2.setName("engineering");
//        emailGroup2.addMembers(employee1);
//        employee1.addEmailGroups(emailGroup2);
//
//
//
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_hibernate");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//
//        entityManager.persist(employee1);
//        entityManager.persist(employee2);
//
//        entityManager.persist(card1);
//        entityManager.persist(card2);
//
//        entityManager.persist(payStub1);
//        entityManager.persist(payStub2);
//
//        entityManager.persist(emailGroup1);
//        entityManager.persist(emailGroup2);
//
//        transaction.commit();
//
//
//
//
//
//    }
//}