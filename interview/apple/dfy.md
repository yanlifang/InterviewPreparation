## Stream
https://stackify.com/streams-guide-java-8 

- Java Stream Creation
- private static Employee[] arrayOfEmps = {
    new Employee(1, "Jeff Bezos", 100000.0),
    new Employee(2, "Bill Gates", 200000.0),
    new Employee(3, "Mark Zuckerberg", 300000.0)
    }; Stream.of(arrayOfEmps);
  

- Obtain a stream from an existing list:private static List<Employee> emptiest = Arrays.asList(arrayOfEmps); empList.stream();
- Java 8 added a new stream() to Collection interface
- Create a stream from individual objects using Stream.of();
  - Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]); 
  - Stream.builder(): Stream.Builder<Employee> empStreamBuilder = Stream.builder();
    empStreamBuilder.accept(arrayOfEmps[0]);
    empStreamBuilder.accept(arrayOfEmps[1]);
    Stream<Employee> empStream = empStreamBuilder.build();
- forEach : simplest and common operation, loops over the stream elements, calling the supplied function on each element 
   - forEach: terminal operation: after operation the stream pipeline is consumed, no longer be used.
    @Test
    public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {
  empList.stream().forEach(e -> e.salaryIncrement(10.0));
  assetThat(empList, contains(
  hasProperty("salary", equalTo(11000.0))
  ));
- 
  
- map() produces a new stream after applying a function to each element of the original stream. 
  Integer[] empiDS = {1, 2, 3};
  List<Employee> employees = Stream.of(empIds)
  .map(employeeRepository::findById)
  .collection(Collectors.toList());
- Collect: performs mutable fod operations (repackaging elements to some data structures and applying
  some additioanl logic, concatenating them) on data elements held in the Stream instance.
    List<Employee> employees = emplIST.stream().collect(Collectors.toList());
  
- filter: produces a new stream that contains elements of the original stream that pass a given test (specified by a Predicate)
 List<Employee> employees = Stream.of(empIds)
  .map(employeeRepository::findById)
  .filter(e -> e != null)
  .filter(e -> e.getSalary() > 200000)
  .collect(Collectors.toList());
  
- findFirst(): returns an Optional for the first entry in the stream; the Optional can be empty
    Employee employee = Stream.of(empIds)
  .map(employeeRepository::findById)
  .filter(e -> e != null) 
  .filter(e -> e.getSalary() > 200000)
  .findFirst()
  .orElse(null);
  
- get array out of stream using toArray()
    Employee[] em = empList.stream().toArray(Employee[]::new);
  Employee[]::new  : create empty array of Employee, which is filtered with elements from the stream

## Stream can be used: array, list, map, file, primitive variables， collections， arrays or i/o channels. Collection of objects
stream - compute on-demand, does not store data, operates on the source data structure (collection and array) produces pipelined data that we can use to implement internal iteration.

## Optional: may or may not contain a non-null value. If a value is present, isPresent() will true, get will return value
Additional methods that depend on the presence or absence of a contained value are provided, such as orElse() return a default value if value not present. ifPresent() execuate a block of code if the value is presented.
Creating Optional objects: Optional<String> empty = Optional.empty();
assertFalse(empty.isPresent()); 

Optional<String> opt = Optional.of(name);
assertTrue(opt.isPresent()); 

## Docker: set of platform as a service products that use OS-level virtualization to deliver software in packages called containers.
build application image on docker 

## How to handle customers request 

## Why MongoDB 
MongoDB is built on a scale-out architecture that has become popular with developers 
of all kinds for developing scalable applications with evolving data schemas.
As a document database, MongoDB makes it easy for developers to store structured or unstructured data.

## How to implement DAO layer to connect to mongoDB 
user properties file to configure Cassandra 

Apache Cassandra is a highly-available NoSQL database that has properties of linear scalability and fault tolerance.
The official driver for Cassandra is the Datastax version

Like other NoSQL database, Cassandra needs partitioning key and has loose schema.
Implement DAO interface using Cassandra driver. The usage of datastax driver is pretty much like JDBC.

## example using nosql
To begin working with NosDB using the JAVA client, your application first needs to connect to a database using a connection string.

A connection string consists of:
A data source address (IP and Port),
Name of the concerned database,
The local instance value which indicates if the database is stand-alone or clustered,
The Distributor service address (IP and Port) is required for the JAVA client,
Security authentication (Username and password) is required because the default authentication mode is not supported for clients other than .NET.
String conn = "Data Source = 192.168.8.101; Port = 9950; Database = northwind; Local Instance = true; Distributor Address = 192.168.8.101; Distributor Port = 9970; User Id = admin; password = alachisoft;";

// initialize database
Database db = NosDB.getDatabase(conn);



## How to query data from Cassandra
Cassandra query language

## Load Balancer 
Load balancing refers to efficiently distributing incoming network traffic across a group of backend servers, also known as a server farm or server pool.
Benefits of Load Balancing

Reduced downtime
Scalable
Redundancy
Flexibility
Efficiency


## Stream vs Collections 
A collection is an in-memory data structure, which holds all the values that the data structure currently has—every element in the collection has to be computed before it can be added to the collection. In contrast, a stream is a conceptually fixed data structure in which elements are computed on demand.
https://www.geeksforgeeks.org/difference-between-streams-and-collections-in-java/
CompanyList.add("Google");
CompanyList.add("Apple");
CompanyList.add("Microsoft");

        // Now creating a comparator
        Comparator<String> com
            = (String o1, String o2) -> o1.compareTo(o2);
 
        // Sorting the list
        Collections.sort(CompanyList, com);

## Multi-thread 

## Reactive programming 

## Elastic Search 

## Do you know MangoDB 

## Bean scope 


## How to handle too many requests 
1

You need K8s with clustering of your micro service and to think how you want to scale your pods horizontally.

On top of that you need to use a load balancer and maybe to use the ribbon + Hysterix + Feign client out of the stack of spring cloud solution.

And you also have too check that you don't receive too many auto-retry technical requests of your underlying HTTP client.
