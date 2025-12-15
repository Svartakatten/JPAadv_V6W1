package se.chasacademy.databaser.jpaorders.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.chasacademy.databaser.jpaorders.Models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
