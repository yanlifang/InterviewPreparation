## return 4th highest salary from table 
Select Salary from table_name by Salary DESC limit 3, 1;

## Singleton lazy thread safe 
Is singleton thread safe? A singleton class itself is not thread safe. 
Multiple threads can access the singleton same time and create multiple objects, 
violating the singleton concept. The singleton may also return a reference to a partially initialized object.
One of the best method
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

 lazy instantiation
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
   
## Why use Restful instead of SOAP, what is the difference;
REST is a set of guidelines that offers flexible implementation, 
whereas SOAP is a protocol with specific requirements like XML messaging. 
REST APIs are lightweight, making them ideal for newer contexts like the 
Internet of Things (IoT), mobile application development, and serverless computing.
