package com.portifolio.userdept.controllers;

import com.portifolio.userdept.entities.User;
import com.portifolio.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // define a classe como um controlador
@RequestMapping (value="/users") //define o caminho que o controlador ira responder
public class UserController {

    @Autowired //instancia um objeto
    private UserRepository repository; // cria um objeto da classe(interface) de busca no banco de dados

    @GetMapping //define o verbo http no caso GET
    public List<User> findAll (){ // busca todos os usuarios USER
        List<User> result = repository.findAll(); // recebe a chamada com resultado da busca de usuarios
        return result; // retorna uma lista com as requisicoes da chamada
    }

    @GetMapping(value = "/{id}") // define o caminho de resposta /users/id( id do usuario selecionado )
    public User findById (@PathVariable Long id){ // @pathvariable associa o id da url com a selecao com o id do banco de dados
        User result = repository.findById(id).get(); // chamada do metodo repository. buscar por ID
        return result; // retorna os dados confome o ID infomado
    }

    @PostMapping // define metodo http como POST
    public User insert (@RequestBody User user) { //@ResquestBody define que o objeto sera uma requisicao em json
        User result = repository.save(user); // save envia para o banco de dados o insert do objeto user(usuario novo) ja convertido como relacional e retorna uma nova referencia para o objeto salvo
        return result;
    }

}
