package br.com.prog3.trabalhofinalpc3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.prog3.trabalhofinalpc3.domain.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
}
