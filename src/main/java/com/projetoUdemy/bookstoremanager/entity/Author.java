package com.projetoUdemy.bookstoremanager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data   //Getters Setters
@Builder //Classe Padrão
@NoArgsConstructor //Construtor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gerando Identificador ÚNICO
    private Long id;

    @Column(nullable = false, unique = true) //Não irá permitir campo único, e autor diferente retornará erro
    private String name;

    @Column(nullable = false)
    private Integer age;
}
