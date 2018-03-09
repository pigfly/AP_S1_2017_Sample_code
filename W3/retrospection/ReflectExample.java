package retrospection;

import java.io.InputStream;

public final class ReflectExample {
    public static void main(String[] args) {
        int [] a1 = new int[]{1, 2, 3};
        int [] a2 = new int[5];
        int [][] a3 = new int[2][3];

        System.out.println(a1.getClass() == a2.getClass());
        System.out.println(a1.getClass());
        System.out.println(a2.getClass());
        System.out.println(a3.getClass());

        System.out.println(a1.getClass().getSuperclass() == a3.getClass().getSuperclass());
        System.out.println(a1.getClass().getSuperclass());
        System.out.println(a2.getClass().getSuperclass());
        System.out.println(a3.getClass().getSuperclass());
    }
}
