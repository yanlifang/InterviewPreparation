## jsp.useBean action tag

The jsp:useBean action tag is used to locate or instantiate a bean class. If bean object of the Bean class is already created, it doesn't create the bean depending on the scope. But if object of bean is not craeted, it instantiates the bean.

Syntax of jsp:useBean action tag
<jsp:useBean id = "instanceName" scope="page|request|session|application" 
class="packageName.className" type="packageName.className"
beanName="packageName.className | <%=expression>" >

## Attributes and Usage of jsp:useBean action tag 
1. id: is used to identify the bean in the specified scope 
2. scope: represents the scope of the bean. It may be page, request, session or application. The default scope is page. 
   1. page: specifies that you can use this ben within the JSP page. The default scope is page.
   2. request: specifies that you can use this bean from any JSP page that processes the same request. It has wider scope than page. 
   3. session: specifies that you can use this bean from any JSP page in the same session whether processes the same request or not. It has wider scope than request. 
   4. applicatoin: specifies that you can use this bean from any JSP page in the same application. It has wider scope than session. 
3. class: instantiates the specified bean class (i.e. creates an object of the bean class) but it must have no-arg or no constructor and must not be abstract.
4. type: provides the bean of a data type if the bean already exists in the scope. It is mainly used with class or beanName attribute. If you use it without class or beanName, no bean is instantiated.
5. beanName: instantiates the bean using the java.beans.Beans.instantiate() method
6. 