package br.com.devoliga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devoliga.Repository.CategoriaRepository;
import br.com.devoliga.model.Categoria;


@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(categoriaRepository.findAll());}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getByID(@PathVariable Long id){
		return categoriaRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());}
	
	@PostMapping
	public ResponseEntity<Categoria> postPostagem(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
		
	}
	
	
	@PutMapping
	public ResponseEntity<Categoria> putPostagem(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria));}
	
	@DeleteMapping("/{id}")
	public void deletePostagem(@PathVariable long id) {
		categoriaRepository.deleteById(id);}

}