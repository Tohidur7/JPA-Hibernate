//package org.example;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class JpaStarterRead {
//    public static void main(String[] args) {
//
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_hibernate");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//
//// TODO ONE TO ONE MAPPING
//
////        System.out.println("******************Employee details");
////        Employee employee = entityManager.find(Employee.class, 1);
////        System.out.println(employee);
////
////        System.out.println("******************Access card details");
////        AccessCard card = entityManager.find(AccessCard.class, 3);
////        System.out.println(card);
//
//
//
//// TODO ONE TO MANY MAPPING
//
////        System.out.println("**********Employee details");
////        Employee employee = entityManager.find(Employee.class, 1);
////        System.out.println(employee);
////
//        System.out.println("**************PayStub details");
//        PayStub payStub = entityManager.find(PayStub.class, 5);
//        System.out.println(payStub);
//
//
//
//// TODO MANY TO MANY MAPPING
//
////        EmailGroup emailGroup = entityManager.find(EmailGroup.class, 1);
////        System.out.println("*********************got email group , Now accessing members");
////        System.out.println(emailGroup.getEmployees());
//
//    }
//}
