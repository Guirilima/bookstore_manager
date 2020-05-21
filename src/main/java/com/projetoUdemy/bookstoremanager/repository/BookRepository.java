package com.projetoUdemy.bookstoremanager.repository;

import com.projetoUdemy.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//Classe Criada para Gerenciar conexão no Banco De Dados
public interface BookRepository extends JpaRepository<Book, Long> {
}
