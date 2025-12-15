package se.chasacademy.databaser.jpaorders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.chasacademy.databaser.jpaorders.Repository.CustomerRepository;
import se.chasacademy.databaser.jpaorders.Repository.OrderLineRepository;
import se.chasacademy.databaser.jpaorders.Repository.OrderRepository;
import se.chasacademy.databaser.jpaorders.Repository.ProductRepository;

@SpringBootApplication
public class JPAOrdersApplication implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;
    private final OrderLineRepository orderLineRepository;

    public JPAOrdersApplication(CustomerRepository customerRepository, ProductRepository productRepository,
                                OrderRepository orderRepository, OrderLineRepository orderLineRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
        this.orderLineRepository = orderLineRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(JPAOrdersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Customers: ");
        customerRepository.findAll().forEach(System.out::println);

        System.out.println();
        System.out.println("Products: ");
        productRepository.findAll().forEach(System.out::println);

        System.out.println();
        System.out.println("Orders: ");
        orderRepository.findAll().forEach(System.out::println);

        System.out.println();
        System.out.println("OrderLines: ");
        orderLineRepository.findAll().forEach(System.out::println);

    }
}
