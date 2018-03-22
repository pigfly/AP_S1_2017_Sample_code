package Person;

/**
 * Created by alexj on 23/3/17.
 */
public abstract class Person implements PersonProtocol {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
