package nl.openweb.pizza.jdk;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @see <a href="https://openjdk.java.net/jeps/359">JEP 359</a>
 */
public record Pizza(String name, List<String> ingredients) {
}

@Value
class LombokPizza {
    String name;
    List<String> ingredients;
}

@Slf4j
class PizzaTest {

    public static void main(String[] args) {
        var pizza = new Pizza("margherita", List.of("tomatoes", "mozzarella", "basilicum"));

        log.info("{}", pizza);
        log.info("I love pizza {} because it has {}",
                pizza.name(),
                String.join(", ", pizza.ingredients()));
    }
}
