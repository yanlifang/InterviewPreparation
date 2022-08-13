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

