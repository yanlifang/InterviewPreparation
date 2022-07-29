## Any locks in multi threadings 

Name and Role

Readwritelock - role 

A ReadWriteLock maintains a pair of associated locks, one for read-only operations and one for writing. The read lock maybe help simultaneously by multiple reader threads, so long as there no writers. The write lock is exclusive. 

Read lock may be held simultaneously by multiple reader threads, so long as there are no writers. The write lock is exclusive. 

Lock readLock() 

Lock writeLock() 

readLock.loc();

try {
    statements
} finally {
    readLock.unlock();
}


ReentrantLcok: implements the lock interface and provides synchronization to methods while accessing shared resources. The code which manipulates the shared resource is surrounded by calls to lock and unlock method. This gives a lock to the current working thread and blocks all other threads which are trying to take a lock on the shared resource. 

ReentrantLock allows threads to enter into the lock on a resource more than once. When the thread first enters into the lock, a hold count is set to one. Before unlocking the thread can re-enter into lock again and every time hold count is incremented by one. For every unlocks request, hold count is decremented by one and when hold count is 0, the resource is unlocked. 

Reentrant locks also offers a fairness parameter, by which the lock would abide by the order of the lock request, after a thread unlocks the resource, the lock would go to the thread which has been waiting for the longest time. 

Future 


## Callable to Runnable 

Runnable: does not return anything 
Callable: return a result




## final and static keyword
1. static
   1. static keyword denotes that a member variable, or method, can be accessed without requiring an instantiation of the class to which it belongs. Not needed to create an object to call that method. The method can be called using the class name. 
   2. static variables can be reinitialized 
   3. can be called by other static methods and only access the static members of the class 
   4. The static class obj cannot be created. It only contains static members only 
   5. The static keyword can be used in a block.

2. Final 
   1. Final keyword denotes an entity that can only be assigned once. T
   2. The final methods cannot be overriden 
   3. The final class cannot be inherited by other classes.
   4. The final keyword is not used with a block.

## Hashmap and hashtable 
Hashmap and hashtable store key and value pairs in a hash table. When using a hashtable or hashmap, we specify an object that is used as a key and the value that you want to be linked to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table. 
HashMap is non-synchronized. Not thread-safe and cannot be shared between many threads without proper synchronization code whereas hashtable is synchronized. It is thread-safe and can be shared with many threads. 
HashMap allows one null key and multiple null values whereas Hashtable does not allow any null key or value. 
HashMap is generally preferred over HashTable if thread synchronization is not needed. 

HashMap: no method is synchronized, multiple threads can operate simultaneously and hence hashmap's object is not thread safe, threads are not required to wait and hence relatively performance is high. Null is allowed for both key and value, introduced in the 1.2v. Non-legacy.
HashTable: Every method is synchronized, at a time only one thread is allowed to operate the HashTable's object. Thread-safe. Increases the waiting time of the thread and performance is low. Null is not allowed for both key and value. Otherwise, will get a null pointer exception. Introduced in the 1.0v, legacy. 

## ConcurrentHashMap 
introduced in v1.5, belongs to java.util.concurrent, which implements ConcurrentMap as well as to Serializable interface also. 
key points of ConcurrentHashMap: 
The underlined data structure for ConcurrentHashMap is Hashtable. 
ConcurrentHashMap class is thread-safe 
At a time any number of threads are applicable for a read operation without locking the ConcurrentHashMap object which is not there in HashMap. 
In ConcurrentHashMap, the object is divided into a number of segments according to the concurrency level.
The default concurrency-level of ConcurrentHashMap is 16. 
In ConcurrentHashMap, at a time any nubmer of threads can perform retrieval operation but for updated in the object, the thread must lock the particular segment in which the thread wants to operate. This type of locking mechanism is known as Segment locking or bucket locking. Hence at a time, 16 update operations can be performed by threads. 
Inserting null object is not possible in ConcurrentHashMap a key or value. 
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable 

## thread (write), how many kinds of locks 
Three ways to create a thread
1. Created by extending the Thread class and overriding its run() method 
public class Main extends Thread {
    public void run() {
        System.out.println("Print");
    }
}
use: creating an instance of the class and call its start() method 
public class Main extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("outside of thread");
    }
    public void run() {
        System.out.println("Inside of a thread");
    }
}

2. implement the runnable interface: 
public class Main implements Runnable {
    public void run() {
        System.out.println("Running in a thread");
    }
}
If class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method 
public class Main implements Runnable {
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("outside of thread");
    } 
    public void run() {
        System.out.println("inside of thread");
    }
}

3. implement the callable interface 
Java Callable tasks return java.util.concurrent.Future object. Using Java Future object, we can find out the status of the Callable task and get the returned object. It provides get() method that can wait for the Callable to finish and then return the result. 
Differences between runnable and callable: runnable - no return void function; callable - has return value 
    To find status of associated callable task: 
    - isDOne()
    - isCanceled()
difference of start and run: thread.run will run this test on current thread, but thread.start have lots of other code, which will create new thread, then use new thread to run the test 

public class MyCallable implements Callable<String> {
    @Override 
    public String call() throws Exception {
        Thread.sleep(1000);
        return Thread.currentThread().getName();
    }

    public static void main(String args[]) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<Future<String>>;
        Callable<String> callable = new MyCallable();
        for (int i = 0; i < 100; i++) {
            Future<String> future = executor.submit(callable);
            list.add(future);
        }

        for(Future<String> fut : list) {
            try {
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedExcepton | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown(); //shutdown the service 
    }
}




Concurrency problems: 
isAlice(): to thread to check if thread has finished running before using any attributes that the thread can change 
Main thread = new Thread();
thread.start();

while(thread.isAlice()) {
    System.out.println("Waiting...");
}
System.out.println("Main1: " + amount);
amount++;
System.out.println("Main: " + amount);
}
public void run() {
    amount++;
}

## CI/CD continuous integration and continuous delivery or continuous deployment
Bridges the gaps between development and operation activities and teams by enforcing automation in building, testing and deployment of applications.

Jenkins is an open source automation server. Helps automate the parts of software development related to building, testing, and deploying, facilitating continous integration and continous delivery. It is a server-based system that runs in servlet containers such as Apache Tomcat. 

benefits of CI/CD: 
1. Less risk
2. More frequent releases 
3. Improved productivity
4. Elevated quality
5. Better design 

Most important characteristics in a CI/CD platform? 
1. Reliability 
2. Speed 
3. Reproducibility
4. Ease of use 

Difference between continous integration, continous delivery, and continous deployment? 
1. CI: executes the sequence of steps required to build and test the project. CI runs automatically on every change committed to a shared repository, offering developers quick feedback about the project's state.
2. Continous delivery: extension of CI. Goal is to automate every step required to package and release a piece of software. The output of a continuous delivery pipeline takes the form of a deployable binary, package or container. 
3. CD: option step-up from continous delivery. It is a process that takes the output from the delivery pipeline and deploys it to the production system in a safe and automated way. 


## JUnit testing 
1. JUnit testing: Java unit testing framework that is one of the best test methods for regression testing. Open source framework, used to write and run repeatable automated tests. 
2. Set up Junit testing
3. test each function, life cycle annotation and test 

## Mockito 
Open source testing framework. Allows the creation of test double objects in automated unit tests for the purpose of test-driven development or behavior-driven development. 
Cann't support final, static, private method 



## lambda function
1. parameter -> expression
2. (p1, p2) -> expression 
3. expressions are limited, have to immediately return a value, cannot contain variable, assignments or statments such as if or for. Code block can be used with curly braces. If lambda expression needs to return a value, code block should have a return statement. 
(p1, p2) -> {code block }
nums.forEach((n) -> {System.out.println(n); });

lambda expressions can be stored in variables if the variable's type is an interface which has only one method. The lambda expression should have the same number of parameters and the same return type as that method. Like Consumer interface
import java.util.function.Consumer;


numbers.add(5);
numbers.add(9);
Consumer<Integer> method = (n) -> {System.out.println(n); }
numbers.forEach(method);

To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type. Calling the interfae's method will run the lambda expression. 

## Stream 
1. create stream object, like collections, list array
2. use all features of stream, intermediate operation, like map and filter 
3. termination operation, terminate pipeline, collection, forEach 

## difference between collection and stream 
create a stream 

1. obtain a stream from a collection by calling the stream() method of the given collection. e.g. Stream<String> stream = items.stream();

Stream processing phases: 
Once you have obtained a Stream instance from a Collection instance, you use the stream to process the elements in the collection. 

Processing the elements in the stream happens in two steps/phases:
Configuration: filters, mappings - non-terminal operations 
Processing: processed, doing sth to the filtered and mapped objects. No processing takes place during the configuring calls. Not until a processing method is called on the stream. - Terminal operations 

Stream.filter(item->item.statsWith("o")); filter method takes a Predicate as parameter. The Predicate interface contains a function called test() which the lambda expression passed as parameters above is matched against. Lambda expression implements Predicate.test()
boolean test(T t) 

Stream.map()
items.stream().map(item -> item.toUpperCase())
Stream.collect(): one of the stream processing methods on the Stream interface 
item.stream().filter(item->item.startsWith("o")).collect(Collectors.toList());

Stream.min() and Stream.max()
The min() and max() methods are stream processing methods. Once these are called, the stream will be iterated, filtering and mapping applied, and the minimum or maximum value in the stram will be returned. 
The min() and max() methods return an Optimal instance which has a get() method on, which you use to obtain the value. no elements, get() will return null. 

Stream.count()
Stream.reduce()

Collection is an in-memory data structure, which holds all the values that the data structure currently has. Every element in the Collection has to be computed before we add it to the Collection. Operations such as searching, sorting, insertion, manipulation, and deletion can be performed on a Collection. Searching, sorting, insertion, manipulation, and deletion can be performed on a Collection. Provides interfaces like Set, List, Queue, Deque, Classes like ArrayList, Vector, LinkedList, PriorityQueue, HashSet 

On the other hand, IStream is an API that is introduced in Java 8 which is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result. The Stream API is used to process collections of objects. 

Main features of the Java stream are as follows: 
1. A stream is not a data structure instead it takes input from the Collections, Arrays, or I/O channels
2. Streams don't change the original data structure, they only provide the results as per the pipelined methods.
3. Each intermediate operations is lazily executed and returns another stream as a result, hence varisou intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result. 

Differences:
1. Streams does not store data, it operates on the soure data structure. Collections stores/holds all the data that the data structure currently has in a particular data structure like Set, List or Map. 
2. StreamS use function interfaces like lambda which makes it a good fit for programming language. Collections don't use functional interfaces. 
3. Java streams are consumable, to traverse the stream, it needs to be created every time. Collections are non-consumable, ie. can be traversable multipe times without creating it agian. 
4. Java streams support both sequential and parallel processing. Collection supports parallel processing and parallel processing can be very helpful in achieving high performance. 
5. All Java stream API interfaces and classes are in java.util.stream package. Collections, specific classes for primitive types such as IntStream, LongStream, and DoubleStream are used in collections since primitive data types such as int, long in the collections using auto-boxing and these operations could take a lot of time. 
6. Streams are not modifiable, one can't add or remove elements from streams. Collections are modifiable, can easily add to or remove elements from collections. 
7. Streams are iterated internally by just mentioning the operations, Collections are iterated externally using loops. 

## @RequestParam @PathVariable 
@RequestParams: extract values from the query string, encoded, optional values
@PathVariables: extract values from URI path, not encoded, optional values 

@GetMapping("/foos/{id})
@ResponseBody
public String getFooById(@PathVaraible String id) {
    return "ID: " + id;
}
http://localhost:8080/spring-mvc-basics/foos/abc ID: abc

@GetMapping("/foos") 
@ResponseBody 
public String getFooByIdUsingQueryParam(@RequestParam String id) {
    return "ID: " + id;
}
http://localhost:8080/spring-mvc-basics/foos?id=abc

http://localhost:8080/spring-mvc-basics/foos/ab+c
----
ID: ab+c

@RequestParam 
http://localhost:8080/spring-mvc-basics/foos?id=ab+c
----
ID: ab c

## @Component and @Service 
@Component is a generaic sterotype for any Spring-managed component or bean
@Repository is a streotype for the persistence layer. 
@Service is a streotype for the service layer.
@Controller is a stereotype for the presentation layer (Spring-MVC)

@Component is a class-level annotation. It is used to denote a class as a Component. We can use @Component across the application to mark the beans as Spring’s managed components. A component is responsible for some operations. Spring framework provides three other specific annotations to be used when marking a class as a Component. 
@Service
@Repository
@Controller

@Service Annotation
In an application, the business logic resides within the service layer so we use the @Service Annotation to indicate that a class belongs to that layer. It is a specialization of @Component Annotation. One most important thing about the @Service Annotation is it can be applied only to classes. It is used to mark the class as a service provider. So overall @Service annotation is used with classes that provide some business functionalities. Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used.

@Repository Annotation
@Repository Annotation is also a specialization of @Component annotation which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects. Though it is a specialization of @Component annotation, so Spring Repository classes are autodetected by the spring framework through classpath scanning. This annotation is a general-purpose stereotype annotation which very close to the DAO pattern where DAO classes are responsible for providing CRUD operations on database tables. 

C. @Controller Annotation
Spring @Controller annotation is also a specialization of @Component annotation. The @Controller annotation indicates that a particular class serves the role of a controller. Spring Controller annotation is typically used in combination with annotated handler methods based on the @RequestMapping annotation. It can be applied to classes only. It’s used to mark a class as a web request handler. It’s mostly used with Spring MVC applications. This annotation acts as a stereotype for the annotated class, indicating its role. The dispatcher scans such annotated classes for mapped methods and detects @RequestMapping annotations.

## Singleton (safe) 
Ensure a class has only one instance, provide a global point of access to it. 
Encapsulated "just-in-time initialization" or "initialization on first use" 
The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. It is named after the singleton set, which is defined to be a set containing one element. 

1. Eager instantiation 
 public class Singleton {
    private Singleton(){}

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance; 
    }
   }
2. public class Singleton {
    private Singleton(){}

    private static Singleton instance;
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance; 
    }
   }
3. lazy instantiation 
   public class Singleton {
    private Singleton(){}

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance; 
    }
   }

4. public class Singleton {
    private Singleton(){}

    private static Singleton instance;

    public static Synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
   }
5. public class Singleton {
    private Singleton(){}

    private static Singleton instance;

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
   }
6. Best methods
   public class Singleton {
    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null ){
            synchronized(Singleton.class){
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
   }
7. One of the best method
   public class Singleton {
    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
   }

## test (steps)


## mokito test 

## http method (post, put, delete)
GET 
@GetMapping("/rest/v1/books")
public ResponseEntity<List<Book>> findAllBooks() {
    List<Book> books = bookService.findAll();
    return ResponseEntity.ok(books);
}

@GetMapping("/rest/v1/books/{bookId}")  - get methods 
public ResonseEntity<Book> findBookById(@PathVariable long bookId) {
    try{
        Book book = bookService.findById(bookId);
        return ResponseEntity.ok(book);
    } catch (ResourceNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
HttpEntity: adds a HttpStatus status code 

POST: create a new resource, update entity 
201: created 
Result of this method is not cacheable. Need to include Cache-Control or Expires header if we want to use cache for POST. In relation with GET with cached result, POST should invalidate the cache. 

@PostMapping("/rest/v1/books")
public ResponseEntity<Book> addBook(@RequestBody Book book) throws URISyntaxException{
    try {
        Book newBook = bookService.save(book);
        return ResponseEntity.created(new URI("/rest/v1/books/")+newBook.getId()).body(book);
    } catch (ResourceAlreadyExistsException ex) {
        logger.error(ex.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    } catch (BadResourceException ex) {
        logger.error(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}

PUT: UPDATE method
@PutMapping("/rest/v1/books/{bookId"})
public ResponseEntity<Void> updateBook(@RequestBody Book book, @PathVariable long bookId) {
    try {
        book.setId(bookId);
        bookService.update(book);
        return ResponseEntity.ok().build();
    } catch(ResponseNotFoundException ex) {
        logger.error(ex.getMessage());
        return ResonseEntity.notFound().build();
    } catch(BadResourceException ex) {
        logger.error(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}

PATCH
@PatchMapping("/rest/v1/books/{bookId}")
public ResponseEntity<Void> updateBookTitle(@RequestBody String title, @PathVariable long bookId) {
    try {
        bookService.updateTitle(bookId, title);
        return ResponseEntity.ok().build();
    } catch(ResouceNotFoundException ex) {
        logger.error(ex.getMessage());
        return ResponseEntity.notFound().build();
    } catch(BadResourceException ex) {
        longger.error(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}

DELETE 
@DeleteMapping(path="/rest/v1/books/{bookId}")
public ResponseEntity<Void> deleteBookById(@PathVariable long bookId){
    try {
        bookService.deleteById(bookId);
        return ResponseEntity.ok().build();
    } catch (ResouceNotFoundException ex) {
        logger.error(ex.getMessage());
        return ResponseEntity.notFound().build();
    }
}
## ways of dependency injection, which one is better way 
DI: provided by Spring IOC(inversion of control) 
1. Setter Dependency injection (SDI): injected with the help of setter and/or getter methods. Set DI as SDI in the bean, done through the bean-configuration file, under property tag 
2. Constructor dependency injection 
3. Field Injection: more popular, reflection like 
   1. @autowired
   2. private UserRepo UserRepo;  

What is the best injection method: Constructor dependency injection, default constructor will make sure inject successfully 

## abstract class and interface 
Type of methods: Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
Type of variables: Abstract class can have final, non-final, static and non-static variables. The interface has only static and final variables.
Implementation: Abstract class can provide the implementation of the interface. Interface can’t provide the implementation of an abstract class.
Inheritance vs Abstraction: A Java interface can be implemented using the keyword “implements” and an abstract class can be extended using the keyword “extends”.
Multiple implementations: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.

## java 8 new features 
1. functional interface and lambda expressions
   @FunctionalInterface 
   public interface MyFirstFunctionalInterface{
       public void firstWork();
   }
2. forEach()
3. Optional class in java.util package. Public and final class, used to deal with NullPointerException 
   import java.util.Optional;
   public class Main{
       public static void main(String[] args) {
           String[] str = new String[10];
           Optional<String> checkNull = Optional.ofNullable(str[5]);
           if (checkNull.isPresent()){
               String word = str[5].toLowerCase();
               System.out.print(str);
           } else {
               System.out.println("string is null");
           }
       }
   }
4. Default and static methods in interfaces 
   In Java 8, you can add methods in the interface that are not abstract i.e. you can have interfaces with method implementation. You can use the Default and Static keyword to create interfaces with method implementation. Default methods mainly enable Lambda Expression functionality.

Using default methods you can add new functionality to your interfaces in your libraries. This will ensure that the code written for the older versions is compatible with those interfaces (binary compatibility).

Let’s understand the Default Method with an example:

import java.util.Optional;   
interface interface_default {
     default void default_method(){
         System.out.println("I am default method of interface");
    }
}
class derived_class implements interface_default{
    
}
class Main{
   public static void main(String[] args){
        derived_class obj1 = new derived_class();
        obj1.default_method();
    }
}

5. Method references: replace lambda expression using method reference 
   import java.util.Optional;
   interface interface_default{
       void display();
   }
   class derived_class{
       public void classMethod() {
           System.out.println("Derived class");
       }
   }
   class Main{
       public static void main(String[] args) {
           dervied_class obj1 = new derived_class();
           interface_default ref = obj1::classMethod;
           ref.display();
       }
   }
6. Java Stream API for bulk data operations on collections 
7. Java Date time API 
8. NashHorn Javascript Engine 
9. Collection API improvements 
## api design 
https://hevodata.com/learn/spring-boot-rest-api/


## bean scope (actual example from your project)
singleton scope: This scopes the bean definition to a single instance per Spring IoC container (default)
prototype: This scopes a single bean definition to have any number of object instances.
request: This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
session: This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
global-session: This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.

## two sum and top k elements 

## vendor machine 
operated by itself 
concurrently use at the same time 
Requirements 
1. Ability to select an item 
2. Ability to pay for an item 
3. Payment, credit card or cash 
4. Dispense item when it selected 
5. Notify the owner servicing agent about the inventory 
6. Cash, dispense change 
   
Class Vendor {
    Collections of items 
}

class Item {
    price
    stock 
}

## design parking lot
requirements 
1. reserve parking lot, and dispense a receipt 
2. able to process payment
3. high consistency no two people will reserve the same spot 
4. three kinds of vehicle 
5. flat rate based on time, but different for different type vehicles 
   

## order by customer 