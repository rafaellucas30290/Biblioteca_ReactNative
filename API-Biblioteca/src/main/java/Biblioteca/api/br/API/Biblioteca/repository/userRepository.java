package Biblioteca.api.br.API.Biblioteca.repository;

import Biblioteca.api.br.API.Biblioteca.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User, Long> {

}
