package nl.openweb.pizza.jdk;

import lombok.extern.slf4j.Slf4j;

/**
 * @see <a href="https://openjdk.java.net/jeps/360">JEP 360</a>
 */
public sealed interface Seal permits LeopardSeal, BeardedSeal {
}

final class LeopardSeal implements Seal {}
final class BeardedSeal implements Seal {}

@Slf4j
class SealTest {

    public static void main(String[] args) {
        var seal = new LeopardSeal();

        // Coming in JDK 16 (maybe?)
        /*
        String message = switch (seal) {
            case LeopardSeal ls -> "Roar"
            case BeardedSeal bs -> "Hipster"
            // no default needed!
        }
        */
    }
}