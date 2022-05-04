package com.sample.springbootcrudoperation.repository;

import org.springframework.data.repository.CrudRepository;  
import com.sample.springbootcrudoperation.model.Books;  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  
