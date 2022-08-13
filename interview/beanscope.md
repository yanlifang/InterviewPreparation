## jsp.useBean action tag
https://www.youtube.com/watch?v=xpKbs8FHUi4


The jsp:useBean action tag is used to locate or instantiate a bean class. If bean object of the Bean class is already created, it doesn't create the bean depending on the scope.
But if object of bean is not created, it instantiates the bean.

Syntax of jsp:useBean action tag
<jsp:useBean id = "instanceName" scope="page|request|session|application" 
class="packageName.className" type="packageName.className"
beanName="packageName.className | <%=expression>" >

## Attributes and Usage of jsp:useBean action tag 


## Bean scope of Spring framework 

singleton: @Bean @Scope("singleton)
prototype 
request
session
application 
websocket 

## Singleton Scope
https://www.baeldung.com/spring-bean-scopes
When we define a bean with the singleton scope, the container creates a single instance of that bean; all requests for that bean name will return the same object, which is cached. Any modifications to the object will be reflected in all references to the bean. This scope is the default value if no other scope is specified.

public class Person {
    private String name;
}


@Bean
@Scope("singleton")
public Person personSingleton() {
return new Person();
} 

We can also use a constant instead of the String value in the following manner:
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)


## Prototype Scope 
A bean with the prototype scope will return a different instance every time it is requested from the container. It is defined by setting the value prototype to the @Scope annotation in the bean definition:
@Bean
@Scope("prototype")
public Person personPrototype() {
return new Person();
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)


## Web Aware Scopes 
The request scope creates a bean instance for a single HTTP request, while the session scope creates a bean instance for an HTTP Session.
The application scope creates the bean instance for the lifecycle of a ServletContext, and the websocket scope creates it for a particular WebSocket session.
public class HelloMessageGenerator {
    private String message;
    
    // standard getter and setter
}

1. request scope
   @Bean
   @RequestScope
   public HelloMessageGenerator requestScopedBean() {
   return new HelloMessageGenerator();
   }
2. session scope
   @Bean
   @SessionScope
   public HelloMessageGenerator sessionScopedBean() {
   return new HelloMessageGenerator();
   }
3. application scope
   @Bean
   @ApplicationScope
   public HelloMessageGenerator applicationScopedBean() {
   return new HelloMessageGenerator();
   }
4. websocket scope
   @Bean
   @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
   public HelloMessageGenerator websocketScopedBean() {
   return new HelloMessageGenerator();
   }


## Configure Beans 
1. Declare them using XML configuration 
2. Declare using the @Bean annotation in a configuration class 

## Component Scanning 
1. spring automatically scan a package for beans if component scanning is enabled 
2. @ComponentScan configures whick packages to scan for classes with annotation configuration. We can specify the base package names directly with one of the basePackages or value arguments. 
@Configuration
@ComponentScan(basePackages = "com.baeldung.annotations")
class VehicleFactoryConfig {}

Both arguments are arrays so that we can provide multiple packages for each.

If no argument is specified, the scanning happens from the same package where the @ComponentScan annotated class is present.

Alternatively, we can use @ComponentScans to specify multiple @ComponentScan configurations:

@Configuration
@ComponentScans({ 
  @ComponentScan(basePackages = "com.baeldung.annotations"), 
  @ComponentScan(basePackageClasses = VehicleFactoryConfig.class)
})
class VehicleFactoryConfig {}

When using XML configuration, the configuring component scanning is just as easy:
<context:component-scan base-package="com.baeldung" />


## @Component 
@Component is a class level annotation. During the component scan, Spring Framework automatically detects classes annotated with @Component:



convert a class to bean, add @Component or @Service 
Singleton and Prototype belongs to one category 

@Component("name of singleton"): if do not provide name, it will be the same as class name 
@Scope("singleton")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)

public class BeanScope{
}

singleton: every call will return the same singleton 
prototype: every call will return a new prototype 

ProxyMode=Scope.ProxyMode.targetclass 

