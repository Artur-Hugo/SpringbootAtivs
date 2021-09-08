package br.com.devoliga.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devoliga.model.Categoria;
public interface CategoriaRepository extends JpaRepository<Categoria,Long > {


	public List<Categoria> findAllBySetorContainingIgnoreCase(String setor);

}
