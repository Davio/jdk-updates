package nl.openweb.pizza.jdk;

import lombok.extern.slf4j.Slf4j;

public sealed interface Seal permits LeopardSeal, BeardedSeal {
}

final class LeopardSeal implements Seal {}
final class BeardedSeal implements Seal {}

@Slf4j
class SealTest {

    public static void main(String[] args) {
        Seal seal = new LeopardSeal();

        if (seal instanceof LeopardSeal leopardSeal) {
            log.info("Roar");
        } else if (seal instanceof BeardedSeal beardedSeal) {
            log.info("Hipster");
        }

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