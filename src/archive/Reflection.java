package archive;

import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee("Shekhar", 26, "1234 dfsajflkjasd", 9384032978L);

        System.out.println(employee.hashCode());

        Class cls = employee.getClass();

        /*Method[] methods = cls.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
*/
      /* System.out.println("***************************************");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }*/

        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);
        field.set(employee, 29);

        System.out.println(System.identityHashCode(employee));

    }
}
