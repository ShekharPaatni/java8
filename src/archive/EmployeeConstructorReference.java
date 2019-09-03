package archive;

interface Emmployee {
    EmployeeConstructorReference myMethod(String name, Integer age, String city);
}

public class EmployeeConstructorReference {
    private String name;
    private Integer age;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public EmployeeConstructorReference(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public EmployeeConstructorReference() {
    }

    @Override
    public String toString() {
        return "EmployeeConstructorReference{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Emmployee emmployee = EmployeeConstructorReference::new;
        EmployeeConstructorReference constructorReference =
                emmployee.myMethod("Shekhar", 26, "Delhi");
        System.out.println(constructorReference);
    }
}
