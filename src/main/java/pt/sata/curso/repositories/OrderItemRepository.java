package pt.sata.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.sata.curso.entities.OrderItem;
import pt.sata.curso.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
