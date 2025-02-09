public class OptionalTest {
    /**
     * https://www.youtube.com/watch?v=wOi2k4dJviM&list=PLmOn9nNkQxJH0qBIrtV6otI0Ep4o2q67A&index=684
     * of(T t) - 不可以为null
     * ofNullable(T t) - 可以为null
     * orElse(T t) - 如果当前的optional内部封装的t是非空的，则返回内部t, 如果内部的t是空的， 则返回orElse()方法中的t
     */

    @Test
    public void testOptionalWithNotHandleException() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        //of(T t) - can not be null
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test(expected = NullPointerException.class)
    public void test1() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        //of(T t) can not be null
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test
    public void testOfNullable() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);
    }

    @Test
    public void testOrElse() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);

        //type is not Optional, it is Employee
        Employee Optional3 = Optional.ofNullable(employee).orElse(new Employee (1, "Li", 999, 9999));
        System.out.println(optional3);
    }

}