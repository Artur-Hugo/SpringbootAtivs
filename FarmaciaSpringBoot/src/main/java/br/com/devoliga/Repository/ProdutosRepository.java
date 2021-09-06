package br.com.devoliga.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devoliga.model.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

}
