package com.portifolio.userdept.repositories;

import com.portifolio.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> { // padrao de criacao de objetos para acessar os dados das entidades (tabelas)


}
