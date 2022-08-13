## Key components and internals of spring boot framework 
https://www.journaldev.com/7989/key-components-and-internals-of-spring-boot-framework
https://www.journaldev.com/7989/key-components-and-internals-of-spring-boot-framework

1. Spring boot starters
   Spring Boot Starters is one of the major key features or components of Spring Boot Framework. The main responsibility of Spring Boot Starter is to combine a group of common or related dependencies into single dependencies
   Spring core Jar file(spring-core-xx.jar)
   Spring Web Jar file(spring-web-xx.jar)
   Spring Web MVC Jar file(spring-webmvc-xx.jar)
   Servlet Jar file(servlet-xx.jar)
   
2. Spring boot autoconfigurator 
3. spring boot CLI
hello.groovy
   @RestController
   class WebApplication {

   @RequestMapping("/")
   String home() {
   "Hello World!"
   }
}
   spring run hello.groovy
   spring run hello.groovy -- --server.port=9000
   

   
4. Spring boot acutator
   Spring Boot Actuator is a sub-project of the Spring Boot Framework. It uses HTTP endpoints to expose operational information about any running application.
   The main benefit of using this library is that we get health and monitoring metrics from production-ready applications. Moreover, the gathering of metrics, understanding traffic, or knowing the state of the database, becomes tremendously easy with Actuator.
   

in addiiton: spring initilizr, spring boot IDEs 