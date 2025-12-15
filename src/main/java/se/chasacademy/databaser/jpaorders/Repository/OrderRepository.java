package se.chasacademy.databaser.jpaorders.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.chasacademy.databaser.jpaorders.Models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
