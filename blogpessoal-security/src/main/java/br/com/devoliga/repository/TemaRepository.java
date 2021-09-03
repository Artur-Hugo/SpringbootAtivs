package br.com.devoliga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devoliga.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema> findByDescricaoContainingIgnoreCase(String Descricao);

	
	
}
