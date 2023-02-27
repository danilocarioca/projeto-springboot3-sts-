package pt.sata.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.sata.curso.entities.Category;
import pt.sata.curso.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
		
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();	}
}
