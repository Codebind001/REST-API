package com.code.WebApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.code.WebApp.dao.BookRepo;
import com.code.WebApp.model.Books;

@RestController
public class BookController {
	
	@Autowired
	BookRepo repo;
	
	ModelAndView mv = new ModelAndView();
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		mv.setViewName("home");
		return mv;
	}
	
	
	
	//@RequestMapping(path="/books", produces={"application/xml"})
	
	@RequestMapping("/books")
	public List<Books> getBooks() {
				
		return repo.findAll();
		
	}
	
	
	//@RequestBody
	//@PostMapping(path="/...", consumes={"application/json"})
	//@RequestMapping(path="/book", method= RequestMethod.POST)
	@PostMapping("/book")
	public Books addBook(@RequestBody Books book) {
		
		repo.save(book);
		return book;
		
	}

	@PutMapping("/book/{id}")
	public Books saveOrUpdateBook(@RequestBody Books book, @PathVariable int id) {
		
		repo.save(book);
		return book;
		
	}
	 
	@RequestMapping("/book/{id}")
	public Optional<Books> getBooks(@PathVariable("id") int id) {
				
		return repo.findById(id);
		
	}
	
	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable int id) {
		
		//Books b = repo.getOne(id);
		repo.deleteById(id);
		return "deleted";
		
	}
	

}
