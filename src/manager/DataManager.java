package manager;

import task.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class DataManager {
    private static Pizza getHavaianPizza() {
        return new Pizza("Гавайська", 850, 256,
                Arrays.asList("Куряче філе", "Сир", "Ананас", "Соус"));

    }

    private static Pizza getPeperoniPizza() {
        return new Pizza("Пепероні", 780, 178,
                Arrays.asList("Пепероні", "Соус", "Сир", "Помідори черрі"));

    }

    private static Pizza getCesarePizza() {
        return new Pizza("Цезаре", 800, 217,
                Arrays.asList("Куряче філе", "Листя салату", "Помідори", "Сир", "Соус"));

    }

    public static Pizzeria getPizzeria() {
        Client Oleksandr = new Client("Олександр");
        Client Vlad = new Client("Влад");
        Client Yana = new Client("Яна");
        Client Sophia = new Client("Софія");
        Client Olena = new Client("Олена");

        Oleksandr.makeOrder(new Order(
                getHavaianPizza(),
                new Address("Сахарова", 25, 306),
                LocalDateTime.of(2022, 11, 3, 10, 20)
        ));

        Oleksandr.makeOrder(new Order(
                getPeperoniPizza(),
                new Address("Сахарова", 25, 306),
                LocalDateTime.of(2022, 11, 2, 12, 10)
        ));

        Oleksandr.makeOrder(new Order(
                getCesarePizza(),
                new Address("Сахарова", 25, 306),
                LocalDateTime.of(2022, 11, 2, 14, 15)
        ));

        Vlad.makeOrder(new Order(
                getHavaianPizza(),
                new Address("Пасічна", 48, 63),
                LocalDateTime.of(2022, 11, 3, 8, 30)
        ));

        Yana.makeOrder(new Order(
                getPeperoniPizza(),
                new Address("Стрийська", 45, 99),
                LocalDateTime.of(2022, 11, 2, 11, 20)
        ));

        Sophia.makeOrder(new Order(
                getCesarePizza(),
                new Address("Сахарова", 25, 306),
                LocalDateTime.of(2022, 11, 3, 14, 15)
        ));

        Olena.makeOrder(new Order(
                getCesarePizza(),
                new Address("Сахарова", 25, 306),
                LocalDateTime.of(2022, 11, 3, 16, 10)
        ));

        List<Client> clients = Arrays.asList(Oleksandr, Vlad, Yana, Sophia, Olena);
        List<Pizza> pizzas = Arrays.asList(getHavaianPizza(), getPeperoniPizza(), getCesarePizza());

        Pizzeria pizzeria = new Pizzeria(clients, pizzas);
        SerializationManager.SerializePizzeria(pizzeria, "input.ser");

        return pizzeria;
    }
}
