package PRNG;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class PseudoRandomNumberGenerator {
    public static void main(String[] args) {
        // Legacy
        RandomGeneratorFactory.of("Random").create(42);

        //default L32X64MixRandom
        RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();

        // Passing the same seed to random, and then calling it will give you the same set of numbers
        RandomGenerator randomGenerator1 = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(999);

        System.out.println(randomGenerator1.getClass());

        RandomGeneratorFactory.all()
                .map(fac -> fac.group()+ " : " +fac.name())
                .sorted()
                .forEach(System.out::println);

        for (int i = 0; i < 10; i++) {
            System.out.println(randomGenerator1.nextInt(11));
        }
    }
}
