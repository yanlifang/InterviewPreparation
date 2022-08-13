## Define final keyword in Java 
final is used with the class to make sure that no other class can extend it

## Define a CountDownLatch in the context of Java 
"The CountDownLatch, as used in Java is a synchronizer which enables a thread to wait for one or more other threads before it starts processing."

## How does an OutOfMemoryError impact a program written in Java, how to correct
"An OutOfMemoryError is created by the JVM when there is no memory available for it to use. This will result in a program halting. The simple way to fix this is to allocate more memory to run in the java application."



## Java timer class 
"A Java timer class is a subclass of a java.util package. It is used to schedule a thread that is executed in the future. An example of one use is for scheduling a task which will be run at regular intervals."


## What is static import and what are the pitfalls of using this 
"Static import is the process of importing the class and the method var iable with the class name from another class. This makes the class available. The pitfall of using this methodology is that it may cause confusion if it is overused and thereby trigger the program to malfunction."

## What is composition, as used in Java?
"Composition is a method used in Java to implement has-a relationships within classes. This facilitates code reuse through object composition. When using composition, you implement instance variables that refer to different objects. The benefit is to provide visibility of the objects to other classes so they can reuse them."

## What is a marker interface, how do you use it?
"A marker interface, as it is used in Java, is a design pattern which provides runtime information about the objects within the program. It also enables the addition of metadata with a class even though the Java language doesn't implicitly support metadata. When coding in Java, the marker interface is used as an interface which doesn't specify a method."


## How are access modifiers in used Java?
"Access modifiers are used to establish accessibility to classes, methods, and other members when writing code in the Java programming language. The four types of access modifiers are default, public, private, and protected. These define how the classes, methods and members can be accessed."

## Key elements of Java programming language 
Simple to learn 
oop: manage using objects 
portability, platform independence, security, and the large library of code available 

## Examples of JDBC drivers
our types of JDBC drivers. Work in conjunction with the JDBC API to connect
with and extract info from databases. The four drivers are ODBC, Native API, Pure Java driver for DB Middleware, and 
Direct-to-Database Pure Java Driver. 

## Diff b/w a user and a daemon thread 
1. how they are created, and their impact on JVM
2. User threads are created by programmers, while daemon threads run in the background
if a user thread is present, the JVM will not shut down, and the program will continue to run. 
   The presence of a daemon thread does not prevent the JVM from terminating. 
   

## Java Reflection API
Enables you to test and modify applications while they are running. You can inspect the various elements of the java programming language,
seeing the details. Java developers use this to debug adn improve their programming.

## How is a volatile keyword used in Java?
A volatile keyword is used in Java with variable and threads which read its value
directly from its memory location. This ensures the value is read exactly as it is contained in the memory location, 
adn that the threads or variables do not cache it in case it changes. 


## Is Java Pass By Value or Pass by Reference? 
Java is pass by value. Java method parameters directly associate varaible 
passing and method calling. The exception is when we pass a reference of complex types defined as method
parameters, the memory address is copied to a new reference variable.

## What a Compare and Swap algorithm is and how you use it when coding in Java8? 
Both are type of instruction which helps to synchronize threads in a multi-threading
environment. The way it works is to examine the content of a memory location, if it matches
another location, it modifies the value of the content and 
creates a new value. This prevents the content from being used by another 
thread and a write operation failing. 

## Programming in Java, can you have an empty catch block? 
Yes, but not advised. 
It will creates involves debugging the program if the empty catch block
were to catch an exception. No info for exception. Time-consuming to find it

## Many applications are developed using Java. What are the key element of Java programming language are?
Simple to learn
OOP, enables programmers to manage their code using objects. 
Portability, platform independence, security, and large library of code available to programmers. 


## What are the diff b/w Path and ClassPath variables? 
"Both Path and Classpath are environmental variables which the operating system uses to locate executables. 
The OS locates the executables in a directory location, which is defined by these variables. The difference 
between a Path and Classpath variable is that a classpath is very specific to Java and can be defined as a directory, ZIP file, JAR file or another type of variable. This is critical since you need to select the appropriate Path based on what Apple API you want to use."
Class path is Java only. 
can be directory, zip, jar file 
## Importance of the main() method in Java?
Entry point for any code. Defines syntax to run a program within the Java.
Enables Java to access the code without initializing a class. The value contained 
within the parentheses is an array of string related to runtime arguments. 

## How enum used in Java?
"Enum is a type whose field is made up of fixed sets of constants. An example of this would be the setting of times within a Java program as morning, noon, afternoon, and evening. These become key words used to create enum types, which are similar to a class."


## Please describe the JDBC API and discuss how it is used?
JDBC stands for Java Database Connectivity. The API enables java programs to work
with relational databases. This enables the program to connect with the database, run SQL
queries, and process the results.

## How do you determine priorities when you have multiple projects due? 

### My answer
First, I will try to schedule the work with different deadlines or due date. If there are couple dues in a short time, I will assess the priorities of the projects and give a different level of priorities of the projects, like the part of work might be related with product release, safety will have high priorities. I will work on these projects first. If two things are in the similar level of priorities, will be a tough choice,  I will consult with team leader or team manager to see if I can get some help or which project has priority over the other.

### experienced answer
Assuming that the projects have different stakeholders, I analyze each to determine the value of increased productivity, morale or revenue, decreased costs, and the overall impact. From there, I make my decision on where to focus first."

## example answer
First and foremost, I will prioritize projects that most closely align with the company's strategic goals and have the highest potential to affect the company's bottom line. Also, I often determine which projects require my attention by the number of hours we are behind and then the project size. I am comfortable delegating tasks when needed, but I am also aware that these times will require an additional commitment of hours from me. Never have I under delivered on a deadline

## What does greatness, and success, mean to you?
Greatness and success, you accomplish the goal you set for yourself. Or fininal one porjects 
you have been worked for a long time. I like to set short goals and long goals. 

For work, greatness also means the growth of yourself. What have you learned and what have you improved 
which will make myself more confident in work. 
If you are working on something you like, that is one of the greatness too.


## What are some examples of JDBC drivers you would use when programming applications for Apple? 
"There are four basic types of JDBC drivers. The drivers work in conjunction with the JDBC API to
connect with and extract information from databases. The four drivers are ODBC, Native API, 
Pure Java driver for Database Middleware, and Direct-to-Database Pure Java Driver. All of these 
are currently used in many Apple applications and the applications which run in the Apple environment."