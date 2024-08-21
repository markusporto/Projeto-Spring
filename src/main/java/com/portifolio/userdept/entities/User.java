package com.portifolio.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")

public class User {

    @Id // define a primary key do banco
    @GeneratedValue (strategy = GenerationType.IDENTITY) // ira gerar automaticamente o valor de ID
    private long id;//atributo de identificador
    private String name;//atributo de identificador
    private String email;//atributo de identificador

    @ManyToOne // relacionamento entre a tabela User - Department
    @JoinColumn(name = "department_id") // foreing key sendo ela o nome da tabela relacionada
    private Department department;// define a classe Departament como atributo de User.

    public User (){ // construtor

    }
//getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    

}
