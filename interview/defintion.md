## abstract vs interface 
The key technical differences between an abstract class and an interface are:

Abstract classes can have constants, members, method stubs (methods without a body) and defined methods, whereas interfaces can only have constants and methods stubs.
Methods and members of an abstract class can be defined with any visibility, whereas all methods of an interface must be defined as public (they are defined public by default).
When inheriting an abstract class, a concrete child class must define the abstract methods, whereas an abstract class can extend another abstract class and abstract methods from the parent class don't have to be defined.
Similarly, an interface extending another interface is not responsible for implementing methods from the parent interface. This is because interfaces cannot define any implementation.
A child class can only extend a single class (abstract or concrete), whereas an interface can extend or a class can implement multiple other interfaces.
A child class can define abstract methods with the same or less restrictive visibility, whereas a class implementing an interface must define the methods with the exact same visibility (public).

## static https://stackoverflow.com/questions/38263533/can-static-method-access-non-static-instance-variable

static method can access non-static methods and fields of any instance it knows of. However, it cannot access anything non-static if it doesn't know which instance to operate on.

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

