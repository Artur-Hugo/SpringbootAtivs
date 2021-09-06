package br.com.devoliga.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devoliga.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	

}
