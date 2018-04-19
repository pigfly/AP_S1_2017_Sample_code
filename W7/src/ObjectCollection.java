public class ObjectCollection {
    private Object o;
    public  ObjectCollection(Object o) { this.o = o; }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        ObjectCollection collection = new ObjectCollection(new Student());
        Student s = (Student)collection.getO();
        System.out.println(s);

        collection.setO("test");
        System.out.println(collection.getO());
    }
}