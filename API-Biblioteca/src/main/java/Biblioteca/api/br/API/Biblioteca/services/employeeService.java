package Biblioteca.api.br.API.Biblioteca.services;

import Biblioteca.api.br.API.Biblioteca.entity.Employee;
import Biblioteca.api.br.API.Biblioteca.repository.employeeRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class employeeService {
    private employeeRepository repository;


    public Employee criar(Employee emp){
        return repository.save(emp);
    }

    public Employee atualizar(Employee emp){
        Employee atual = repository.findById(emp.getId())
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

        atual.setName(emp.getName());
        atual.setAdress(emp.getAdress());
        atual.setPhoneNumber(emp.getPhoneNumber());
        atual.setWorkCard(emp.getWorkCard());

        return repository.save(atual);
    }

    public Employee ajusteSalarial(Long id, BigDecimal newSalary){
        Employee empregado = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));

        empregado.setSalary(newSalary);

        return repository.save(empregado);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    public List<Employee> listar(){
        return repository.findAll();
    }

    public Employee findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
    }
}
