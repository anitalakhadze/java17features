package patternMatching;

public class PatternMatching {
    public static void main(String[] args) {
        Animal animal = new Cat();
        if (animal instanceof Cat cat) {
            System.out.println(cat.meow());
        }

        if (!(animal instanceof Cat cat)) {
            System.out.println("This isn't a cat!");
        } else {
            System.out.println(cat.meow());
        }

        System.out.println(Cat.isCat(animal));
    }
}
