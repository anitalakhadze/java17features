package switchExpressions;

import sealedClasses.Cat;
import sealedClasses.Dog;

public class SwitchExpression {

    private static String ifElseSwitch(Object o) {
        if (o instanceof Cat) {
            return "This is a cat";
        } else if (o instanceof Dog) {
            return "This is a dog";
        } else {
            return "This is some other animal";
        }
    }

//    private static String legacySwitch(Object o) {
//        switch (o) {
//            case Cat:
//                return "This is a cat";
//                break;
//            case Dog:
//                return "This is a dog";
//                break;
//            default:
//                return "This is some other animal";
//                break;
//        }
//    }

    private static String modernSwitch(Object o) {
        String whichAnimal = switch (o) {
            case Cat cat -> "This is a cat";
            case Dog dog -> "This is a dog";
            default -> {
                System.out.println("This is some other animal");
                yield "Unknown animal";
            }
        };
        return whichAnimal;
    }
}


