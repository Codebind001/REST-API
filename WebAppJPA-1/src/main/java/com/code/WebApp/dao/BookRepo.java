package com.code.WebApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.code.WebApp.model.Books;

public interface BookRepo extends JpaRepository<Books, Integer>{

}
