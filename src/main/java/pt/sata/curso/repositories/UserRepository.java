package pt.sata.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.sata.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
