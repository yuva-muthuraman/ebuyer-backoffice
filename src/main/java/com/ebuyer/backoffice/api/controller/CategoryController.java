package com.ebuyer.backoffice.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ebuyer.backoffice.model.Category;
import com.ebuyer.backoffice.repository.CategoryRepository;

@RestController
public class CategoryController {
	@Autowired
	private CategoryRepository repository;
	
	@RequestMapping(value="categories", method=RequestMethod.GET)
	public List<Category> getCategories() {
		List<Category> categories = new ArrayList<Category>();
		
		repository.findAll().forEach(category->{
			categories.add(category);
		});
		
		return categories;
	}
}
