## jsp.useBean action tag

The jsp:useBean action tag is used to locate or instantiate a bean class. If bean object of the Bean class is already created, it doesn't create the bean depending on the scope. But if object of bean is not craeted, it instantiates the bean.

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


## Prototype Scope 
A bean with the prototype scope will return a different instance every time it is requested from the container. It is defined by setting the value prototype to the @Scope annotation in the bean definition:

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)

## Web Aware Scopes 
The request scope creates a bean instance for a single HTTP request, while the session scope creates a bean instance for an HTTP Session.
The application scope creates the bean instance for the lifecycle of a ServletContext, and the websocket scope creates it for a particular WebSocket session.
public class HelloMessageGenerator {
    private String message;
    
    // standard getter and setter
}

1. request scope
2. session scope
3. application scope 
4. websocket scope 

