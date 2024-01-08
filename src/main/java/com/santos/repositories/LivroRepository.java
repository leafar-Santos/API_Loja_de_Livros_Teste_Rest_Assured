package com.santos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.santos.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
