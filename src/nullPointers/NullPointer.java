package nullPointers;

public class NullPointer {
    public static void main(String[] args) {
        Person ani = new Person("Ani", null, null);
        int i = ani.getAge().compareTo(23);
        System.out.println(i);
    }
}
