

public class Runner {

    //Relationships in JAVA:
    //1. HAS-A Relationship
    //2. IS-A Relationship
    //3. USES-A Relationship

    //Q)What is the difference between HAS-A relationship and IS-A relationship?

    //Ans:

    //HAS-A Relationship is able to define associations between entity classes, where associations are able to improve communication between entity classes and data navigation between entity classes

    //IS-A is relationship is able to define inheritance relation between entity classes, where inheritance relation is able to improve code reusablity.

    //Associations in JAVA:
    //1. One-To-One association
    //2. One-To-Many association
    //3. Many-To-One association
    //4. Many-To-Many association
    

    //In java applications, we are able to achieve associations by delcaring either single reference variable or array of reference variables of an entity class in another entity class.
}

class Account{

}

class Address{

}

class Employee{
    Account account;//One to One Association
    Address[] address;//One to Many Association
}