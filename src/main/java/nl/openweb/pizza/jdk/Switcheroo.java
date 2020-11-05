package nl.openweb.pizza.jdk;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @see <a href="https://openjdk.java.net/jeps/361">JEP 361</a>
 */
@Slf4j
public class Switcheroo {

    public static void main(String[] args) {
        int i = new Random().nextInt(3);

        var str = switch(i) {
            case 0 -> "yo";
            case 1 -> "ho";
            default -> "a bottle of rum";
        };

        log.info(str);
    }
}