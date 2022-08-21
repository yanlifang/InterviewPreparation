## https://juejin.cn/post/6844904125709156359  interview questions
https://www.runoob.com/design-pattern/design-pattern-intro.html


final用于声明属性、方法和类，分别表示属性不可变，方法不可覆盖，累不可以继承；
finally是异常处理语句结构的一部分，表示无论是否发生异常总是要执行；
finalize是Object类中的一个方法，
在垃圾回收器执行的时候会调用被回收对象的此方法，供垃圾收集时的其他资源回收。


## Damon thread on background 
finalize is a damon thread 

## Serilization 
process of converting the Java object into a Byte stream
Serialization in Java is the process of converting the Java code object 
into a bytestream, to transfer the object code from one java virtual machine to another and 
recreate it using the process of deserialization 
ObjectMapper 

## An oject outputstream writes primitive data types and graphs of Java objects to an OutputStream

spirng has a lot configuration. Spring is a framework which helps to conenct different components together.
SpringBoot is based on the spring, less configuration. Lots of ready to use starter dependency which are easy to use 


## 面向对象编程是有诸多好处的：
封装特性能够提高类的易用性，减少编程过程中代码出错的风险。
继承最大的好处就是能够实现代码的复用。
抽象更多的是能够让程序的设计和实现分离。
多态最大的好处就是提高了程序的可扩展性。

## Public members can be accessed from the child class of the same package. 
public means everyone is allowed to access, private means that only members
of the same class are allowed to access, 
and protected means that members of subclasses are also allowed.

## object life cycle
We can break the life of an object into three phases: creation and initialization,
use, and destruction. Object lifecycle routines allow the creation and destruction 
of object references; lifecycle methods associated with an object 
allow you to control what happens when an object is created or destroyed.

## role of IOC container in Spring
Responsible to instantiate, configure and assemble the objects. 
Get into from XML file and works accordingly. 
1. Main tasks: to instantiate the application class, to configure the obj, to assemble the dependencies between the objs
2. Two types of IoC containers: BeanFactory, ApplicationContext

The org.springframework.beans.factory.BeanFactory and the org.springframework.context.ApplicationContext interfaces acts as the IoC container. 
The ApplicationContext interface is built on top of the BeanFactory interface. It adds some extra functionality than BeanFactory such as simple integration with Spring's AOP, message resource handling (for I18N), event propagation, application layer specific context (e.g. WebApplicationContext) for web application. So it is better to use ApplicationContext than BeanFactory.
BeanFactory: 
Resource resource=new ClassPathResource("applicationContext.xml");  
BeanFactory factory=new XmlBeanFactory(resource);

ApplicationContext:
ApplicationContext context =   
new ClassPathXmlApplicationContext("applicationContext.xml");


1. create the instance 
2. configure the instance 
3. assemble the dependencies 

## data structures 
https://www.mygreatlearning.com/blog/data-structures-using-java/


// create a clone or shallow copy of hash table h
h1 = (Hashtable<Integer, String>)h.clone();

## How do you fix Java's ConcurrentModificationException? 
There are two basic approaches: Do not make any changes to a collection
while an Iterator loops through it. If you can't stop the underlying collection
from being modified during iteration, 
create a clone of the target data structure and iterate through the clone.

## internal of hashmap
Internally HashMap uses a hashCode of the key Object and this hashCode is further used by the hash
function to find the index of the bucket where the new entry can be added. HashMap uses multiple
buckets and each bucket points to a Singly Linked List where the entries (nodes) are stored.

## What is the difference between constructor injection and setter injection?
No.	Constructor Injection	                            Setter Injection
1)	No Partial Injection	                            Partial Injection
2)	Desn't override the setter property	                Overrides the constructor property if both are defined.
3)	Creates new instance if any modification occurs	    Doesn't create new instance if you change the property value
4)	Better for too many properties	                    Better for few properties.

## Autowiring in Spring? Autowiring modes? 
Autowiring enables the programmer to inject the bean automatically. We don't need to write explicit injection logic.
https://www.javatpoint.com/spring-interview-questions

## Java Core  https://www.interviewbit.com/java-interview-questions/

## Qiyun Zhao's 
https://docs.google.com/document/d/1o7sKok4oS0Fla4FlYbZ9Gb_rhbHuTeD_orJR8f_1pGA/edit#

### What is Java?
   Java is the high-level programming language that was developed by James Gosling in the year 1982. It is based on the principles of object-oriented programming and can be used to develop large-scale applications. 
### Why is Java a platform independent language? 
    Java language was developed in such a way that it does not depend on any hardware or software due to the fact that the compiler compiles the code and then converts it to platform-independent byte code which can be run on multiple systems. Only require machine to have a runtime environment

### Why is Java not a pure object-oriented language? 
    Java supports primitive data types - byte, boolean, char, short, int, float, long, and double and hence it is not a pure object oriented language. 

### Difference between heap and stack memory in Java? And how Java utlizes this?
    Stack memory is the portion of memory that was assigned to every individual program. And it was fixed. On the other hand, heap memory is the portion that was not allocated to the Java program but it will be available for use by the Java program when it is requried, mostly during the runtime of the program. 
    Java utilizes this memory as - 
    1. When we write a java program then all the variables, methods, etc are stored in the stack memory.
    2. And when we create any object in the java program then that object was created in the heap memory. And it was referenced from the stack memory.

    class Main {
        public void printArray(int[] array){
       for(int i : array)
           System.out.println(i);
        }
        public static void main(String args[]) {
       int[] array = new int[10];
       printArray(array);
        }
    }

    https://d3n0h9tb65y8q.cloudfront.net/public_assets/assets/000/003/020/original/stack_and_heap_memory.png?1648813762

## SpringBoot作业题和分享的面经熟背，还有那本grokking的书。
能有一定的例子，比如bean of scope, singleton, 哪里，什么场景用到了singleton？

## Microservice, kafka, cloud
### Microservice 

### Kafka 

### Cloud 


## Algorithm
1)先讲自己对题意的理解，题意理解不了，就要clarify。2）简单描述下自己思路中用什么算法和数据结构。3）开始写算法，写的过程中要有一定的沟通。4）一开始写的时候想下corner case并沟通。5）要会自己写main 方法去test自己的算法。会构造不同的test case 去run自己的算法。6）如果run时候报错，会debug，通常是包没导入，或语法错误。
7）注意自己的coding style 要美观。https://www.jdoodle.com/online-java-compiler/

## Singleton能熟练写Singleton并讲清楚为啥那样写


## get orders by customer ID; create a new order
会让你们徒手写一个API，从设计url, 到controller，到service，到repository 到entity。
包含payload的设计

## Vending machine system design

## Spring Boot Actuator

Actuator brings production-ready features to our application.
Monitoring our app, gathering matrics, understanding trasffic, or the state of our database become trival with this dependency.

Main benefit of this library: get production-grade tools without having to actually implement these features ourselves.

Actuator: mainly used to expose operational information about the running application - health, metrics, info, dump, env, etc.
It uses HTTP endpoitns or JMX beans to enable us to interact with it.

Once this dependency is on the classpath, several endpoints are available for us out of the box.
As with most Spring modules, we can easily configure or extent it in many ways.

Thus, the only two available by default are /health and /info.

If we want to enable all of them, we could set management.endpoints.web.exposure.include=*. Alternatively, we can list endpoints that should be enabled.


>>>>>>> 7a75fdac35e531d9a693c3701667752d14b56d20