package Person;

/**
 * Created by alexj on 23/3/17.
 */
public class Child extends Person {
    private Person father;
    private Person mother;

    public Child(String name, Integer age, Person father, Person mother) {
        super(name, age);
        this.father = father;
        this.mother = mother;
    }

    @Override
    public Boolean hasParent() {
        return true;
    }

    @Override
    public void paint() {
        System.out.format("Painting a %s \n", getClass());
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }
}
