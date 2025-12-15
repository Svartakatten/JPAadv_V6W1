package se.chasacademy.databaser.jpaorders;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import se.chasacademy.databaser.jpaorders.Models.Order;
import se.chasacademy.databaser.jpaorders.Repository.OrderRepository;

import java.util.List;

@Component
public class TestRun implements CommandLineRunner {

    private final OrderRepository orderRepository;

    public TestRun(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        System.out.println(" TESTAR ATT HÄMTA DATA FRÅN DATABASEN ");

        List<Order> orders = orderRepository.findAll();

        if (orders.isEmpty()) {
            System.out.println("VARNING: Inga ordrar hittades!");
        } else {
            for (Order order : orders) {
                System.out.println("Order: " + order.getOrderNumber() +
                        " | Datum: " + order.getOrderDate() +
                        " | Status: " + order.getStatus());

                System.out.println("   Kund: " + order.getCustomer().getFirstName() + " " + order.getCustomer().getLastName());

                System.out.println("   Rader:");
                order.getOrderLines().forEach(line -> {
                    System.out.println("      - " + line.getQuantity() + " st " +
                            line.getProduct().getName() +
                            " (Aktiv produkt: " + line.getProduct().getActive() + ")");
                });
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
