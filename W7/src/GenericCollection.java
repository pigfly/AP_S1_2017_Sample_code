// in general, you can treat generics as if they are any other type,
// they just happen to have type parameters.
public class GenericCollection<T> {
    private T a;
    public GenericCollection() {}

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        GenericCollection<Student> collection = new GenericCollection<>();
        collection.setA(new Student());
        Student s = collection.getA(); // do we need to type cast ?

//        collection.setA(1);
    }
}