package patternMatching;

public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("eating fish");
    }

    public String meow() {
        return "meow";
    }

    public static boolean isCat(Object animal) {
        return animal instanceof Cat cat && cat.meow().equals("meow");
    }
}
