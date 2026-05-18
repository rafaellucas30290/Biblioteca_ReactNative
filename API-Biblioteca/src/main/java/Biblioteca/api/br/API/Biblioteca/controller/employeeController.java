package Biblioteca.api.br.API.Biblioteca.controller;

import Biblioteca.api.br.API.Biblioteca.DTO.SalaryDTO;
import Biblioteca.api.br.API.Biblioteca.entity.Employee;
import Biblioteca.api.br.API.Biblioteca.services.employeeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/employee")
public class employeeController {
    private employeeService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee criar(@RequestBody Employee emp){
        return service.criar(emp);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee listById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> list(){
        return service.listar();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee atualizar(
            @PathVariable Long id,
            @RequestBody Employee emp){

        return service.atualizar(emp);
    }

    @PatchMapping("/{id}/salary")
    @ResponseStatus(HttpStatus.OK)
    public Employee atualizarSalario(
            @PathVariable Long id,
            @RequestBody SalaryDTO dto
    ){
        return service.ajusteSalarial(id, dto.salary());
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Long id){
        service.deletar(id);
    }
}
