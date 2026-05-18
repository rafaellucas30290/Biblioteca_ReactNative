package Biblioteca.api.br.API.Biblioteca.repository;

import Biblioteca.api.br.API.Biblioteca.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Long>{


}
