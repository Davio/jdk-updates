package nl.openweb.pizza.jdk;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * @see <a href="https://openjdk.java.net/jeps/305">JEP 305</a>
 */
@Slf4j
public class PatternMatching {

    @SneakyThrows
    public static void main(String[] args) {
        // Pay no attention to that man behind the curtain, this is just to trick the compiler into now knowing the type
//        Object o = Class.forName("java.lang.String").getConstructor(String.class).newInstance("Hello");
        var o = Class.forName("java.lang.Integer").getConstructor(int.class).newInstance(1);

        if (o instanceof String s) {
            log.info("String has length {}", s.length());
        } else if (o instanceof Integer i) {
            log.info("Integer is {}", i);
        }
    }
}
