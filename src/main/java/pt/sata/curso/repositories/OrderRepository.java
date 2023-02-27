package pt.sata.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.sata.curso.entities.Order;
import pt.sata.curso.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
