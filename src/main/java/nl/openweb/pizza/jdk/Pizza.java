package nl.openweb.pizza.jdk;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

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
        Pizza pizza = new Pizza("margherita", List.of("tomatoes", "mozzarella", "basilicum"));

        log.info("-----");
        log.info("{}", pizza);
        log.info("-----");
        log.info("I love pizza {} because it has {}",
                pizza.name(),
                String.join(", ", pizza.ingredients()));
        log.info("-----");
    }
}
