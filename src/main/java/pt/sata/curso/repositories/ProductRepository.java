package pt.sata.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.sata.curso.entities.Category;
import pt.sata.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
