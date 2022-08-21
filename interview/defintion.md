## abstract vs interface 
The key technical differences between an abstract class and an interface are:
Abstract class vs Interface

Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.
Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
Multiple implementations: An interface can extend one or more Java interfaces, an abstract class can extend another Java class and implement multiple Java interfaces.
Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.
## static https://stackoverflow.com/questions/38263533/can-static-method-access-non-static-instance-variable
Static Block
If you need to do the computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, when the class is first loaded. Take a look at the below Java program to understand the usage of Static Block.
Static Variable
When you declare a variable as static, then a single copy of the variable is created and divided among all objects at the class level. Static variables are, essentially, global variables. Basically, all the instances of the class share the same static variable. Static variables can be created at class-level only.
Static Methods
When a method is declared with the static keyword, it is known as a static method. The most common example of a static method is the main( ) method.  Methods declared as static can have the following restrictions:
They can directly call other static methods only.
They can access static data directly.
Static Class

A class can be made static only if it is a nested class. Nested static class doesn’t need a reference of Outer class. In this case, a static class cannot access non-static members of the Outer class. Let’s take an example to understand how it works


static method can access non-static methods and fields of any instance it knows of. However, it cannot access anything non-static if it doesn't know which instance to operate on.

## final
Final Variables
When a variable is declared with the final keyword, its value can’t be modified, essentially, a constant. This also means that you must initialize a final variable. If the final variable is a reference, this means that the variable cannot be re-bound to reference another object, but the internal state of the object pointed by that reference variable can be changed i.e. you can add or remove elements from the final array or final collection. It is good practice to represent final variables in all uppercase, using underscore to separate words.
When a class is declared with final keyword, it is called a final class. A final class cannot be extended(inherited).
Usage 1: One is definitely to prevent inheritance, as final classes cannot be extended. For example, all Wrapper Classes like Integer, Float, etc. are final classes. We can not extend them.
Usage 2: The other use of final with classes is to create an immutable class like the predefined String class. One can not make a class immutable without making it final.
When a method is declared with final keyword, it is called a final method. A final method cannot be overridden. The Object class does this—a number of its methods are final. We must declare methods with the final keyword for which we are required to follow the same implementation throughout all the derived classes.

## override vs overload
What is Overloading and Overriding? When two or more methods in the same class have the same name but different parameters, it's called Overloading. When the method signature (name and parameters) are the same in the superclass and the child class, it's called Overriding.

## String immutable 
https://www.baeldung.com/java-string-immutable

## treemap hashmap的区别:TreeMap默认是按照Key值升序排序的

## iterate map using lambda 
public void iterateUsingLbda(Map<String, Integer> map) {
map.forEach((k, v) -> System.out.println((k + ":" + v)));
}

## 用BFS判断图的连通性（注意不是树的BFS）
给了个图，判断3和12是否连通
3<--->7<---->9<---->4<--->12
!       !
8--------1
https://blog.csdn.net/i4053/article/details/84190926


## Understanding SOAP and RESTAPI
https://medium.com/geekculture/understanding-soap-and-restful-web-services-a27ddcd4c3df
A client or user can invoke a web service by sending an XML message and then in turn gets back and XML response message.

XML supposed to tags the data, SOAP transfers the message, and WSDL describes the service’s accessibility.
a REST web service is generally a better choice when time is a factor, but SOAP wins out when building a service with multiple, non-CRUD methods

Also, SOAP web Services have standards for security and addressing.

## SpringBoot Annotation 
1. Basic Setup 
@SpringBootApplication, @Configuration @ComponentsCAN 
   @EnableAutoConfiguration
   
2. Request Responses 
@GetMapping @RequestMapping @RequestParam 
   
3. Component Types
@Component, @Service, @Repository, @Controller, @RestController
   
4. Testing 
@SpringBootTest, @MockBean, @Validated 
   
5. Misc 
@Bean, @ConditionalOnJava
   
## Diff b/w Spring and SpringBoot 
Spring uses either the web.xml or SpringServletContainerInitializer as its bootstrap entry point.
Spring Boot uses only Servlet 3 features to bootstrap an application.

## Concurrent modification exception
The ConcurrentModificationException occurs when an object is tried to be modified concurrently when it is not permissible. This exception usually comes when one is working with Java Collection classes. For Example - It is not permissible for a thread to modify a Collection when some other thread is iterating over it.
https://www.javatpoint.com/concurrentmodificationexception-in-java

## create custom exception in Java 
https://www.baeldung.com/java-new-custom-exception

## connect dao layer to NoSQL db  Cassandra 
https://www.baeldung.com/spring-data-cassandra-tutorial
@Repository
public interface BookRepository extends CassandraRepository<Book> {
//
}

@Configuration
@EnableCassandraRepositories(
basePackages = "com.baeldung.spring.data.cassandra.repository")
public class CassandraConfig extends AbstractCassandraConfiguration {
//
}

https://www.baeldung.com/cassandra-with-java

## How to count visits on a website using webAPI 
countapi.xyz
1. set up HTML, CSS, JavaScript 
   <h1>site been visited <span id=""visits"></span></h1>
2. Create a namespace 
https://api.countapi.xyz/create?namespace={name of your website}
   
3. Add script in the top of your INDEX.html file 

4. Add a fun in your script file to count visits and dupate 

5. reset value of your key 

6. view the current value of your key 


## Load balancer vs API Gateway 
A load balancer can control and balance network traffic, but API Gateway does it differently. Requests can be directed to specific backend resources based on the destinations being requested instead of being distributed evenly over a group of resources (e.g., a cluster of servers).
https://www.nginx.com/resources/glossary/load-balancing/

## Stream vs Collections
Collections are mainly used to store and group the data. Streams are mainly used to perform operations on data.
You can add or remove elements from collections. You can't add or remove elements from streams.

## Reactive programming 
https://dzone.com/articles/spring-reactive-programming-in-java
Spring Webflux:

## Collections and Stream
Collections are mainly used to store and group the data. 
Streams are mainly used to perform operations on data. 
You can add or remove elements from collections. You can't add or remove elements from streams.

## Elasticsearch 
You can send data in the form of JSON documents to Elasticsearch using the API or ingestion tools such as Logstash and Amazon Kinesis Firehose. Elasticsearch automatically stores the original document and adds a searchable reference to the document in the cluster’s index. You can then search and retrieve the document using the Elasticsearch API. You can also use Kibana, a visualization tool, with Elasticsearch to visualize your data and build interactive dashboards.
https://aws.amazon.com/opensearch-service/the-elk-stack/what-is-elasticsearch/

