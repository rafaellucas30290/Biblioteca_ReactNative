package Biblioteca.api.br.API.Biblioteca.services;

import Biblioteca.api.br.API.Biblioteca.entity.User;
import Biblioteca.api.br.API.Biblioteca.repository.userRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    private userRepository userRepository;

    public User create(User user){
        return userRepository.save(user);
    }

    public User findById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public List<User> listAll(){
        return userRepository.findAll();
    }

    public User update(User user){
        User atual = userRepository.findById(user.getId()).
                orElseThrow(()-> new RuntimeException("Produto não encontrado"));

        atual.setName(user.getName());
        atual.setAdress(user.getAdress());
        atual.setLogin(user.getLogin());
        atual.setPassword(user.getPassword());

        return userRepository.save(atual);

    }


}
