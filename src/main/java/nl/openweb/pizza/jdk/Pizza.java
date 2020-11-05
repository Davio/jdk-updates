package nl.openweb.pizza.jdk;

import java.util.List;

record Pizza(String name, List<String> ingredients) {
}

class PizzaTest {

    public static void main(String[] args) {
        Pizza pizza = new Pizza("margherita", List.of("tomatoes", "mozzarella", "basilicum"));

        System.out.println("-----");
        System.out.println(pizza);
        System.out.println("-----");
        System.out.printf("I love pizza %s because it has %s%n",
                pizza.name(),
                String.join(", ", pizza.ingredients()));
    }
}
