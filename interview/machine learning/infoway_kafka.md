# Hibernate https://www.interviewbit.com/hibernate-interview-questions/
## What is ORM in Hibernate? 
Object relational mapping. Mapping tool pattern mainly used for converting data stored in a relational database to an object used in object-oriented programming constructs. 
Simplying data retrieval, creation, and manipulation 

## Advantages of Hibernate over JDBC 
- clean readable code: eliminating API-based boiler-plate codes, making the code look cleaner and readable 
- HQL hibernate query language: provides HQL closer to Java and is object-oriented in nature. Reducing the burden for writing dtabase independent queries. 
  JDBC, developer has to know the db-specific codes 
- Transaction management; provides the feature, but JDBC not
- Exception handling: Hibernate wraps the JDBC exceptions and throws unchecked exceptions like JDBCException or HibernateException. 
- Special features: supports OOPs features like inheritance, associations and also supports collections. 

## Important interfaces of Hibernate framework? 
Core interfaces: 
- Configuration 
- SessionFactory 
- Session
- Criteria 
- Query
- Transaction 

## What is a Session in Hibernate? 
A session is an object that maintains the connection between Java object application and database. Session also has methods for storing,
retrieving, modifying or deleting data from database using methods like persist(), load(), get(), update(), delete(). 
Has factory methods to return Query, Criteria, and Transactions objects

## What is a SessionFactory?

 
